package com.example.fragmentsapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeadlinesFragment extends Fragment implements AdapterView.OnItemClickListener {
    ListView headlinesListView;
    OnHeadlineSelectedListener callback;
    static String TAG = HeadlinesFragment.class.getSimpleName();

    public interface OnHeadlineSelectedListener {
        public void onArticleSelected(String headline);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG,"onAttach"+"  abdul");

       callback = (OnHeadlineSelectedListener) getActivity();
    }

    public HeadlinesFragment() {
        // Required empty public constructor
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
        View view = inflater.inflate(R.layout.fragment_headlines, container, false);//3
        headlinesListView = view.findViewById(R.id.headlineslistview);


        headlinesListView.setOnItemClickListener(this);
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
        Log.i(TAG,"onDestroy");

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        callback.onArticleSelected(item);//a

      //  Toast.makeText(getContext(), item, Toast.LENGTH_SHORT).show();
    }
}
