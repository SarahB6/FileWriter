import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterClass
{

    public void does()
    {
        System.out.print("worked");
    }
    //take in a string and output a file
    public void writeFile(String fileName, String textEntry) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter( fileName));
        for(int i = 0; i<textEntry.length(); i++)
        {
            bw.write(textEntry.charAt(i));
        }
        bw.close();

    }
    //take in a file and output a string
    public String readFile(String fileName) throws IOException
    {
		BufferedReader br = new BufferedReader(new BufferedReader(new FileReader(fileName)));
        StringBuilder toReturn = new StringBuilder(); 
		while(br.ready())
		{
            char c = (char)br.read();
            toReturn.append(c);
        }
        br.close();
        return toReturn.toString();
        
        

    }
}
