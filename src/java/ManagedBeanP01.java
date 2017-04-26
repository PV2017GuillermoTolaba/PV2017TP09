/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author WallHero
 */
@ManagedBean
@ViewScoped
public class ManagedBeanP01 {
    private int[] almacenar = new int[10];
    private int n = 0;
    private int mayor, menor;
    private float prom = 0.0f;
    private int ocupado = 0;
    public ManagedBeanP01() {
    }
    public void agregarNumero()
    {
        if(ocupado == 10) return ;
        almacenar[ocupado] = n;
        if(ocupado == 0) mayor = almacenar[ocupado];
        else if(almacenar[ocupado] > mayor) mayor = almacenar[ocupado];
        if(ocupado == 0) menor = almacenar[ocupado];
        else if(almacenar[ocupado] < menor) menor = almacenar[ocupado];
        prom += almacenar[ocupado];
        ocupado++;
        n = 0;
    }
    public String obtenerRes(int opcion)
    {
        if(ocupado != 10) return "";
        String cadena = "";
        switch(opcion)
        {
            case 0: return cadena = "Mayor: [" + mayor +"]";
            case 1: return cadena = "Menor: [" + menor +"]";
            case 2: return cadena = "Promedio: [" + (prom/10.0) +"]";    
        }
        return "";
    }
 /*   public int obtenerResultados(int opcion)
    {
        switch(opcion)
        {
            case 0: return mayor;
            case 1: return menor;
            case 2: return (int) (prom/10.0);
        }
        return -1;
    }*/
    public String mostrarNumeros()
    {
        if(ocupado != 10) return "";
        String cadena = "";
        for(int i = 0; i < 10; i++) cadena = cadena + " " + almacenar[i];
        return cadena;
    }
    public void reiniciarTodo()
    {
        ocupado = 0;
        n= 0;
    }
    
    
    
    
    public int[] getAlmacenar() {
        return almacenar;
    }

    public void setAlmacenar(int[] almacenar) {
        this.almacenar = almacenar;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getOcupado() {
        return ocupado;
    }

    public void setOcupado(int ocupado) {
        this.ocupado = ocupado;
    }
}
