package gamis214.com.styleinputlayouts;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button err = findViewById(R.id.error);
        final TextInputLayout til_nombre = findViewById(R.id.til_nombre);
        final TextInputLayout til_pass = findViewById(R.id.til_pass);
        err.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                til_nombre.setError("ESTO ES UN ERROR");
                til_pass.setError("Error password");
            }
        });
    }
}
