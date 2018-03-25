package pl.edu.ur.polab4.obliczanieFigur;

public class Prostokat {
    public double dlbok;
    public double krbok;
    public double pole;
    public double obwod;

    public Prostokat(double dlbok, double krbok) {
        this.dlbok = dlbok;
        this.krbok = krbok;
    }
    public void PProstokat(){
        this.pole = dlbok*krbok;
        this.obwod = (2*dlbok) + (2*krbok);
        System.out.println("Pole prostokata: "+this.pole);
        System.out.println("Obwod prostokata: "+this.obwod);
    }


}
