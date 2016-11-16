package com.example.user.frag;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int i) {
        FragmentManager manager2 =getFragmentManager();
        BlankFragment f1 = (BlankFragment) manager2.findFragmentById(R.id.fragment);
        f1.changeData(i);

    }
}
