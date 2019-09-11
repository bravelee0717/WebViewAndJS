package com.example.webviewandjs.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.webviewandjs.R;
import com.example.webviewandjs.adapters.BaseAdapter;
import com.example.webviewandjs.adapters.BaseViewHolder;
import com.example.webviewandjs.models.KingZero;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends Activity implements View.OnClickListener {
    private RecyclerView recyclerView;
    private BaseAdapter baseAdapter;
    private List<KingZero> list;
    private TextView bottomTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        recyclerView = findViewById(R.id.myRecyclerView);
        bottomTv = findViewById(R.id.bottom_tv);
        bottomTv.setOnClickListener(this);
        getData();
        afterView();
    }

    private void getData() {
        list = new ArrayList<>();
        list.add(new KingZero(R.mipmap.shanguanwaner, "上官婉儿"));
        list.add(new KingZero(R.mipmap.libai, "李白"));
        list.add(new KingZero(R.mipmap.lixin, "李信"));
        list.add(new KingZero(R.mipmap.zhugeliang, "诸葛亮"));
        list.add(new KingZero(R.mipmap.chengyaojin, "程咬金"));
        list.add(new KingZero(R.mipmap.huakulan, "花木兰"));
        list.add(new KingZero(R.mipmap.jialuo, "伽罗"));
        list.add(new KingZero(R.mipmap.juyoujing, "橘右京"));
        list.add(new KingZero(R.mipmap.xiaoqiao, "小乔"));
        list.add(new KingZero(R.mipmap.change, "嫦娥"));
        list.add(new KingZero(R.mipmap.hanxin, "韩信"));
        list.add(new KingZero(R.mipmap.sunshangxiang, "孙尚香"));
        list.add(new KingZero(R.mipmap.dongfangyao, "东方曜"));
        list.add(new KingZero(R.mipmap.buzhihuowu, "不知火舞"));
        list.add(new KingZero(R.mipmap.direnjie, "狄仁杰"));
    }

    private void afterView() {
        if (baseAdapter == null) {
            baseAdapter = new BaseAdapter() {

                @Override
                public int getItemCount() {
                    return list.size();
                }

                @Override
                public void onBindView(BaseViewHolder viewHolder, int position) {
                    TextView textView = viewHolder.getView(R.id.title);
                    textView.setText(list.get(position).getName());
                }

                @Override
                public void onItemClick(int position) {
                    Intent intent = new Intent(RecycleViewActivity.this, ImageActivity.class);
                    intent.putExtra("zero", list.get(position));
                    startActivity(intent);
                }

                @Override
                public int getLayoutId(int position) {
                    return R.layout.item_info;
                }
            };
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(baseAdapter);
        } else {
            baseAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.bottom_tv) {
            Intent intent = new Intent(this, ImageActivity.class);
            intent.putExtra("zero", new KingZero(R.mipmap.kai, "凯皇"));
            startActivity(intent);
        }
    }
}
