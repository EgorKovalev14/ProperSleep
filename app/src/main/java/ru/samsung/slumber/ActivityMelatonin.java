package ru.samsung.slumber;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityMelatonin extends AppCompatActivity implements View.OnClickListener {
    ImageView melatonin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melatonin);
        melatonin = findViewById(R.id.imageViewMelatonin);
        melatonin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.imageViewMelatonin:
                finish();
        }

    }
}
