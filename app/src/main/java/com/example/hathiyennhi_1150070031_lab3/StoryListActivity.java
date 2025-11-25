package com.example.hathiyennhi_1150070031_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class StoryListActivity extends AppCompatActivity {

    private ArrayList<Story> stories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_list);

        String chude = getIntent().getStringExtra("chude");
        TextView tvChuDe = findViewById(R.id.tvChuDe);
        tvChuDe.setText(chude);


        List<Story> list = StoryData.getStoriesByTopic(chude);
        stories = new ArrayList<>(list);


        String[] titles = new String[stories.size()];
        for (int i = 0; i < stories.size(); i++) {
            titles[i] = stories.get(i).title;
        }


        int[] icons = new int[]{
                R.drawable.event_busy,
                R.drawable.assignment,
                R.drawable.banned,
                R.drawable.computer,
                R.drawable.calculate,
                R.drawable.record_voice,
                R.drawable.homework,
                R.drawable.group,
                R.drawable.trending_down,
                R.drawable.school
        };

        ListView lv = findViewById(R.id.lvTruyen);
        StoryListAdapter adapter = new StoryListAdapter(this, titles, icons);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener((parent, view, position, id) -> {
            Intent i = new Intent(this, StoryDetailActivity.class);
            i.putExtra("chude", chude);
            i.putExtra("index", position);
            startActivity(i);
        });

        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
    }
}
