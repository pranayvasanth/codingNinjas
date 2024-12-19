import java.util.*;

public class game{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the your choice \t 1.Rock \t 2.Paper \t 3.Scissors");
        int uc=s.nextInt();
        

        switch (uc) {
          case 1 -> System.out.println("Your choice : Rock");
          case 2 -> System.out.println("Your choice : Paper");
          case 3 -> System.out.println("Your choice : Scissors");
      }
        Random ran =new Random();

        int ran_n = ran.nextInt(3)+1;

      switch (ran_n) {
          case 1 -> System.out.println("computer choise: Rock \t" );
              case 2 -> System.out.println(" computer choise :Paper\t");
              case 3 -> System.out.println("computer choise: Scissors\t");

      }
      if(uc==ran_n)
      {
        System.out.println("Draw Try Again!");
      }
      else if(uc==1 && ran_n==3 || uc==2 && ran_n==1 || uc==3 && ran_n==2)
      {
        System.out.println("You Win :)");
      }
      else{
        System.out.println("You Lose :( \n Better Luck next Time! ;-)");
      }
    
  }
}
