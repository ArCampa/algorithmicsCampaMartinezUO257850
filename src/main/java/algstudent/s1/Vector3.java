package algstudent.s1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Vector3 {
    public static void main(String arg[]) throws IOException {
        String[] args = new String[1];
        int i = 1;
        int counter = 0;
        File file = new File("resultsLinear.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        FileWriter fos = new FileWriter(file);
        while (true) {
            counter++;
            i++;// linear increase
            // i *= 5;
            // i = i^2; cuadratic increase
            args[0] = i + "";
            long t1 = System.currentTimeMillis();
            long t2 = new Vector2().main(args);
            fos.append((t2) + ",\n");
            fos.flush();
            if (counter >= 1000) {
                break;
            }
            System.out.println("i = " + i + " t2 = " + t2);
        }
        fos.close();

        counter = 0;
        i = 1;
        file = new File("results5.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);
        while (true) {
            counter++;
            // i++;//linear increase
            i *= 5;
            // i = i^2; cuadratic increase
            args[0] = i + "";
            long t1 = System.currentTimeMillis();
            long t2 = new Vector2().main(args);
            fos.append((t2) + ",\n");
            fos.flush();
            if (counter >= 1000) { 
                break;
            }
            System.out.println("i = " + i + " t2 = " + t2);
        }
        fos.close();

        new MatrixOperationsTimes();
    }
}