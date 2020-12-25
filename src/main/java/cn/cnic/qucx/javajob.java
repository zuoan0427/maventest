package cn.cnic.qucx;

import javax.naming.Name;
import java.io.FileOutputStream;

/**
 * @author xyzhang
 * @create 2020-11-18 15:30
 */
public class javajob {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/opt/javatest.txt");
        fos.write("哈哈哈哈".getBytes());
        fos.close();
    }
}
