package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
final class zzJS extends zzZWH {
    private static Collection<zzJU> zzAg = new ArrayList();
    private Collection<zzJU> zzAf = zzAg;
    private Iterable<zzJV> zzAj;

    public zzJS(Iterable<zzJV> iterable) {
        this.zzAj = iterable;
    }

    private Collection<zzJU> zzHx() {
        try {
            ArrayList<zzJU> arrayList = new ArrayList<>();
            zzZXF zzzxf = new zzZXF();
            for (zzJV zzjv : this.zzAj) {
                zzzxf.zzZ(arrayList, zzjv.zzHL(), zzjv.zzHK());
            }
            return arrayList;
        } catch (Exception unused) {
            return zzAg;
        }
    }

    public static Collection<zzJU> zzU(Iterable<zzJV> iterable) {
        return new zzJS(iterable).zzHx();
    }

    @Override // com.aspose.words.internal.zzZWH
    public final void zzHy() {
        this.zzAf = zzHx();
    }

    public final Collection<zzJU> zzIj() {
        return this.zzAf;
    }
}
