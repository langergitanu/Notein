package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzDW {
    private ArrayList<zzE2> zzvv = new ArrayList<>();
    private ArrayList<zzED> zzvu = new ArrayList<>();
    private ArrayList<zzDK> zzvt = new ArrayList<>();

    public final ArrayList<zzDK> zzDi() {
        return this.zzvt;
    }

    public final ArrayList<zzED> zzDj() {
        return this.zzvu;
    }

    public final ArrayList<zzE2> zzDk() {
        return this.zzvv;
    }

    public final void zzZ(zzGM zzgm) {
        Iterator<zzDK> it = this.zzvt.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzgm);
        }
    }
}
