package Domain;

import java.util.Random;

public class User {
    private String id;
    private String username;
    private String password;
    private boolean status;

    public User() {
        id = creatID();
        status = true;
    }

    public User(String id, String username, String password, boolean statues) {
        id = creatID();
        this.username = username;
        this.password = password;
        status = true;
    }

    public String creatID() {
        StringBuilder sb = new StringBuilder("tgytt");

        for (int i = 0; i < 5; i++) {
            Random r = new Random();
            int num = r.nextInt(10);

            sb.append(num);
        }

        return sb.toString();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
