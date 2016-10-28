import java.util.Random;
import java.util.Scanner;

public class Main {

    private static void showRandomMInMax(int min, int max, int N){
        int count=0;
        if (min > max) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        for (int i = 0; i < N; i++) {

            //get the range, casting to long to avoid overflow problems

            Random random = new Random();
            int range = (max * 10 - min) + 1;
            int randomNum = random.nextInt(range);

            if (randomNum < max)
            {
                count++;
            }

            //System.out.println("wygenerowano: "+randomNum);

        }
        System.out.println("liczba mieści się w przedziale: "+count);
    }

    public static void main(String[] args) {

        int max=0;
        int min=0;
        int countRandom=0;

        System.out.println("podaj ilość losowań: ");
        Scanner scanner = new Scanner(System.in);
        countRandom = scanner.nextInt();

        System.out.println("podaj min: ");
        Scanner scanner2 = new Scanner(System.in);
        min = scanner2.nextInt();

        System.out.println("podaj max: ");
        Scanner scanner3 = new Scanner(System.in);
        max = scanner2.nextInt();


        if(countRandom!=0 ||min!=0||max!=0)
        {
                showRandomMInMax(min,max,countRandom);
        }




        }
    }

