package com.aitu;

public class Authenticator implements IAuthenticator{

    private String[] admin1 = { "admin1", "blockone"};
    private String[] admin2 = { "admin2", "blocktwo"};
    private String[] admin3 = { "admin3", "blockthree"};

    public boolean checkCredentials(String username, String password) {
        if (admin1[0].equals(username) && admin1[1].equals(password)) return true;
        else if (admin2[0].equals(username) && admin2[1].equals(password)) return true;
        else if (admin3[0].equals(username) && admin3[1].equals(password)) return true;
        else return false;
    }
}
