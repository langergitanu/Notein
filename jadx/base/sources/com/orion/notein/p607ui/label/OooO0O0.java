package com.orion.notein.p607ui.label;

import android.text.Editable;
import android.text.TextWatcher;
import com.orion.notein.p607ui.label.OooO0OO;
import o0Oo0ooO.C28411OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements TextWatcher {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28411OooO0o f71970OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO00o f71971OooOo0o;

    public OooO0O0(OooO0OO.OooO00o oooO00o, C28411OooO0o c28411OooO0o) {
        this.f71971OooOo0o = oooO00o;
        this.f71970OooOo = c28411OooO0o;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Exception {
        if (this.f71971OooOo0o.f71981OooO0oo) {
            return;
        }
        String string = editable != null ? editable.toString() : null;
        if (string == null) {
            string = "";
        }
        this.f71970OooOo.invoke(string);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
