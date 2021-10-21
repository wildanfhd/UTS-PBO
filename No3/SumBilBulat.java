import java.util.Scanner;

class InputUser{
  protected Scanner ourInput = new Scanner(System.in);
  protected int bilBulat, total;

  public void setInputan(){
    System.out.println("Masukkan 10 Bilangan Bulat : ");
    for(int j = 1; j <= 10; j++){
      System.out.print("Masukkan nilai ke-" + j + " : ");
      this.bilBulat = ourInput.nextInt();
      this.total = this.total + this.bilBulat;
    }
  }

  public void sumBilangan(){
    System.out.println("Totalnya adalah " + this.total);
  }
}

public class SumBilBulat{
  public static void main(String[] args) {
    InputUser bilKita = new InputUser();
    bilKita.setInputan();
    bilKita.sumBilangan();
  }
}