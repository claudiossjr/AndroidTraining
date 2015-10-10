package br.com.claudio.training.trainingaplication.utilities.interfaces;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by claudio on 07/10/15.
 */
public interface ActivityFactoryInterface {
    public AppCompatActivity getMenuActivity();
    public AppCompatActivity getSelectPedidoActivity();
    public AppCompatActivity getSelectClientActivity();
    public AppCompatActivity getSelectItemPedidoActivity();
}
