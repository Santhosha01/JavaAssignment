package encapsulation.question4;

public class Movie {
	private String movieName;
	private String producer;
	private double duration;
	private String releaseDate;
	private String genre;
	private static String language="Tamil";
	private static int noOfDirector=1;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void getDetails() {
		 System.out.println("\nMovie Details :  \n\n Movie Name = " + movieName + "\n Producer = " + producer + "\n Duration = " + duration + "\n Release Date = "
				+ releaseDate + "\n Genre = " + genre+" \n Langugae = "+language+" \n No of Director = "+noOfDirector+"\n");
	}

}
