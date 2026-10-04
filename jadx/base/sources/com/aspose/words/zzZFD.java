package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFD {
    private zzZFC zzYmv;
    private zzQQ zzYsS;
    private zzZIG zzYsT;
    private zzPS zzZq9;
    private double zzYmw = -1.7976931348623157E308d;
    private ArrayList<zzZJQ> zzZe5 = new ArrayList<>();

    public zzZFD(zzZIG zzzig, zzPS zzps, zzZFC zzzfc) {
        this.zzYsT = zzzig;
        this.zzYmv = zzzfc;
        this.zzYsS = zzQQ.zzZ(zzps, false);
        this.zzZq9 = zzps;
    }

    private static boolean zzW(zzZJQ zzzjq) {
        if (zzzjq != null) {
            return zzzjq.zzZ3Y() == null && zzzjq.getVerticalMerge() == 0;
        }
        return true;
    }

    public final void zzWW(double d) {
        this.zzYmw = d;
    }

    public final void zzX(zzZJQ zzzjq) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZe5, zzzjq);
    }

    public final int zzYZj() {
        return Math.min(this.zzZe5.size(), 63);
    }

    public final int zzYZk() {
        return this.zzZe5.size();
    }

    public final zzZFC zzYZl() {
        return this.zzYmv;
    }

    public final double zzYZm() {
        return this.zzYmw;
    }

    public final int zzYZn() {
        int i = 0;
        for (int size = this.zzZe5.size() - 1; size >= 0 && zzW(this.zzZe5.get(size)); size--) {
            i++;
        }
        return this.zzZe5.size() - i;
    }

    public final void zzYZo() {
        int size = this.zzZe5.size() - 1;
        if (size >= 0) {
            this.zzZe5.remove(size);
        }
    }

    public final void zzZ(int i, zzZJQ zzzjq) {
        this.zzZe5.set(i, zzzjq);
    }

    public final zzQQ zzZ3X() {
        return this.zzYsS;
    }

    public final zzZIG zzZ3Y() {
        return this.zzYsT;
    }

    public final zzPS zzZWe() {
        return this.zzZq9;
    }

    public final zzZJQ zzz6(int i) {
        return this.zzZe5.get(i);
    }
}
