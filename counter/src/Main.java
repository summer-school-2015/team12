
import java.io.IOException;
import java.util.*;
import java.io.*;
public class Main {
static int nstr = 0;
static int nsymb = 0;
    static int nword = 0;


    public static void main(String[] args) throws IOException{
        String path1 = args[0].substring(3);
        String path2 = args[1].substring(3);


        if (args[0].contains(path1)) {
          try(  FileInputStream fin = new FileInputStream(path1)) {
              ReadFile();
              PrintConsole();
          }
            catch (IOException er)
            {
                System.out.println(er.getMessage());
            }
        }
        if (args[0].contains(path1) && args[1].contains(path2)) {
            ReadFile();
            PrintFile();
        }

        if (args[1].contains(path2)) {
            ReadConsole();
            PrintFile();
        }

        if (args.length == 0) {
            ReadConsole();
            PrintConsole();
        }
    }

    public static void ReadFile() {
        String str = "";
        String all = "";
        try(BufferedReader fis = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\counters\\if.txt"))){
           str=fis.readLine();
            while(!str.equals("")){
                nstr++;
                all += str + " ";
                nsymb += str.length();
            }
            StringTokenizer fas = new StringTokenizer(all);
            nword = fas.countTokens();
        }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
    }

    static void PrintConsole() {

    }

    static void ReadConsole() {
        System.out.println(nstr + " " + nword + " " + nsymb);

    }

    static void PrintFile() {
    }

}