public class dd {
    private static dd ourInstance = new dd();

    public static dd getInstance() {
        return ourInstance;
    }

    private dd() {


    }
}
