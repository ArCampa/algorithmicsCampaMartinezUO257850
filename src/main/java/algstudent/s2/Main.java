package algstudent.s2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String arg[]) throws IOException {
        int i = 10000;
        File file;
        FileWriter fos;
        file = new File("resultsBubbleDirect.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new Bubble(i);
            vector.directlySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Bubble Direct finished");
        fos.close();

        i = 10000;

        file = new File("resultsBubbleInverse.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new Bubble(i);
            vector.inverselySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Bubble Inverse finished");
        fos.close();

        i = 10000;
        file = new File("resultsBubbleRandom.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new Bubble(i);
            vector.randomlySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Bubble Random finished");
        fos.close();

        // ---------------------------------------------------

        i = 10000;
        file = new File("resultsSelectionDirect.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new Selection(i);
            vector.directlySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Selection Direct finished");
        fos.close();

        i = 10000;
        file = new File("resultsSelectionInverse.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new Selection(i);
            vector.inverselySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Selection Inverse finished");
        fos.close();

        i = 10000;
        file = new File("resultsSelectionRandom.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new Selection(i);
            vector.randomlySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Selection Random finished");
        fos.close();

        // ---------------------------------------------------------

        i = 10000;
        file = new File("resultsInsertionDirect.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new Insertion(i);
            vector.directlySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Insertion Direct finished");
        fos.close();

        i = 10000;
        file = new File("resultsInsertionInverse.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new Insertion(i);
            vector.inverselySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Insertion Inverse finished");
        fos.close();

        i = 10000;
        file = new File("resultsInsertionRandom.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new Insertion(i);
            vector.randomlySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Insertion Random finished");
        fos.close();


        //---------------------------------------------------

        i = 10000;
        file = new File("resultsQuicksortDirect.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new QuicksortCentralElement(i);
            vector.directlySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Quicksort Central Direct finished");
        fos.close();

        i = 10000;
        file = new File("resultsQuicksortInverse.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new QuicksortCentralElement(i);
            vector.inverselySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Quicksort Central Inverse finished");
        fos.close();

        i = 10000;
        file = new File("resultsQuicksortRandom.csv");
        if (file.createNewFile()) {
            System.out.println("file created");
        }
        fos = new FileWriter(file);

        while (i < 2560000) {
            i *= 2;
            Vector vector = new QuicksortCentralElement(i);
            vector.randomlySorted();

            long t1 = System.currentTimeMillis();

            vector.sort();

            fos.append((System.currentTimeMillis() - t1) + ",\n");
            fos.flush();
        }

        System.out.println("Quicksort Central Random finished");
        fos.close();
    }
}
