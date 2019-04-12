package com.example.layoutsandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FrameLayoutActivity extends AppCompatActivity {

    @BindView(R.id.ivAndroidLogo)
    ImageView ivAndroidLogo;
    @BindView(R.id.tvAndroidText)
    TextView tvAndroidText;
    @BindView(R.id.etComments)
    EditText etComments;
    @BindView(R.id.btnSubmit)
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSubmit)
    public void onViewClicked() {
        Intent intent = new Intent(this, TableLayoutActivity.class);
        startActivity(intent);
    }
}
