package pl.edu.ur.polab4.obliczanieFigur;

public class Kolo {
   public double promien;
   public double pole;
   public double obwod;

    public Kolo(double promien) {
        this.promien = promien;
    }
    public void PKolo(){
    this.pole = 3.14*(promien*promien);
    this.obwod = 2*3.14*promien;
    System.out.println("Pole kola: "+this.pole);
    System.out.println("Obwod kola: "+this.obwod);
    }


}
