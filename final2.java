class Final2
{
    public static void main(String Arg[])
    {
        Base bobj = new Derived;
        bobj.fun();  //Derived fun
        bobj.gun(); //Base fun
    }

}
class Base
{
    public void fun()
    {
        System.out.println("Base funn");
    }   
    final public void gun()
    {
        System.out.println("Base gun");
    }

}
class Derived extends Base
{

    public void fun()
    {
        System.out.println("Derived fun");
    }   
        public void gun()
    {
        System.out.println("Derived gun");
    }
}