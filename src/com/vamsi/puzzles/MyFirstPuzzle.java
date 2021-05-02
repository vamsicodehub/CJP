package com.vamsi.puzzles;

public class MyFirstPuzzle {

	public static void main(String[] args) {
		MyFirstPuzzle javaPuzzler = new MyFirstPuzzle();
		javaPuzzler.doSth();
	}

	public void doSth() {
		float f = 1.2f;
		if (f >= 1.0f) {
			f = 0.9999999f;
		}
		InnerClass innerClass = new InnerClass(f);
		System.out.println(innerClass.getValue());
	}

	private class InnerClass {

		private float value;

		public InnerClass(float value) {
			if (value >= 1.0f) {
				throw new IllegalArgumentException("Value can't be greater than 1.0f");
			}

			this.value = value;
		}

		public float getValue() {
			return value;
		}
	}
}