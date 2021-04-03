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

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<getterSetter> familyArrayList = new ArrayList<>();
        familyArrayList.add(new getterSetter("father","әpә",R.drawable.family_father));
        familyArrayList.add(new getterSetter("mother","әṭa",R.drawable.family_mother));
        familyArrayList.add(new getterSetter("son","angsi",R.drawable.family_son));
        familyArrayList.add(new getterSetter("daughter","tune",R.drawable.family_daughter));
        familyArrayList.add(new getterSetter("older brother","taachi",R.drawable.family_older_brother));
        familyArrayList.add(new getterSetter("younger brother","chalitti",R.drawable.family_younger_brother));
        familyArrayList.add(new getterSetter("older sister","teṭe",R.drawable.family_older_sister));
        familyArrayList.add(new getterSetter("younger sister","kolliti",R.drawable.family_younger_sister));
        familyArrayList.add(new getterSetter("grandmother","ama",R.drawable.family_grandmother));
        familyArrayList.add(new getterSetter("grandfather","paapa",R.drawable.family_grandfather));

        ListView familyListView = (ListView) findViewById(R.id.IDfromFamily);
        familyListView.setDivider(null);
        CustomAdapter familyAdapter = new CustomAdapter(this,R.id.IDfromFamily,familyArrayList);
        familyListView.setAdapter(familyAdapter);
    }
}
