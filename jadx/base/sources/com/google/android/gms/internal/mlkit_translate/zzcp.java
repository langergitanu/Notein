package com.google.android.gms.internal.mlkit_translate;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class zzcp extends AbstractSet {
    final /* synthetic */ zzcu zza;

    public zzcp(zzcu zzcuVar) {
        this.zza = zzcuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.zza.zzb((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzco(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzct zzctVarZzb;
        if (!(obj instanceof Map.Entry) || (zzctVarZzb = this.zza.zzb((Map.Entry) obj)) == null) {
            return false;
        }
        this.zza.zze(zzctVarZzb, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zzb;
    }
}
