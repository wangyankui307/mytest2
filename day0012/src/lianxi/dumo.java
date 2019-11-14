package lianxi;

import java.io.File;
import java.sql.SQLOutput;

//递归练习
public class dumo {
    public static void main(String[] args) {
        //求1到n的和 1 2 3 5 7 8
        System.out.println(method(5));
        //递归多级打印,找出。jpg文件
        File file = new File("day0011\\libs");
        method1(file);

    }

    protected static int method(int n) {
        if (n == 1) {
            return 1;
        }
        return n + method(n - 1);
        System.out.println("提交之后");
    }

    public static void method1(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                if(file1.getName().endsWith(".jpg"))
                System.out.println(file1);
            } else {
                method1(file1);
            }
        }
    }

}