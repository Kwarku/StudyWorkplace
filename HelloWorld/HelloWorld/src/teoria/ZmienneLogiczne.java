package teoria;

import java.util.Random;
import java.util.Scanner;

public class ZmienneLogiczne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("podaj wynik testu");
        int testScore = sc.nextInt();
        char grade;
        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }


        System.out.println("Twoja ocena to: " + grade);

    }
}

class TerazSwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nr miesiaca najlepiej od 1 - 3");
        short nrMiesiace = sc.nextShort();

        switch (nrMiesiace) {
            case 1:
                System.out.println("Styczen");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            default:
                System.out.println("Juz mi sie nie chce dalej pisac");
        }
    }
}

class ZadanieZPetlaWhilePoczatek {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 11) {
            System.out.println("cout is : " + count);
            count++;

        }

    }
}

class PetlaWhileLiczMalejacych {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe rzeczywista");
        int number = sc.nextInt();
        int temp = number;

        while (number >= 0) {

            System.out.println("The number is: " + number--);
            //number--;

        }

        System.out.println("--------------------");
        while (number < temp) {
            //number++;
            System.out.println("The number is: " + ++number);

        }
        sc.close();
    }
}

class DoWhileDemo {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("count is: " + count);
            count++;
        } while (count < 1);
    }
}

class WartosciParzyste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        System.out.println("Enter some real number");
        int count = sc.nextInt();
        int tempCount = count;
        while (count > 0) {
            if (count % 2 == 0) {
                number++;
                System.out.println(number + " even number is:  " + count);

            }
            count--;
        }

        System.out.println("whole even number from 0 to " + tempCount + " is: " + number );
    }
}
class PetlaForDemo{
    public static void main(String[] args) {
        for (int i =0; i<10; i++) {
            System.out.println(i);
            i++;
        }
    }
}
class WypisanieTablicy{
    public static void main(String[] args) {
        int tab[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i =0; i<tab.length; i++) {
            System.out.println( i + " element is: " + tab[i]);
        }

        for (int element : tab) {
            System.out.println(element);
        }
    }
}

class BreakDemo{
    public static void main(String[] args) {
        int[] array = {15, 16, 17, 169, 16, 13, 51, 351, 13, 568, 43, 84134, 131, 1};
        int i;
        int searchfor = 43;
        boolean foundIt = false;

        for (i=0; i<array.length; i++) {
            if (array[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("found " + searchfor + " at index " + i);
        }else{
            System.out.println(searchfor + "not in the array");
        }
    }
}

class FindElementInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean ifFind = false;

        System.out.println("Podaj dlugosc tablicy");
        int arrayLenght = sc.nextInt();

        System.out.println("Podaj szukany element");
        int searchElement = sc.nextInt();

        int[] array = new int[arrayLenght];
        for (int i =0; i<array.length; i++) {
            array[i]= random.nextInt(arrayLenght);


        }

        int position;

        for (position=0 ; position<array.length; position++) {
            if (array[position] == searchElement) {
                ifFind = true;
                break;
            }
        }
        if (ifFind) {
            System.out.println("Found " + searchElement + " at index " + position);
        }else{
            System.out.println(searchElement + " not in the array");
        }


    }
}
class ContiniueDemo{
    public static void main(String[] args) {
        String searchMe = "peter piper pick a peck of pickled peppers";

        int max = searchMe.length();
        int numPs = 0;

        for (int i =0; i<max ; i++) {
            if (searchMe.charAt(i) != 'p') {
                continue;
            }
            numPs++;
        }
        System.out.println(searchMe);
        System.out.println("found " + numPs + "p's in the string");
    }
}

class ContinueExercise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some number");
        int userNumber = sc.nextInt();

        for (int i=0; i<userNumber; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}