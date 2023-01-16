package com.bl.camelcase;

public class SplitMethod {

    public static void main(String[] args) {
        String input = "hello welcome to ocean";
        SplitMethod ccs = new SplitMethod();
        ccs.methodTwo(input);

    }

    public void methodTwo(String input) {
        String result = "";
        String str[] = input.split(" ");
        String newString = "";
        String firstWord = "";

        for (String splittedWord : str) {
            newString = newString + (splittedWord.charAt(0) + "").toLowerCase();
            for (int i = 0; i < splittedWord.length(); i++) {
                if (i == 0) {
                    newString = newString + (splittedWord.charAt(i) + "").toUpperCase();
                } else {
                    newString = newString + (splittedWord.charAt(i) + "").toLowerCase();
                }

            }

        }
        result = result + newString;
        System.out.println(result);
    }

}

