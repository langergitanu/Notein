package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zzut implements zzuq {
    final List zza;

    public zzut(Context context, zzus zzusVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzusVar.zzc()) {
            arrayList.add(new zzvi(context, zzusVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzuq
    public final void zza(zzup zzupVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzuq) it.next()).zza(zzupVar);
        }
    }
}
