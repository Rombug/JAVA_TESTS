package lt.code.academy.oopTest;

import java.util.Scanner;

public class SecondTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite Varda");
        String name = sc.nextLine();
        System.out.println("Iveskite Pavarde");
        String surname = sc.nextLine();
        System.out.println("Iveskite Asmens koda:");
        int ak = sc.nextInt();

        // Output input by user
        System.out.println("Vardas: " + name);
        System.out.println("Pavarde: " + surname);
        System.out.println("Asmens kodas: " + ak);
    }
}
