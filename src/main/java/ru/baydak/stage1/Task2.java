package ru.baydak.stage1;

import java.io.*;

public class Task2 {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder result = new StringBuilder();
        StringBuilder cmd = new StringBuilder();

        String s = r.readLine().trim();
        String s2 = r.readLine().trim();
        int cursor = 0;
        boolean flag = false;

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (c == '>') {
                switch (cmd.toString()) {
                    case "delete" -> {
                        if (cursor < result.length()) {
                            result.deleteCharAt(cursor);
                        }
                    }
                    case "bspace" -> {
                        if (cursor > 0) {
                            result.deleteCharAt(--cursor);
                        }
                    }
                    case "left" -> cursor = Math.max(0, cursor - 1);
                    case "right" -> cursor = Math.min(result.length(), cursor + 1);
                }
                cmd.setLength(0);
                flag = false;
            } else if (c == '<') {
                flag = true;
            } else if (flag) {
                cmd.append(c);
            } else {
                result.insert(cursor++, c);
            }
        }

        w.println(s.contentEquals(result) ? "Yes" : "No");
        w.flush();
    }
}