package com.google.android.gms.internal.mlkit_translate;

import OooOoo.C20593OooO0Oo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
final class zzaj extends zzy {
    final transient Object zza;

    public zzaj(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzy, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzy, com.google.android.gms.internal.mlkit_translate.zzp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new zzz(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C20593OooO0Oo.OooO0O0("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzp
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzy, com.google.android.gms.internal.mlkit_translate.zzp
    /* JADX INFO: renamed from: zzd */
    public final zzak iterator() {
        return new zzz(this.zza);
    }
}
