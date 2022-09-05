import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("c://Test/Work.txt");
        int c;
        while ((c=reader.read())!= -1) {
            System.out.print((char) c);
        }
    }
}
