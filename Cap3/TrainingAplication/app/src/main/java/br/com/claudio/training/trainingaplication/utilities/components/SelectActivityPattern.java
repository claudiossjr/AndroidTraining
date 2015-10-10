package br.com.claudio.training.trainingaplication.utilities.components;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import br.com.claudio.training.trainingaplication.R;

/**
 * Created by cjunior on 09/10/15.
 */
public class SelectActivityPattern extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void alert(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

//        MenuItem item = menu.findItem(R.id.action_share);
//        ShareActionProvider sharedItem = (ShareActionProvider)item.getActionProvider();
//        sharedItem.setShareIntent(getDefaultIntent());
        return true;
    }

    private Intent getDefaultIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/*");
        intent.putExtra(Intent.EXTRA_TEXT,"Texto para compartilhar");
        return intent;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == android.R.id.home) {
            finish();
            return true;
        }
        if (id == R.id.action_settings) {
            return true;
        }
        if(id == R.id.action_search) {
            alert("Searching");
            return true;
        }
        if(id == R.id.action_refresh) {
            alert("Refreshing");
            return true;
        }
        if(id == R.id.action_share) {
            alert("Sharing");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
