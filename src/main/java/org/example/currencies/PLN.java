package org.example.currencies;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PLN {
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
}
