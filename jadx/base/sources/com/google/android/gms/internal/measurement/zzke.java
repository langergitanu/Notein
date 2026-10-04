package com.google.android.gms.internal.measurement;

import OoooooO.C21445Oooo;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
final class zzke extends zzkm {
    public zzke(zzkg zzkgVar, String str, Double d, boolean z) {
        super(zzkgVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.zzb;
        String string = obj.toString();
        Log.e("PhenotypeFlag", C21445Oooo.OooO0O0(new StringBuilder(str.length() + 27 + string.length()), "Invalid double value for ", str, ": ", string));
        return null;
    }
}
