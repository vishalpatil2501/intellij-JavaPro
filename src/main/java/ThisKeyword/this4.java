package ThisKeyword;

//  4. this: to refer to the current instance variable of the class

class boys1
{
    int rollno;
    String name;
    float fee;

    boys1(int rollno,String name,float fee)
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

class this4
{
    public static void main(String args[])
    {
        boys1 s1=new boys1(111,"ankit",5000f);
        boys1 s2=new boys1(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
