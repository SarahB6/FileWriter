import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tester 
{
    public static void main(String[] args) throws IOException
    {
        FileWriterClass frc = new FileWriterClass();

        String fileName = "testerFile";
        String string = "this is a test";
        frc.does();
        
        System.out.println();
        System.out.println("test");
        frc.writeFile(fileName, string);
        String s = frc.readFile(fileName);
        System.out.println(s);

        System.out.println();
        System.out.println("# of characters: " + frc.countCharacters(fileName));
    }
}
