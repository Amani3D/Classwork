package Home;

public class Song {

    public String title;
    public String artist;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public void setTitle(){

        System.out.println(title);
    }

    public void play(){

        System.out.println(title);
    }

    public void favoriteTrack(String[] songs){
        String favoriteTrack = songs[songs.length-2];


        System.out.println(favoriteTrack);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
