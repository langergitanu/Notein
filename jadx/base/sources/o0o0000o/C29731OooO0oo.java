package o0o0000o;

import android.text.Editable;
import android.text.TextWatcher;
import com.orion.notein.p607ui.noteeditor.ruler.SetRulerAngleDialogFragment;

/* JADX INFO: renamed from: o0o0000o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29731OooO0oo implements TextWatcher {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SetRulerAngleDialogFragment f105443OooOo0o;

    public C29731OooO0oo(SetRulerAngleDialogFragment setRulerAngleDialogFragment) {
        this.f105443OooOo0o = setRulerAngleDialogFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        this.f105443OooOo0o.Oooo0OO(string);
    }
}
