public class FileWriterTest {
    public static void main (String[] args) {
        FileWrite fw = new FileWrite();
        String test1 = "Hello!";
        fw.writeStringToFile(test1);

        String txtTest = "filetest.txt";
        System.out.println(fw.writeFileToString(txtTest));
    }
} 