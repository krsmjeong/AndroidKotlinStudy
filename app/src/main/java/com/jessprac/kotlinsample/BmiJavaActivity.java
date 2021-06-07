package com.jessprac.kotlinsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BmiJavaActivity extends AppCompatActivity {

    EditText tallField;
    EditText weightField;
    TextView resultLabel;
    Button bmiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // UI로 사용할 레이아웃 XML파일을 지정한다.
        setContentView(R.layout.layout_view_binding);

        tallField = findViewById(R.id.tallField);
        weightField = findViewById(R.id.weightField);
        resultLabel = findViewById(R.id.resultLabel);
        bmiButton = findViewById(R.id.bmiButton);

        // BmiButton 이 클릭된 경우의 이벤트 리스너를 등록한다.
        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // tallField 의 값을 읽어온다.
                EditText tallField = findViewById(R.id.tallField);
                String tall = tallField.getText().toString();

                // weightField 의 값을 읽어온다.
                EditText weightFiled = findViewById(R.id.weightField);
                String weight = weightFiled.getText().toString();

                // BMI를 계산한다. 체중 / 키 * 키 -> 키를 cm 로 입력받았으므로 100으로 나누어 제곱한다.
                // Math.pow() 는 넘겨받은 파라미터 값을 제곱해서 돌려준다.
                // 예를 들어 Math.pow(2, 3) 은 2의 3제곱 즉, 8을 돌려준다.
                double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(tall) / 100.0, 2);

                // 결과 bmi를 resultLabel에 보여준다.
                TextView resultLabel = findViewById(R.id.resultLabel);
                resultLabel.setText("키: " + tall + ", 체중: " + weight + ", BMI: " + bmi);
            }
        });
    }
}