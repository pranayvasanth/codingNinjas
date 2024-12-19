import java.util.*;

public class hangman {
    public static void main(String[] args) 
    {
        // List of animal names
        String[] animalNames = {
            "Cat", "Dog", "Lion", "Tiger", "Bear", "Horse", "Zebra", "Monkey",
            "Elephant", "Snake", "Fox", "Wolf", "Rabbit", "Dolphin", "Whale", "Panda",
            "Kangaroo", "Giraffe", "Penguin", "Chicken"
        };

        // Generate a random index
        Random random = new Random();
        int randomIndex = random.nextInt(animalNames.length);

        // Select a random animal name
        String randomAnimal = animalNames[randomIndex].toLowerCase();

        // Initialize the hidden word and hangman state
        char[] hiddenWord = new char[randomAnimal.length()];
        for (int i = 0; i < hiddenWord.length; i++)
         {
            hiddenWord[i] = '-';
         }

        int wrongGuesses = 0;
        boolean wordGuessed = false;
        Scanner scanner = new Scanner(System.in);

        // Hangman parts
        String[] hangman = 
        {
            "  O  ",  // Head
            " O\n |  ",  // Body
            " O\n |\n/|  ",  // One arm
            " O\n |\n/|\\",  // Both arms
            " O\n |\n/|\\\n |\n",  //one leg
            " O\n |\n/|\\\n |\n/|\\",  // Both leg
        };

        System.out.println("Welcome to Hangman!");

        while (wrongGuesses < hangman.length && !wordGuessed) 
        {
            System.out.println("\nCurrent word: " + String.valueOf(hiddenWord));
            System.out.print("Enter your guess: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            boolean correctGuess = false;
            for (int i = 0; i < randomAnimal.length(); i++) {
                if (randomAnimal.charAt(i) == guess && hiddenWord[i] == '-') {
                    hiddenWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                System.out.println("Wrong guess!");
                System.out.println(hangman[wrongGuesses]);
                wrongGuesses++;
            }

            // Check if the word is fully guessed
            wordGuessed = String.valueOf(hiddenWord).equals(randomAnimal);
        }

        if (wordGuessed) 
        {
            System.out.println("\nCongratulations! You guessed the word: " + randomAnimal);
        } else 
         {
            System.out.println("\nGame over! The word was:"+ randomAnimal);
        }
    }
}
