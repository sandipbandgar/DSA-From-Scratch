package MethodsInJava;

import java.util.Arrays;
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {

        float[] sub = new float[5];
        System.out.println(Arrays.toString(cgpa(sub)));

    }
    static float[] cgpa(float[] sub){
        Scanner in = new Scanner(System.in);
        int i;
        float sum=0;
        for (i = 0; i < sub.length ; i++) {
            sub[i] = in.nextInt();
            sum = sum + sub[i];
        }
        float cgpa = ((sum / i)/10);
        float cgpaP = cgpa * 9.5f;
        return new float[]{cgpa,cgpaP};
    }

}
