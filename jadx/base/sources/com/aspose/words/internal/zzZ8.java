package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8 extends zzN {
    private ArrayList<zzZ7> zzY6;

    public zzZ8() {
        this.zzY6 = new ArrayList<>();
    }

    @Override // com.aspose.words.internal.zzN
    public final zzN zz2() {
        zzZ8 zzz8 = new zzZ8(this.zzY6.size());
        Iterator<zzZ7> it = this.zzY6.iterator();
        while (it.hasNext()) {
            zzZQG.zzZ(zzz8.zzY6, it.next());
        }
        return zzz8;
    }

    @Override // com.aspose.words.internal.zzN
    public final zzZL zz3() {
        zzG zzg = new zzG();
        for (zzZ7 zzz7 : this.zzY6) {
            zzP8 zzp8ZzY = zzP8.zzY(new long[]{zzz7.zzYN().zzYK(), zzz7.zzYM().zzYK(), zzz7.zzYL().zzYK()}, false, true);
            zzP0 zzp0 = new zzP0(zzp8ZzY.zzO8(), zzz7.zzYN().zzYK());
            zzp0.zzJ(zzz7.zzYN().zzZy());
            zzp0.zzY(new zzPV[]{zzz7.zzYN().zzZy(), zzz7.zzYM().zzZy(), zzz7.zzYL().zzZy()});
            zzZG zzzg = new zzZG(zzp8ZzY);
            zzzg.zzY(zzp0);
            zzg.zzX(zzzg);
        }
        return zzg;
    }

    @Override // com.aspose.words.internal.zzN
    public final void zzX(zzP9 zzp9) {
        ArrayList<zzZ7> arrayList = new ArrayList<>(this.zzY6.size());
        Iterator<zzZ7> it = this.zzY6.iterator();
        while (it.hasNext()) {
            zzZQG.zzZ(arrayList, it.next().zzQ(zzp9));
        }
        this.zzY6 = arrayList;
    }

    public final ArrayList<zzZ7> zzYO() {
        return this.zzY6;
    }

    @Override // com.aspose.words.internal.zzN
    public final void zzZ(zzM zzm) throws Exception {
        zzm.zzZ(this);
    }

    public zzZ8(int i) {
        this.zzY6 = new ArrayList<>(i);
    }
}
