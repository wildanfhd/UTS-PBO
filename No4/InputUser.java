import java.util.Scanner;

public class InputUser{
  protected Scanner ourInput = new Scanner(System.in);
  protected double jariJari;

  public void setInputan(){
    System.out.print("Masukkan Jari-jari : ");
    this.jariJari = ourInput.nextDouble();
  }

}