package užduotis1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Iveskite metus: ");
        int metai = sc.nextInt();

        if (metai >= 1896 && (metai - 1896) % 4 == 0) {
            int numeris = (metai - 1896) / 4 + 1;
            System.out.println("Olimpiniai metai");
            System.out.println("Olimpiados numeris: " + numeris);
        } else {
            System.out.println("Ne olimpiniai metai");
        }
    }
}

