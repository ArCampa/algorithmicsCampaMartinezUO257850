package algstudent.s1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import algstudent.s0.MatrixOperations;

public class MatrixOperationsTimes {
    public MatrixOperationsTimes() throws IOException {
        String[] args = {};
        main(args);
    }
    public static void main(String arg[]) throws IOException {
        File file = new File("resultsDiag1.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        FileWriter fos = new FileWriter(file);

        int counter = 0;
        int i = 1;
        while (true) {
            counter++;
            i++;// linear increase
            // i *= 5;
            // i = i^2; cuadratic increase
            long t1 = System.currentTimeMillis();
            new MatrixOperations(i, -i, i).sumDiagonal1();
            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
            if (counter >= 1000) { // if execution time is longer than 10 minutes
                break;
            }
        }

        fos.close();



        file = new File("resultsDiag2.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        counter = 0;
        i = 1;
        while (true) {
            counter++;
            i++;// linear increase
            // i *= 5;
            // i = i^2; cuadratic increase
            long t1 = System.currentTimeMillis();
            new MatrixOperations(i, -i, i).sumDiagonal2();
            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
            if (counter >= 1000) { // if execution time is longer than 10 minutes
                break;
            }
        }

        fos.close();
    }
}
