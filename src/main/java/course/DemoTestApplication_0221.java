package course;

import java.util.Random;
import java.util.Scanner;

public class DemoTestApplication_0221 {

    public static void main(String[] args) {
        Random randA = new Random();
        Random randB = new Random();
        Scanner scanner = new Scanner(System.in);
        int inp;

        do {
            System.out.println("賭A大輸入:1,賭B大輸入2:");
            inp = scanner.nextInt();
        } while (inp < 1 || inp > 2);
        int AA = randA.nextInt(6) + 1;
        int BB = randB.nextInt(6) + 1;

        System.out.println("骰完了,輸入OK打開碗蓋看結果");
        while (true) {
            if (scanner.hasNext("OK")) {
                break;
            }
        }

        System.out.println("A骰出" + AA);
        System.out.println("B骰出" + BB);

        if (inp == 1) {
            if (AA < BB) {
                System.out.println("你輸囉");
            } else if (AA > BB) {
                System.out.println("你贏了!");
            } else {
                System.out.println("平手");
            }
        } else if (inp == 2) {
            if (BB < AA) {
                System.out.println("你贏了!");
            } else if (BB > AA) {
                System.out.println("你輸囉");
            } else {
                System.out.println("平手");
            }
        }
    }
}