package com.example.fragmentsapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {

TextView detailsTextView;
    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //FragmentDetailsScreen fragmentDetailsScreen = new FragmentDetailsScreen(getContext());
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        detailsTextView = view.findViewById(R.id.newsDetailsTextview);
        return view;

    }

    public void updateTextView(String headline) {//c
        detailsTextView.setText(headline);
    }
}
