package com.example.ericksson.tallerandroid.activity;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

import com.example.ericksson.tallerandroid.Util.Constants;
import com.example.ericksson.tallerandroid.Util.TallerActions;

public class IntentServiceEjemplo extends IntentService {


    public IntentServiceEjemplo() {
        super("IntentServiceEjemplo");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (action.equalsIgnoreCase(TallerActions.ACTION_MULTIPLY)){
                int numero1 = intent.getExtras().getInt(Constants.NUMERO_1);
                int numero2 = intent.getExtras().getInt(Constants.NUMERO_2);
                multiply(numero1, numero2);
            }
        }
    }

    private void multiply(int numero1, int numero2) {
        int resultado = numero1*numero2;
        Intent intent = new Intent(TallerActions.ACTION_RECEIVE_RESULT);
        intent.putExtra(Constants.RESULTADO, resultado);
        sendBroadcast(intent);
    }

    private void handleActionFoo(String param1, String param2) {
        // TODO: Handle action Foo
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionBaz(String param1, String param2) {
        // TODO: Handle action Baz
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
