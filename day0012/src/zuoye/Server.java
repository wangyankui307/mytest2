package zuoye;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8888);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        FileOutputStream fos=new FileOutputStream("C:\\IdeaProjects\\untitled\\day12\\libs\\bbb\\"+System.currentTimeMillis()+".png");
        int len;
        byte[] b=new byte[8192];
        while ((len=is.read(b))!=-1){
            fos.write(b,0,len);
        }
        OutputStream os = socket.getOutputStream();
        os.write("上传成功".getBytes());
        is.close();
        os.close();
        fos.close();
    }
}
