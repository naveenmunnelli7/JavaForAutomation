package com.naveen;

public class RemoveAllWhiteSpacesFromString {

		   public static void main(String[] args) {
		      String input_string = "Java programming is fun to learn.";
		      System.out.println("The string is defined as: " + input_string);
		      String result = input_string.replaceAll("\\s", "");
		      System.out.println("\nThe string after replacing white spaces: " + result);
		   }
		}

