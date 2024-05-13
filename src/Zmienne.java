public class Zmienne {
    public static void main(String[] args) {

        int liczba;
        liczba = 13;

        double liczba2 = 17.7;

        System.out.println("Nasza zmienna: " + liczba);

        liczba = (int)liczba2;

        //liczba2 = liczba;
        System.out.println("Liczba: " + liczba);

        //komentarz
        int days = 5;
        int hours = 8;
        int weeks = 52;

        int workHoursPerYear = days * hours * weeks;

        System.out.println(workHoursPerYear);

        String napis = "Dzisiaj\t jest \"ładna\" pogoda";

        napis += ".";

        System.out.println("Moj \\ napis: " + napis);
        System.out.print("Moj \n napis: " + napis + "\n");
        System.out.print("Moj\t napis: " + napis + "\n");


        char znak = '#';

        boolean sun = true; //false

        // https://github.com/przemjan/trzeciaIgr1r2024

    }
}
