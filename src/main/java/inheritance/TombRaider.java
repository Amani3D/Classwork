package inheritance;

public class TombRaider extends VideoGames {

    private String mainCharacter;

    public TombRaider(String genre, String rating, String title) {
        super(genre, rating, title);
    }

    @Override
    public void describeGame() {
        super.describeGame();
    }

    @Override
    public String toString() {
        return "TombRaider{" +
                "mainCharacter='" + mainCharacter + '\'' +
                '}';
    }
}
