import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        int numerButa;

        System.out.println("Podaj numer buta: ");
        numerButa = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj średnią z matmy: ");
        double srednia = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj imię: ");
        String name = klawisz.nextLine();

        System.out.println("Twój numer buta to: " +
                numerButa + ", twoja średnia: " + srednia +
                ", imię: " + name);

    }
}
