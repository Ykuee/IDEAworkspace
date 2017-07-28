package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Ykue on 2017/7/27.
 */
public class Test {
    private String aaa = "sssss";
    FileOutputStream fileOutputStream = new FileOutputStream(aaa);


    public Test() throws FileNotFoundException {
    }
}
