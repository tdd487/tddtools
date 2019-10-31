import com.tools.CompearTwoList;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMM");
        System.out.println(sdf1.format(date));
    }
}
