package com.vamsi.puzzles;

public class My4Puzzle {

	private static String str = "Vamsi is a Java Expert"; 
	public static void main(String[] args) {
		My4Puzzle javaPuzzler = null;
		javaPuzzler.set("vamC is a Java Developer");
		System.out.println(javaPuzzler.get());
		}
		 
		private static String get(){
		//return "i am a java puzzler";
			return str;
		}
		
		private static void set(String str)
		{
			My4Puzzle.str = str;
		}
	}

