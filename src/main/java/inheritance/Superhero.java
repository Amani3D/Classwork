package inheritance;

public class Superhero {

    public String wearsTights;

    public Superhero(String wearsTights) {
        this.wearsTights = wearsTights;
    }

    public void listSuperPowers() {
        String[] superPowers = {"Flight", "Super Strength", "Super Speed" };
        for (int x = 0; x < superPowers.length; x++) {
            System.out.println(superPowers[x]);
        }
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "wearsTights='" + wearsTights + '\'' +
                '}';
    }
}
