package com.yy.bean.collectiondemo;

public class person {
    private String name;
    private  int sg;
    private int age;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", sg=" + sg +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSg() {
        return sg;
    }

    public void setSg(int sg) {
        this.sg = sg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
