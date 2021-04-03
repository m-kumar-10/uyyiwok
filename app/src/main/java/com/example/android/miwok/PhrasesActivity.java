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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<getterSetter> phraseArrayList = new ArrayList<>();
        phraseArrayList.add(new getterSetter("Where are you going?","minto wuksus"));
        phraseArrayList.add(new getterSetter("What is your name?","tinnә oyaase'nә"));
        phraseArrayList.add(new getterSetter("My name is...","oyaaset..."));
        phraseArrayList.add(new getterSetter("How are you feeling?","michәksәs?"));
        phraseArrayList.add(new getterSetter("I’m feeling good.","kuchi achit"));
        phraseArrayList.add(new getterSetter("Are you coming?","әәnәs'aa?"));
        phraseArrayList.add(new getterSetter("Yes, I’m coming.","hәә’ әәnәm"));
        phraseArrayList.add(new getterSetter("I’m coming","әәnәm"));
        phraseArrayList.add(new getterSetter("Let’s go.","yoowutis"));
        phraseArrayList.add(new getterSetter("Come here.","әnni'nem"));

        ListView phrasesListView = (ListView) findViewById(R.id.IDfromPhrase);
        phrasesListView.setDivider(null);
        CustomAdapter phrasesAdapter = new CustomAdapter(this,R.id.IDfromPhrase,phraseArrayList);
        phrasesListView.setAdapter(phrasesAdapter);
    }
}
