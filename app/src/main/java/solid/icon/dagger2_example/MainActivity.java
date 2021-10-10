package solid.icon.dagger2_example;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import solid.icon.dagger2_example.services.NetworkService;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Inject
    NetworkService networkService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App)getApplication()).getAppComponent()
                .inject(this);

        textView = findViewById(R.id.textView);
        textView.setText(networkService.getHello());
    }
}