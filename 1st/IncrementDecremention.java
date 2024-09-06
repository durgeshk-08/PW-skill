class IncrementDecremention
{
    public static void main (String []args)
    {
    //     int a=5;
    //     a++;
    //     System.out.println(a);

    //     a=5;
    //     a--;
    //     System.out.println(a);


        int a=5;
        int b;
       // b = a++ + ++a + --a;

        b = a++ + ++a + ++a + ++a + --a + a-- ; 
        System.out.println(a);
        System.out.println(b);


    }
}
