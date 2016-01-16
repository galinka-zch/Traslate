import java.io.IOException;
import java.util.Scanner;

public class Translate {
    public static void main(String[] args) {
        char[] consonants = {'б', 'в', 'г', 'д', 'й', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        char[] simvollanguage1 = {'A', 'Б'};
        int selectionTranslate;
        int inChar;
        System.out.println("Enter a Character 1, 2, 3:");
        try {
            inChar = System.in.read();
            System.out.print("You entered a Character in ASCII");
            System.out.println(inChar);
        } catch (IOException e) {
            System.out.println("Error reading from user");
        }

        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.print("Введите строку для перевода: ");
        s1 = sc.nextLine();
        char[] line = s1.toCharArray();
        inChar = 49;
        switch (inChar) {
            case 49:
                System.out.println("language 01");
                for (int i = 0; i < consonants.length; i++) {
                    for (int k = 0; k < line.length; k++) {
                        if (consonants[i] == line[k])
                            line[k] = 0;
                        else line[k] = 1;
                    }
                }
                break;
            case 50:
                System.out.println("language АБ");
                for (int i = 0; i < consonants.length; i++) {
                    for (int k = 0; k < line.length; k++) {
                        if (consonants[i] == line[k])
                            line[k] = 'Б';
                        else line[k] = 'А';
                    }
                }
                break;
            case 51:
                System.out.println("language delete");
                for (int k = 0; k < line.length; k++) {
                    line[k] = ' ';
                    break;
                }
        }

    }
}