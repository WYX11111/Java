public class Narcissistic_num {
    public static void main(String args[]){
        int n = 1000;
        int i,m,b,r,sum = 0;
        for(i = 1; i < n; i++){
            m = i;
            while(m != 0){
                b = m % 10;
                sum = sum + b * b * b;
                m = m / 10;
            }
            if(sum == i)
                System.out.println(i);
            sum = 0;
        }
    }
}
