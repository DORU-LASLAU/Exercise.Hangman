import java.util.Scanner;
public class HangMan {
    public static void main(String[] args) {
        Scanner inputVal = new Scanner(System.in);
        System.out.println("Please enter a letter or"+
                "the complete word:");
        String inputString;
        MagicWord magic = new MagicWord();
        boolean win = false;
        int cont = 1;
        do {
            System.out.println("Attempt n." + cont);
            inputString = inputVal.next();
            win = magic.check(inputString);
            if (!win) {
                System.out.println(magic.getUnderscoreString());
            }
            cont++;
        } while (!win);
        System.out.println("You win !!!");
    }
}
