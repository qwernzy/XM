import java.util.ArrayList;

public class myjava {
    public static void main(String[] args) {
        phone d = phone.getInstance();
        phone d1 = phone.getInstance();
        if (d1 == d) {
            System.out.println("d1 = " + d1);
        }

    }
}
