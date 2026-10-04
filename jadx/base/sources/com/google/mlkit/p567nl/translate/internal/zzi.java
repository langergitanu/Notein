package com.google.mlkit.p567nl.translate.internal;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.p567nl.translate.TranslatorOptions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzi extends LazyInstanceMap {
    private final zzae zza;
    private final ModelFileHelper zzb;
    private final zzq zzc;

    public zzi(zzae zzaeVar, ModelFileHelper modelFileHelper, zzq zzqVar) {
        this.zza = zzaeVar;
        this.zzb = modelFileHelper;
        this.zzc = zzqVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        TranslatorOptions translatorOptions = (TranslatorOptions) obj;
        String strZzb = translatorOptions.zzb();
        String strZzc = translatorOptions.zzc();
        return new TranslateJni(this.zza, this.zzc.zza(translatorOptions.zza()), this.zzb, strZzb, strZzc);
    }
}
