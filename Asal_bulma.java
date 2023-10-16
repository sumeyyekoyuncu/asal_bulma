
import java.util.Scanner;


public class Asal_bulmaa {
  public static int asalMı(int a){
      for(int i=2;a>i;i++){
          if(a%i==0){
            return 0;
          }
        }  
            return 1; 
     }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("asalligini kontrol etmek istediginiz sayiyi girin");
        int sayi=scanner.nextInt();
        if(asalMı( sayi)==1){
            System.out.println(sayi+"sayisi asaldir");
            
        }
        else{
            System.out.println(sayi+"sayisi asal degildir...");
        }
        
       
    }
}
