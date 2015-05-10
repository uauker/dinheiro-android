package com.uauker.apps.dinheiro.models.currencies;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

@XStreamAlias("uol_cot_iphone")
public class UolCotIphone {

    @XStreamImplicit(itemFieldName = "currencyShowcase")
    public List<CurrencyShowCase> currencyShowCases;


    public List<CurrencyShowCaseItem> getContent() {
        try {
            return currencyShowCases.get(0).currencyShowCaseItems;
        } catch (Exception e) {
            return new ArrayList<CurrencyShowCaseItem>();
        }
    }
}
