import com.google.common.math.IntMath;

public final class Application {

    // Make sure the Guava dependency is used.
    public String getGreeting() {
        return "Hello World, 2 + 2 is " + IntMath.checkedAdd(2, 2) + "!";
    }

    public static void main(String[] args) {
        System.out.println(new Application().getGreeting());
    }
}



