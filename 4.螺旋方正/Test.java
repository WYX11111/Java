import java.util.Scanner;

public class Test {
    int a[][] = null;
    int n = 0;
    int M;
    int m = 1;

    public void creat() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n][n];
        M = n * n;
    }
    public void input(int t){
        int j = t,i = t,k;
        if(m <= M){
            for(k = 0; k < n - t * 2; k++,j++,m++)
                a[i][j] = m;
            j--;
            i++;
            for(k = 0; k < n - t * 2 - 1 ; k++,i++,m++)
                a[i][j] = m;
            i--;
            j--;
            for(k = 0; k < n - t * 2 - 1 ; k++,j--,m++)
                a[i][j] = m;
            j++;
            i--;
            for(k = 0; k < n - t * 2 - 2 ; k++,i--,m++)
                a[i][j] = m;
            input(t+1);
        }
    }
    public void output(){
        for(int p = 0; p < n; p++){
            for(int q = 0; q < n; q = q+2) {
                System.out.print(a[p][q] + " ");
            }
            System.out.println();
        }
    }
}
