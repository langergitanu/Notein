package o0ooo;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.orion.notein.p607ui.ocr.dialog.ScannedPageSelectDialogFragment;
import oO0o0O0o.C33596OooOOo0;

/* JADX INFO: renamed from: o0ooo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31695OooOOO0 implements TextWatcher {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ScannedPageSelectDialogFragment f113233OooOo0o;

    public C31695OooOOO0(ScannedPageSelectDialogFragment scannedPageSelectDialogFragment) {
        this.f113233OooOo0o = scannedPageSelectDialogFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = this.f113233OooOo0o;
        EditText editText = scannedPageSelectDialogFragment.f78350Oooo0oO;
        if (editText == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        Integer numOooOOO0 = C33596OooOOo0.OooOOO0(editText.getText().toString());
        if (numOooOOO0 != null) {
            int iIntValue = numOooOOO0.intValue();
            int iIntValue2 = ((Number) scannedPageSelectDialogFragment.Oooo00o().f108655OooOOO.getValue()).intValue();
            if (iIntValue < 1 || iIntValue > iIntValue2) {
                return;
            }
            scannedPageSelectDialogFragment.Oooo00o().OooO(iIntValue);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
