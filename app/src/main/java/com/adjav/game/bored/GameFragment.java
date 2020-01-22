package com.adjav.game.bored;


import android.app.Activity;
import android.os.Bundle;


import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.PriorityQueue;


public class GameFragment extends Fragment {

    private Button memory;
    private Button reflex;
    private Button accuracy;



    public GameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_game, container, false);

        memory = view.findViewById(R.id.memory_play);
        reflex = view.findViewById(R.id.reflex_play);
        accuracy = view.findViewById(R.id.accuracy_play);

        memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new MemoryFragment(), null).addToBackStack(null).commit();

            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ReflexFragment(), null).commit();

            }
        });

        return view;
    }
}

