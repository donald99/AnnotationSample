package dom.annotation;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import d.annotation.PrintInfo;

public class MainActivity extends Activity {


    @BindView(R.id.textview)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        textView.setText("1234567890");

        showToast();
    }

    @PrintInfo
    public void showToast(){
        Toast.makeText(this,"showToast",Toast.LENGTH_LONG).show();
    }
}
