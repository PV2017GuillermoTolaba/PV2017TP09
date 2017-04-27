
import java.io.Serializable;
public class Auto implements Serializable{
    private String Matricula = "";
    private String Marca = "";
    private String Color = "";
    private String Combustible = "";
    private String Modelo = "";
    public Auto() {
    }

    public Auto(String Mat, String Mar, String Col, String Comb, String Model)
    {
        Matricula = Mat;
        Marca = Mar;
        Color = Col;
        Combustible = Comb;
        Modelo = Model;
    }
    public void removerCoche()
    {
        Matricula = "";
        Marca = "";
        Modelo = "";
        Color = "";
        Combustible = "";
    }
    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    
}
