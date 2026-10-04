package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zz0D {
    private ArrayList<zz0E> zzZm = new ArrayList<>();

    public final int getCount() {
        return this.zzZm.size();
    }

    public final zz0E zzTd(int i) {
        return this.zzZm.get(i);
    }

    public final void zzZ(zz0E zz0e) {
        zzZQG.zzZ(this.zzZm, zz0e);
    }

    public final int zzs8() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzZm.size(); i2++) {
            if (zzTd(i2).zzsa()) {
                i++;
            }
        }
        return i;
    }

    public final boolean zzs9() {
        for (int i = 0; i < this.zzZm.size(); i++) {
            if (zzTd(i).zzsa()) {
                return true;
            }
        }
        return false;
    }
}
