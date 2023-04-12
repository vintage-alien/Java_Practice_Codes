package PracticeCodes;

public class BasicJavaPrograms {

    public static void reverseString(String givenString){
        StringBuilder desiredString = new StringBuilder();
        for (int i=givenString.length()-1; i>=0; i--){
            desiredString.append(givenString.charAt(i));
        }
        System.out.println(desiredString);
    }


    public static void reverseWordsInString(String givenString){
        String[] words = givenString.split(" ");
        StringBuilder targetString = new StringBuilder();
        for (int i=words.length-1; i>=0; i--){
            targetString.append(words[i]).append(" ");
        }
        System.out.println(targetString);
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");

        String testString = "MdHasanujjaman";
        reverseString(testString);
        reverseString("123");


        String testString2 = "My name is Hasan";
        reverseWordsInString(testString2);
    }
}
