public class Main {
	public static void main(String[] args) {
    int cinemaId = 0;
		Cinema cinema = new Cinema(++cinemaId);

    int movieId = 0;
		Movie m1 = new Movie(++movieId, "Inception", 148, 8.8);
		Movie m2 = new Movie(++movieId, "Spirited Away", 125, 8.6);
		Movie m3 = new Movie(++movieId, "Short Film", 90, 7.2);

		cinema.addMovie(m1);
		cinema.addMovie(m2);
		cinema.addMovie(m3);

		cinema.showMovies();
		System.out.println();
		cinema.showLongMovies();
	}
}
