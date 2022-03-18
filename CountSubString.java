public class CountSubString {
    public static int countSubString(String s, String sub) {
        int m = s.length(), n = sub.length();

        if (m == 0 || m < n)
            return 0;
        if (n == 0)
            return -1;

        int cnt = 0;

        for (int i = 0; i <= m - n; ++i) {
            int j = i;
            while (j < n+i) {
                if (s.charAt(j) != sub.charAt(j-i))
                    break;
                ++j;
            }
            if(j == n+i) cnt++;
            j = 0;
        }

        return cnt;
    }

    // public static int countSubStringUsingKMP(String s, String sub){

    // }

    public static void main(String[] args) {
        String s = "A guide to tripi";
        String sub = "ip";
        System.out.println(countSubString(s, sub));
    }
}
