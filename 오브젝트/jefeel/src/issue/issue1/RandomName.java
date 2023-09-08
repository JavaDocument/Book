package issue.issue1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;


public class RandomName {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> nameList = new ArrayList<>();

        System.out.print("인원수를 입력해주세요 : ");
        int size = Integer.parseInt(br.readLine());
        int min = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("이름을 입력해주세요 : ");
            nameList.add(br.readLine());
        }

        int index = SecureRandom.getInstanceStrong().nextInt(size - min) + min;

        System.out.println(nameList.get(index));
    }
}
