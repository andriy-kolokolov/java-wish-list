package org.experis.task;

import org.experis.task.Util.BoxPacker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Box<Gift>> wishlist = new ArrayList<>();
        boolean adding = true;

        while (adding) {
            System.out.println("Add new present to wishlist ? 'n' to exit)");
            if (sc.nextLine().equalsIgnoreCase("n")) adding = false;
            else {
                System.out.println("Type present name: ");
                wishlist.add(new Box<>(new Gift(sc.nextLine())));
            }
        }

        System.out.println("HERE YOUR GIFTS ALREADY PACKAGED IN BOXES AND READY TO PRESENT!: \n");

        for(Box<Gift> giftBox : wishlist) {
            System.out.println(
                    BoxPacker.getPackedBox(giftBox)
            );;
        }
    }

}
