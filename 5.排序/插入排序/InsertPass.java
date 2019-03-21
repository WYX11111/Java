import java.util.Random;

public class InsertPass {
    public static void main(String args[]){
        int a[] = new int[10];
        int w, i, j;

        Random random = new Random();

        for(i = 0 ; i < a.length ; i++){
            a[i] = random.nextInt() % 100;
        }

        for(i = 1 ; i < a.length ; i++){
            if(a[i] < a[i - 1]){
                w = a[i];
                for(j = i - 1 ; j >= 0 && w < a[j]; j--)
                    a[j + 1] = a[j];
                a[j + 1] = w;
            }
        }

        for(i = 0 ; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
