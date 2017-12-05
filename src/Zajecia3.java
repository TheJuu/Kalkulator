
public class Zajecia3 {

	public static void main(String[] args) {
		
		
		int tablica[] = {1,2,3,4,5,6};
		int liczba = 1;
		WypiszLiczby(liczba);
		WypiszLiczby(tablica);

	}
  public static void WypiszLiczby(int jakasTablica[]) 
  {
	  for (int i = 0; i < jakasTablica.length; i++) {
		  
		  System.out.println(jakasTablica[i]);
	  }
  }
	public static void WypiszLiczby(int j) {
		 System.out.println(j);
	}
}
