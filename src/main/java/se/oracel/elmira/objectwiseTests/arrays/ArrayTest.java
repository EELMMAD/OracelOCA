package se.oracel.elmira.objectwiseTests.arrays;

public class ArrayTest {
    public static void main(String[] args){
        int ia[][] = { {1, 2}, null };
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println(ia[i][j]);
    }
}
