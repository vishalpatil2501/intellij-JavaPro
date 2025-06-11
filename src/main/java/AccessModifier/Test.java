package AccessModifier;

public class Test {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;   // Default access
    private int privateVar = 40;
    public void display() {
        System.out.println("Inside Test class");
    }
}
