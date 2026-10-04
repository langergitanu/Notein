package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQZ implements Iterable<zzYR0> {
    private zzYQ7 zzXQE;
    private ArrayList<zzYR0> zzZm = new ArrayList<>();

    public zzYQZ(zzYQ7 zzyq7) {
        this.zzXQE = zzyq7;
    }

    private zzYR0 zzYvv() {
        zzYQK zzyqk = new zzYQK();
        zzyqk.setName("pm0");
        zzyqk.zzY(new zzYCZ());
        this.zzXQE.zzYuS().zzZ((zzYPP) zzyqk, false, true);
        zzYR0 zzyr0 = new zzYR0();
        zzyr0.setName("Standard");
        zzyr0.zzEs(zzyqk.getName());
        zzyr0.zzK(new Section(this.zzXQE.getDocument()));
        zzZ(zzyr0);
        return zzyr0;
    }

    public final void clear() {
        this.zzZm.clear();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzYR0> iterator() {
        return this.zzZm.iterator();
    }

    public final zzYR0 zzEq(String str) {
        for (zzYR0 zzyr0 : this.zzZm) {
            if (com.aspose.words.internal.zzZKN.equals(zzyr0.getName(), str)) {
                return zzyr0;
            }
        }
        return null;
    }

    public final zzYR0 zzYvw() {
        return zzEq("Standard") != null ? zzEq("Standard") : zzYvv();
    }

    public final void zzZ(zzYR0 zzyr0) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzyr0);
    }
}
