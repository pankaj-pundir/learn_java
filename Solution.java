import java.util.HashSet;

class Solution{
        public static int numJewelsInStones(String jewels, String stones) {
            HashSet<String> ss = new HashSet<String>();
            // HashSet<String>;
            for(int i = 0; i < jewels.length(); i++) 
            // {System.out.println(jewels.split("")[i]);}
            ss.add(jewels.split("")[i]);
            int count = 0;
            for( int i = 0; i < stones.length(); i++) {
                if(ss.contains(stones.split("")[i])) count++;
            }
            return count;
        }

        public static void main(String[] args) {
            int ans = numJewelsInStones("yvA","aAABB");
            System.out.println(ans);
        }
    };