
import java.util.Scanner;
public class LoopsHw {
static int noOfMovies = 8; 
 
public static void for_loop()
{
System.out.println("\n\n FOR LOOP");
// Using Scanner for Getting Input from User
Scanner input = new Scanner(System.in);
for (int noOfMovie = 1; noOfMovie <= 8; noOfMovie++) {
System.out.println("\n Attempt # = " + noOfMovie);
System.out.println("Enter the number of movie and I will guess the movie (1-8) : ");
int noOfMovies = input.nextInt();
switch (noOfMovies) {
case 1:
System.out.println("Let me Guess! Your movie name is Harry Potter and the Philosopher's Stone !");
break;
case 2:
System.out.println("Let me Guess! Your movie name is Harry Potter and the Chamber of Secrets!");
break;
case 3:
System.out.println("Let me Guess! Your movie name is Harry Potter and the Prisoner of Azkaban!");
break;
case 4:
System.out.println("Let me Guess! Your movie name is Harry Potter and the Goblet of Fire!");
break;
case 5:
System.out.println("Let me Guess! Your movie name is Harry Potter and the Order of the Phoenix!");
break;
case 6:
System.out.println("Let me Guess! Your movie name is Harry Potter and the Half-Blood Prince!");
break;
case 7:
System.out.println("Let me Guess! Your movie name is Harry Potter and the Deathly Hallows – Part 1!");
break;
case 8:
System.out.println("Let me Guess! Your movie name is Harry Potter and the Deathly Hallows – Part 2!");
break;

default:
System.out.println("Let me Guess! I think there is no movie!");
} // End of Switch
} // End of For Loop
input.close();
System.out.println("You have completed Max attempts : " + noOfMovies);
} // End of method for_loop

public static void main(String[] args) {
	for_loop();
}
}
