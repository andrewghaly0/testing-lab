import java.util.Scanner;

public class yung {

    public String idle(int sumOfx,int sumOfy,int sumOfz ) {
        if (sumOfx == 0 && sumOfy == 0 && sumOfz == 0)
            return "yes";
        else
            return "no";
    }
    public static void main(String[] args) {
        System.out.println(" enter number of forces ");
        Scanner scan = new Scanner(System.in);
        int forces = scan.nextInt();
        int[] Farr = new int[forces*3];
        int sumOfx=0,sumOfy=0,sumOfz = 0;
        for (int i = 0; i < forces*3 ; i++)
            Farr[i] = scan.nextInt();
            for (int i = 0; i < forces*3 ; i += 3)
            {
                sumOfx = sumOfx + Farr[i];
                sumOfy = sumOfy + Farr[i+1];
                sumOfz = sumOfz + Farr[i+2];
            }

    }
}