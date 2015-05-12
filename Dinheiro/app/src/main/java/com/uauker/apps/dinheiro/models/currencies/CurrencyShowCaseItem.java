package com.uauker.apps.dinheiro.models.currencies;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("currencyShowcaseItem")
public class CurrencyShowCaseItem {

    @XStreamAsAttribute
    public String iso4217;

    @XStreamAsAttribute
    public String title;

    @XStreamAsAttribute
    public String buyPrice;

    @XStreamAsAttribute
    public String sellPrice;

    @XStreamAsAttribute
    public String moves;

    @XStreamAsAttribute
    public String movesValue;

    public String getMoveRounded() {
        try {
            final Float moveFloat = Float.parseFloat(this.moves);

            return String.format("%.2f%%", moveFloat);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
