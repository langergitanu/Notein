package com.orion.notein.p607ui.label;

import android.text.Editable;
import android.text.TextWatcher;
import com.orion.notein.p607ui.label.OooO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements TextWatcher {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<String, C32460OooOooO> f71966OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0o.OooO0O0 f71967OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public OooO(OooO0o.OooO0O0 oooO0O0, InterfaceC32507OooOO0o<? super String, C32460OooOooO> interfaceC32507OooOO0o) {
        this.f71967OooOo0o = oooO0O0;
        this.f71966OooOo = interfaceC32507OooOO0o;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f71967OooOo0o.f71994OooO) {
            return;
        }
        String string = editable != null ? editable.toString() : null;
        if (string == null) {
            string = "";
        }
        this.f71966OooOo.invoke(string);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
