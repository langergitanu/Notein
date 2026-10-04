package com.google.android.gms.internal.mlkit_translate;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzvd implements zzup {
    private final zzor zza;
    private zzsu zzb = new zzsu();

    private zzvd(zzor zzorVar, int i) {
        this.zza = zzorVar;
        zzwj.zza();
    }

    public static zzup zzf(zzor zzorVar) {
        return new zzvd(zzorVar, 0);
    }

    public static zzup zzg() {
        return new zzvd(new zzor(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzup
    public final zzup zza(zzoq zzoqVar) {
        this.zza.zzg(zzoqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzup
    public final zzup zzb(zzox zzoxVar) {
        this.zza.zzi(zzoxVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzup
    public final zzup zzc(zzsu zzsuVar) {
        this.zzb = zzsuVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzup
    public final String zzd() {
        zzsw zzswVarZzh = this.zza.zzm().zzh();
        return (zzswVarZzh == null || zzi.zzb(zzswVarZzh.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzswVarZzh.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzup
    public final byte[] zze(int i, boolean z) {
        this.zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzl(this.zzb.zzm());
        try {
            zzwj.zza();
            if (i == 0) {
                return new JsonDataEncoderBuilder().configureWith(zzmm.zza).ignoreNullValues(true).build().encode(this.zza.zzm()).getBytes("utf-8");
            }
            zzot zzotVarZzm = this.zza.zzm();
            zzbw zzbwVar = new zzbw();
            zzmm.zza.configure(zzbwVar);
            return zzbwVar.zza().zza(zzotVarZzm);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
