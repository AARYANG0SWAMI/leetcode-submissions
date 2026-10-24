class Solution {
    private final int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int startA = toDayOfYear(arriveAlice);
        int endA = toDayOfYear(leaveAlice);
        int startB = toDayOfYear(arriveBob);
        int endB = toDayOfYear(leaveBob);

        int startOverlap = Math.max(startA, startB);
        int endOverlap = Math.min(endA, endB);

        return Math.max(0, endOverlap - startOverlap + 1);
    }

    private int toDayOfYear(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            dayOfYear += days[i];
        }
        return dayOfYear;
    }
}
