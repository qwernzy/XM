package com.yy.bean.Z08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 *  * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Xiloer
 *
 */
/*
张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;qq,25,女,5000,2001-01-12;方法,26,女,6000,2007-12-22
*/
public class Test09 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入员工信息:格式为:name,age,gender,salary,hiredate;name,age");
        String input = sc.nextLine().trim();//接收字符串
        String[] l = input.split(";");
        List<Emp> list = new ArrayList<>();
        Calendar c = Calendar.getInstance();

        for(int i=0;i<l.length;i++){
            String[] everyArr = l[i].split(",");
            String name = everyArr[0];
            int age = Integer.parseInt(everyArr[1]);
            String gender = everyArr[2];
            int salary = Integer.parseInt(everyArr[3]);


            Date hiredate = sdf.parse(everyArr[4]);

            Emp emp = new Emp(name,age,gender,salary,hiredate);
            list.add(emp);
        }
        for (Emp emp : list) {
            Date d = emp.getHiredate();
            c.setTime(d);
            c.add(Calendar.MINUTE, 3);
            c.set(Calendar.DAY_OF_WEEK, 6);
            System.out.println( "转正时间："+sdf.format(c.getTime()));
        }

    }
    static class  Emp{
        private String name;
        private int age;
        private String gender;
        private int salary;
        private Date hiredate;

        public Emp(String name, int age, String gender, int salary, Date hiredate) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.salary = salary;
            this.hiredate = hiredate;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", salary=" + salary +
                    ", hiredate=" + hiredate +
                    '}';
        }

        public Emp() {
            super();
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
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
    }
}
