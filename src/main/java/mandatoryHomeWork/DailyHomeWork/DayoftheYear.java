package mandatoryHomeWork.DailyHomeWork;

public class DayoftheYear {

    public int dayOfYear(String date) {

        // - find whether the year is a leap year or nor
        // - if it is a leap year, turn on  a flag
        // - check the month, if 02 then add 28/29
        // - else add 30/31
        //     - if odd or if 08 then add 31
        int datetday = Integer.parseInt(date.substring(8,10));
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int sumOfDays = 0;
        boolean flag = false;
        if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            flag = true;
        }
        
        for (int i = 1; i < month ; i++) {
            if(i!=2) {
                if(i%2==0 && i!=8) {
                    sumOfDays = sumOfDays + 30;
                }else {
                    sumOfDays =sumOfDays+ 31;
                }
            }	else{
                if(flag == true) {
                    sumOfDays = sumOfDays + 29;
                }else{
                    sumOfDays = sumOfDays + 28;
                }
            }				
        }
        return sumOfDays + (datetday);

}
        
    }