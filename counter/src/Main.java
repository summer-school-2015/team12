
import java.io.IOException;
import java.util.*;
import java.io.*;
public class Main {
static int nstr = 0;
static int nsymb = 0;
    static int nword = 0;


    public static void main(String[] args) throws IOException {

        if (args.length == 2) {
            if (args[0].contains("if=")) {
                try (FileInputStream fin = new FileInputStream(args[0].substring(3))) {
                    ReadFile(args[0].substring(3));
                } catch (IOException er) {
                    System.out.println(er.getMessage());
                }
                try (FileOutputStream fin = new FileOutputStream(args[1].substring(3))) {
                    PrintFile(args[1].substring(3));
                } catch (IOException ero) {
                    System.out.println(ero.getMessage());
                }


            } else {
                try (FileInputStream fin = new FileInputStream(args[1].substring(3))) {
                    ReadFile(args[1].substring(3));
                } catch (IOException er) {
                    System.out.println(er.getMessage());
                }
                try (FileOutputStream fin = new FileOutputStream(args[0].substring(3))) {
                    PrintFile(args[0].substring(3));
                } catch (IOException ero) {
                    System.out.println(ero.getMessage());
                }
            }
        }
            if (args.length == 1) {
                if (args[0].contains("if=")) {
                    try (FileInputStream fin = new FileInputStream(args[0].substring(3))) {
                        ReadFile(args[0].substring(3));
                    } catch (IOException er) {
                        System.out.println(er.getMessage());
                    }
                    PrintConsole();
                } else {
                    ReadConsole();
                    try (FileOutputStream fin = new FileOutputStream(args[0].substring(3))) {
                        PrintFile(args[0].substring(3));
                    } catch (IOException er) {
                        System.out.println(er.getMessage());
                    }

                }
            }
            if (args.length == 0) {
                ReadConsole();
                PrintConsole();
            }


        }



    public static void ReadFile(String path1) {
        String str = "";
        String all = "";
        try(BufferedReader fis = new BufferedReader(new FileReader(path1))){

            while((str = fis.readLine()) != null){

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
        System.out.println(nstr + " " + nword + " " + nsymb);
    }

    static void ReadConsole() {
        String str = "";
        String all = "";
        try(BufferedReader fis = new BufferedReader(new InputStreamReader(System.in))){

            while(!((str = fis.readLine()).equals(""))){

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

    static void PrintFile(String path2) {
        try(BufferedWriter fot = new BufferedWriter(new FileWriter(path2)))
        {
            fot.write("Strings = " + nstr);
            fot.newLine();
            fot.write("Words = " + nword);
            fot.newLine();
            fot.write("Symbols = " + nsymb);
        }
        catch (IOException err)
        {
            System.out.println(err.getMessage());
        }
    }

}