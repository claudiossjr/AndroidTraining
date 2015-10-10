package br.com.claudio.training.trainingaplication.controller.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.com.claudio.training.trainingaplication.R;
import br.com.claudio.training.trainingaplication.utilities.components.DebugActivity;

public class LoginActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_login);

        //ativando o toolbar
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Login");

        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(getLoginListener());



        //Tratando botão flutuavel.
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    private View.OnClickListener getLoginListener() {
        return new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView tvUser = (TextView) findViewById(R.id.tLogin);
                TextView tvPass = (TextView) findViewById(R.id.tSenha);

                String username = tvUser.getText().toString();
                String password = tvPass.getText().toString();
                if("SEARCH".equals(username) && "".equals(password)) {
                    alert("Logado");
                    Intent intent = new Intent(getContext(),MenuActivity.class);
                    Bundle params = new Bundle();
                    params.putString("nome","Rosas");
                    intent.putExtras(params);
                    startActivity(intent);
                    finish();
                } else {
                    alert("User or Password invalid.");
                }
            }
        };
    }

    private void alert(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private Context getContext() {
        return this;
    }
}
