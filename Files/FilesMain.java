package Files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesMain {
    public static void main(String[] args) {
        //fileStreamsDemo();
        fileReadWriteDemo();
    }

    public static void fileStreamsDemo() {
        try {
            FileInputStream input = new FileInputStream("./Files/data.txt");
            FileOutputStream output = new FileOutputStream("./Files/output.txt");
            
            int buffer = input.read();
            while(buffer != -1) {
                System.out.println(buffer);
                output.write(buffer);
                buffer = input.read();
            }

            input.close();
            output.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileReadWriteDemo() {
        try {
            FileReader input = new FileReader("./Files/data.txt");
            FileWriter output = new FileWriter("./Files/output.txt");
            BufferedReader reader = new BufferedReader(input);
            
            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                output.write(line);
                output.write("\n");
                line = reader.readLine();
            }

            reader.close();
            input.close();
            output.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
