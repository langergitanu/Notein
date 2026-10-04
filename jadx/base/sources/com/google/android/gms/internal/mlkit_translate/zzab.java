package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzab extends zzt {
    static final zzt zza = new zzab(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzab(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzf.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzt, com.google.android.gms.internal.mlkit_translate.zzp
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzp
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzp
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzp
    public final Object[] zze() {
        return this.zzb;
    }
}
