import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int hsptlA = 0;
        int hsptlB = 0;
        int hsptlC = 0;
        int hsptlD = 0;

        for(int i = 0 ; i < 3 ; i++) {
            
            String coldYn = sc.next();
            int    tmp    = sc.nextInt();

            if      ("Y".equals(coldYn) && tmp >= 37) hsptlA++;
            else if ("N".equals(coldYn) && tmp >= 37) hsptlB++;
            else if ("Y".equals(coldYn) && tmp <  37) hsptlC++;
            else hsptlD++;

        }
        
        if (hsptlA >= 2) System.out.print("E");
        else System.out.print("N");

    }
}