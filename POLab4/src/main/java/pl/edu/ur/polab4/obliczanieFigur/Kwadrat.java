package pl.edu.ur.polab4.obliczanieFigur;

public class Kwadrat {
    public double bok;
    public double pole;
    public double obwod;

    public Kwadrat(double bok) {
        this.bok = bok;
    }
    public void PKwadrat(){
        this.pole = bok*bok;
        this.obwod = 4*bok;
        System.out.println("Pole kwadratu: "+this.pole);
        System.out.println("Obwod kkwadratu: "+this.obwod);
    }


}
