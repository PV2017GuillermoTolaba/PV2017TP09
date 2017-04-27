/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author WallHero
 */
@ManagedBean
@SessionScoped
public class ManagedBeanP03 {
    private ArrayList<Rectangulo> RectanguloxD = new ArrayList<Rectangulo>(){};
    public ManagedBeanP03() {
        Rectangulo miniRect = new Rectangulo(0, 0, 4, 3);
        RectanguloxD.add(miniRect);
        miniRect = new Rectangulo(1,2, 15, 9);
        RectanguloxD.add(miniRect);
        miniRect = new Rectangulo(1,2, 15, 9);
        RectanguloxD.add(miniRect);        
    }
    
    public void borrarRectangulo(Rectangulo objet)
    {
        RectanguloxD.remove(objet);
    }
/*
        public void borrarRectangulo(int borrado)
    {
        RectanguloxD.remove(borrado);
    }
    */
    public ArrayList<Rectangulo> getRectanguloxD() {
        return RectanguloxD;
    }

    public void setRectanguloxD(ArrayList<Rectangulo> RectanguloxD) {
        this.RectanguloxD = RectanguloxD;
    }
}
