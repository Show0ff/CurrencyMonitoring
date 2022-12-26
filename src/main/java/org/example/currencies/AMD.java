package org.example.currencies;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AMD {
    @JsonProperty("ID")
    public String iD;
    @JsonProperty("NumCode")
    public String numCode;
    @JsonProperty("CharCode")
    public String charCode;
    @JsonProperty("Nominal")
    public int nominal;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Value")
    public double value;
    @JsonProperty("Previous")
    public double previous;

    @Override
    public String toString() {
        return "\n\n AMD{" +
                "iD='" + iD + '\'' +
                ",\n numCode='" + numCode + '\'' +
                ",\n charCode='" + charCode + '\'' +
                ",\n nominal=" + nominal +
                ",\n name='" + name + '\'' +
                ",\n value=" + value +
                ",\n previous=" + previous +
                '}';
    }
}
