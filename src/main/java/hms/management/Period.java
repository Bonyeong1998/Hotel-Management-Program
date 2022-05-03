package hms.management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Period {

    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Period(String a) {
        this.a = a;
    }

    public static ArrayList<Period> CertainDate(String start, String end) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        ArrayList<Period> savedate = new ArrayList<>();
        Date current = startDate;

        while (current.compareTo(endDate) <= 0) {
            savedate.add(new Period(sdf.format(current)));
            Calendar s = Calendar.getInstance();
            s.setTime(current);
            s.add(Calendar.DAY_OF_YEAR, 1);
            current = s.getTime();
        }
        return savedate;
    }
}
