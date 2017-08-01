package IO;

import java.io.*;

/**
 * Created by Ykue on 2017/7/28.
 */
public class TestFile {
    File file = new File("E:/GGMyfriends/Test.txt");
    int count =  0;
    FileReader fileReader;
    PrintWriter fileWriter;
    InputStreamReader streamReader;
    BufferedReader bufferedReader;
    char[] buffer=new char[512];   //一次取出的字节数大小,缓冲区大小
    int numberRead=0;
    FileInputStream input=null;
    FileOutputStream out =null;



    public void  testReader(){
        try {
            fileReader = new FileReader(file);
            fileWriter = new PrintWriter(new File("E:/GGMyfriends/Test3.txt"));

            while ((numberRead=fileReader.read(buffer))!=-1){
                fileWriter.write(buffer, 0, numberRead);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
/*
    public void testBuffere(){
        try {

            input = new FileInputStream(file);
            out = new FileOutputStream(new File("E:/GGMyfriends/Test2.txt"));
            while ((numberRead = input.read(buffer)) != -1){
                out.write(buffer,0,numberRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                input.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
*/


    /*public  void testReader() {
        try {
            streamReader = new InputStreamReader(new FileInputStream(new File("E:/GGMyfriends/Test.txt")));
            bufferedReader = new BufferedReader(streamReader);
            String text;
//            System.out.println("****"+bufferedReader.readLine());
//            bufferedReader.reset();
            while((text = bufferedReader.readLine()) != null){
                count ++;
                System.out.println("----"+text);

            }
            System.out.println("总字节数："+count);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }*/


 /*   public void createFile(){
        file = new File("E:/GGMyfriends/Test.txt");
        try {
            file.createNewFile();
            file.mkdirs();
            System.out.println("该分区大小"+file.getTotalSpace()/(1024*1024*1024)+"G");
            System.out.println("文件名  "+file.getName());
            System.out.println("文件父目录字符串 "+file.getParent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}

class student implements Serializable{

}