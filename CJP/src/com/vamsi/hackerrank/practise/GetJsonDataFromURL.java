package com.vamsi.hackerrank.practise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class GetJsonDataFromURL {

    public static void main(String[] args) {
	System.out.println(LocalTime.now());
	System.out.println(Arrays.toString(getMovieTitles("spider")));
	System.out.println(LocalTime.now());
    }

    private static String[] getMovieTitles(String query) {
	List<String> titlesLst = new ArrayList<>();
	int startPage = 1;
	int totalPages = Integer.MAX_VALUE;
	
	IntStream.iterate(1, n -> n + 1).takeWhile(n -> n < totalPages).limit(totalPages).forEach(c -> {

	    try (BufferedReader reader = new BufferedReader(new InputStreamReader(
		    new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + URLEncoder.encode(query, "UTF-8") + "&page=" + c).openConnection().getInputStream()))) {

		Supplier<Stream<String>> contentStream = reader::lines;

		Optional<JsonObject> objectAsJob = contentStream.get().map(contentStreamLine -> new Gson().fromJson(contentStreamLine, JsonObject.class)).findFirst();
		totalPages = objectAsJob.map(convertedLines -> convertedLines.get("total_pages").getAsInt()).get();
		Optional<JsonArray> dataFilter = objectAsJob.map(convertedLines -> convertedLines.getAsJsonArray("data"));

		IntStream.iterate(0, n -> n + 1).takeWhile(n -> n < dataFilter.get().size()).forEach(dataLines -> {
		    titlesLst.add(dataFilter.get().get(dataLines).getAsJsonObject().get("Title").getAsString());
		    Collections.sort(titlesLst);
		});

	    }
	    catch (Exception e) {
		e.printStackTrace();
	    }

	    totalPages++;
	});

	return titlesLst.toArray(new String[0]);
    }

}
