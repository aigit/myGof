import org.junit.jupiter.api.Test;
import org.pattern.protype.Student;

import java.io.InputStream;

public class MyTest {

    @Test
    public void RunTimeTest() throws Exception{
        Runtime runtime = Runtime.getRuntime();
        Process ipconfig = runtime.exec("ipconfig");
        InputStream inputStream = ipconfig.getInputStream();
        byte[] bytes = new byte[1024*1024*100];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes,0,read,"gbk"));
        inputStream.close();
    }

    @Test
    public void test() throws CloneNotSupportedException {
        Student student = new Student();
        student.show();
        Student a = student.clone();
        a.show();

    }
}
