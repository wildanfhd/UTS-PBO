class iniLingkaran extends InputUser{
  protected double keliling, luasLing, diameter;
  protected final double PI = 3.14;

  public double luasLingkaranKu(){
    this.luasLing = PI * this.jariJari * this.jariJari;
    return this.luasLing;
  }

  public double kelilingLingkaranKu(){
    this.diameter = this.jariJari * this.jariJari;
    this.keliling = 2* PI * this.jariJari;
    return this.keliling;
  }

  public void showInfo(){
    System.out.println("Diameter Lingkaran = " + this.diameter);
    System.out.println("Keliling Lingkaran = " + this.keliling);
    System.out.println("Luas  Lingkaran = " + this.luasLing);
  }

  public static void main(String[] args) {
    iniLingkaran roda = new iniLingkaran();
    roda.setInputan();
    roda.kelilingLingkaranKu();
    roda.luasLingkaranKu();
    roda.showInfo();
  }
}