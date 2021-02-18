package algstudent.s1;

import java.io.IOException;

public class Vector2 {
    public static long main(String arg[]) throws IOException {
        
            long t1 = System.currentTimeMillis();
            new Vector1().main(arg);
            t1 = System.currentTimeMillis()-t1;
            return t1;
    } 
}
