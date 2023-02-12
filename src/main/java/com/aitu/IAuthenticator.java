package com.aitu;

public interface IAuthenticator {

    boolean checkCredentials(String username, String password);
}
