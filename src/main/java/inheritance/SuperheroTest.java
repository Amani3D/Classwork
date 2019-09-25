package inheritance;

public class SuperheroTest {
    public static void main(String[] args) {

        SuperMan superman = new SuperMan("Tights", "Cape", "Clark Kent");
        superman.listSuperPowers();

        WonderWoman wonderwoman = new WonderWoman("No tights", "No cape", "Diana");
        wonderwoman.listSuperPowers();

        System.out.println(superman);
        System.out.println(wonderwoman);
    }
}
