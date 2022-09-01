package com.naveen;
public class Capitalize {
	
   public static void main(String[] args) {
      String input_string = "java program";
      System.out.println("The string is defined as: " +input_string);
      String first_letter = input_string.substring(0, 1);
      String remaining_letters = input_string.substring(1, input_string.length());
      first_letter = first_letter.toUpperCase();
      input_string = first_letter + remaining_letters;
      System.out.println("The string after capitalizing the first letter is: " + input_string);
   }
}