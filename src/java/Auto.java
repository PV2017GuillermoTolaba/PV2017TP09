
import java.io.Serializable;
public class Auto implements Serializable{
    private String Matricula = "";
    private String Marca = "";
    private String Color = "";
    private String Combustible = "";

    public Auto() {
    }

    public Auto(String Mat, String Mar, String Col, String Comb)
    {
        Matricula = Mat;
        Marca = Mar;
        Color = Col;
        Combustible = Comb;
    }
    public void removerCoche()
    {
        Matricula = "";
        Marca = "";
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
    
    
}
