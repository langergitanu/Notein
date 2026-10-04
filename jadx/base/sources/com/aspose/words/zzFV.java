package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzFV extends zz80 implements Cloneable {
    private int zzYG;
    private ArrayList<zzFK> zzZeP = new ArrayList<>();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getId() {
        return this.zzYG;
    }

    public final void setId(int i) {
        this.zzYG = i;
    }

    public final zzFK zzLo(int i) {
        for (zzFK zzfk : this.zzZeP) {
            if (zzfk.zzZN3() != null && zzfk.zzZN3().zzZFY() == i) {
                return zzfk;
            }
        }
        return null;
    }

    public final ArrayList<zzFK> zzZNU() {
        return this.zzZeP;
    }

    public final void zzZNV() {
        for (zzFK zzfk : this.zzZeP) {
            if (zzfk.zzZN3() != null && zzfk.zzZN3().zzZFY() == 3) {
                this.zzZeP.remove(zzfk);
                return;
            }
        }
    }

    public final zzFV zzZNW() {
        zzFV zzfv = (zzFV) memberwiseClone();
        zzfv.zzZeP = new ArrayList<>();
        Iterator<zzFK> it = this.zzZeP.iterator();
        while (it.hasNext()) {
            zzfv.zzZeP.add(it.next().zzZN7());
        }
        zzfv.setExtensions(zzZBz());
        return zzfv;
    }
}
