package com.yy.entity;

public class User {
    private String id,pwd,cname,phone;
    private Double qian;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", cname='" + cname + '\'' +
                ", phone='" + phone + '\'' +
                ", qian=" + qian +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getQian() {
        return qian;
    }

    public void setQian(Double qian) {
        this.qian = qian;
    }
}
