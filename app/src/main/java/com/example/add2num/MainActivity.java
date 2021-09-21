package com.example.add2num;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
    }

    public void clickButton(View v) {
        // Объявим числовые переменные
        double a, b, c;

        // Считаем с editText и editText2 текстовые значения
        String s1 = editText.getText().toString();
        String s2 = editText2.getText().toString();

        // Преобразуем текстовые переменные в числовые значения
        a = Double.parseDouble(s1);
        b = Double.parseDouble(s2);

        // Проведем с числовыми переменными нужные действия
        c = a + b + 1;

        // Преобразуем ответ в число
        String s = Double.toString(c);

        // Выведем текст в textView
        textView.setText(s);
    }
}
