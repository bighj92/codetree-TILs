import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        int a    = 3;
        String b = "C";

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(b+"!.....!"+a);
        bw.flush();
        bw.close();


    }
}