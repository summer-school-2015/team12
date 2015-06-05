package Square;

/**
 * Created by User on 05/06/2015.
 */
public class Triangle extends Figure{
    double a;
    double h;

    String type;
    Triangle(double a1, double h1)
    {

        a = a1;
        h = h1;
        type = "Triangle";
    }
    public String saymyname(){
        return  type;
    }
    public double square()
    {
        return a * h / 2;
    }
}
