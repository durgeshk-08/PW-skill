class TernaryOperation {
    public static void main (String []args)
    {
        int a=30;
        int b=20;
        int c=40;

        int result = (a<b)? a:b;
        System.out.println(result);

        String results = (a<b)? "a is less":"b is less";
        System.out.println(results);

        int resultss = (a<b) ? (a<c ? a : b) : (b<c ? b : c);
        System.out.println(resultss);



                                                        // EXAMPLE OF IF ELSE

        if (a<b)
        {
            if (a<c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);            
            }
        }
        else
        {
            if (b<c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
    }
    
}
