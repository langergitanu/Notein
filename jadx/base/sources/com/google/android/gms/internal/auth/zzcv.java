package com.google.android.gms.internal.auth;

import OooO0o.C20424OooO0Oo;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l, boolean z) {
        super(zzczVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Invalid long value for ", this.zzc, ": ");
            sbOooO0o0.append((String) obj);
            Log.e("PhenotypeFlag", sbOooO0o0.toString());
            return null;
        }
    }
}
