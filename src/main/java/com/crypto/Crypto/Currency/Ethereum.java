package com.crypto.Crypto.Currency;

import com.crypto.Crypto.Model.Binance.CryptoPrice;
import com.crypto.Crypto.Model.Binance.BinanceTickerCurrency;
import com.crypto.Crypto.Services.CryptoMarginService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ethereum extends Currency {

    @Value("${eth.margin.type}")
    private String marginType;

    @Value("${eth.margin.value}")
    private double marginValue;

    public String getSymbol() {
        return "eth";
    }

    public CryptoMarginService getCryptoMarginService() {
        return new CryptoMarginService(this.marginType, this.marginValue, this.getUsdValue());
    }

    public double getUsdValue() {
        CryptoPrice cryptoPrice = this.getBinanceService().getCryptoPrice(BinanceTickerCurrency.ETHUSDT);
        return cryptoPrice.getPrice();
    }
}
