package week11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    private File file;
    private int lines;
    private int characters;

    public Analysis(File file) {
        this.file = file;

        try (Scanner scanner = new Scanner(file)) {
            // Read the file and count the lines and characters
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines++;
                characters += line.length();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getName());
        }
    }

    public int lines() {
        return lines;
    }

    public int characters() {
        return characters;
    }
}
