package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzSZ implements zzHB {
    private ArrayList<zzT0> zzQ4 = new ArrayList<>();

    public zzSZ() {
        reset();
    }

    private void zzTk() {
        zzZQG.zzZ(this.zzQ4, new zzT0(0, Integer.MAX_VALUE));
    }

    @Override // com.aspose.words.internal.zzHB
    public final int getCount() {
        return this.zzQ4.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzT0> iterator() {
        return this.zzQ4.iterator();
    }

    public final void reset() {
        this.zzQ4.clear();
        zzTk();
    }

    @Override // com.aspose.words.internal.zzHB
    public final zzT0 zzYN(int i) {
        return this.zzQ4.get(i);
    }

    public final int zzYO(int i) {
        for (int i2 = 0; i2 < this.zzQ4.size() && this.zzQ4.get(i2).zzTn() <= i; i2++) {
            if (this.zzQ4.get(i2).zzTm() >= i) {
                return i2;
            }
        }
        return -1;
    }

    public final void zzYP(int i) {
        for (int size = this.zzQ4.size() - 1; size >= 0; size--) {
            zzT0 zzt0 = this.zzQ4.get(size);
            if (zzt0.zzTn() == i) {
                return;
            }
            if (zzt0.zzTn() < i) {
                zzT0 zzt02 = new zzT0(i, zzt0.zzTm());
                zzt0.zzYQ(i - 1);
                this.zzQ4.add(size + 1, zzt02);
                return;
            }
        }
    }
}
