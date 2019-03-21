import java.util.Random;

public class MergeSort {
    public static void Merge(int sr[], int tr[], int i, int m, int n){
        int j, k;

        for (j = m + 1 , k = i; i <= m && j <= n; k++){
            if (sr[i] <= sr[j])
                tr[k] = sr[i++];
            else
                tr[k] = sr[j++];
        }

        while(i <= m) tr[k++] = sr[i++];
        while(j <= n) tr[k++] = sr[j++];
    }

    public static void MSort(int sr[],int tr1[], int s, int t){
        int m;
        int tr2[] = new int [t + 1];
        if(s == t)
            tr1[s] = sr[s];
        else{
            m = (s + t)/2;
            MSort(sr, tr2, s, m);
            MSort(sr, tr2, m+1, t);
            Merge(tr2, tr1, s, m, t);
        }
    }

    public static void main(String args[]){
        int a[] = new int[10];
        int i;

        Random random = new Random();

        for(i = 0 ; i < a.length ; i++){
            a[i] = random.nextInt() % 100;
        }

        MSort(a,a,0,a.length - 1);

        for(i = 0 ; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    
}
