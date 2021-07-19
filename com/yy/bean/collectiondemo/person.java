package com.yy.bean.collectiondemo;

import org.jetbrains.annotations.NotNull;

public class person implements Comparable<person>{
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

    @Override
    public int compareTo(@NotNull person o) {
        int x=this.name.length()-o.getName().length();

            return x;

    }
}
