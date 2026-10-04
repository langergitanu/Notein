package com.google.android.gms.internal.auth;

import OooO0o.C20424OooO0Oo;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d, boolean z) {
        super(zzczVar, str, d, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Invalid double value for ", this.zzc, ": ");
            sbOooO0o0.append((String) obj);
            Log.e("PhenotypeFlag", sbOooO0o0.toString());
            return null;
        }
    }
}
