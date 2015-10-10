package br.com.claudio.training.trainingaplication.controller.activities;

import android.os.Bundle;

import br.com.claudio.training.trainingaplication.R;
import br.com.claudio.training.trainingaplication.utilities.components.DebugActivity;

/**
 * Created by cjunior on 10/10/15.
 */
public class ListPedidoActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list);
    }
}
