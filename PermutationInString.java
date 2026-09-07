public class PermutationInString {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = s1.length(); right < s2.length(); right++) {

            if (same(count1, count2)) {
                return true;
            }

            count2[s2.charAt(right) - 'a']++;
            count2[s2.charAt(left) - 'a']--;

            left++;
        }

        return same(count1, count2);
    }

    public static boolean same(int[] a, int[] b) {

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}