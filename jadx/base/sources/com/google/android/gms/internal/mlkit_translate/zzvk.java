package com.google.android.gms.internal.mlkit_translate;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* JADX INFO: loaded from: classes7.dex */
final class zzvk extends LazyInstanceMap {
    private zzvk() {
        throw null;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        zzus zzusVar = (zzus) obj;
        MlKitContext mlKitContext = MlKitContext.getInstance();
        return new zzuy(mlKitContext.getApplicationContext(), (SharedPrefManager) mlKitContext.get(SharedPrefManager.class), new zzut(MlKitContext.getInstance().getApplicationContext(), zzusVar), zzusVar.zzb());
    }

    public /* synthetic */ zzvk(zzvj zzvjVar) {
    }
}
