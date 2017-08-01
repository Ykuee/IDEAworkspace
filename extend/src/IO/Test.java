package IO;

import java.io.File;
import java.util.Scanner;


/**
 * Created by Ykue on 2017/7/27.
 */
public class Test {
    public static void main(String[] args) {
        TestFile testFile = new TestFile();
        Test test = new Test();
/*        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        System.out.println(string);
        */
        //testFile.testReader();
        //testFile.testBuffere();
        //testFile.testReader();
        test.Test();
        int[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int es: i ) {
            System.out.println(es);
        }
    }
    public void Test(){
        System.out.println("s");
    }
}
