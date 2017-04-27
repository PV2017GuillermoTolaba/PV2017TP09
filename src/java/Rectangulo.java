
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WallHero
 */
public class Rectangulo implements Serializable{
    private Puntos A, B, C, D;
    private int bh, h, per, sup;
    
    public Rectangulo() {
    }
    public Rectangulo(int x, int y, int bh, int h)
    {
        this.A = new Puntos(x,y);
        this.bh = bh;
        this.h = h;
        this.per = (bh*2)+(h*2);
        this.sup = bh*h;
    }
    public Rectangulo(Puntos A, Puntos B, Puntos C, Puntos D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }


    public Puntos getA() {
        return A;
    }

    public void setA(Puntos A) {
        this.A = A;
    }

    public Puntos getB() {
        return B;
    }

    public void setB(Puntos B) {
        this.B = B;
    }

    public Puntos getC() {
        return C;
    }

    public void setC(Puntos C) {
        this.C = C;
    }

    public Puntos getD() {
        return D;
    }

    public void setD(Puntos D) {
        this.D = D;
    }

    public int getBh() {
        return bh;
    }

    public void setBh(int bh) {
        this.bh = bh;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public int getSup() {
        return sup;
    }

    public void setSup(int sup) {
        this.sup = sup;
    }
    
}
