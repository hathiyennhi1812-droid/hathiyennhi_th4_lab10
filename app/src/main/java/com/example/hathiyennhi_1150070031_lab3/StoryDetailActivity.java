package com.example.hathiyennhi_1150070031_lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_detail);

        String tenTruyen = getIntent().getStringExtra("tenTruyen");

        TextView tvTenTruyen = findViewById(R.id.tvTenTruyen);
        TextView tvNoiDung = findViewById(R.id.tvNoiDung);
        ImageView btnBack = findViewById(R.id.btnBack);

        tvTenTruyen.setText(tenTruyen);

        // Nội dung ví dụ
        tvNoiDung.setText("Lúc bé, ngồi học là chuyện lạ. Lớn lên mới biết, chuyện lạ là đi học.\n\n"
                + "Lúc bé, tưởng đến trường để gặp bạn. Lớn lên mới biết, đến trường để gặp bài.\n\n"
                + "Lúc bé, tưởng ngồi học là hay. Lớn lên mới biết, ngồi học là ngủ.\n\n"
                + "Lúc bé, tưởng điểm 10 là giỏi. Lớn lên mới biết, điểm 10 là ảo giác.\n\n"
                + "Lúc bé, tưởng càng học càng giỏi. Lớn lên mới biết, càng học càng ngu 😅");

        btnBack.setOnClickListener(v -> finish());
    }
}
