package Home;

public class SongTest {
    public static void main(String[] args) {

        Song song1 = new Song("Truth Hurts", "Lizzo");
        song1.play();
        song1.favoriteTrack(new String[] {"Truth Hurts", "Lose It", "FACE", "bad guy"});

        System.out.println(song1);
    }
}
