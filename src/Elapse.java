
public class Elapse {

	public static void main(String[] args) {
		int firstMovieOfHarryPorterYear = 2001;
		int lastMovieOfHarryPorterYear = 2011;
        int elapsedYears = (lastMovieOfHarryPorterYear - firstMovieOfHarryPorterYear);
        System.out.println("Elapsed years of First and Last Movie is "  + elapsedYears);
        
        int firstMovieReleaseYear = 2001;
        int lastMovieReleaseYear = 2011;
        int releaseElapsedYears = (lastMovieReleaseYear - firstMovieReleaseYear);
        int totalNumberOfMovies = 8;
        double approxYearsForAMovieRelease = (double) releaseElapsedYears/totalNumberOfMovies;
        int monthsPerYear = 12;
        
       
        System.out.println(approxYearsForAMovieRelease);

}

}
