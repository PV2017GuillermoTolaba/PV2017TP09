/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author WallHero
 */
@ManagedBean
@ApplicationScoped
public class AutosMB {
    private Auto[] Autos = new Auto[100];
    private int ocupado;

    public AutosMB() {
        Auto autito = new Auto("LS-220","VW","Blanco perla","C");
        Autos[0] = autito;
        autito = new Auto("LS-221","BMW","Celeste","A");
        Autos[1] = autito;
        autito = new Auto("LS-223","Ford","Rojo","B");
        Autos[2] = autito;
        autito = new Auto("LS-224","Fiat","Gris","A");
        Autos[3] = autito;
        ocupado = 3;
    }
    public void removerAuto(Auto autoing)
    {
        int i;
        for(i = 0; i <= ocupado; i++) if(Autos[i] == autoing) break;
        Autos[i].removerCoche();
        for(i=i; i<= ocupado; i++) Autos[i] = Autos[i+1];
    }
    public Auto[] obtenerAutos(){
        Auto[] AutoCargado = new Auto[ocupado+1];
        for(int i = 0; i <= ocupado; i++)
        {
            AutoCargado[i] = Autos[i];
        }
        return AutoCargado;
    }
    public Auto[] getAutos() {
        return Autos;
    }
    
    public void setAutos(Auto[] Autos) {
        this.Autos = Autos;
    }

    public int getOcupado() {
        return ocupado;
    }

    public void setOcupado(int ocupado) {
        this.ocupado = ocupado;
    }
    
}
