package ThisKeyword;

// 3. this() is used to call the constructor of the current class

class Sample1
{

    Sample1()  //constructor
    {
        System.out.println("In default constructor");
    }
    Sample1(int a)  //constructor
    {
        this();
        System.out.println("In Parameterised constructor " + a);
    }
    void sampleMethod(int a)
    {
        System.out.println("In sampleMethod with value: " + a);
    }
}
class this3
{
    public static void main(String args[])
    {
        Sample1 s = new Sample1(10);
        s.sampleMethod(10);

    }
}