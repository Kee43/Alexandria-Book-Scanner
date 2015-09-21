package it.jaschke.alexandria;

/**
 * Created by Kieran on 02/08/2015.
 */
import android.content.Intent;
import android.support.v4.app.Fragment;

import it.jaschke.alexandria.barcodescanner.IntentIntegrator;


public final class FragmentIntentIntegrator extends IntentIntegrator {

    private final Fragment fragment;

    public FragmentIntentIntegrator(Fragment fragment) {
        super(fragment.getActivity());
        this.fragment = fragment;
    }

    @Override
    protected void startActivityForResult(Intent intent, int code) {
        fragment.startActivityForResult(intent, code);
    }
}
