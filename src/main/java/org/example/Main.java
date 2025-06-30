package org.example;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Calculates membership price
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String memberStat = scan.nextLine();
        if(!memberStat.equalsIgnoreCase("regular") && !memberStat.equalsIgnoreCase("VIP") && !memberStat.equalsIgnoreCase("Premium")){
            System.out.println("Invalid membership status entered.");
            return;
        }
        System.out.print("Enter age: ");
        int memberAge = scan.nextInt();

        float finalPrice = memberPriceCalc(memberStat, memberAge);
        String priceFormat = String.format("$%.2f", finalPrice);
        System.out.println("Price: ".concat(priceFormat));
    }

    private static float memberPriceCalc(String memberStat, int memberAge){
        memberStat = memberStat.toLowerCase();
        switch (memberStat) {
            case "regular" -> {
                if (memberAge < 18) {
                    return 50.0f;
                } else if (memberAge <= 64) {
                    return 100.0f;
                } else {
                    return 75.0f;
                }
            }
            case "vip" -> {
                if (memberAge < 18) {
                    return 75.0f;
                } else if (memberAge <= 64) {
                    return 150.0f;
                } else {
                    return 112.5f;
                }
            }
            case "premium" -> {
                if (memberAge < 18) {
                    return 100.0f;
                } else if (memberAge <= 64) {
                    return 200.0f;
                } else {
                    return 150.0f;
                }
            }
            default -> {
                return 0.0f;
            }
        }
    }

}