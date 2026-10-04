package com.google.android.gms.internal.auth;

import OooO0o.C20424OooO0Oo;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Invalid boolean value for ", this.zzc, ": ");
        sbOooO0o0.append((String) obj);
        Log.e("PhenotypeFlag", sbOooO0o0.toString());
        return null;
    }
}
