package teoria;

public class Tablice {
    public static void main(String[] args) {
        int[] listaIntow;
        listaIntow = new int[3];
        listaIntow[0] = 100;
        listaIntow[1] = 200;
        listaIntow[2] = 300;
//        listaIntow[3] = 400;

        System.out.println("Pierwszy elemten: " + listaIntow[0]);
        System.out.println("Drugi element: " + listaIntow[1]);
        System.out.println("Trzeci elemenet: " + listaIntow[2]);
//        System.out.println("Trzeci elemenet: " + listaIntow[3]);

        System.out.println("--------------------");

        int[] nowaLista = {100, 200, 300, 400};
        System.out.println("Pierwszy elemten: " + nowaLista[0]);
        System.out.println("Drugi element: " + nowaLista[1]);
        System.out.println("Trzeci elemenet: " + nowaLista[2]);
        System.out.println("Ostatni elemenet: " + nowaLista[3]);

//        for (int liczba : nowaLista) {
//            System.out.println("element: " + liczba);
//
//        }

        System.out.println("-------------------------------");

        int[] dynamicznaAlokacjaListy = new int[2];
        dynamicznaAlokacjaListy[0] = 10;
        dynamicznaAlokacjaListy[1] = 20;

        System.out.println("Pierwszy elemten: " + dynamicznaAlokacjaListy[0]);
        System.out.println("Drugi element: " + dynamicznaAlokacjaListy[1]);

        /*teoria.Tablice wielowymiarowe*/
        String[][]tablica = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"James", "Rebecka"}} ;

        System.out.println("powinno byc Mr. James : " + tablica[0][0] + tablica[1][0]);
        System.out.println("powinno byc Mrs. Rebecka : " + tablica[0][1] + tablica[1][1]);
        System.out.println("powiino byc Ms.Rebecka: " + tablica[0][2] + tablica[1][1]);

        //Kopiowanie tablicy
        System.out.println("------------");
        System.out.println("kopiowanie tablicy");

        char[] copyFrom ={'a','b','c','d','e','f','g','h','i'};
        char[] copyTo = new char[4];

        System.arraycopy(copyFrom, 1, copyTo, 0, copyTo.length );
        for (char znak : copyTo) {
            System.out.println(znak);
        }

        System.out.println("----------------");

        char[] nowa = java.util.Arrays.copyOfRange(copyFrom,2,4);
        System.out.println(nowa);
        System.out.println(2%4);


    }

}
