package com.bl.camelcase;

public class CamelCase {

        public void camelCase(String str) {
            String result = "";
            char first = str.charAt(0);
            char firstToLowerCase = Character.toLowerCase(first);
            result =result + firstToLowerCase;
            for (int i = 1; i < str.length(); i++) {
                char current = str.charAt(i);
                char previous = str.charAt(i - 1);
                if (previous == ' ') {
                    char currentToUpperCase = Character.toUpperCase(current);
                    result += currentToUpperCase;

                } else {
                    char currentToLowerCase = Character.toLowerCase(current);
                    result = result + currentToLowerCase;
                }
            }
            String output = result.replaceAll(" ","");
            System.out.println(output);


        }

        public static void main(String[] args) {

            CamelCase cc = new CamelCase();
            String str = "hello welcome to fifa ";
            cc.camelCase(str);

        }
    }
