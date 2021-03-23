package algstudent.s4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SegmentsPlacementTimes {
    public void simulate() throws IOException {

        File file1;
        FileWriter greedy1;
        file1 = new File("greedy1.csv");
        if (file1.createNewFile()) {
            System.out.println("file created");
        }
        greedy1 = new FileWriter(file1);

        File file2;
        FileWriter greedy2;
        file2 = new File("greedy2.csv");
        if (file2.createNewFile()) {
            System.out.println("file created");
        }
        greedy2 = new FileWriter(file2);

        File file3;
        FileWriter greedy3;
        file3 = new File("greedy3.csv");
        if (file3.createNewFile()) {
            System.out.println("file created");
        }
        greedy3 = new FileWriter(file3);

        for (int i = 100; i <= 12800; i *= 2) {
            List<Integer> list = generateList(i);
            System.out.println("---------------" + i + "--------------");
            SegmentsPlacement segments = new SegmentsPlacement(list);

            long t1 = System.currentTimeMillis();
            segments.ostrichGreedy();
            greedy1.append((System.currentTimeMillis() - t1) + ",\n");
            greedy1.flush();

            t1 = System.currentTimeMillis();
            segments.greedyLongShort();
            greedy2.append((System.currentTimeMillis() - t1) + ",\n");
            greedy2.flush();

            t1 = System.currentTimeMillis();
            segments.greedyShortLong();
            greedy3.append((System.currentTimeMillis() - t1) + ",\n");
            greedy3.flush();

            System.out.println(i + " finished");

        }
        greedy1.close();
        greedy2.close();
        greedy3.close();
    }

    private List<Integer> generateList(int size) {
        Random rn = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(rn.nextInt(99));
        }
        return list;
    }

}
