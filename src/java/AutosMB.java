/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import org.primefaces.component.dialog.Dialog;
import org.primefaces.context.RequestContext;

/**
 *
 * @author WallHero
 */
@ManagedBean
@ApplicationScoped
public class AutosMB {
    private Auto[] Autos = new Auto[100];
    private int ocupado;
    private int modificando = -1;
    private String nuevamatricula = "", nuevamarca = "", nuevomodelo="", nuevocolor="", nuevocombustible="";
    public AutosMB() {
        Auto autito = new Auto("LS-220","VW","Blanco perla","C", "Gol");
        Autos[0] = autito;
        autito = new Auto("LS-221","BMW","Celeste","A", "R8");
        Autos[1] = autito;
        autito = new Auto("LS-223","Ford","Rojo","B", "Fiesta");
        Autos[2] = autito;
        autito = new Auto("LS-224","Fiat","Gris","A", "Siena");
        Autos[3] = autito;
        ocupado = 3;
        modificando = 0;
    }
 
    
    public void modificarAuto(Auto autoing)
    {
        int i;
        for(i = 0; i <= ocupado; i++) if(Autos[i] == autoing) break;
        this.modificando = i;
        nuevamatricula = modificandoAuto(0);
        nuevamarca = modificandoAuto(1);
        nuevomodelo = modificandoAuto(2);
        nuevocolor = modificandoAuto(3);
        nuevocombustible = modificandoAuto(4);
        
        /*RequestContext context = RequestContext.getCurrentInstance();
        context.execute("editado.show();");*/
    }    
    public void modificacionCoche()
    {
        Autos[modificando].setMatricula(nuevamatricula);
        Autos[modificando].setMarca(nuevamarca);
        Autos[modificando].setColor(nuevocolor);
        Autos[modificando].setCombustible(nuevocombustible);
        Autos[modificando].setModelo(nuevomodelo);
    }
    public String modificandoAuto(int opcion)
    {
       switch(opcion)
       {
           case 0: return Autos[modificando].getMatricula();
           case 1: return Autos[modificando].getMarca();
           case 2: return Autos[modificando].getModelo();
           case 3: return Autos[modificando].getColor();
           case 4: return Autos[modificando].getCombustible();
       }
       return ""; 
    }  
    public void removerAuto(Auto autoing)
    {
        int i;
        for(i = 0; i <= ocupado; i++) if(Autos[i] == autoing) break;
        Autos[i].removerCoche();
        for(i=i; i<= ocupado; i++) Autos[i] = Autos[i+1];
        ocupado--;
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

    public int getModificando() {
        return modificando;
    }

    public void setModificando(int modificando) {
        this.modificando = modificando;
    }

    public String getNuevamatricula() {
        return nuevamatricula;
    }

    public void setNuevamatricula(String nuevamatricula) {
        this.nuevamatricula = nuevamatricula;
    }

    public String getNuevamarca() {
        return nuevamarca;
    }

    public void setNuevamarca(String nuevamarca) {
        this.nuevamarca = nuevamarca;
    }

    public String getNuevomodelo() {
        return nuevomodelo;
    }

    public void setNuevomodelo(String nuevomodelo) {
        this.nuevomodelo = nuevomodelo;
    }

    public String getNuevocolor() {
        return nuevocolor;
    }

    public void setNuevocolor(String nuevocolor) {
        this.nuevocolor = nuevocolor;
    }

    public String getNuevocombustible() {
        return nuevocombustible;
    }

    public void setNuevocombustible(String nuevocombustible) {
        this.nuevocombustible = nuevocombustible;
    }
    
}
