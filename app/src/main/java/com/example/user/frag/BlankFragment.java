package com.example.user.frag;


import android.content.res.Resources;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment extends Fragment  {
    TextView t1;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        t1= (TextView) view.findViewById(R.id.textView);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }
    public void changeData(int i){
        Resources res= getResources();
       String[] desp= res.getStringArray(R.array.dis);
        t1.setText(desp[i]);
    }


}
