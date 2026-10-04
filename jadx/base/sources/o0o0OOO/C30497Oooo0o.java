package o0o0OOO;

import android.text.Editable;
import android.text.TextWatcher;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0o0OOO.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30497Oooo0o implements TextWatcher {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PaperConfigDialogFragment f108906OooOo0o;

    public C30497Oooo0o(PaperConfigDialogFragment paperConfigDialogFragment) {
        this.f108906OooOo0o = paperConfigDialogFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C30520o000000o c30520o000000oOooOoo = this.f108906OooOo0o.OooOoo();
        String strValueOf = String.valueOf(editable);
        C33781o00o0O c33781o00o0O = c30520o000000oOooOoo.f109027Oooo0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, strValueOf);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
