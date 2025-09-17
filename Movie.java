public class Movie {
  private int id;
	private String title;
	private int durationMinutes;
	private double rating;

	public Movie(int movieId, String title, int durationMinutes, double rating) {
		this.id = movieId;
    this.title = title;
		this.durationMinutes = durationMinutes;
		this.rating = rating;
	}

	public int getDurationMinutes() {
		return durationMinutes;
	}

	// @Override
	public String getInfor() {
		return "Movie{" + "id='" + id + '\'' +
			"title='" + title + '\'' +
			", duration=" + durationMinutes + " min" +
			", rating=" + rating +
			'}';
	}
}
