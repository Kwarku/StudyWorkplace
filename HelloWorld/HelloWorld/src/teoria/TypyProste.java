package teoria;

public class TypyProste {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        boolean result = true;
        char capitalC = 'C';
        byte wiek = 100;
        short zarobki = 10000;
        int wyswietlenia = 450000000;

        System.out.println("Czy mam dwie rece? : " + result +
                "\nwielka litera C :" + capitalC +
                "\nmoj wiek to: " + wiek +
                "\nzarabiam: " + zarobki +
                "\nmoje dane wyswietla : " + wyswietlenia + " osob");

        System.out.println("------------------------------------");

        int wartoscDecimal = 26;
        int wartoscHex = 0x1a;
        int wartoscBin = 0b11010;

        System.out.println("\nWartosc dzeisietna : " + wartoscDecimal +
                "\nWartosc szesnastkowa: " + wartoscHex +
                "\nWartosc binarna : " + wartoscBin);


        System.out.println("--------------------");

        double zmiennaDouble = 123.5;
        float zmiennaFloat = 123.5f;

        System.out.println("Zmianna typu double: " + zmiennaDouble +
                "\nzmienna typu float: " + zmiennaFloat +
                "\nzmienna double jako int: " + (int) zmiennaDouble);

        System.out.println("-----------------");
        float pi1 = 3.14_15f;
        float pi2 = 3.1415f;
        long socialNumberCode = 999_999_999L;

        int zmienna3 = 5___________2;

        System.out.println("Zmienne z podkresleniem : " +
                "\npi: " + pi1 +
                "\npi2: " + pi2 +
                "\nsocialCode :" + socialNumberCode +
                "\nzmienna int : " + zmienna3);

    }
}
