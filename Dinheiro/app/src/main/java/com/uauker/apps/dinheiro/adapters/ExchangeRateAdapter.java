package com.uauker.apps.dinheiro.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uauker.apps.dinheiro.R;
import com.uauker.apps.dinheiro.models.currencies.CurrencyShowCaseItem;

import java.util.ArrayList;
import java.util.List;

public class ExchangeRateAdapter extends RecyclerView.Adapter<ExchangeRateAdapter.ExchangeRateViewHolder> {

    List<CurrencyShowCaseItem> content = new ArrayList<>();

    public ExchangeRateAdapter(List<CurrencyShowCaseItem> content) {
        this.content = content;
    }

    @Override
    public ExchangeRateAdapter.ExchangeRateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_exchange_rate, parent, false);

        return new ExchangeRateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExchangeRateViewHolder holder, int position) {
        final CurrencyShowCaseItem item = this.content.get(position);

        holder.setObject(item);
    }

    @Override
    public int getItemCount() {
        return content.size();
    }

    public static class ExchangeRateViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView buy;
        TextView sell;
        TextView move;

        public ExchangeRateViewHolder(View view) {
            super(view);

            this.name = (TextView) view.findViewById(R.id.exchange_rate_name);
            this.buy = (TextView) view.findViewById(R.id.exchange_rate_buy);
            this.sell = (TextView) view.findViewById(R.id.exchange_rate_sell);
            this.move = (TextView) view.findViewById(R.id.exchange_rate_move);
        }

        public void setObject(final CurrencyShowCaseItem item) {
            this.name.setText(item.title);
            this.buy.setText(item.buyPrice);
            this.sell.setText(item.sellPrice);
            this.move.setText(item.getMoveRounded());
        }
    }
}
