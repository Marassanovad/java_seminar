package Seminar4;

import java.util.Deque;
import java.util.LinkedList;

public class HWTaskSimplifyPath {


    public String simplifyPath(String path) {
        Deque<String> deque = new LinkedList<>();
        String[] words = path.split("/");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("") || words[i].equals(".")) {
                continue;
            }
            else if (words[i].equals("..")) {
                if (!deque.isEmpty()) {
                    deque.pollLast();
                }
            } else deque.addLast(words[i]);
        }
        String res = "";
        if (deque.isEmpty()) {
            return "/";
        }
        else {
            while (!deque.isEmpty()) {
                res += "/" + deque.pollFirst();
            }
            return res;
        }
    }
}
    

