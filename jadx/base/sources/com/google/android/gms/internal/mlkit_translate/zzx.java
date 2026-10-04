package com.google.android.gms.internal.mlkit_translate;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class zzx extends zzn {
    public zzx() {
        super(4);
    }

    public final zzx zzc(Object obj) {
        obj.getClass();
        zza(obj);
        return this;
    }

    public final zzy zzd() {
        int i = this.zzb;
        if (i == 0) {
            return zzah.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzaj(obj);
        }
        zzy zzyVarZzl = zzy.zzl(i, this.zza);
        this.zzb = zzyVarZzl.size();
        this.zzc = true;
        return zzyVarZzl;
    }
}
