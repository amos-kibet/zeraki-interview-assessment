package Tasks;/*
   Create a temporary byte[]  of length equal
   to the length of the input string.
   Store the bytes (which we get by using
   getBytes() method) in reverse order into
   the temporary byte[] .
   Create a new String abject using byte[] to
   store result.
*/

import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {

        solutionOne();
    }

    static void solutionOne() {
        String input = "GeeksforGeeks";

        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println(new String(result));
    }

    static void solutionTwo() {

    }
}
