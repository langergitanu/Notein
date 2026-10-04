package com.google.android.gms.internal.mlkit_translate;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class zzad extends zzy {
    private final transient zzw zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzad(zzw zzwVar, Object[] objArr, int i, int i2) {
        this.zza = zzwVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzy, com.google.android.gms.internal.mlkit_translate.zzp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzp
    public final int zza(Object[] objArr, int i) {
        return zzg().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzy, com.google.android.gms.internal.mlkit_translate.zzp
    /* JADX INFO: renamed from: zzd */
    public final zzak iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzy
    public final zzt zzh() {
        return new zzac(this);
    }
}
