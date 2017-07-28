package extendTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ykue on 2017/7/14.
 */
public class Wife extends Peson {
    @Override
    public void sing() {
        System.out.println("wife can sing");
    }

    public void arraylisttest(){
        int a = 100;
        List<String> list = new ArrayList();
        String[] strList = new String[list.size()];
        list.add(Integer.toString(a));
        list.add("fffs");
        strList = list.toArray(strList);
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
            System.out.println(strList[i]);
        }
//        for (int i=0; i<list.toArray().length; i++){
//            System.out.println(list.toArray()[i]);
//        }
    }
    public int singleNumber(int[] A) {
        if (null == A || A.length == 0) {
            return 0;
        }
        int n = A[0];
        for(int i = 1; i < A.length; i++) {
            System.out.println("前n的二进制"+Integer.toBinaryString(n));
            n = n ^ A[i];//出现两次的数异或后为0，只剩出现一次的数。
            System.out.println("this n ="+n);
            System.out.println("A[i]的二进制"+Integer.toBinaryString(A[i]));
            System.out.println("i="+i);
            System.out.println("-------");
        }
        return n;
    }



}
