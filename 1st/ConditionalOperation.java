class ConditionalOperation {
    public static void main(String[] args) 
    {
        // //int age = 18;
        // //int age = 19;
        // int age = 14;
        // if (age >= 18)
        // {
        //     System.out.println("ligel adult");
        // }
        // else
        // {System.out.println("You're child");}     



        
                            //second
    //     //int age = 18;
    //    // int age = 63;
    //    //int age = 17;
    //    int age = 9;
    //     if (age>=18 && age<61)
    //     {
    //         System.out.println("Adult");
    //     }
    //     else if (age>60)
    //     {
    //         System.out.println("old");
    //     }
    //     else if (age>=16 && age<18)
    //     {
    //         System.out.println("Teenager");
    //     }
    //     else
    //     {System.out.println("Child");}





                        //Third

          int age =18;
          
          if (age>=18 && age<=60)
          {
            if (age>=18 && age<=20)
            {
                System.out.println("YOu are compliting stage of Teeneger");
            }
            else if (age >=20 && age <30)
            {
                System.out.println("you are a 20's");
            }
            else  if (age >=30 && age <40)
            {
                System.out.println("you are a 30's");
            } 
            else if (age >=40 && age <50)
            {
                System.out.println("you are a 40's");
            }
            else 
            {
                System.out.println("YOu are 50's");
            }
          } 
          else if (age>60)
          {
            if (age>=60 && age<70)
            {
                System.out.println("you are a 60's");
            }
            else  if (age>=70 && age<80)
            {
                System.out.println("you are a 70's");
            }
            else
            {
                System.out.println("You are in Danger");
            }
          } 
          else if (age>=16 && age<18)
          {
            System.out.println("you are a teenager");
          } 
          else
          {
            System.out.println("You are a child");
          }   
        
    }    
}
