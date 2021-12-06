package util;

import java.sql.Timestamp;
import java.util.Date;

public class Util {
    public static Timestamp dateTimestamp(Date d){
        Timestamp timestamp=new Timestamp(d.getTime());
        return timestamp;
    }
}
