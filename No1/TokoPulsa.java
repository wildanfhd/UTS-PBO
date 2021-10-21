import java.util.Scanner;

class TokoPulsa{
  protected double iniJam, iniMenit, iniDetik, totalWaktu;
  protected Scanner ourInput = new Scanner(System.in);

  public double inputHour(){
    System.out.print("Masukkan Jam : ");
    this.iniJam = ourInput.nextDouble();
    return this.iniJam;
  }
  
  public double inputMinute(){
    System.out.print("Masukkan Menit : ");
    this.iniMenit = ourInput.nextDouble();
    return this.iniMenit;
  }

  public double inputSecond(){
    System.out.print("Masukkan Detik : ");
    this.iniDetik = ourInput.nextDouble();
    return this.iniDetik;
  }

  public void countPulsa(){
    this.totalWaktu = (this.iniJam * 3600) + (this.iniMenit * 60) + this.iniDetik;
    System.out.println("Tarif pulsa yang dibutuhkan = Rp. " + (this.totalWaktu/5)*150);
    System.out.println("Lamanya Waktu = " + (this.totalWaktu/5) + "Detik");
  }

  public void showInfo(){
    System.out.print("" + this.iniJam + " jam, " + this.iniMenit + " menit, " + this.iniDetik + " detik");
  }

  public static void main(String[] args) {
    TokoPulsa jamal = new TokoPulsa();
    jamal.inputHour();
    jamal.inputMinute();
    jamal.inputSecond();
    jamal.countPulsa();
    jamal.showInfo();
  }
}