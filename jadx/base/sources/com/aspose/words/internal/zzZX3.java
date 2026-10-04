package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzZX3 {
    private int zzdo;
    private int zzdp;
    private int zz9p = Integer.MAX_VALUE;
    private int zz9o = Integer.MAX_VALUE;
    private ArrayList<zzZX4> zzEG = new ArrayList<>();

    private zzZX4 zzoK() {
        return zzSs(this.zzEG.size() - 1);
    }

    public final int getCount() {
        return this.zzEG.size();
    }

    public final zzZX4 zzSs(int i) {
        if (i < 0 || i >= this.zzEG.size()) {
            return null;
        }
        return this.zzEG.get(i);
    }

    public final void zzZ(int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        if (z3) {
            int i5 = i - this.zzdp;
            int i6 = i2 - this.zzdo;
            this.zzdp = i;
            this.zzdo = i2;
            i3 = i5;
            i4 = i6;
        } else {
            this.zzdp += i;
            this.zzdo += i2;
            i3 = i;
            i4 = i2;
        }
        zzZX4 zzzx4 = new zzZX4(i3, i4, this.zzdp, this.zzdo, z, z2);
        if (zzoK() != null && zzoK().zzoN() && zzzx4.zzoN()) {
            return;
        }
        this.zz9p = Math.min(this.zzdp, this.zz9p);
        this.zz9o = Math.min(this.zzdo, this.zz9o);
        this.zzEG.add(zzzx4);
    }

    public final void zzZu(int i, int i2) {
        int i3 = i - this.zz9p;
        int i4 = i2 - this.zz9o;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        Iterator<zzZX4> it = this.zzEG.iterator();
        while (it.hasNext()) {
            it.next().translate(i3, i4);
        }
    }
}
