package com.yy.bean.Z08;

import java.util.Date;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    张三,25,男,5000,2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * @author Xiloer
 *
 */
public class Emp {
    public static void main(String[] args) {

    }
    class User{
      private   String name;
      private   int age;
      private    String gender;
      private    int salary;
        public boolean equals(User user){
            if (user.name==this.name&&user.age==this.age) {
                return true;
            }else {
                return false;
            }
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public Date getHiredate() {
            return hiredate;
        }

        public void setHiredate(Date hiredate) {
            this.hiredate = hiredate;
        }

        private Date hiredate;
    }
}
