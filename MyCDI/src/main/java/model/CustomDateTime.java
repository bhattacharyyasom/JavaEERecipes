package model;

import java.time.Instant;
import java.util.Date;

//This is a model whose beans we need to create that could need customization
public class CustomDateTime {
    Date date;
    String calenderName;

    public CustomDateTime(Date date, String calenderName) {
        this.date = date;
        this.calenderName=calenderName;
    }

    public Instant getTime() {
        return date.toInstant();
    }
}
