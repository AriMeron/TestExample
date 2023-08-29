import java.io.*;

public class FileWrite {

    public void writeStringToFile (String str) throws IOException {
        FileWriter fw = new FileWriter("filetest.txt");
        fw.write(str);
        fw.close();
    }

    public String writeFileToString (String fileName) throws IOException {
        String ret = "";
        Scanner s = new Scanner(fileName);
        ret = Scanner.nextLine();
        return ret;
    }
    
}