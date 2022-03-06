import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

class Solution{

    public String convert(String s, int numRows) {
        // boolean[] visited = new boolean[s.length()];
        String[] list = new String[numRows];
        for (int i = 0; i <numRows; i++) {list[i] = "";}
        int L = s.length();
        int index = 0;
        boolean direction = true;
        
        // var h = new helper<String>();
        if(numRows == 1) return s;
        // h.display(list);
        for (int i = 0; i < L; i++) {
            // if(list[index] == null) list[index] = s.charAt(i);
            // else
            list[index]+=s.charAt(i);

            if(direction) {index++; }
            else index--;

            if(index == 0 || index==numRows-1) {direction = !direction; }
            
        }

        // h.display(list);

        StringBuilder sb = new StringBuilder();

        for(var x:list) sb.append(x);
        // list.forEach((x)->sb.add(x));
        return sb.toString();
    }

        public static void main(String[] args) {
            Solution solution = new Solution();
            String ans = solution.convert("PAYPALISHIRING",1);
            System.out.println(ans);
        }
    };