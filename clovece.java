import java.util.Random;
import java.util.Scanner;

public class clovece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Zadej délku herního pole: ");
        int n = sc.nextInt();
        int i = 0;

        int pozice = 0;
        int pozice2 = 0;

        int figurka = 0;
        int figurkaRandom = 0;

        int figurka2 = 0;
        int figurkaRandom2 = 0;

        while (pozice != n - 1 && pozice2 != n - 1) {

            if (i == 0) {
                System.out.print("0. hod - start -- > x# ");

                for (int j = 0; j < n - 1; j++) {
                    System.out.print("o ");

                }
                System.out.println();
            }

            else if (i % 2 == 1) {

                figurka = random.nextInt(6) + 1;
                while (figurka % 6 == 0) {
                    figurkaRandom = random.nextInt(6) + 1;
                    figurka += figurkaRandom;

                }

                System.out.print(i + ". hod (X) - padla " + figurka + " : ");
                for (int j = 0; j < n; j++) {

                    if (n - 1 < figurka + pozice) {
                        figurka -= figurka;
                        if (j == figurka2 + pozice2) {
                            System.out.print("# ");
                        } else {
                            System.out.print("o ");
                        }
                    }

                    else if (j == figurka + pozice) {
                        System.out.print("x ");
                    } else if (j == pozice2) {
                        System.out.print("# ");
                    } else {
                        System.out.print("o ");
                    }

                }

                if (pozice < n - 1) {
                    pozice += figurka;
                } else if (pozice > n - 1) {
                    pozice -= figurka;
                }

                if (pozice == pozice2) {
                    pozice2 = 0;
                }

                System.out.println();
            }

            else {

                figurka2 = random.nextInt(6) + 1;
                while (figurka2 % 6 == 0) {
                    figurkaRandom2 = random.nextInt(6) + 1;
                    figurka2 += figurkaRandom2;
                }
                System.out.print(i + ". hod (#) - padla " + figurka2 + " : ");

                for (int j = 0; j < n; j++) {

                    if (n - 1 < figurka2 + pozice2) {
                        figurka2 -= figurka2;
                        if (j == figurka + pozice) {
                            System.out.print("x ");
                        } else {
                            System.out.print("o ");
                        }

                    } else if (j == figurka2 + pozice2) {
                        System.out.print("# ");
                    } else if (j == pozice) {
                        System.out.print("x ");
                    } else {
                        System.out.print("o ");
                    }

                }

                if (pozice2 <= n - 1) {
                    pozice2 += figurka2;

                } else if (pozice2 > n - 1) {
                    pozice2 -= figurka2;
                }

                if (pozice2 == pozice) {
                    pozice = 0;
                }

                System.out.println();
            }
            i++;
        }
        if (pozice > pozice2) {
            System.out.println("vyhrálo X");
        } else if (pozice2 > pozice) {
            System.out.println("vyhrálo #");
        }
        sc.close();
    }
}