package calculatorab;
//@author Artsiom_Berazavik

public class Arithmetic {
    
    public double x; 
    public double y; 
    public double result = 42; 
    
 //Default constructor  
    public Arithmetic () {
    }
    
//Constructor, wait for two double
    public Arithmetic (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double add (double x, double y) {
        result = x + y;
        return result;
    }
    
    public double multiplicate (double x, double y) {
        result = x * y;
        return result;
    }
    
    public double division (double x, double  y) {
        if (y == 0) {
            System.out.println("Делить на ноль исторически не преемлемно" + " Потому что: ");
        } else {
        result = x / y;
        }
        return result;
    }

    public double subtraction(double x, double y) {
        result =  x - y;
        return result;
    }
}

