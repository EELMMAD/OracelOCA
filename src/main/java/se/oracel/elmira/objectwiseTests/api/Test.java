package se.oracel.elmira.objectwiseTests.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
        public String getDateString(LocalDateTime ldt){
            return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ldt);
    }
}
