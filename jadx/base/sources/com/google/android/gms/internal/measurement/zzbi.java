package com.google.android.gms.internal.measurement;

import OooOoo.C20593OooO0Oo;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbi extends zzav {
    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzd(str)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("Command not found: ", str));
        }
        zzao zzaoVarZzh = zzgVar.zzh(str);
        if (zzaoVarZzh instanceof zzai) {
            return ((zzai) zzaoVarZzh).zza(zzgVar, list);
        }
        throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Function ", str, " is not defined"));
    }
}
