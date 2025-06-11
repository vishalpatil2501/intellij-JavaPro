package AccessModifier;

public class Demo {
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.publicVar);     // ✅ Accessible
        System.out.println(obj.protectedVar);  // ✅ Accessible (same package)
        System.out.println(obj.defaultVar);    // ✅ Accessible (same package)
        // System.out.println(obj.privateVar); // ❌ NOT accessible (private)
    }
}
