package me.cwuyi;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    /**
     * Leetcode 205
     *
     * 想法是正向反向两个map记录对应关系，如果有对应关系不正确的返回false
     *
     * @param s
     * @param t
     * @return
     */


    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> amap = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            char a = t.charAt(i);

            if (map.get(c) == null) {
                map.put(c, a);
            } else if (map.get(c) != a) {
                return false;
            }

            if (amap.get(a) == null) {
                amap.put(a, c);
            } else if (amap.get(a) != c) {
                return false;
            }
        }

        return true;
    }

}
