package com.tnsif.string;
import java.util.Scanner;

public class ModifyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter input String:\n");
        StringBuilder str = new StringBuilder(scanner.nextLine());

        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(j);
            if (ch >= 'A' && ch <= 'Z') {
                str.deleteCharAt(j);
                str.append(ch);
            }else {
            	j++;
            }
        }

        System.err.println("Modified String: " + str);
    }
}
