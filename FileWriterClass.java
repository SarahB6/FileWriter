import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class FileWriterClass
{
    //take in a string and output a file
    public void writeFile(String textEntry)
    {
        
    }
    //take in a file and output a string
    public String readFile(String inputString, String fileName) throws IOException
    {
		BufferedReader br = new BufferedReader(new BufferedReader(new FileReader(fileName)));
        StringBuilder toReturn = new StringBuilder(); 
		while(br.ready())
		{
            toReturn.append(br.read());
        }
        return toReturn.toString();
    }
}
