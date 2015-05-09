package com.uauker.apps.dinheiro.models.currencies;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("currencyShowcaseItem")
public class CurrencyShowCaseItem {

    public String iso4217;
    public String title;
    public String buyPrice;
    public String sellPrice;
    public String moves;
    public String movesValue;

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getIso4217() {
        return iso4217;
    }

    public void setIso4217(String iso4217) {
        this.iso4217 = iso4217;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getMoves() {
        return moves;
    }

    public void setMoves(String moves) {
        this.moves = moves;
    }

    public String getMovesValue() {
        return movesValue;
    }

    public void setMovesValue(String movesValue) {
        this.movesValue = movesValue;
    }
}
