import java.io.*;

public class filestr {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file2.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}