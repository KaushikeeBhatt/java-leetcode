class Solution {
    public String reverseVowels(String s) {
        int a = 0, n = s.length() - 1;
        StringBuilder p = new StringBuilder(s);

        while (a < n) {
            if (!isVowel(p.charAt(a))) {
                a++;
                continue;
            }
            if (!isVowel(p.charAt(n))) {
                n--;
                continue;
            }

            // Swap vowels
            char temp = p.charAt(a);
            p.setCharAt(a, p.charAt(n));
            p.setCharAt(n, temp);

            a++;
            n--;
        }

        return p.toString();
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
