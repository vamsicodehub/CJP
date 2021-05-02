package com.vamsi.hackerrank.practise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class GetJsonDataFromMock {

    public static void main(String[] args) {
	System.out.println(LocalTime.now());
	System.out.println(Arrays.toString(getMovieTitles("spider")));
	System.out.println(LocalTime.now());
    }
    
    static String[] getMovieTitles(String substr) {
	String response;
	int startPage = 1;
	int totalPages = Integer.MAX_VALUE;
	Set<String> titles = new TreeSet<>(new Comparator<String>() {

	    @Override
	    public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	    }
	});
	while (startPage <= totalPages) {
	  try {
	      System.out.println("About to call URL"+LocalTime.now());
	    URL obj = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr + "&page=" + startPage);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	    con.setRequestMethod("GET");
	    System.out.println("Call to URL Done"+LocalTime.now());
	    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    while ((response = in.readLine()) != null) {
	      JsonObject convertedObject = new Gson().fromJson(response, JsonObject.class);
	      totalPages = convertedObject.get("total_pages").getAsInt();
	      JsonArray data = convertedObject.getAsJsonArray("data");
	      for (int i = 0; i < data.size(); i++) {
	        String title = data.get(i).getAsJsonObject().get("Title").getAsString();
	        titles.add(title);
	      }
	    }
	    System.out.println("Done Reading from Stream"+LocalTime.now());
	    in.close();
	    startPage++;
	  } catch (Exception ex) {
	    ex.printStackTrace();
	  }

	}
	return titles.toArray(new String[0]);
	}

}
