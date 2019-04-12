package com.example.layoutsandroid;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class GridViewActivity extends AppCompatActivity {

    @BindView(R.id.gridview)
    GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        ButterKnife.bind(this);

        gridview.setAdapter(new ImageAdapter(this));

    }
}
