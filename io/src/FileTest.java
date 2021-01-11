import java.io.File;
import java.io.IOException;

public class FileTest {

    static void TestGetFileWithRelative(){
        File file = new File("../2.txt");
        System.out.println(file.getName());
    }

    static void TestGetFileWithabsolute(){
        File file = new File("/Users/ljshllw/codespace/Github/JavaTest/io/2.txt");
        System.out.println(file.getName());
    }

    static void FileAttribute() throws IOException {
        File file = new File("io/2.txt");
        System.out.println(file.getName()); //文件或目录的名称
        System.out.println(file.getParent()); //返回路径名的父级
        System.out.println(file.getParentFile()); //与上边有区别？
        System.out.println(file.getPath()); //路径名字符串
        System.out.println(file.isAbsolute()); //是否是绝对路径
        System.out.println(file.getAbsolutePath()); //绝对路径
        System.out.println(file.getAbsoluteFile()); //与上同？
        System.out.println(file.canRead()); //可读
        System.out.println(file.canWrite()); //可写
        System.out.println(file.exists()); //存在
        System.out.println(file.isDirectory()); //是否是目录
        System.out.println(file.isFile()); //是否是文件
        System.out.println(file.lastModified()); //最后一次修改时间戳
        System.out.println(file.length());  //长度
        //file.delete();  //删除
        //file.createNewFile(); //创建
        //file.deleteOnExit();  //虚拟机推出时候删除
        System.out.println(file.list());

    }

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        FileAttribute();
    }
}
