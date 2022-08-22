package main;
import util.Input;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String userInput = sc.nextLine();
        System.out.println("You entered: "+ userInput);
        System.out.println("Is Numeric: " + StringUtils.isNumericSpace(userInput));
        System.out.println(StringUtils.reverse(userInput));
        System.out.println(StringUtils.swapCase(userInput));

    }

}
