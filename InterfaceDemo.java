class Interface
{   
    public static void main(String Arg[])
    {
        Demo obj = new Demo();
        float fRet = 0;
        
        fRet = obj.CalculateArea(20.43f);
        System.out.println("Area is :"+fRet);

        fRet = obj.CalculateCircumfarance(20.43f);
        System.out.println("Circlefarance is :"+fRet);
        
    }
}
interface  Circle
{
    public final float PI = 3.14f;
    public float CalculateArea(float Radius);
    public float CalculateCircumfarance(float Radius);
}
class Demo implements Circle
{
    public float CalculateArea(float Radius)
    {
        return  PI * Radius * Radius;
    }
    public float CalculateCircumfarance(float Radius)
    {
        return 2 * PI * Radius;
    }
}