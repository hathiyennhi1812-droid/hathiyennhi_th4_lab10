package com.example.hathiyennhi_1150070031_lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class StoryListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_list);

        String chude = getIntent().getStringExtra("chude");
        TextView tvChuDe = findViewById(R.id.tvChuDe);
        tvChuDe.setText(chude);

        String[] dsTruyen = {
                "Việc học", "Đã hai lần rồi", "Cùng như nhau", "Rất lạnh",
                "Im lặng là vàng", "Bài học vỡ lòng", "Chưa chi đã đau",
                "1 xu và 1 phút", "Sao còn chưa thật?", "Sở thích hóa thạch",
                "Nhầm lẫn tai hại", "Cảm giác"
        };

        ListView lv = findViewById(R.id.lvTruyen);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.item_truyen, R.id.tvTenTruyen, dsTruyen);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener((parent, view, position, id) -> {
            Intent i = new Intent(this, StoryDetailActivity.class);
            i.putExtra("tenTruyen", dsTruyen[position]);
            startActivity(i);
        });

        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
    }
}
