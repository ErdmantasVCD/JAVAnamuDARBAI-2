package užduotis3;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Iveskite metus: ");
        int metai = sc.nextInt();

        if (metai % 400 == 0 || (metai % 4 == 0 && metai % 100 != 0)) {
            System.out.println("Keliamieji metai");
        } else {
            System.out.println("Nekeliamieji metai");
        }
    }
}

