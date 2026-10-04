package com.google.android.gms.internal.measurement;

import OoooooO.C21445Oooo;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
final class zzkc extends zzkm {
    public zzkc(zzkg zzkgVar, String str, Long l, boolean z) {
        super(zzkgVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.zzb;
        String string = obj.toString();
        Log.e("PhenotypeFlag", C21445Oooo.OooO0O0(new StringBuilder(str.length() + 25 + string.length()), "Invalid long value for ", str, ": ", string));
        return null;
    }
}
