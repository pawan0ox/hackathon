package User;

import java.util.ArrayList;
import java.util.Scanner;
import service_center.branches;


public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your number");
        int number = sc.nextInt();
        System.out.println("repairs to be done");
        ArrayList<branches> repair = new ArrayList<>();
    }
}