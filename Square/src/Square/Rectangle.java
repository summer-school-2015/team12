package Square;

/**
 * Created by User on 05/06/2015.
 */
public class Rectangle extends Figure{
    double a;
    double b;

    String type;
    Rectangle(double a1, double b1)
    {

        a = a1;
        b = b1;
        type = "Rectangle";
    }
    public String saymyname(){
        return  type;
    }
    public double square()
    {
        return a * b;
    }
}
