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

            if (!checkUsername(username)) {
                System.out.println("the username can only be composed of letters and numbers, not pure numbers");
                continue;
            }

            if (contains(list, username)) {
                System.out.println("the cuurent username is occupied");
                continue;
            }

            u.setUsername(username);
            break;
        }

        while (true) {
            System.out.println("please imput your password here:");
            String password1 = sc.next();
            System.out.println("please imput the password again:");
            String password2 = sc.next();

            if (!checkLen(3, 8, password1)) {
                System.out.println("the password should between 3 ~ 8");
                continue;
            }

            if (!checkPassword(password1)) {
                System.out.println("the username must be composed of letters and numbers, not pure numbers");
                continue;
            }

            if(!password1.equals(password2)) {
                System.out.println("the two passwords are different, please check it again");
                continue;
            }

            u.setPassword(password1);
            break;
        }

        list.add(u);
        System.out.println("the account has been successfully registered");
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

    public int[] getCount (String userInfo) {
        int charCount = 0;
        int numCount = 0;
        int otherCount = 0;

        for (int i = 0; i < userInfo.length(); i++) {
            char c = userInfo.charAt(i);
            if (Character.isLetter(c)) {
                charCount++;
            } else if (Character.isDigit(c)) {
                numCount++;
            } else {
                otherCount++;
            }
        }

        return new int[] {charCount, numCount, otherCount};
    }

    public boolean checkUsername(String username) {
        int[] arr = getCount(username);

        return arr[0] > 0 && arr[1] >= 0 && arr[2] == 0;
    }

    public boolean checkPassword(String password) {
        int[] arr = getCount(password);

        return arr[0] > 0 && arr[1] > 0 && arr[2] ==0;
    }

    public boolean contains (ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if(u.getUsername().equals(username)) {
                return true;
            }
        }

        return false;
    }

}
