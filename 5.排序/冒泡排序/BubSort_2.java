import java.util.Random;

public class BubSort_2{
	public static void main(String args[]){
		int a[] = new int[10];
		Random random = new Random();

		for(int i = 0 ; i < a.length ; i++){
			a[i] = random.nextInt() % 100;
		}
		int flag = 0;
		for(int i = 0 ; i < a.length - 1 ; i++){
			flag = 0;
			for(int j = 1 ; j < a.length - i; j++){
				if( a[j - 1] > a[j]){
					flag = 1;
					int t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
				}
			}
			if(flag == 0)
				break;
		}

		for(int i = 0 ; i < a.length ; i++){
			System.out.println(a[i]);
		}
	}
}
