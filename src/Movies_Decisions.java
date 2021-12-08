import java.util.Scanner;

public class Movies_Decisions {

	public static void main(String[] args) {
		



		// Using Scanner for Getting Input from User
		Scanner input = new Scanner(System.in);



		System.out.println("Enter the number of movie and I will guess your movie : ");
		int noOfMovie = input.nextInt();
		input.close();



		// If Only
		System.out.println("\nIF STATEMENT");
		if (noOfMovie >= 1  && noOfMovie <=8 && !(noOfMovie==2)) {
		System.out.println(" Your number of movie is "+noOfMovie+"");
		}



		// If Else (Nested IF)
		System.out.println("\nIF ELSE STATEMENT");



		if (noOfMovie >= 1  && noOfMovie <=8 && !(noOfMovie==2)) {
		System.out.println("\" Your number of movie is "+noOfMovie+"");
		}
		else
		{
		System.out.println(" Sorry, I could not find a movie with "+noOfMovie+"");
		}
		//If Else If
		//With just 1 LOC, this bracket is not necessary. But its best practice to use brackets always to avoid unintentional bugs.
		System.out.println("\nIF ELSE IF STATEMENT");
		if (noOfMovie == 1)
		System.out.println("Your movie name is Harry Potter and the Philosopher's Stone");
		else if (noOfMovie == 2 )
		{
		System.out.println("Your movie name is Harry Potter and the Chamber of Secrets");
		}
		else if (noOfMovie == 3) System.out.println("Your movie name is Harry Potter and the Prisoner of Azkaban");
		else if (noOfMovie == 4)
		{
		System.out.println("Your movie name is Harry Potter and the Goblet of Fire");}
		else if (noOfMovie == 5)
		System.out.println("Your movie name is Harry Potter and the Order of the Phoenix");
		else if (noOfMovie == 6)
			System.out.println("Your movie name is Harry Potter and the Half-Blood Prince");
		else if (noOfMovie == 7)
			System.out.println("Your movie name is Harry Potter and the Deathly Hallows – Part 1");
		else if (noOfMovie == 8)
			System.out.println("Your movie name is Harry Potter and the Deathly Hallows – Part 2");
		
		
		
		
		
		
	} // End of Method main



      }// End of Class


	


