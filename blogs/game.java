import java.util.*;

public class game{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the your choice \t 1.Rock \t 2.Paper \t 3.Scissors");
        int uc=s.nextInt();


        Random ran =new Random();

        int ran_n = ran.nextInt(3);

      switch (ran_n) {
          case 1 -> System.out.println("computer choise: Rock \t" );
              case 2 -> System.out.println(" computer choise :Paper\t");
              case 3 -> System.out.println("computer choise: Scissors\t");

      }
      if(uc==ran_n)
      {
        System.out.println("Draw try again");
      }
      else if(uc>ran_n){
        System.out.println("You Win :)");
      }
      else{
        System.out.println("You Lose :(");
      }
    }
}