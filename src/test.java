import java.util.Scanner;
public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (in.hasNextInt()) {

                String A = in.next();
                String B = in.next();
                int count=0;
                int i = 0;
                for (i = 0; i < A.length(); i++) {

                    String S1 = A.substring(0, i);
                    String S2 = A.substring(i, A.length() - 1);

                    StringBuilder sb = new StringBuilder(S1);
                    StringBuilder C = sb.append(B).append(S2);
                    if (C.toString().equals(C.reverse().toString())) {
                        count++;
                    }
                    System.out.println(count);
                }

            }




        }
}