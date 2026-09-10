package Domain;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        getCode();
    }

    public static String getCode () {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            Character c = list.get(index);
            sb.append(c);
        }

        sb.append(r.nextInt(10));

        return null;
    }
}
