package br.com.claudio.training.trainingaplication.controller.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.claudio.training.trainingaplication.R;
import br.com.claudio.training.trainingaplication.utilities.components.DebugActivity;
import br.com.claudio.training.trainingaplication.utilities.components.MyTabListener;

/**
 * Created by cjunior on 08/10/15.
 */
public class MenuActivity extends DebugActivity {

    private Intent defaultIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_menu);
        getSupportActionBar().setTitle("Menu");
        initTabs();
        initListeners();

    }

    private void initTabs() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("Tab 1").setTabListener((ActionBar.TabListener) new MyTabListener(this, 1)));
        actionBar.addTab(actionBar.newTab().setText("Tab 2").setTabListener((ActionBar.TabListener) new MyTabListener(this, 2)));
        actionBar.addTab(actionBar.newTab().setText("Tab 3").setTabListener((ActionBar.TabListener) new MyTabListener(this, 3)));
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


        //SearchView
        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(onSearch());

        //ShareActionProvider
        MenuItem sharedItem = menu.findItem(R.id.action_share);
        ShareActionProvider share = (ShareActionProvider) MenuItemCompat.getActionProvider(sharedItem);
        share.setShareIntent(getDefaultIntent());

        return true;
    }

    private SearchView.OnQueryTextListener onSearch() {

        return new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                alert("Buscar o Texto: " + query );
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        };
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


    public Intent getDefaultIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/*");
        intent.putExtra(Intent.EXTRA_TEXT,"Texto para compartilhar");
        return intent;
    }
}
