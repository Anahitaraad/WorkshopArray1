package lexicon.se;

public class Workshop {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String[] myArray = new String[3];

        myArray[0] = "Erik";
        myArray[1] = " ";
        myArray[2] = "Svensson";
        for (String word : myArray) {
            System.out.print(word);
        }

        String s = find("Eric Svensson");
    }

    public static String find(final String fullName) {

        return null;
    }


}









