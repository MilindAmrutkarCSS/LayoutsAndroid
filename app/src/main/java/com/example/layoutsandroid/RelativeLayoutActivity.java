package com.example.layoutsandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RelativeLayoutActivity extends AppCompatActivity {

    @BindView(R.id.tvRelativeHeading)
    TextView tvRelativeHeading;
    @BindView(R.id.ivD2KLogo)
    ImageView ivD2KLogo;
    @BindView(R.id.etName)
    EditText etName;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.btnSubmit)
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSubmit)
    public void onViewClicked() {
        Intent intent = new Intent(this, FrameLayoutActivity.class);
        startActivity(intent);
    }
}
