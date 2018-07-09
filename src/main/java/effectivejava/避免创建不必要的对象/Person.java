package effectivejava.避免创建不必要的对象;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by eCRF on 2018/5/30.
 */
public class Person {
    private Date birthDate;
    public boolean isBabyBoomer(){
        Calendar gmtCal=Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        Date boomStart=gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        Date boomEnd=gmtCal.getTime();
        return birthDate.compareTo(boomStart)>=0&&birthDate.compareTo(boomEnd)<0;
    }
}
