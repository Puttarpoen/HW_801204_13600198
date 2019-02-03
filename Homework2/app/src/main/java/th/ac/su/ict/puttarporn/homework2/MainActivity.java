package th.ac.su.ict.puttarporn.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ab;
    private Button Bt1;
    private Button Bt2;
    private Button Bt3;
    private Button Bt4;
    private Button Bt5;
    private Button Bt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ab = findViewById(R.id.ab);
        Bt1 = findViewById(R.id.Bt1);
        Bt2 = findViewById(R.id.Bt2);
        Bt3 = findViewById(R.id.Bt3);
        Bt4 = findViewById(R.id.Bt4);
        Bt5 = findViewById(R.id.Bt5);
        Bt6 = findViewById(R.id.Bt6);

        Bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ab.setBackgroundColor(Color.rgb(235, 225, 221 ));
                ab.setText("235-225-221");
            }
        });
        Bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ab.setBackgroundColor(Color.rgb(236, 203, 202 ));
                ab.setText("236-203-202");
            }
        });
        Bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ab.setBackgroundColor(Color.rgb(117, 131, 156 ));
                ab.setText("117-131-156");
            }
        });
        Bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ab.setBackgroundColor(Color.rgb(153, 169, 191 ));
                ab.setText("153-169-191");
            }
        });
        Bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ab.setBackgroundColor(Color.rgb(195, 204, 213 ));
                ab.setText("195-204-213");
            }
        });
        Bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ab.setBackgroundColor(Color.rgb(221, 226, 229 ));
                ab.setText("221-226-229");
            }
        });

    }


}

