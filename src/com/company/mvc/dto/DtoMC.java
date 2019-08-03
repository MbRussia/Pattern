package com.company.mvc.dto;

public class DtoMC {
    private String login;
    private String passwd;

    public DtoMC() {
    }

    public DtoMC(String login, String passwd) {
        this.login = login;
        this.passwd = passwd;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
