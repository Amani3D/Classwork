package repl;

public class Contains {
    public static void main(String[] args) {

        String[] names = {"a", "b", "c", "d", "e"};


        System.out.println(contains(names, "c"));
    }
    public static boolean contains(String[] names, String element) {

        for(int x = 0; x < names.length; x++){
            if(names[x].equals(element.toLowerCase()))
            return true;
        }
        return false;


    }
}
