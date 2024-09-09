import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.

        int num1 = 26;
        int num2 = 5;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(num1 + " * " + num2 + " = " + num1*num2);
        bw.flush();
        bw.close();
    }
}