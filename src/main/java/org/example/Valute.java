package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.currencies.*;

public class Valute{
    @JsonProperty("AUD")
    public AUD aUD;
    @JsonProperty("AZN")
    public AZN aZN;
    @JsonProperty("GBP")
    public GBP gBP;
    @JsonProperty("AMD")
    public AMD aMD;
    @JsonProperty("BYN")
    public BYN bYN;
    @JsonProperty("BGN")
    public BGN bGN;
    @JsonProperty("BRL")
    public BRL bRL;
    @JsonProperty("HUF")
    public HUF hUF;
    @JsonProperty("HKD")
    public HKD hKD;
    @JsonProperty("DKK")
    public DKK dKK;
    @JsonProperty("USD")
    public USD uSD;
    @JsonProperty("EUR")
    public EUR eUR;
    @JsonProperty("INR")
    public INR iNR;
    @JsonProperty("KZT")
    public KZT kZT;
    @JsonProperty("CAD")
    public CAD cAD;
    @JsonProperty("KGS")
    public KGS kGS;
    @JsonProperty("CNY")
    public CNY cNY;
    @JsonProperty("MDL")
    public MDL mDL;
    @JsonProperty("NOK")
    public NOK nOK;
    @JsonProperty("PLN")
    public PLN pLN;
    @JsonProperty("RON")
    public RON rON;
    @JsonProperty("XDR")
    public XDR xDR;
    @JsonProperty("SGD")
    public SGD sGD;
    @JsonProperty("TJS")
    public TJS tJS;
    @JsonProperty("TRY")
    public TRY tRY;
    @JsonProperty("TMT")
    public TMT tMT;
    @JsonProperty("UZS")
    public UZS uZS;
    @JsonProperty("UAH")
    public UAH uAH;
    @JsonProperty("CZK")
    public CZK cZK;
    @JsonProperty("SEK")
    public SEK sEK;
    @JsonProperty("CHF")
    public CHF cHF;
    @JsonProperty("ZAR")
    public ZAR zAR;
    @JsonProperty("KRW")
    public KRW kRW;
    @JsonProperty("JPY")
    public JPY jPY;

    @Override
    public String toString() {
        return "Valute{" +
                "\naUD=" + aUD +
                ",\n aZN=" + aZN +
                ",\n gBP=" + gBP +
                ",\n aMD=" + aMD +
                ",\n bYN=" + bYN +
                ",\n bGN=" + bGN +
                ",\n bRL=" + bRL +
                ",\n hUF=" + hUF +
                ",\n hKD=" + hKD +
                ",\n dKK=" + dKK +
                ",\n uSD=" + uSD +
                ",\n eUR=" + eUR +
                ",\n iNR=" + iNR +
                ",\n kZT=" + kZT +
                ",\n cAD=" + cAD +
                ",\n kGS=" + kGS +
                ",\n cNY=" + cNY +
                ",\n mDL=" + mDL +
                ",\n nOK=" + nOK +
                ",\n pLN=" + pLN +
                ",\n rON=" + rON +
                ",\n xDR=" + xDR +
                ",\n sGD=" + sGD +
                ",\n tJS=" + tJS +
                ",\n tRY=" + tRY +
                ",\n tMT=" + tMT +
                ",\n uZS=" + uZS +
                ",\n uAH=" + uAH +
                ",\n cZK=" + cZK +
                ",\n sEK=" + sEK +
                ",\n cHF=" + cHF +
                ",\n zAR=" + zAR +
                ",\n kRW=" + kRW +
                ",\n jPY=" + jPY +
                '}';
    }
}
