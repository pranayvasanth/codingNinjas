import java.util.*;


public  class guess{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);



        System.out.println("Welcome Guess the Number Game ;-] ");
        System.out.println("The Number reside betwenn 0 to 50 Try To get in 5 Tries ");
       
          
            int numTogess=(int) (Math.random()*50);

            System.out.println("Guess The Number: ");
            int ngused=sc.nextInt();
             int i=1;
            while(numTogess!=ngused) 
            { 
               if(i!=6){
                if ( ngused < numTogess) {

                    if (numTogess %2 ==0) {
                        System.out.println("Hint Your Number is divisible By 2\n");
                    }
                    else{
                        System.out.println(" Hint: Your Looking for Odd number:\n");
                    }
                    System.out.println("The Guess number is Higher \t Try No:"+i);
                    ngused=sc.nextInt();
                    i++;
                }
                else if (ngused> numTogess) {
                    if (numTogess %2 ==0) {
                        System.out.println("Hint Your Number is divisible By 2 \n");
                    }
                    else{
                        System.out.println(" Hint: Your Looking for Odd number:\n");
                    }
                    System.out.println("The Guess number is Lower \t Try No:"+i);
                    ngused=sc.nextInt();
                    i++;
                }
            }
            if(ngused == numTogess){
                System.out.println("YOu Guessed the Number !-) ["+numTogess+"]");
            }

        }

    }
}