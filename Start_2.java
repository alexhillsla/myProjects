import java.io.IOException;

public class Start_2 {
    public static void main (String[] agrs) throws IOException {

        char ch, answer = 'B';

        System.out.println("Какую букву я загадал ?");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char)System.in.read();

        if (ch == answer) {
            System.out.println("Поздравляю! ");
        } else if (ch > answer) {
            System.out.println("Перестарался! ");
        } else {
            System.out.println("Недостарался! ");
        }


    }
}
