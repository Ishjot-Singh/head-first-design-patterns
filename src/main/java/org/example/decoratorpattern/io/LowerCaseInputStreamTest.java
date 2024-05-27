package org.example.decoratorpattern.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class LowerCaseInputStreamTest {
    public static void main(String[] args) {
        int c;
        try{
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/java/org/example/decoratorpattern/io/test.txt")
                    )
            );
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
