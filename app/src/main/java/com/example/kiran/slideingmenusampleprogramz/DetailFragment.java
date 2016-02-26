package com.example.kiran.slideingmenusampleprogramz;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.kiran.slideingmenusampleprogramz.R.id.detail;

/**
 * Created by Kiran on 18-12-2015.
 */
public class DetailFragment extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.menu_details_fragment,container,false);
        String menu=getArguments().getString("menu");
        textView=(TextView) view.findViewById(detail);
        textView.setText(menu);
        return view;
    }
}
