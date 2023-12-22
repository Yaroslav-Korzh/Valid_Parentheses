package org.example;

public class Meth {
    public boolean isValid(String strs) {
        char a = '(';
        char aa = ')';
        char b = '[';
        char bb = ']';
        char c = '{';
        char cc = '}';
        int a1 = 0; int a2 = 0; int b1 = 0; int b2 = 0; int c1 = 0; int c2 = 0;
        boolean result;

        for (int i = 0; i < strs.length(); i++) {
            if (strs.charAt(i) == a) {
                a1++;
            } else if (strs.charAt(i) == aa) {
                a2++;
            } else if (strs.charAt(i) == b) {
                b1++;
            } else if (strs.charAt(i) == bb) {
                b2++;
            } else if (strs.charAt(i) == c) {
                c1++;
            } else if (strs.charAt(i) == cc) {
                c2++;
            }
        }
        if (a1 == a2 && b1 == b2 && c1 == c2) {
            result = true;
        } else result = false;
        return result;
    }
}
