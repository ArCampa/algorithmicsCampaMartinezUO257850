package algstudent.s4;

import java.io.IOException;

public class Main {
    public static void main(String arg[]) throws IOException {
        new SegmentsPlacement("src/main/java/algstudent./s4/game1.txt");
        new SegmentsPlacement("src/main/java/algstudent./s4/game2.txt");
        new SegmentsPlacementTimes().simulate();
    }
}
