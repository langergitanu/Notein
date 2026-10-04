package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzBG implements zzGH {
    private ArrayList<zzGH> zzZc = new ArrayList<>();
    private zzGH zzsG;

    public final int getCount() {
        return this.zzZc.size();
    }

    public final zzGH zzBF() {
        return this.zzsG;
    }

    public final zzGH zzVl(int i) {
        return this.zzZc.get(i);
    }

    public final void zzW(zzGH zzgh) {
        this.zzZc.remove(zzgh);
    }

    public final int zzX(zzGH zzgh) {
        zzgh.zzZ(this);
        zzZQG.zzZ(this.zzZc, zzgh);
        return this.zzZc.size() - 1;
    }

    public final void zzY(zzGH zzgh) {
        zzgh.zzZ(this);
        this.zzZc.add(0, zzgh);
    }

    @Override // com.aspose.words.internal.zzGH
    public void zzZ(zzAX zzax) {
        Iterator<zzGH> it = this.zzZc.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzax);
        }
    }

    @Override // com.aspose.words.internal.zzGH
    public final void zzZ(zzGH zzgh) {
        this.zzsG = zzgh;
    }
}
