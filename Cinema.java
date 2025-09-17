import java.util.ArrayList;
import java.util.List;

public class Cinema {
  private int id=0;
	private List<Movie> movies = new ArrayList<>();
	public static int totalMovies = 0; // static counter across all cinemas

  public Cinema() {
    this.id = ++this.id;
  }

	public void addMovie(Movie movie) {
		if (movie == null) return;
		movies.add(movie);
		totalMovies++;
	}

	public void showMovies() {
		if (movies.isEmpty()) {
			System.out.println("No movies in this cinema.");
			return;
		}
		System.out.println("All movies:");
		for (Movie m : movies) {
			System.out.println("- " + m.getInfor());
		}
		System.out.println("Total movies (all cinemas): " + totalMovies);
	}

	public void showLongMovies() {
		boolean any = false;
		System.out.println("Long movies (>120 minutes):");
		for (Movie m : movies) {
			if (m.getDurationMinutes() > 120) {
				System.out.println("- " + m.getInfor());
				any = true;
			}
		}
		if (!any) {
			System.out.println("(none)");
		}
	}
}
