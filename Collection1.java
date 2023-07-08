import java.util.*;

class Collection1
{
    public static void main(String arg[])
    {
        Hashtable <String,Integer> hobj = new Hashtable<String,Integer>();

        hobj.put("C programming",990);
        hobj.put("c++ programming",1200);
        hobj.put("Java programming",780);
        hobj.put("Pythan programming ",1650);

        System.out.print("Book price of java"+hobj.get("Java programming"));
        hobj.remove("C++ programming");

        Enumeration eobj = hobj.keys();
        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }
    }
}