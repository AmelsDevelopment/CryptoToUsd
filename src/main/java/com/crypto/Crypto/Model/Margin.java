package com.crypto.Crypto.Model;

public class Margin {
    private String buy;
    private String sell;

    public String getBuy() {
        return buy;
    }

    public String getSell() {
        return sell;
    }

    public Margin(String buy, String sell){
        this.buy = buy;
        this.sell = sell;
    }
}
