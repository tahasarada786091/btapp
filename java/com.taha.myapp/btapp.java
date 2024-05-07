import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isProcessRunning = false; // Track if the process is currently running

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonChalu = findViewById(R.id.buttonChalu);
        Button buttonBas = findViewById(R.id.buttonBas);

        buttonChalu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isProcessRunning) {
                    // Add code to disconnect Bluetooth speaker
                    isProcessRunning = true;
                }
            }
        });

        buttonBas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isProcessRunning) {
                    // Add code to stop the process and reconnect Bluetooth speaker
                    isProcessRunning = false;
                }
            }
        });
    }
}
