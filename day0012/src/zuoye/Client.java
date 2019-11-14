package zuoye;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        FileInputStream fis=new FileInputStream("C:\\IdeaProjects\\untitled\\day12\\libs\\propert.png");
        int len;
        byte [] b=new byte[8192];
        while ((len=fis.read(b))!=-1){
            os.write(b,0,len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        while ((len=is.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        os.close();
        fis.close();
        is.close();
        socket.close();
    }
}
