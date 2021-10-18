import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

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
}
