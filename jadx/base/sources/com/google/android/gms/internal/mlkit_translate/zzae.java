package com.google.android.gms.internal.mlkit_translate;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
final class zzae extends zzy {
    private final transient zzw zza;
    private final transient zzt zzb;

    public zzae(zzw zzwVar, zzt zztVar) {
        this.zza = zzwVar;
        this.zzb = zztVar;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzy, com.google.android.gms.internal.mlkit_translate.zzp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzp
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzy, com.google.android.gms.internal.mlkit_translate.zzp
    /* JADX INFO: renamed from: zzd */
    public final zzak iterator() {
        return this.zzb.listIterator(0);
    }
}
