package o0ooo;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.orion.notein.p607ui.ocr.dialog.ReplacePageSelectorDialogFragment;
import oO0o0O0o.C33596OooOOo0;

/* JADX INFO: renamed from: o0ooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31689OooO0oO implements TextWatcher {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ReplacePageSelectorDialogFragment f113228OooOo0o;

    public C31689OooO0oO(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment) {
        this.f113228OooOo0o = replacePageSelectorDialogFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f113228OooOo0o;
        EditText editText = replacePageSelectorDialogFragment.f78295Oooo;
        if (editText == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        Integer numOooOOO0 = C33596OooOOo0.OooOOO0(editText.getText().toString());
        if (numOooOOO0 != null) {
            int iIntValue = numOooOOO0.intValue();
            int iIntValue2 = ((Number) replacePageSelectorDialogFragment.Oooo0().f108655OooOOO.getValue()).intValue();
            if (iIntValue < 1 || iIntValue > iIntValue2) {
                return;
            }
            replacePageSelectorDialogFragment.Oooo0().OooO(iIntValue);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
