package week11;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Printer {
    private String fileName;

    public Printer(String fileName) throws Exception {
        this.fileName = fileName;
    }

    public void printLinesWhichContain(String word) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
        reader.close();
    }
}
