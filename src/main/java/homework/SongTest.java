package homework;

public class SongTest {
    public static void main(String[] args) {

        Songs song1 = new Songs("Hollaback Girl", "Gwen Stefani");
        song1.setArtist("Lizzo");
        song1.setSongname("Truth Hurts");
        song1.playSong();

        System.out.println(song1);
    }


}
