import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        int a    = 1;
        int b    = 2;
        String c = "C";


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(a+"->"+b+"->"+c);
        bw.flush();
        bw.close();


    }
}