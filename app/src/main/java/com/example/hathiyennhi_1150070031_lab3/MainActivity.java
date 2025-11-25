package com.example.hathiyennhi_1150070031_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTitle = findViewById(R.id.tvTitle);
        tvTitle.setText("Truyện cười");

        ListView lvChuDe = findViewById(R.id.lvChuDe);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.item_chude,
                R.id.tvChuDe,
                StoryData.TOPICS
        );
        lvChuDe.setAdapter(adapter);

        lvChuDe.setOnItemClickListener((parent, view, position, id) -> {
            String topic = StoryData.TOPICS[position];
            Intent i = new Intent(MainActivity.this, StoryListActivity.class);
            i.putExtra("chude", topic);
            startActivity(i);
        });
    }
}
