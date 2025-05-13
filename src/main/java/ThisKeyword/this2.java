package ThisKeyword;

// 2. this: to refer to the current instance variable of the class

class boys
{
    int rollno;
    String name;
    float fee;

    boys(int rollno,String name,float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }
}

public class this2
{
    public static void main(String args[])
    {
        boys s1=new boys(111,"ankit",5000f);
        boys s2=new boys(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}