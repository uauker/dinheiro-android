package com.uauker.apps.dinheiro.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.thoughtworks.xstream.XStream;
import com.uauker.apps.dinheiro.R;
import com.uauker.apps.dinheiro.helpers.ConfigHelper;
import com.uauker.apps.dinheiro.models.currencies.CurrencyShowCase;
import com.uauker.apps.dinheiro.models.currencies.CurrencyShowCaseItem;
import com.uauker.apps.dinheiro.models.currencies.UolCotIphone;

import java.io.IOException;

public class ExchangeRateFragment extends Fragment implements Callback, SwipeRefreshLayout.OnRefreshListener {

    OkHttpClient client = new OkHttpClient();
    SwipeRefreshLayout swipeRefresh;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_exchange_rate, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.swipeRefresh = (SwipeRefreshLayout) view.findViewById(R.id.fragment_swipe_refresh_layout);
        this.swipeRefresh.setOnRefreshListener(this);

        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() throws IOException {
        final Request request = new Request.Builder()
                .url(ConfigHelper.CURRENCY)
                .build();

        final Call call = client.newCall(request);
        call.enqueue(this);
    }

    @Override
    public void onFailure(Request request, IOException e) {
        endRefresing();
    }

    @Override
    public void onResponse(Response response) throws IOException {
        final String xmlString = response.body().string();

        final XStream xstream = new XStream();
        xstream.processAnnotations(UolCotIphone.class);
        xstream.processAnnotations(CurrencyShowCase.class);
        xstream.processAnnotations(CurrencyShowCaseItem.class);
        UolCotIphone cot = (UolCotIphone) xstream.fromXML(xmlString);

        endRefresing();
    }

    public void endRefresing() {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                swipeRefresh.setRefreshing(false);
            }
        });
    }

    @Override
    public void onRefresh() {
        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
