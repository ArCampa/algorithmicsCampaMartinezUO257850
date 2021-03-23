package algstudent.s4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SegmentsPlacementTimes {
    public void simulate() {
        for (int i = 0; i <= 12800; i++) {
            List<Integer> list = generateList(i);
            System.out.println("---------------" + i + "--------------");
            new SegmentsPlacement(list);
        }
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
