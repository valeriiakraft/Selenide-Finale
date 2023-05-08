
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MinDeliveryDate {
    String getMinDataForTest(){
        Date currentData = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentData);
        calendar.add(Calendar.DATE,3);
        Date currentDatePlusThree= calendar.getTime();
        String minDeliveryDate = simpleDateFormat.format(currentDatePlusThree);

        return minDeliveryDate;
    }
}
