package rizki.com.projectdua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GetValueData extends AppCompatActivity {

    TextView txtNama, txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_value_data);

        txtNama = (TextView)findViewById(R.id.txtNama);
        txtPass = (TextView)findViewById(R.id.txtPass);

        Intent intent = getIntent();

        //mengambil nilai dari yang di lempar activity sebelumnya

        String fName = intent.getStringExtra("nama");
        String fPass = intent.getStringExtra("pass");

        txtNama.setText("Halo , " + fName);
        txtPass.setText("Password anda : " + fPass);

    }
}
