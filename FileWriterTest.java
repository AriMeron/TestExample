public class FileWriterTest {
    public static void main (String[] args) {
        String test1 = "Hello!";
        writeStringToFile(test1);

        Sting txtTest = "filetest.txt";
        System.out.println(writeFileToString(txtTest));
    }
} 