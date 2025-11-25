package com.example.hathiyennhi_1150070031_lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class StoryPagerAdapter extends PagerAdapter {

    private final List<Story> stories;
    private final Context context;

    public StoryPagerAdapter(List<Story> stories, Context context) {
        this.stories = stories;
        this.context = context;
    }

    @Override
    public int getCount() {
        return stories.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View v = LayoutInflater.from(context)
                .inflate(R.layout.item_detail_story, container, false);

        Story s = stories.get(position);

        TextView tvTitle = v.findViewById(R.id.tvTenTruyen);
        TextView tvContent = v.findViewById(R.id.tvNoiDung);

        tvTitle.setText(s.title);
        tvContent.setText(s.content);

        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
