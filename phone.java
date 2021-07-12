public class phone {
    private static phone ourInstance = new phone();

    public static phone getInstance() {
        return ourInstance;
    }

    private phone() {

    }
}
