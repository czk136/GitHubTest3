package cn.itcast.githubtest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initOnClickListener();
    }

    private void initOnClickListener() {

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),IndexActivity.class);
                startActivity(intent1);
            }
        });
    }

    private void initData() {

    }

    private void initView() {
        btn1 = this.findViewById(R.id.btn1);
    }
}
