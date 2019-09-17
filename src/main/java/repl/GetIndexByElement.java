package repl;

public class GetIndexByElement {
    public static void main(String[] args) {

        String[] names = {"a", "b", "c", "d", "e"};

        System.out.println(getIndexByElement(names, "c"));
    }

    public static int getIndexByElement(String[] names, String element) {

        int index = -1;

        for(int x= 0; x <names.length; x++){
            if (names[x].equalsIgnoreCase(element)){
                index = x;

            }
    }

        return index;




    }


            }





