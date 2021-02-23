package algstudent.s1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import algstudent.s0.MatrixOperations;
import algstudent.s12.Loop1;
import algstudent.s12.Loop2;
import algstudent.s12.Loop3;
import algstudent.s12.Unknown;

public class MatrixOperationsTimes {
    public MatrixOperationsTimes() throws IOException {
        String[] args = {};
        main(args);
    }

    public static void main(String arg[]) throws IOException {
        int limit = 1000;

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
            new MatrixOperations(i, 0, i).sumDiagonal1();
            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
            if (counter >= limit * 10) { // if execution time is longer than 10 minutes
                break;
            }
        }

        System.out.println("diag1 finished");
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
            new MatrixOperations(i, 0, i).sumDiagonal2();
            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
            if (counter >= limit * 10) { // if execution time is longer than 10 minutes
                break;
            }
        }

        System.out.println("diag2 finished");
        fos.close();

        // lab 3
        file = new File("loop1.csv");
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
            Loop1.loop1(i);
            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
            if (counter >= limit) { // if execution time is longer than 10 minutes
                break;
            }
        }
        System.out.println("loop1 finished");

        fos.close();
        file = new File("loop2.csv");
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
            Loop2.loop2(i);
            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
            if (counter >= limit) { // if execution time is longer than 10 minutes
                break;
            }
        }
        System.out.println("loop2 finished");

        fos.close();
        file = new File("loop3.csv");
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
            Loop3.loop3(i);
            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
            if (counter >= limit) { // if execution time is longer than 10 minutes
                break;
            }
        }
        
        System.out.println("loop3 finished");

        file = new File("unknown.csv");
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
            Unknown.unknown(i);
            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
            if (counter >= limit) { // if execution time is longer than 10 minutes
                break;
            }
        }

        fos.close();

        System.out.println("finished");
    }
}
