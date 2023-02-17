package com.aitu;

import java.util.Objects;

public class Authenticator implements IAuthenticator {

    private String[] log = {"admin1", "admin2", "admin3"};
    private String[] pass = {"blockone", "blocktwo", "blockthree"};

    public boolean checkCredentials(String login, String password) {
        for (int i = 0; i < 3; i++) {
            if (log[i].equals(login) && pass[i].equals(password)) return true;
        }
        return false;
    }

}