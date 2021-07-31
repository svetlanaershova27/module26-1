import java.util.Calendar;
public class Time {

    public void getTime(int d,int m, int t, int k) {
        Calendar calendar = Calendar.getInstance();
        calendar. set(Calendar.DAY_OF_MONTH, d);
        calendar. set(Calendar.MONTH, m);
        calendar.set(Calendar.HOUR_OF_DAY, t);
        calendar.set(Calendar.MINUTE, k);//поменяли часы на 21
        //System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        //System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.getTime());
    }
}



