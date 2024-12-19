import java.util.*;


public  class guess
{

    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Welcome Guess the Number Game ;-] ");
            System.out.println("The Number reside betwenn 0 to 50 Try To get in 5 Tries ");
      
              
                int RandomNumber=(int) (Math.random()*50);

                System.out.println("Guess The Number: ");
                int userguess=sc.nextInt();
                 int i=1;
                 if(userguess>50)
                    {
                        System.out.println("Enter value between 0 to 50 only");
                    }
                    else{
            while(RandomNumber!=userguess) 
            { 
                if(i!=6)
                {   
                        if ( userguess < RandomNumber) 
                        {
                          if (RandomNumber %2 ==0) 
                            {
                            System.out.println("Hint Your Number is divisible By 2\n");
                            }
                        else
                            {
                                System.out.println(" Hint: Your Looking for Odd number:\n");
                            }
                            System.out.println("The Guess number is Higher \t Try No:"+i);
                            userguess=sc.nextInt();
                            i++;
                        }
                        else if (userguess> RandomNumber) 
                        {
                            if (RandomNumber %2 ==0) 
                            {
                                 System.out.println("Hint Your Number is divisible By 2 \n");
                            }
                            else   
                            {
                                System.out.println(" Hint: Your Looking for Odd number:\n");
                            }
                                System.out.println("The Guess number is Lower \t Try No:"+i);
                                userguess=sc.nextInt();
                                i++;
                        }
                    
                }
                }
                if(userguess == RandomNumber)
                {
                    System.out.println("YOu Guessed the Number !-) ["+RandomNumber+"]");
                }
                else
                {
                    System.out.println("Sorry Try Again!   :(");
                }


            }
        }
    }

}
