package com.uauker.apps.dinheiro.models.currencies;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("uol_cot_iphone")
public class UolCotIphone {

    @XStreamImplicit(itemFieldName = "currencyShowcase")
    public List<CurrencyShowCase> currencyShowCases;

}
