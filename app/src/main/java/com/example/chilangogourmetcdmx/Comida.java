package com.example.chilangogourmetcdmx;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Comida extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private ListView listView;
    private String nombres[] = {"Tacos", "Quesadillas", "Enchiladas", "Molcajete"};
    private String mParam1;
    private String mParam2;

    public Comida() {
        // Required empty public constructor
    }

    public static Comida newInstance(String param1, String param2) {
        Comida fragment = new Comida();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comida, container, false);
        listView = view.findViewById(R.id.lv2);

        // Set adapter for ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, nombres);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getContext(), Tacos.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(getContext(), Quesadillas.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(getContext(), Enchiladas.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(getContext(), Molcajete.class);
                    startActivity(intent);
                }
            }
        });

        return view;
    }
}