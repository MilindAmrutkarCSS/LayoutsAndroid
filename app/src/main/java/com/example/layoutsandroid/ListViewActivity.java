package com.example.layoutsandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ListViewActivity extends AppCompatActivity {

    String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry"};
    @BindView(R.id.mobile_list)
    ListView mobileList;
    @BindView(R.id.btnSubmit)
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }

    @OnClick(R.id.btnSubmit)
    public void onViewClicked() {
        Intent intent = new Intent(this, GridViewActivity.class);
        startActivity(intent);
    }
}
