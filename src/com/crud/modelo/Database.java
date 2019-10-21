package com.crud.modelo;


public class Database {
    String url;
    String uss;
    String pwd;
    String driver;
    
    public Database(){
        this.url="jdbc:mysql://localhost:3306/mydb";
        this.uss="root";
        this.pwd="";
        this.driver="com.mysql.jdbc.Driver";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUss() {
        return uss;
    }

    public void setUss(String uss) {
        this.uss = uss;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    
}
