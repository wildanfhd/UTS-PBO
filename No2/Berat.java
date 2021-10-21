import java.util.Scanner;

public class Berat{
  protected double beratBadan, tinggiBadan, IndexMassa;
  protected String badan;
  protected Scanner ourInput = new Scanner(System.in);
  
  public double inputBerat(){
    System.out.print("Masukkan Berat badan (kg): ");
    this.beratBadan = ourInput.nextDouble();
    return this.beratBadan;
  }

  public double inputTinggi(){
    System.out.print("Masukkan Tinggi badan (m): ");
    this.tinggiBadan = ourInput.nextDouble();
    return this.tinggiBadan;
  }

  public double getBerat(){
    
    return this.beratBadan;
  }

  public double getTinggi(){
    
    return this.tinggiBadan;
  }

  public String hitungIndexMassa(){
    this.IndexMassa = this.beratBadan/(this.tinggiBadan*this.tinggiBadan);
    if((this.IndexMassa >= 18.5) && (this.IndexMassa <= 22.9)){
      this.badan = "Ideal";
      System.out.println("Berat badan anda termasuk " + this.badan + ", Bagus!!");
    } else if(this.IndexMassa > 22.9){
      this.badan = "Overweight";
      System.out.println("Berat badan anda termasuk " + this.badan + ", Wah kamu harus mengurangi makanan cepat saji!");
    } else if(this.IndexMassa < 18.5){
      this.badan = "Underweight";
      System.out.println("Berat badan anda termasuk " + this.badan + ", Ayo terapkan pola hidup sehat!");
    }
    System.out.println("Body Mass Index anda = " + this.IndexMassa);
    return this.badan;
  }

  public void showInfo(){
    System.out.println("Berat badan anda = " + this.beratBadan + " kg");
    System.out.println("Tinggi badan anda = " + this.tinggiBadan  + " m");
    this.hitungIndexMassa();
  }

  // Main Method / Program Utama
  public static void main(String[] args) throws Exception {
    try{
      Berat jamal = new Berat();
      jamal.inputBerat();
      jamal.inputTinggi();
      jamal.showInfo();
    } catch(Exception e){
      System.out.println(e);
    }
    
  }
}



