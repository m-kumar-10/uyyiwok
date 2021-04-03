/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<getterSetter> colorArrayList = new ArrayList<getterSetter>();

        colorArrayList.add(new getterSetter("red","weṭeṭṭi",R.drawable.color_red));
        colorArrayList.add(new getterSetter("green","chokokki",R.drawable.color_green));
        colorArrayList.add(new getterSetter("brown","ṭakaakki",R.drawable.color_brown));
        colorArrayList.add(new getterSetter("gray","ṭopoppi",R.drawable.color_gray));
        colorArrayList.add(new getterSetter("black","kululli",R.drawable.color_black));
        colorArrayList.add(new getterSetter("white","kelelli",R.drawable.color_white));
        colorArrayList.add(new getterSetter("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        colorArrayList.add(new getterSetter("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        ListView colorListView = (ListView) findViewById(R.id.IDfromColor);
//        colorListView.setDivider(null);
//        colorListView.setDividerHeight(0);
        CustomAdapter colorAdapter = new CustomAdapter(this,R.id.IDfromColor,colorArrayList);
        colorListView.setAdapter(colorAdapter);

    }
}
