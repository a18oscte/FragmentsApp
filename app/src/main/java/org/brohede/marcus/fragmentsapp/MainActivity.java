package org.brohede.marcus.fragmentsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            // Create a new Fragment to be placed in the activity layout
            HeadlinesFragment firstFragment = new HeadlinesFragment();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            firstFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, firstFragment).commit();
        }

        /*
        TODO: You should create an app that uses fragments and orientation

        TODO: 1 - Create a fragment (list) to hold a ListView of Mountains
        See: https://developer.android.com/training/basics/fragments/fragment-ui.html

        TODO: 2 - Create a fragment (blank) to hold a details view of Mountain
        See: https://developer.android.com/training/basics/fragments/fragment-ui.html

        TODO: 3 - Create a separate layout for landscape orientation
        See: https://developer.android.com/training/multiscreen/screensizes.html
        See: https://developer.android.com/training/multiscreen/screensizes.html#alternative-layouts

        TODO: 4 - The layout in portrait mode should only display the list fragment and when
                  pressing a list item the details fragment should replace the list fragment
                  and show all the Mountain data.

        TODO: 5 - The layout in landscape mode should display both the list fragment and the
                  details fragment. The details fragment should display details of the currently
                  selected list item.

        */
    }
}
