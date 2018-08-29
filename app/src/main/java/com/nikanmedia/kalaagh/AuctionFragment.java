package com.nikanmedia.kalaagh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AuctionFragment extends android.support.v4.app.Fragment {
    Button b1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_auction, container, false);
        b1 = (Button) view.findViewById(R.id.button);
        return view;
    }


}
