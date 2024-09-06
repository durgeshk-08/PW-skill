class Logical {
    public static void main(String []args)
    {
        int a=10;
        int b=20;
        int c=30;

        //AND
        System.out.println(a==b && a<b && a>b);
        System.out.println(a<b && a<=b && a<c);

        //OR
        System.out.println(a==b || a<b || a<c);
        System.out.println(a<b || a>b || a>c);

        //NOT
        System.out.println(!true);



    }
    
}
