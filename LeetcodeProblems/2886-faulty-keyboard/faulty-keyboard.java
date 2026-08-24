class Solution {
    public String finalString(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'i') {
                list.add(s.charAt(i));
            } else {
                Collections.reverse(list);
            }
        }

        StringBuilder result = new StringBuilder();

        for (char c : list) {
            result.append(c);
        }

        return result.toString();
    }
}