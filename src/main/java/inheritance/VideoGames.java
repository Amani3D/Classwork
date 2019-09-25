package inheritance;

public class VideoGames {

    public String genre;
    public String rating;
    public String title;

    public VideoGames(String genre, String rating, String title) {
        this.genre = genre;
        this.rating = rating;
        this.title = title;
    }

    public void describeGame() {
        System.out.println(title + " " + genre + " " + rating);
    }

    @Override
    public String toString() {
        return "VideoGames{" +
                "genre='" + genre + '\'' +
                ", rating='" + rating + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
