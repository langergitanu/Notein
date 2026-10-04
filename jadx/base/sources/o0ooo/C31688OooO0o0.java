package o0ooo;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.orion.notein.p607ui.ocr.dialog.ReplacePageSelectorDialogFragment;
import oO0o0O0o.C33596OooOOo0;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31688OooO0o0 implements TextWatcher {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ReplacePageSelectorDialogFragment f113227OooOo0o;

    public C31688OooO0o0(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment) {
        this.f113227OooOo0o = replacePageSelectorDialogFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f113227OooOo0o;
        EditText editText = replacePageSelectorDialogFragment.f78300Oooo0O0;
        if (editText == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("dstPageNum");
            throw null;
        }
        Integer numOooOOO0 = C33596OooOOo0.OooOOO0(editText.getText().toString());
        if (numOooOOO0 != null) {
            int iIntValue = numOooOOO0.intValue();
            int iIntValue2 = ((Number) replacePageSelectorDialogFragment.Oooo0().f108661OooOOoo.getValue()).intValue();
            if (iIntValue < 1 || iIntValue > iIntValue2) {
                return;
            }
            C33781o00o0O c33781o00o0O = replacePageSelectorDialogFragment.Oooo0().f108658OooOOOo;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, numOooOOO0);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
