package com.naveen;
import java.util.Arrays;
import java.util.stream.Collectors;
public class RemoveAllDuplicateWords {

	   public static void main(String[] args){
	      String my_str = "This is a is sample a sample only.";
	      my_str = Arrays.stream(my_str.split("\\s+")).distinct().collect(Collectors.joining(" "));
	      System.out.println(my_str);
	   }
	}


