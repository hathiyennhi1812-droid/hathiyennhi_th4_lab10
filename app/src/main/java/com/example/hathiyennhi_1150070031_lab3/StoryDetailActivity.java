package com.example.hathiyennhi_1150070031_lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class StoryDetailActivity extends AppCompatActivity {

    private ArrayList<Story> stories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_detail);

        String chude = getIntent().getStringExtra("chude");
        int index = getIntent().getIntExtra("index", 0);


        TextView tvTitleBar = findViewById(R.id.tvTitleBar);
        tvTitleBar.setText(chude);

        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());


        List<Story> list = StoryData.getStoriesByTopic(chude);
        stories = new ArrayList<>(list);

        ViewPager vp = findViewById(R.id.vpStory);
        StoryPagerAdapter adapter = new StoryPagerAdapter(stories, this);
        vp.setAdapter(adapter);


        vp.setCurrentItem(index, false);
    }
}
