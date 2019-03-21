import java.util.Random;

public class QuickSort {
    public static int Partition(int a[], int low, int high){
        int w, pivotkey;
        w = a[low];
        pivotkey = a[low];
        while(low < high) {
            while (low < high && a[high] >= pivotkey)
                high--;
            if (low < high)
                a[low++] = a[high];
            while (low < high && a[low] <= pivotkey)
                low++;
            if (low < high)
                a[high--] = a[low];

        }
        a[low] = w;
        return low;
    }

    public static void QSort(int a[], int s, int t){
        int pivotloc;
        if(s < t){
            pivotloc = Partition(a, s, t);
            QSort(a, 0, pivotloc - 1);
            QSort(a, pivotloc+1, t);
        }
    }

    public static void main(String args[]){
        int a[] = new int[10];
        int w, i, j;

        Random random = new Random();

        for(i = 0 ; i < a.length ; i++){
            a[i] = random.nextInt() % 100;
        }

        QSort(a,0,a.length - 1);

        for(i = 0 ; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
