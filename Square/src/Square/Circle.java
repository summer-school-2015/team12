package Square;

/**
 * Created by User on 05/06/2015.
 */
public class Circle extends Figure{
    double r;
    String type;

    Circle(double r1)
    {

        r = r1;
        type = "Circle";
    }
    public String saymyname(){
        return  type;
    }
    public double square()
    {
        return 3.14 * r * r;
    }
}
