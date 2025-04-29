package ThisKeyword;

// 1. this: to use as a parameter in a method

class Sample {
       void fun() {
         System.out.println("hello there");
      }
      void foo() {
         System.out.println("hello foo");
         this.fun();
      }
}
  class this1 {
    public static void main(String args[]) {
        Sample s = new Sample();
        s.foo();
    }
  }

