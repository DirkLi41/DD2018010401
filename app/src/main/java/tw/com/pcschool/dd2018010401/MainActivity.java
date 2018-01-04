package tw.com.pcschool.dd2018010401;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        /*TextView tv = new TextView(this);
                tv.setText("Hello,World!");
                setContentView(tv);*/
        Button bt = new Button(this);
        bt.setText("Click me!!!");
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,  "Boom!!!", Toast.LENGTH_SHORT).show();
            }
        });
        //setContentView(bt);
        Button bt2 = new Button(this);
        bt2.setText("Don't Click!!!");
        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,  "Oh Yes~", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout lin = new LinearLayout(this);
        lin.setOrientation(LinearLayout.VERTICAL);
        lin.addView(bt);
        lin.addView(bt2);
        setContentView(lin);


    }
}
