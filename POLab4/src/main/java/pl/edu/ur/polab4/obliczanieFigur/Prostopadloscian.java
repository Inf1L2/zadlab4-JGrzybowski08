package pl.edu.ur.polab4.obliczanieFigur;

public class Prostopadloscian {
    public double krbok;
    public double dlbok;
    public double wysokosc;
    public double pole;
    public double objetosc;

    public Prostopadloscian(double krbok, double dlbok, double wysokosc) {
        this.krbok = krbok;
        this.dlbok = dlbok;
        this.wysokosc = wysokosc;
    }

    public void PProstopadloscian(){
        this.pole = (2*krbok*dlbok)+(2*krbok*wysokosc)+(2*dlbok*wysokosc);
        this.objetosc = krbok*dlbok*wysokosc;
        System.out.println("Pole Prostopadloscianu: "+this.pole);
        System.out.println("Objetosc Prostopadloscianu: "+this.objetosc);
    }


}
