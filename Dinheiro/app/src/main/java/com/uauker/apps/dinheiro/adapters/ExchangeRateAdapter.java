package com.uauker.apps.dinheiro.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uauker.apps.dinheiro.R;

public class ExchangeRateAdapter extends RecyclerView.Adapter<ExchangeRateAdapter.ExchangeRateViewHolder> {

    @Override
    public ExchangeRateAdapter.ExchangeRateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_exchange_rate, parent, false);

        return new ExchangeRateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExchangeRateViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class ExchangeRateViewHolder extends RecyclerView.ViewHolder {

        public ExchangeRateViewHolder(View itemView) {
            super(itemView);
        }
    }
}
