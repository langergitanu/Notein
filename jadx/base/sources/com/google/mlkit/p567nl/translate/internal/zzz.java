package com.google.mlkit.p567nl.translate.internal;

import com.google.mlkit.p567nl.translate.TranslateRemoteModel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzz {
    private final zzg zza;
    private final zzy zzb;
    private final Map zzc = new HashMap();

    public zzz(zzy zzyVar, zzg zzgVar) {
        this.zzb = zzyVar;
        this.zza = zzgVar;
    }

    public final zzab zza(TranslateRemoteModel translateRemoteModel, boolean z) {
        String strZza = TranslateRemoteModel.zza(zzac.zzb(translateRemoteModel.getLanguage()));
        synchronized (this.zzc) {
            try {
                if (this.zzc.containsKey(strZza)) {
                    return (zzab) this.zzc.get(strZza);
                }
                zzab zzabVar = new zzab(this.zza.zza(translateRemoteModel), this.zzb, null);
                if (z) {
                    this.zzc.put(strZza, zzabVar);
                }
                return zzabVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
