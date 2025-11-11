package com.example.hathiyennhi_1150070031_lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView lvChuDe;
    ArrayList<HashMap<String, Object>> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvChuDe = findViewById(R.id.lvChuDe);
        data = new ArrayList<>();


        addChuDe(getString(R.string.topic_girl), R.drawable.congai);
        addChuDe(getString(R.string.topic_couple), R.drawable.vochong);
        addChuDe(getString(R.string.topic_student), R.drawable.hocsinh);
        addChuDe(getString(R.string.topic_teacher), R.drawable.thaytro);


        SimpleAdapter adapter = new SimpleAdapter(
                this, data, R.layout.item_chude,
                new String[]{"ten", "icon"},
                new int[]{R.id.tvTenChuDe, R.id.imgIcon});
        lvChuDe.setAdapter(adapter);


        lvChuDe.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(this, StoryListActivity.class);
            intent.putExtra("chude", data.get(position).get("ten").toString());
            startActivity(intent);
        });


        Button btnVN = findViewById(R.id.btnVN);
        Button btnEN = findViewById(R.id.btnEN);

        btnVN.setOnClickListener(v -> {
            LocaleHelper.setLocale(this, "vi");
            recreate();
        });

        btnEN.setOnClickListener(v -> {
            LocaleHelper.setLocale(this, "en");
            recreate();
        });
    }

    private void addChuDe(String ten, int icon) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("ten", ten);
        map.put("icon", icon);
        data.add(map);
    }
}