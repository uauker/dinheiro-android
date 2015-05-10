package com.uauker.apps.dinheiro.helpers;


public interface ConfigHelper {

    String CURRENCY = "http://m.app2.uol.com.br/aplicativo/iphone/cotacoes/v1/uol_cot_iphone_currency_showcase.xml";
    String CURRENCY_SPECFIC = "http://m.app2.uol.com.br/aplicativo/iphone/cotacoes/v1/uol_cot_iphone_currency_interday_table.xml?currency_code=USDC&start=9/2/2015&end=9/5/2015&chart_width=300";

    String INDEXES = "http://m.app2.uol.com.br/aplicativo/iphone/cotacoes/v1/uol_cot_iphone_indices_values.xml";

    String STOCKS = "http://m.app2.uol.com.br/aplicativo/iphone/cotacoes/v1/uol_cot_iphone_items_summary.xml?codes=BBAS3.SA,OGXP3.SA,PETR3.SA,PETR4.SA,VALE3.SA,VALE5.SA";
}
