class Solution {
    public int thirdMax(int[] nums) {
        Long m1 = null, m2 = null, m3 = null;
        for (int n : nums) {
            long v = (long) n;
            if ((m1 != null && v == m1) || (m2 != null && v == m2) || (m3 != null && v == m3)) continue;
            if (m1 == null || v > m1) {
                m3 = m2; m2 = m1; m1 = v;
            } else if (m2 == null || v > m2) {
                m3 = m2; m2 = v;
            } else if (m3 == null || v > m3) {
                m3 = v;
            }
        }
        return m3 == null ? m1.intValue() : m3.intValue();
    }
}
