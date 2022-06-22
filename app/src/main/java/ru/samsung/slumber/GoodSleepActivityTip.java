package ru.samsung.slumber;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GoodSleepActivityTip extends AppCompatActivity implements View.OnClickListener {
    ImageView image;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goodsleep_tip_activity);
        image = findViewById(R.id.imageViewSleepSreda);
        image.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.imageViewSleepSreda:
                finish();
                break;
        }

    }
}
