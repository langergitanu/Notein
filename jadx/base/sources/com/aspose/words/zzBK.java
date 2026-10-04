package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzBK extends zz7S {
    private zz2S zzZjc;

    public final void zzZ(zz2S zz2s) {
        this.zzZjc = zz2s;
    }

    public final zz07 zzZFj() {
        return this.zzZji;
    }

    @Override // com.aspose.words.zz7S
    public final boolean zzZFk() throws Exception {
        if (super.zzZFk()) {
            return true;
        }
        Iterator<T> it = zzZyb().getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            zz7S zz7s = (zz7S) com.aspose.words.internal.zzZKW.zzZ(((ShapeBase) it.next()).zzY9i(), zz7S.class);
            if (zz7s != null && zz7s.zzZFk()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zz53
    public final void zzZFl() {
        this.zzZji = new zz6X();
    }

    public final zz2S zzZTd() {
        return this.zzZjc;
    }
}
