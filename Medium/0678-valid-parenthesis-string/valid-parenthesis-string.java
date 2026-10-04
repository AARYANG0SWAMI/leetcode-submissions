class Solution {
    public boolean checkValidString(String s) {
        int countR = 0; // maximum
        int countL = 0; // minimum

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                countR++;
                countL++;
            }

            else if (s.charAt(i) == ')') {
                countR--;
                countL--;
            }

            else { // '*'
                countR++;
                countL--;
            }

            if (countL < 0) {
                countL = 0;
            }

            if (countR < 0) {
                return false;
            }
        }

        return countL == 0;
    }
}
