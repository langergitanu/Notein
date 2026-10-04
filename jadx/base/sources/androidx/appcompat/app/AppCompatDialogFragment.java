package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    public AppCompatDialogFragment() {
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC21495OooOoO(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof DialogC21495OooOoO)) {
            super.setupDialog(dialog, i);
            return;
        }
        DialogC21495OooOoO dialogC21495OooOoO = (DialogC21495OooOoO) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC21495OooOoO.supportRequestWindowFeature(1);
    }

    public AppCompatDialogFragment(int i) {
        super(i);
    }
}
