import java.util.Random;

public class SelectSort {
    public static void main(String args[]){
        int a[] = new int[10];
        Random random = new Random();

        for(int i = 0 ; i < a.length ; i++){
            a[i] = random.nextInt() % 100;
        }

        for(int i = 0 ; i < a.length - 1 ; i++){
            int j = i;
            for (int k = i + 1; k < a.length; k++)
                if (a[j] > a[k])
                    j = k;
            if(i != j){
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }

        for(int i = 0 ; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
