import java.util.Scanner;

public class FibonacciSayiDizeleri {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int dizi [] = new int[40] ;
		dizi[0] = 1;
		dizi[1]=1;
		
		for(int i = 2 ; i < dizi.length ; i++ )
		{ dizi[i]=dizi[i-1]+dizi[i-2];
		
				System.out.println(+ dizi[i]);
		
		}
		}
	}
		
		

	

