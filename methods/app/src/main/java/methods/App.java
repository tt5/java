package methods;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        String[] concepts = {"a", "b", "c"};
        System.out.println(searchArray("b", concepts));
        System.out.println(searchArray("x", concepts));

    }
    public static boolean searchArray(String target, String[] array) {
        boolean result = false;
        for (String element : array) {
            if (element.equals(target)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
