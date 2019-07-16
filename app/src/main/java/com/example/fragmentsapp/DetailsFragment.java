package com.example.fragmentsapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {
    public  static String TAG = DetailsFragment.class.getSimpleName();
    public static final String MY_KEY = "somekey" ;
    TextView detailsTextView;
    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG,"onAttach"+"  abdul");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreate"+"  abdul");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG,"onCreateView"+"  abdul");

        // Inflate the layout for this fragment
        //FragmentDetailsScreen fragmentDetailsScreen = new FragmentDetailsScreen(getContext());
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        detailsTextView = view.findViewById(R.id.newsDetailsTextview);
       // if (getArguments().containsKey(MY_KEY)) {

           // String data = getArguments().getString(MY_KEY);
           // detailsTextView.setText(data);



        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG,"onActivityCreated"+"  abdul");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG,"onStart"+"  abdul");


    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"onResume"+"  abdul");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"onPause"+"  abdul");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG,"onStop"+"  abdul");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG,"onDestroyView"+"  abdul");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG,"onDetach"+"  abdul");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy"+"  abdul");

    }

    public void updateTextView(String headline) {//c
        detailsTextView.setText(headline);
    }
}
