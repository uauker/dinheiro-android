package com.uauker.apps.dinheiro.models.currencies;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("currencyShowcase")
public class CurrencyShowCase {

    @XStreamImplicit(itemFieldName = "currencyShowcaseItem")
    public List<CurrencyShowCaseItem> currencyShowCaseItems;
}
