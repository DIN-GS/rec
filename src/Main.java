import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    static  Main m = new Main();
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());


        System.out.println(m.procto(n, 2));
    }


    public static boolean procto(int n,int k){
        if (k+1 > n ) return true;
        if (n % k ==0 && k!=n) return false;
        else return procto( n, ++k);
    }

}