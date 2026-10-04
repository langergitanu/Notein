package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zz0M extends zz47 {
    private boolean zzYXt;
    private zzZ0J zzYXu;
    private ArrayList<zz47> zzZom;

    public zz0M(zzZ0J zzz0j) {
        this(zzz0j, new zz30());
    }

    public final ArrayList<zz47> zzMf() {
        return this.zzZom;
    }

    public final void zzY(zz47 zz47Var) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZom, zz47Var);
    }

    @Override // com.aspose.words.zz47
    public final void zzZ(zz4A zz4a) {
        super.zzZ(zz4a);
        Iterator<zz47> it = this.zzZom.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zz4a);
        }
    }

    public final void zzZsJ() {
        this.zzYXt = true;
    }

    public final boolean zzZsK() {
        return this.zzYXt;
    }

    public final zzZ0J zzZsL() {
        return this.zzYXu;
    }

    @Override // com.aspose.words.zz47
    public final zz47 zzZx7() {
        zz0M zz0m = (zz0M) super.zzZx7();
        if (this.zzZom != null) {
            zz0m.zzZom = new ArrayList<>(this.zzZom.size());
            Iterator<zz47> it = this.zzZom.iterator();
            while (it.hasNext()) {
                zz0m.zzY(it.next().zzZx7());
            }
        }
        return zz0m;
    }

    public zz0M(zzZ0J zzz0j, zz30 zz30Var) {
        this.zzZom = new ArrayList<>();
        zzW(zz30Var);
        this.zzYXu = zzz0j;
    }
}
