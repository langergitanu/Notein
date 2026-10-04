package com.google.android.gms.internal.mlkit_translate;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
class zzn extends zzo {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzn(int i) {
    }

    public final zzn zza(Object obj) {
        obj.getClass();
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            this.zza = Arrays.copyOf(objArr, zzo.zzb(length, i));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr2[i2] = obj;
        return this;
    }
}
