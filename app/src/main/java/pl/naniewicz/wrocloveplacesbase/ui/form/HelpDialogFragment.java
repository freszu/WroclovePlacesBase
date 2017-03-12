package pl.naniewicz.wrocloveplacesbase.ui.form;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

public class HelpDialogFragment extends DialogFragment {

    public static final String TAG = HelpDialogFragment.class.getSimpleName();

    public static HelpDialogFragment newInstance() {
        return new HelpDialogFragment();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //todo implement material dialog
        return null;
    }
}