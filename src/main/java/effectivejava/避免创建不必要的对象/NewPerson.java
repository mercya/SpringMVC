package effectivejava.避免创建不必要的对象;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by eCRF on 2018/5/30.
 */
public class NewPerson {
    private  Date birthDate;
    private static  final  Date BOOM_START;
    private static final Date BOOM_END;
    static {
        Calendar gmtCal=Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        BOOM_START=gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        BOOM_END=gmtCal.getTime();
    }
}
