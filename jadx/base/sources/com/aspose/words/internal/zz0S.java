package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class zz0S {
    private zzDB zzew = zzDB.zzCT();
    private ArrayList<Object> zzZm = new ArrayList<>();

    private int zzE(int i, boolean z) {
        int count = this.zzew.getCount() - 2;
        int i2 = 0;
        while (i2 <= count) {
            int i3 = (i2 + count) >> 1;
            int i4 = this.zzew.get(i3);
            int i5 = i3 + 1;
            int i6 = this.zzew.get(i5);
            if (i < i4) {
                count = i3 - 1;
            } else {
                if (i < i6) {
                    return (i != i4 && z) ? ~i2 : i3;
                }
                i2 = i5;
            }
        }
        return ~i2;
    }

    public final void add(int i) {
        this.zzew.add(i);
    }

    public final void clear() {
        this.zzew.clear();
        this.zzZm.clear();
    }

    public Object getItem(int i) {
        return this.zzZm.get(i);
    }

    public final int getItemCount() {
        return this.zzZm.size();
    }

    public final int getStartPosition() {
        return this.zzew.get(0);
    }

    public final boolean isValid() {
        return this.zzew.getCount() >= 2 && this.zzew.get(0) >= 0;
    }

    public final void removeAt(int i) {
        this.zzew.removeAt(i);
        this.zzZm.remove(i);
    }

    public String toString() {
        return this.zzew.toString();
    }

    public final int zzTe(int i) {
        return this.zzew.get(i);
    }

    public final zz0R zzTf(int i) {
        for (int i2 = 0; i2 < this.zzew.getCount(); i2++) {
            if (this.zzew.get(i2) >= i) {
                return new zz0R(this, i2, this.zzew.get(i2));
            }
        }
        return new zz0R(this, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final int zzTg(int i) {
        return this.zzew.zzVJ(i);
    }

    public final int zzTh(int i) {
        return zzE(i, true);
    }

    public final int zzTi(int i) {
        int iZzE = zzE(i, false);
        if (iZzE >= 0) {
            return iZzE;
        }
        if (this.zzew.getCount() > 1) {
            return this.zzew.getCount() - 2;
        }
        throw new IllegalStateException("Cannot find an entry for the specified position in the PLCF.");
    }

    public final int zzX(int i, Object obj) {
        this.zzew.add(i);
        zzZQG.zzZ(this.zzZm, obj);
        return this.zzZm.size() - 1;
    }

    public final int zzZ(int i, int i2, Object obj) {
        if (this.zzew.getCount() == 0) {
            this.zzew.add(i);
        }
        return zzX(i2, obj);
    }

    public final void zzZD(int i, int i2) {
        this.zzew.set(i, i2);
    }

    public final int zzsk() {
        return this.zzew.getCount();
    }

    public final void zzsl() {
        this.zzew.set(r0.getCount() - 1, Integer.MAX_VALUE);
    }

    public final int zzsm() {
        if (this.zzew.getCount() <= 0) {
            return 0;
        }
        return this.zzew.get(r0.getCount() - 1);
    }
}
