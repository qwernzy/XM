import java.util.ArrayList;

public class myjava {
    public static void main(String[] args) {
        System.out.println("哈喽世界！");
        String name="牛";
        System.out.println("name = " + name);
        System.out.println("myjava.main");
        System.out.println("args = [" + args + "]");
        int age =20;
        if (age <18) {
            System.out.println("未成年");
        }
        ArrayList<String> user = new ArrayList<>();
            user.add("唐1葬");
            user.add("唐2葬");
            user.add("唐3葬");
            user.add("唐3葬");
            user.add("唐葬4");

        for (String s : user) {
            System.out.println("s = " + s);
        }
    }
}
