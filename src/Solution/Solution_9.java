package Solution;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * \* User: 史锴源
 * \* Date: 2019/5/6
 * \* Time: 10:24
 * \* Description:读取文件 逆序输出到另一个文件
 * \
 */
public class Solution_9 {
    public static List<Character> list= new ArrayList<Character>();
    public static void main(String[] args){
        run("1.txt", "2.txt");
    }
    public static void run(String filename, String inputfilename){
        File file = new File(filename);
        File file1 = new File(inputfilename);
        Reader reader = null;
        try{
            Writer writer = new PrintWriter(new FileWriter(file1));
            reader = new InputStreamReader(new FileInputStream(file));
            int temp;
            while((temp = reader.read()) != -1){
                list.add((char)temp);
            }
            reader.close();
            for(int i = list.size() - 1; i >= 0; i --){
                writer.write(list.get(i));
                writer.flush();
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}