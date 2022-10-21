import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int[] mas = new int[n+1];


        mas[0] = 2;
        int l = 1;
        int k = 0;


        for (int i = 3; i < n+1; i = i + 1){
            k =0;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0 && j != i){
                    k =1;
                    break;
                }
            }
            if ( k == 0) {
                mas[l] = i;
                l++;
            }
        }

        //pomulku 3 indekcamu
        /*for (int i = 3; i < n+1; i = i + 2){
            if ( i > 10 && i % 10 == 5){
                continue;
            }

            for (int j = 0; j < mas.length; j++){
                if (mas[j] == 0) break;

                if (mas[j]*mas[j]-1 > i){
                    mas[l] = i;
                    l++;
                    break;
                }

                if (i % mas[j] == 0) {
                    break;
                } else {
                    mas[l]= i;
                    l++;
                }
            }

        }*/


        for (int i : mas){
            if (i!=0) System.out.println(i);
        }
    }
}