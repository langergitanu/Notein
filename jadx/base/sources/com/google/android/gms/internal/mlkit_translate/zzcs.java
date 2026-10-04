package com.google.android.gms.internal.mlkit_translate;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzcs implements Iterator {
    zzct zza;
    zzct zzb = null;
    int zzc;
    final /* synthetic */ zzcu zzd;

    public zzcs(zzcu zzcuVar) {
        this.zzd = zzcuVar;
        this.zza = zzcuVar.zzd.zzd;
        this.zzc = zzcuVar.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzct zzctVar = this.zzb;
        if (zzctVar == null) {
            throw new IllegalStateException();
        }
        this.zzd.zze(zzctVar, true);
        this.zzb = null;
        this.zzc = this.zzd.zzc;
    }

    public final zzct zza() {
        zzcu zzcuVar = this.zzd;
        zzct zzctVar = this.zza;
        if (zzctVar == zzcuVar.zzd) {
            throw new NoSuchElementException();
        }
        if (zzcuVar.zzc != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zzctVar.zzd;
        this.zzb = zzctVar;
        return zzctVar;
    }
}
