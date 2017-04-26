/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.javafx.logging.PulseLogger.addMessage;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author WallHero
 */
@ManagedBean
@SessionScoped
public class Libreria {

    private int ISBN = 0;
    private String titulo = "";
    private String autor = "";
    private int precio = 0;
    private boolean comp = false;
    private ArrayList<LibreriaLib> libros = new ArrayList<LibreriaLib>(){};
    private LibreriaLib libro;
    public Libreria() {
    }
    public void agregarLibro()
    {
        comp = false;
        libro = new LibreriaLib(ISBN, titulo, autor, precio);
//        libro.agregarLibro();
        if(comprobarISBN(ISBN) == 0)
        {    
            libros.add(libro);
            comp = true;
        }  
        else addMessage("El ISBN introducido está en uso");
    }
    public int comprobarISBN(int nuevo){
        for(int i = 0; i < libros.size(); i++)
        {
            if(libros.get(i).getISBN() == nuevo) return 1;
        }
        return 0;
    }   
         
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the libros
     */
    public ArrayList<LibreriaLib> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList<LibreriaLib> libros) {
        this.libros = libros;
    }

    /**
     * @return the comp
     */
    public boolean isComp() {
        return comp;
    }

    /**
     * @param comp the comp to set
     */
    public void setComp(boolean comp) {
        this.comp = comp;
    }
}
