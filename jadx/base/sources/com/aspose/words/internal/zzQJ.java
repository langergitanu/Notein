package com.aspose.words.internal;

import com.aspose.words.internal.zzQI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzQJ<TElement extends zzQI> extends zzQI implements Cloneable {
    private ArrayList<TElement> zzZc = new ArrayList<>();

    public final int getCount() {
        return this.zzZc.size();
    }

    public final void removeAt(int i) {
        this.zzZc.remove(i);
    }

    public final ArrayList<TElement> zzQw() {
        return this.zzZc;
    }

    public final void zzQx() {
        Collections.reverse(this.zzZc);
    }

    public final TElement zzYi(int i) {
        return this.zzZc.get(i);
    }

    public final void zzYj(int i) {
        this.zzZc = new ArrayList<>(i);
    }

    public int zzZ(TElement telement) {
        if (telement == null) {
            return -1;
        }
        zzZQG.zzZ(this.zzZc, telement);
        return this.zzZc.size() - 1;
    }

    public final void zzZ(Comparator<TElement> comparator) {
        Collections.sort(this.zzZc, comparator);
    }

    @Override // com.aspose.words.internal.zzQI
    public void zzZ(zzQA zzqa) throws Exception {
        for (int i = 0; i < this.zzZc.size(); i++) {
            zzYi(i).zzZ(zzqa);
        }
    }
}
