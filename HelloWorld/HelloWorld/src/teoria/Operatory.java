package teoria;

public class Operatory {
    public static void main(String[] args) {
        int zm1 = 2;
        int zm2 = 3;
        int wynik;
        wynik = zm1 + zm2;
        System.out.println("wynik to: " + wynik);
        wynik++;
        System.out.println("wynik to: " + wynik);
        wynik += zm2;
        System.out.println("wynik to: " + wynik);
        wynik -= zm1;
        System.out.println("wynik to: " + wynik);
        wynik = wynik % zm1;
        System.out.println("wynik to: " + wynik);


        String napis = "fajnie ";
        System.out.println((napis + napis));

        System.out.println(wynik + " *2");

        System.out.println("-----------");
        System.out.println("oryginal: " + wynik);
        System.out.println("wynik++ : " + wynik++);
        System.out.println("wynik: " + wynik);
        System.out.println("++wynik : " + ++wynik);
        System.out.println("wynik: " + wynik);

        System.out.println("---------");
        boolean czyPrawda = false;
        System.out.println("oryginal: " + czyPrawda);
        czyPrawda = !czyPrawda;
        System.out.println("negacja: " + czyPrawda);
        czyPrawda = !czyPrawda;
        System.out.println("negacja ponowna: " + czyPrawda);



        System.out.println("------------ ");
        if (zm1 == zm2 || zm1 > 0) {
            System.out.println("zm1 == zm2 lub zm1>0");
        }
        if (zm1 != zm2 && zm2 !=0) {
            System.out.println("zm1 != zm2 i zm2!=0");
        }

        System.out.println("---------");
        int a = 1;
        int b = 2;
        boolean czy = true;
        int cos = czy ? a : b;
        System.out.println(cos);
    }
}
