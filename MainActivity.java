package com.example.rts_lab31factorization;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v){
        EditText el_n = (EditText)findViewById(R.id.editText);
        TextView result1 = (TextView)findViewById(R.id.textView2);
        TextView result2 = (TextView)findViewById(R.id.textView3);

        int n = Integer.parseInt(el_n.getText().toString());
        int x, y, p = 0, q = 0;
        boolean check = true;
        double counter = Math.ceil(Math.sqrt(n));
        while (check == true) {
            if ((Math.sqrt((counter*counter - n)))%1 ==0) {
                x = (int)counter;
                y = (int)Math.sqrt((counter*counter - n));
                p = x - y;
                q = x + y;
                check = false;
            }
            counter++;
        }
        result1.setText(Integer.toString(p));
        result2.setText(Integer.toString(q));
    }
}
