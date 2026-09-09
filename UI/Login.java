package UI;

import java.util.ArrayList;
import java.util.Scanner;

import Domain.User;

public class Login {

    public void start() {
        System.out.println("The page of login has been opened");

        ArrayList<User> list = new ArrayList<>();

        while (true) {
            System.out.println("======================================");
            System.out.println("  👾 welcome to text fighting game 👾  ");
            System.out.println("======================================");
            System.out.println("please select the operation: 1.log in 2.register 3.log out");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> {
                    System.out.println("the user chose the logout operation");
                    System.exit(0);
                }
                default -> System.out.println("error: pls choose it again");
            }
        }
    }

    public void register(ArrayList<User> list) {
        System.out.println("the user chose the register operation");

        User u = new User();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("please imput your username here:");
            String username = sc.next();

            if (!checkLen(3, 16, username)) {
                System.out.println("the username should between 3 ~ 16");
                continue;
            }
        }
    }

    public void login(ArrayList<User> list) {
        System.out.println("the user chose the login operation");
    }

    public boolean checkLen(int minLen, int maxLen, String str) {
        if (str.length() > minLen && str.length() < maxLen) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkUsername(String username) {
        int charCount = 0;
        int numCount = 0;
        int otherCount = 0;

        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (Character.isLetter(c)){
                charCount++;
            } else if (Character.isDigit(c)){
                numCount++;
            } else {
                otherCount++;
            }
        }
        
        return charCount > 0 && numCount >= 0 && otherCount == 0;
    }

}
