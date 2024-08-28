import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a    = 3;
        String b = "C";

        bw.write(a + "\n" + b);
        bw.flush();
        bw.close();

    }
}