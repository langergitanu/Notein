package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4T {
    private int zzX1Y;
    private ArrayList<StringBuilder> zzXz = new ArrayList<>();

    public final void clear() {
        this.zzX1Y = 0;
        this.zzXz.clear();
    }

    public final int getCount() {
        return this.zzXz.size();
    }

    public final int getMaxLength() {
        Iterator<StringBuilder> it = this.zzXz.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().length());
        }
        return iMax;
    }

    public final void newLine() {
        this.zzX1Y++;
    }

    public final int zzXUP() {
        return this.zzX1Y;
    }

    public final StringBuilder zzXUQ() {
        int size = (this.zzX1Y - this.zzXz.size()) + 1;
        for (int i = 0; i < size; i++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXz, new StringBuilder());
        }
        return zzju(this.zzX1Y);
    }

    public final StringBuilder zzju(int i) {
        return this.zzXz.get(i);
    }

    public final void zzjv(int i) {
        this.zzX1Y = i;
    }
}
