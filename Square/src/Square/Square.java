
package Square;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
/**
 * Created by User on 05/06/2015.
 */
public  class Square {

    public static void main(String[] args) {
        int n;
        String str;
        String str1;
        StringTokenizer st = new StringTokenizer("");

        try (BufferedReader fis = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\Square\\if.txt"))) {
            int i = 0;
            str = fis.readLine();
            n = Integer.parseInt(str);
            Figure arrfig[] = new Figure[n];

            while ((str = fis.readLine()) != null) {
                st = new StringTokenizer(str);
                str1 = st.nextToken();
                if (str1.contains("CIRCLE")) {
                    double r;
                    str1 = st.nextToken();
                    r = Double.parseDouble(str1);
                    arrfig[i] = new Circle(r);
                    i++;
                }
                if (str1.contains("TRIANGLE")) {
                    double a;
                    double h;
                    str1 = st.nextToken();
                    a = Double.parseDouble(str1);
                    str1 = st.nextToken();
                    h = Double.parseDouble(str1);
                    arrfig[i] = new Triangle(a, h);
                    i++;
                }
                if (str1.contains("RECTANGLE")) {
                    double a;
                    double b;
                    str1 = st.nextToken();
                    a = Double.parseDouble(str1);
                    str1 = st.nextToken();
                    b = Double.parseDouble(str1);
                    arrfig[i] = new Rectangle(a, b);

                    i++;

                }

                Figure tmp;
                int j;
                for (i = 0; i <= n - 1; i++) {
                    for (j = 0; j < n -i - 1; j++) {
                        if (arrfig[j].square() > arrfig[j + 1].square()) {
                            tmp = arrfig[j];
                            arrfig[j] = arrfig[j + 1];
                            arrfig[j + 1] = tmp;
                        }
                    }
                }

            }
            for(i = 0; i < n; i++) {
                double sqr = arrfig[i].square();
                System.out.println(arrfig[i].saymyname() + " " + sqr);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

