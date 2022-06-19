package ru.samsung.slumber;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qwerty);
        // код пишется в методе onCreate()

// получаем экземпляр элемента ListView
        ListView listView = findViewById(R.id.listView);

// определяем строковый массив
        final String[] catNames = new String[] {
                "Рыжик", "Барсик", "Мурзик", "Мурка", "Васька",
                "Томасина", "Кристина", "Пушок", "Дымка", "Кузя",
                "Китти", "Масяня", "Симба"
        };

// используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, catNames);

        listView.setAdapter(adapter);
    }
}
