package fiap.dvriesman.nubank.spending;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    private static final DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm");

    public static Date getDateFromString(String value) throws Exception {
        return (Date)formatter.parse(value);
    }

}
