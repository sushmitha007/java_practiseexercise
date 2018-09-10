import java.util.Scanner;
public class  VowelConso{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the word");
    String word = in.nextLine();
    int len = word.length();
    for (int i = 0; i < len; i++) {
        if ((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') || (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I'
                    || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                System.out.println(word.charAt(i) + "\t vowel");
            } else {
                System.out.println(word.charAt(i) + "\t consonent");
            }
        }
        else System.out.println(word.charAt(i) + "\terror it is not a character");
    }
}
}
