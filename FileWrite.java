import java.io.*;

public class FileWrite {

    public void writeStringToFile (String str) throws IOException {
        PrintWriter pw = new PrintWriter("fileTest.txt");
        for(int i = 0; i < str.length(); i++)
            pw.print(str.charAt(i));
        pw.close();
    }

    public String writeFileToString (String fileName) throws IOException {
        StringBuilder ret = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while(br.ready()) {
            ret.append((char) br.read());
        }
        br.close();
        return ret.toString();
    }
    
}