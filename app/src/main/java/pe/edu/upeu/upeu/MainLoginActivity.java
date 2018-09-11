package pe.edu.upeu.upeu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainLoginActivity extends AppCompatActivity {

    Button btnIngresar;
    EditText usuario, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        btnIngresar=(Button)findViewById(R.id.button);
        usuario=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte=new Intent();
                inte.putExtra("valorUser",String.valueOf(usuario.getText()));
                inte.putExtra("valorPass",String.valueOf(password.getText()));
                inte.setClass(getApplicationContext(),MainActivity.class);
                startActivity(inte);
            }
        });
    }
}
