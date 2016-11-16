package com.example.user.frag;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment implements AdapterView.OnItemClickListener {
    ListView list;
    communicator comm;

    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list= (ListView) getActivity().findViewById(R.id.listview);
        comm= (communicator) getActivity();
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.titlea,android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        comm.respond(i);

    }
}

