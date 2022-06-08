/* Write a user defined exception class to authenticate the user name and password. */

import java.util.Scanner;

class userNameError extends Exception {
    String user;

    userNameError(String u) {
        user = u;
    }

    public String userExp() {
        return user;
    }
}

class PassWordError extends Exception {
    String passwd;

    PassWordError(String p) {
        passwd = p;
    }

    public String passExp() {
        return passwd;
    }
}

public class userAuthentication {
    public static void main(String[] args) {
        try {
            String u, p;
            Scanner sc = new Scanner(System.in);
            System.out.println("Username : ");
            u = sc.nextLine();
            System.out.println("Password : ");
            p = sc.nextLine();
            if (!u.equals("user")) {
                throw new userNameError(u);
            } 
            else if (!p.equals("user@123")) {
                throw new PassWordError(p);
            }
            else {
                System.out.println("Auntentication Success!!!");
            }
        } catch (userNameError e) {
            System.out.println(e.userExp()+" is Invalid Username!!!");
        } catch (PassWordError e) {
            System.out.println(e.passExp()+" is Invalid Password!!!");
        }
    }
}

