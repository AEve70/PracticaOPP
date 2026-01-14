

import java.util.Scanner;

public class IOManager {
    static Scanner in = new Scanner(System.in);
    
    
    public static void print(String message){
        System.out.println(message);
    }

    public static int readInt(){
        
        int value = in.nextInt();
        return value;
    }
}
