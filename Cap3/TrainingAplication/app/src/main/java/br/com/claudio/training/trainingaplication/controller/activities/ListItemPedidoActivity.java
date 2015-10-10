package br.com.claudio.training.trainingaplication.controller.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import br.com.claudio.training.trainingaplication.R;
import br.com.claudio.training.trainingaplication.utilities.components.DebugActivity;

/**
 * Created by cjunior on 10/10/15.
 */
public class ListItemPedidoActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list);

        String numeroPedido = getIntent().getExtras().getString("pedido");

        LinearLayout layout = (LinearLayout) findViewById(R.id.list_content);
        LayoutInflater inflater = LayoutInflater.from(this);
        for(int i = 0; i < 100; i++) {

            LinearLayout inflatier = (LinearLayout) inflater.inflate(R.layout.inflate_element,layout,false);

            TextView edit = (TextView) inflatier.findViewById(R.id.inflatier_id);
            edit.setText(i + " -> " + numeroPedido);

            layout.addView(inflatier);
        }



    }
}
