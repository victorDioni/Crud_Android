package dionizio.victor.crud.ui.login.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import dionizio.victor.crud.R;
import dionizio.victor.crud.ui.main.view.MainActivity;
import dionizio.victor.crud.ui.produto.view.CadastrarProdutoActivity;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnEntrarLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chamarTelaPrincipal();
            }
        });
    }

    public void chamarTelaPrincipal(){
        startActivity(new Intent(this, MainActivity.class));
    }
}
