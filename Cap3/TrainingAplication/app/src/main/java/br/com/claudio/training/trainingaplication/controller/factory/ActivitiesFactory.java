package br.com.claudio.training.trainingaplication.controller.factory;

import android.support.v7.app.AppCompatActivity;

import br.com.claudio.training.trainingaplication.interfaces.ActivityFactoryInterface;

/**
 * Created by claudio on 07/10/15.
 */
public class ActivitiesFactory implements ActivityFactoryInterface{
    //Singleton implementation
    private static ActivitiesFactory FACTORY = new ActivitiesFactory();
    public static ActivitiesFactory getInstance() {return FACTORY;}

    @Override
    public AppCompatActivity getMenuActivity() {
        return null;
    }

    @Override
    public AppCompatActivity getSelectPedidoActivity() {
        return null;
    }

    @Override
    public AppCompatActivity getSelectClientActivity() {
        return null;
    }

    @Override
    public AppCompatActivity getSelectItemPedidoActivity() {
        return null;
    }
}
