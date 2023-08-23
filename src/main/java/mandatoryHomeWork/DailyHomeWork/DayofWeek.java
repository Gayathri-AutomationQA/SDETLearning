package mandatoryHomeWork.DailyHomeWork;

public class DayofWeek {


    /*
     * Pseudo Code
     * Count and sum total number of days till that date
     * get the remainder of % 8 
     * if number is greater than 8 do % again 
     * find the day from Array initialised
     */
    public String dayOfTheWeek(int day, int month, int year) {
        int[] arrMonthDays = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        int totalDayCount = 0;
        String[] arrDays = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        //Calculate the number of days
        for (int i = 0; i < month-1; i++) {
            totalDayCount = totalDayCount + arrMonthDays[i];
            System.out.println(totalDayCount);
        }
        totalDayCount = totalDayCount + day;

        //Add 1 if Leap year
        if(year%4==0 && year%100!=0 || year%400==0) totalDayCount = totalDayCount+1;

        for (int i = 1971; i < year; i++) {
            if(year%4==0 && year%100!=0 || year%400==0) totalDayCount = totalDayCount+1;

            totalDayCount = totalDayCount + 365;
        }
        return arrDays[(totalDayCount + 4) % 7];


    }
}
