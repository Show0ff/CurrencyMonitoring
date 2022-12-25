package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Info {
    @JsonProperty("Date")
    public Date date;
    @JsonProperty("PreviousDate")
    public Date previousDate;
    @JsonProperty("PreviousURL")
    public String previousURL;
    @JsonProperty("Timestamp")
    public Date timestamp;
    @JsonProperty("Valute")
    public Valute valute;
}
