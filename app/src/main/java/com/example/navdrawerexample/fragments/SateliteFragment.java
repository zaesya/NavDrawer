package com.example.navdrawerexample.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navdrawerexample.R;

public class SateliteFragment extends Fragment {

    private ListView listViewSatelite;

    public SateliteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_satelite, container, false);

        // Initialize ListView
        listViewSatelite = rootView.findViewById(R.id.listViewMapel);

        // Create an array of student names
        String[] mapelNames = {"Moon", "Callisto", "Galileo", "Dimorphos", "Enceladus"};

        // Create an ArrayAdapter to populate the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, mapelNames);

        // Set the adapter to the ListView
        listViewSatelite.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Set the title of the Fragment
        requireActivity().setTitle("Satelite Fragment");
    }
}
