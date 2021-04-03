package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<getterSetter> numberArrayList = new ArrayList<>();

        numberArrayList.add(new getterSetter("One","lutti",R.drawable.number_one));
        numberArrayList.add(new getterSetter("two","otiiko",R.drawable.number_two));
        numberArrayList.add(new getterSetter("three","tolookosu",R.drawable.number_three));
        numberArrayList.add(new getterSetter("four","oyyisa",R.drawable.number_four));
        numberArrayList.add(new getterSetter("five","massokka",R.drawable.number_five));
        numberArrayList.add(new getterSetter("six","temmokka",R.drawable.number_six));
        numberArrayList.add(new getterSetter("seven","kenekaku",R.drawable.number_seven));
        numberArrayList.add(new getterSetter("eight","kawinta",R.drawable.number_eight));
        numberArrayList.add(new getterSetter("nine","wo’e",R.drawable.number_nine));
        numberArrayList.add(new getterSetter("ten","na’aacha",R.drawable.number_ten));

        ListView numberListView = (ListView) findViewById(R.id.IDfromNumber);
        numberListView.setDivider(null);
        CustomAdapter numberAdapter = new CustomAdapter(this,R.id.IDfromNumber,numberArrayList);
        numberListView.setAdapter(numberAdapter);
    }
}
