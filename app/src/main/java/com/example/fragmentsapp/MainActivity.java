package com.example.fragmentsapp;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements HeadlinesFragment.OnHeadlineSelectedListener {
    static String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//1
        Log.i(TAG,"onCreate" +"  abdul");

       /* SimpleFragment simpleFragment = SimpleFragment.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =  fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,simpleFragment);
        fragmentTransaction.commit();*/
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG,"onStart" +"  abdul");


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
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy"+"  abdul");

    }

    @Override
    public void onArticleSelected(String headline) {//b
        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        if (detailsFragment != null) {//it means my app has been installed on a tablet
            detailsFragment.updateTextView(headline);
        }
        else{ // it means that my app is installed on the phone

            DetailsFragment newFragment = new DetailsFragment();
            Bundle args = new Bundle();
            args.putString(DetailsFragment.MY_KEY, headline);
            newFragment.setArguments(args);

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack so the user can navigate back

            transaction.replace(R.id.my_container, newFragment);
            transaction.addToBackStack(null);

            // Commit the transaction
            transaction.commit();
        }

    }
}
