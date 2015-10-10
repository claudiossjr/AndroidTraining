package br.com.claudio.training.trainingaplication.controller.factory;

import android.support.v7.app.AppCompatActivity;

import br.com.claudio.training.trainingaplication.controller.activities.MenuActivity;
import br.com.claudio.training.trainingaplication.controller.activities.SearchClienteActivity;
import br.com.claudio.training.trainingaplication.controller.activities.SearchPedidoActivity;
import br.com.claudio.training.trainingaplication.utilities.interfaces.ActivityFactoryInterface;

/**
 * Created by claudio on 07/10/15.
 */
public class ActivitiesFactory implements ActivityFactoryInterface{
    //Singleton implementation
    private static ActivitiesFactory FACTORY = new ActivitiesFactory();
    public static ActivitiesFactory getInstance() {return FACTORY;}

    @Override
    public AppCompatActivity getMenuActivity() {
        return new MenuActivity();
    }

    @Override
    public AppCompatActivity getSelectPedidoActivity() {
        return new SearchPedidoActivity();
    }

    @Override
    public AppCompatActivity getSelectClientActivity() {
        return new SearchClienteActivity();
    }

    @Override
    public AppCompatActivity getSelectItemPedidoActivity() {
        return null;
    }
}
