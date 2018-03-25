package pl.edu.ur.polab4.obliczanieFigur;

public class Szescian {
    public double bok;
    public double pole;
    public double objetosc;

    public Szescian(double bok) {
        this.bok = bok;
    }
    public void PSzescian(){
        this.pole = 6*(bok*bok);
        this.objetosc = bok*bok*bok;
        System.out.println("Pole szescianu: "+this.pole);
        System.out.println("Objetosc szescianu: "+this.objetosc);
    }


}
