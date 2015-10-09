package br.com.claudio.training.trainingaplication.controller.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.claudio.training.trainingaplication.R;
import br.com.claudio.training.trainingaplication.interfaces.DebugActivity;

/**
 * Created by cjunior on 08/10/15.
 */
public class MenuActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_menu);

        initListeners();

    }

    private void initListeners() {
        Button btPedido = (Button) findViewById(R.id.btPedido);
        btPedido.setOnClickListener(getBtPedido());

        Button btCliente = (Button) findViewById(R.id.btCliente);
        btCliente.setOnClickListener(getBtCliente());
    }

    private View.OnClickListener getBtCliente() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),SearchClienteActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener getBtPedido() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SearchPedidoActivity.class);
                startActivity(intent);
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
