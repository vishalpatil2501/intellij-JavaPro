package inheritance;

    class Animal4 {
         void makesound () {
             System.out.println("Inheritance main class");
         }
    }
    class Dog4 extends Animal4 {
        @Override
        void makesound() {
            System.out.println("Sub Inheri Class");
        }
    }
    public class MtdOverridingInheri {
        public static void main(String[] args) {
            Dog4 s = new Dog4();
            Animal4 i = new Animal4();
            s.makesound();            // Inherited method
            i.makesound();            // Child class method
        }
    }