package com.naveen;
public class tOGGLE{
   public static void main(String args[]){
      String sample = "Hello How are you";
      String[] words = sample.split(" ");
      String result = "";
      for(String word:words){
         String firstSub = word.substring(0, 1);
         String secondSub = word.substring(1);
         result = result+firstSub.toLowerCase()+secondSub.toUpperCase()+" ";
      }
      System.out.println(result);
   }
}