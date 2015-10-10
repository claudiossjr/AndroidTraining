package br.com.claudio.training.trainingaplication.controller.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import br.com.claudio.training.trainingaplication.R;
import br.com.claudio.training.trainingaplication.utilities.components.SelectActivityPattern;

/**
 * Created by cjunior on 08/10/15.
 */
public class SearchPedidoActivity extends SelectActivityPattern {

    private String searchElement = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_search_pedido);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Busca Pedido");
        EditText numberPedido = (EditText) findViewById(R.id.tPedido);
        numberPedido.setOnKeyListener(textEntered());
    }

    private View.OnKeyListener textEntered() {
        return new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                EditText pedido = (EditText)v;
//                searchElement += event.getCharacters();
//            } else {
                if( event.getKeyCode() == KeyEvent.KEYCODE_ENTER ) {
                    Intent intent = new Intent(getContext(),ListItemPedidoActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("pedido",pedido.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);
                }

                return false;
            }
        };
    }

    private Context getContext() {
        return this;
    }
}
