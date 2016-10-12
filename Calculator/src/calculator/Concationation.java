package calculator;
//@author Artsiom_Berazavik

public class Concationation {
    
    public double x; //int 0 by default
    public double y; //int 0 by default
    
   
    public Concationation () {
    }
//Constructor, wait for two int
    public Concationation (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double add (double x, double y) {
        return x + y;
    }

}
