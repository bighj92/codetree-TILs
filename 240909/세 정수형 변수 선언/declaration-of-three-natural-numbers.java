import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.

        
        int n1 = 7;
        int n2 = 23;
        int n3 = 30;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(n1 + " + " + n2 + " = " + n3);
        bw.flush();
        bw.close();

    }
}