public class Three {
    public static void main(String args[]){
        int n = 10;
        int sum,k,j,m;
        for(int i = 1; i < n; i++){
            for(j = 1; ;j = j + 2) {
                sum = 0;
                for(k = 0; k < i; k++)
                    sum = sum + 2 * k + j;
                if(sum == i * i * i)
                    break;
            }
            System.out.print(i+"^3=");
            for(m = 0; m < i; m++) {
                System.out.print((j + 2 * m));
                System.out.print("+");
            }
            System.out.print(j + 2 * k);
            System.out.println();
        }
    }
}
