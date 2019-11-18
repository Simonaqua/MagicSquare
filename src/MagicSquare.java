import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MagicSquare {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int i;
        int j;
        int sum = 0;
        int rowCheckSum;
        int colCheckSum;
        int diagCheckSum = 0;
        ArrayList<Integer> sol = new ArrayList<Integer>();
        n = s.nextInt();
        int[][] square = new int[n][n];
        for(i = 0 ; i<n;i++){
            for(j = 0 ;j<n ; j++){
                square[i][j] = s.nextInt();
                if( i == j){
                    sum+=square[i][j];
                }
            }
        }

        for(i = 0 ; i<n ;i++){
                    diagCheckSum += square[i][n-i-1];
        }
        if(sum != diagCheckSum){
            sol.add(0);
        }
        for(i = 0 ; i<n; i++){
            rowCheckSum = 0;
            for (j = 0 ; j<n ; j++){
                rowCheckSum += square[i][j];
                }
            if(sum != rowCheckSum){
                sol.add(i+1);
            }
        }
        for(j = 0 ; j<n ; j++){
            colCheckSum = 0;
            for(i = 0 ; i<n ; i++){
                colCheckSum += square[i][j];
            }
            if(sum != colCheckSum){
                sol.add((j+1)*(-1));
            }
        }
        Collections.sort(sol);
        if(sol.size() != 0) {
            System.out.println(sol.size());
            for (i = 0; i < sol.size(); i++) {
                System.out.println(sol.get(i));
            }
        }
        else
            System.out.println(0);
    }
}
