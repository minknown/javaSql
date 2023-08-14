package com.mayizt.pojo;

public class Jm {
    private String id;
    private String name;
    private String sta;
    private String f;
    private String tn;
    public Jm() {
    }

    public Jm(String id, String name, String sta, String f, String tn) {
        this.id = id;
        this.name = name;
        this.sta = sta;
        this.f = f;
        this.tn = tn;
    }

    @Override
    public String toString() {
        return "Jm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sta='" + sta + '\'' +
                ", f='" + f + '\'' +
                ", tn='" + tn + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getTn() {
        return tn;
    }

    public void setTn(String tn) {
        this.tn = tn;
    }
}
