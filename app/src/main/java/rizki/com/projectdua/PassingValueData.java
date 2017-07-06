package rizki.com.projectdua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PassingValueData extends AppCompatActivity {

    EditText etUsername, etPass;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_value_data);

        etUsername = (EditText)findViewById(R.id.etUsername);
        etPass = (EditText)findViewById(R.id.etPass);

        btnSubmit  = (Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //cek nilai kosong

                String aUser = etUsername.getText().toString();
                String aPass = etPass.getText().toString();

                if(aUser.isEmpty()){
                    etUsername.setError("Username tidak boleh kosong");
                }else if (aPass.isEmpty()){
                    etPass.setError("Password tidak boleh kosong");
                }else{
                    //pindah ke activity getValueData
                    Intent a1 = new Intent(getApplicationContext(),
                            GetValueData.class);

                    //lempar nilai
                    a1.putExtra("nama", aUser);
                    a1.putExtra("pass", aPass);

                    startActivity(a1);


                }
            }
        });
    }
}
