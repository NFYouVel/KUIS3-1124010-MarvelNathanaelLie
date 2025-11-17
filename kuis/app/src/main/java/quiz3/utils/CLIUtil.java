package quiz3.utils;

import java.util.Scanner;

import quiz3.models.InvalidInputException;

public class CLIUtil {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static int getInt() {
        return sc.nextInt();
    }

    // public static Number getNum(String message) {
    //     System.out.println(message);
    //     String input = sc.nextLine();
    //     try {
    //         return Double.parseDouble(input);
    //     } catch (InvalidInputException e) {
    //         throw new InvalidInputException("Harus String");
    //     }
        

    // }


}