package issue.issue1;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public interface Input {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    String input();
}
