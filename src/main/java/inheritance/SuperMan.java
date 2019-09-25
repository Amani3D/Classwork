package inheritance;

public class SuperMan extends Superhero {

    private String hasCape;
    private String secretIdentity;

    public SuperMan(String wearsTights, String hasCape, String secretIdentity) {
        super(wearsTights);
        this.hasCape = hasCape;
        this.secretIdentity = secretIdentity;
    }

    public void listSuperPowers() {
        String[] superPowers = {"Flight", "Super Strength", "Super Speed" };
        for (int x = 0; x < superPowers.length; x++) {
            System.out.println(superPowers[x]);
        }

    }
}
