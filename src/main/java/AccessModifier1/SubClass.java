package AccessModifier1;

import AccessModifier.Test;

public class SubClass extends Test {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        System.out.println(obj.publicVar);     // ✅ Accessible
        System.out.println(obj.protectedVar);  // ✅ Accessible (subclass)
// System.out.println(obj.defaultVar); // ❌ NOT accessible (different package)
// System.out.println(obj.privateVar); // ❌ NOT accessible (private)
    }
}

