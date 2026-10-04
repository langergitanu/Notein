package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzBD extends zz98 implements Cloneable {
    private static zzBD zzZ7P;
    private ArrayList<zzBF> zzUY;

    static {
        zzBD zzbd = new zzBD();
        zzZ7P = zzbd;
        zzbd.zzUY = new ArrayList<>();
    }

    public static zzBD zzZF4() {
        return zzZ7P;
    }

    @Override // com.aspose.words.zz98
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zz9(ArrayList<zzBF> arrayList) {
        this.zzUY = arrayList;
    }

    @Override // com.aspose.words.zz98
    public final void zzZ(zzZCK zzzck) {
        zzzck.zzZ(this);
    }

    @Override // com.aspose.words.zz98
    public final zz98 zzZFO() {
        zzBD zzbd = (zzBD) memberwiseClone();
        zzbd.zzUY = new ArrayList<>();
        Iterator<zzBF> it = this.zzUY.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zzbd.zzUY, it.next());
        }
        return zzbd;
    }

    @Override // com.aspose.words.zz98
    public final int zzZSn() {
        return 2;
    }

    public final ArrayList<zzBF> zzl9() {
        return this.zzUY;
    }
}
