package server;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Created by Paul on 03/05/2015.
 */
public class ConsultationValidator {
    public static String validateConsultationDate(int id, String date, long patientPNC, int doctorID, String text) {
        if(!PatientValidator.isValidPNC(patientPNC)) return "Invalid patient PNC";
        if(!isValidID(id)) return "ID must be greater than 0";
        return "Valid";
    }

    public static boolean isValidID(int id)
    {
        if (id>0) return true;
        else return false;
    }

    public static GregorianCalendar dateParser(String date)
    {
        SimpleDateFormat parserSDF=new SimpleDateFormat("dd-MM-yyyy");
        GregorianCalendar parsedDate=new GregorianCalendar();
        parsedDate.setTime(parserSDF.parse(date, new ParsePosition(0)));
        return parsedDate;
    }
}
