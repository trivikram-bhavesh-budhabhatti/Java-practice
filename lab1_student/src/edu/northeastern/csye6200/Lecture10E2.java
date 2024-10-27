package edu.northeastern.csye6200;

public class Lecture10E2 {
	public static void main(String[] args) {
		String[] myWords = {"Dog", "Cat", "Fish", "Bird", "Horse"};
		System.out.println(makeSentence(myWords));
	}
	public static String makeSentence(String[] s1) {
		StringBuffer s = new StringBuffer();
		for(int i = 0; i < s1.length; i++) {
			s.append(s1[i]);
			s.append(" ");
		}
		String sentence = s.toString();
		return sentence;
	}
}
