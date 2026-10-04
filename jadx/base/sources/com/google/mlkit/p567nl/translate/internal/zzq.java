package com.google.mlkit.p567nl.translate.internal;

import com.google.android.gms.internal.mlkit_translate.zzte;
import com.google.android.gms.internal.mlkit_translate.zzuy;
import com.google.android.gms.internal.mlkit_translate.zzva;
import com.google.android.gms.internal.mlkit_translate.zzvl;
import com.google.mlkit.common.sdkinternal.MlKitContext;

/* JADX INFO: loaded from: classes8.dex */
public final class zzq {
    private final zzuy zza;
    private final zzva zzb;

    public zzq() {
        zzuy zzuyVarZzb = zzvl.zzb("translate");
        zzva zzvaVarZza = zzva.zza(MlKitContext.getInstance().getApplicationContext());
        this.zza = zzuyVarZzb;
        this.zzb = zzvaVarZza;
    }

    public final zzs zza(zzte zzteVar) {
        return new zzs(this.zza, this.zzb, zzteVar, null);
    }
}
