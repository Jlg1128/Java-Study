package InputStream;

import java.io.*;

public class InputStream {
    public static void main(String[] args) throws Exception{
        FileInputStream input = new FileInputStream("InputStream/test.txt");
        FileOutputStream output = new FileOutputStream("InputStream/output.txt");
        int len;
        byte[] buff = new byte[1024];
        while(( len = input.read()) != -1){
            output.write(buff, 0, len);
        }
    }
}

