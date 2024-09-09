package algoritmos;

import java.util.Arrays;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digitalRoot(16));
    }

    public static int digitalRoot(int n) {

        return (1 + (n - 1) % 9);
//        String nString = Integer.valueOf(n).toString();
//
//        int[] nArray = new int[nString.length()];
//        for(int i =0; i < nString.length(); i++) {
//            nArray[i] = Character.getNumericValue(nString.charAt(i));
//        }
//
//        if(nArray.length == 1) {
//            return n;
//        }
//
//        return digitalRoot(Arrays.stream(nArray).sum());


    }
}
