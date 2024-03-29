package algstudent.s4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SegmentsPlacement {
    List<Integer> elements;

    public void main(String file) {
        loadFile(file);

        ostrichGreedy();
        greedyLongShort();
        greedyShortLong();
    }

    public void setList(List<Integer> list) {
        elements = list;
    }

    public SegmentsPlacement(String file) {
        main(file);
    }

    public SegmentsPlacement(List<Integer> list) {
        setList(list);
    }

    private void loadFile(String file) {
        BufferedReader fich = null;
        String line;
        elements = new ArrayList<Integer>();

        try {
            fich = new BufferedReader(new FileReader(file));
            line = fich.readLine(); // first element of the file
            while (line != null) {
                elements.add(Integer.parseInt(line));
                line = fich.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is no file: " + file);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + file);
        } finally {
            if (fich != null)
                try {
                    fich.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file: " + file);
                    e.printStackTrace();
                }
        }

    }

    void ostrichGreedy() {
        int size = elements.get(0);
        int pufosos = 0;
        int line = 0;
        int added = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        while (size > added) {
            queue.add(elements.get(added));
            added++;
        }
        for (int i = 0; i < queue.size(); i++) {
            int prevLine = line;
            int current = queue.poll();
            line += current;
            int calculoPuf = (line + prevLine) / 2;
            pufosos += calculoPuf;
            System.out.println("S" + i + ": (" + prevLine + " to " + line + "), midpoint =" + calculoPuf);
        }
        System.out.println("Cost of greedy 1 = " + pufosos);
        System.out.println();
    }

    void greedyLongShort() {
        int size = elements.get(0);
        int pufosos = 0;
        int line = 0;
        int added = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        while (size > added) {
            int element = -1;
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i) > element && !queue.contains(elements.get(i)))
                    element = elements.get(i);
            }
            if (element >= 0)
                queue.add(element);
            added++;
        }
        for (int i = 0; i < queue.size(); i++) {
            int prevLine = line;
            int current = queue.poll();
            line += current;
            int calculoPuf = (line + prevLine) / 2;
            pufosos += calculoPuf;
            System.out.println("S" + i + ": (" + prevLine + " to " + line + "), midpoint =" + calculoPuf);
        }
        System.out.println("Cost of greedy 2 = " + pufosos);
        System.out.println();
    }

    void greedyShortLong() {
        int size = elements.get(0);
        int pufosos = 0;
        int line = 0;
        int added = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        while (size > added) {
            int element = 100;
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i) < element && !queue.contains(elements.get(i)))
                    element = elements.get(i);
            }
            if (element < 100)
                queue.add(element);
            added++;
        }
        for (int i = 0; i < queue.size(); i++) {
            int prevLine = line;
            int current = queue.poll();
            line += current;
            int calculoPuf = (line + prevLine) / 2;
            pufosos += calculoPuf;
            System.out.println("S" + i + ": (" + prevLine + " to " + line + "), midpoint =" + calculoPuf);
        }
        System.out.println("Cost of greedy 3 = " + pufosos);
        System.out.println();
    }

}
