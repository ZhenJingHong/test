package com.itheima.test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();

        int dot = s.indexOf('.');
        if (dot == -1) {
            System.out.println(s);
            return;
        }

        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '.') {
                d[i] = -1;
            } else {
                d[i] = ch - '0';
            }
        }

        int end = n;
        boolean hasDot = true;

        while (t > 0) {
            int pos = -1;
            for (int i = dot + 1; i < end; i++) {
                if (d[i] >= 5) {
                    pos = i;
                    break;
                }
            }
            if (pos == -1) break;

            end = pos;
            t--;

            int j = pos - 1;
            while (j >= 0) {
                if (j == dot) {
                    j--;
                    continue;
                }
                d[j]++;
                if (d[j] == 10) {
                    d[j] = 0;
                    j--;
                } else {
                    break;
                }
            }

            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append('1');
                for (int i = 0; i < end; i++) {
                    if (i == dot) break;
                    sb.append(d[i]);
                }
                System.out.println(sb.toString());
                return;
            }

            if (j < dot) {
                hasDot = false;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < end; i++) {
            if (i == dot) {
                if (hasDot) sb.append('.');
                continue;
            }
            sb.append(d[i]);
        }

        String ans = sb.toString();
        if (ans.contains(".")) {
            ans = ans.replaceAll("0+$", "");
            if (ans.endsWith(".")) {
                ans = ans.substring(0, ans.length() - 1);
            }
        }
        System.out.println(ans);
        }
    }
}
