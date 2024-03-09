public class program {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        int a =5;

//        System.exit(0);
        System.out.println("out system");
        int b =10;
        System.out.println(a+b);
        System.exit(0);
        try{
            int data=25/5;
            System.out.println(data);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }

//        System.exit(0);
        finally {
        System.out.println("in system");
    }
    }
}