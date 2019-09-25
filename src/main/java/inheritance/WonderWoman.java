package inheritance;

public class WonderWoman extends Superhero {

    private String sword;
    private String lasso;

    public WonderWoman(String wearsTights, String sword, String lasso) {
        super(wearsTights);
        this.lasso = lasso;
        this.sword = sword;
    }

    public void listSuperPowers() {
        String[] superPowers = {"Flight", "Super Strength", "Super Speed"};
        for (int x = 0; x < superPowers.length; x++) {
            System.out.println(superPowers[x]);
        }
    }
}
