class Multi3
{
    public static void main(String Arg[])
    {
        Thread t1 = Thread.currentThread();
        Thread t2 = Thread.currentThread();

        System.out.println("Name of current thread is "+t1.getName());
        System.out.println("Priority of thread is : "+t1.getPriority());   

        System.out.println("Name of current thread is "+t2.getName());
        System.out.println("Priority of thread is : "+t2.getPriority()); 

    }
}
