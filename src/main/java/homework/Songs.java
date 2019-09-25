package homework;

public class Songs {

    private String songname;
    private String artist;

    public Songs(String songname, String artist) {
        this.artist = artist;
        this.songname = songname;
    }
    public void setSongname(String songname){
        this.songname = songname;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    private void play() {
        System.out.println(songname + artist);
    }
    public void playSong() {
        play();
    }

    @Override
    public String toString() {
        return "Songs{" +
                "songname='" + songname + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
