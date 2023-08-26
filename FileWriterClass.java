import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;

public class FileWriterClass
{
    //take in a string and output a file
    public void writeFile(String fileName, String textEntry) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter( fileName));
        for(int i = 0; i<textEntry.length(); i++)
        {
            bw.write(fileName.charAt(i));
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
            toReturn.append(br.read());
        }
        br.close();
        return toReturn.toString();

    }
}
