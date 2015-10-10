package br.com.claudio.training.trainingaplication.controller.activities;

import android.os.Bundle;

import br.com.claudio.training.trainingaplication.R;
import br.com.claudio.training.trainingaplication.utilities.components.SelectActivityPattern;

/**
 * Created by cjunior on 08/10/15.
 */
public class SearchPedidoActivity extends SelectActivityPattern {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_search_pedido);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Busca Pedido");
    }
}
