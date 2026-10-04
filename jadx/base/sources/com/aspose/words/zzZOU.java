package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOU {
    private ArrayList<zzZAX> zzZsW;

    public final boolean isEmpty() {
        return this.zzZsW == null;
    }

    public final void zzCR(int i) throws Exception {
        if (isEmpty()) {
            return;
        }
        Iterator<zzZAX> it = this.zzZsW.iterator();
        while (it.hasNext()) {
            it.next().zzCR(i);
        }
    }

    public final zzZOT zzV(Field field, boolean z) throws Exception {
        zzZOT zzzotZzV = null;
        if (isEmpty()) {
            return null;
        }
        Iterator<zzZAX> it = this.zzZsW.iterator();
        while (it.hasNext()) {
            zzzotZzV = it.next().zzV(field, z);
            int iZzZaW = zzzotZzV.zzZaW();
            if (iZzZaW != 0) {
                if (iZzZaW == 1 || iZzZaW == 2) {
                    return zzzotZzV;
                }
                throw new IllegalStateException();
            }
            field = zzzotZzV.getField();
        }
        return zzzotZzV;
    }

    public final void zzY(zzZAX zzzax) {
        if (isEmpty()) {
            return;
        }
        this.zzZsW.remove(zzzax);
        if (this.zzZsW.size() == 0) {
            this.zzZsW = null;
        }
    }

    public final void zzZ(zzZAX zzzax) {
        if (isEmpty()) {
            this.zzZsW = new ArrayList<>();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZsW, zzzax);
    }

    public final void zzZ(zzZOY zzzoy, int i) {
        if (isEmpty()) {
            return;
        }
        Iterator<zzZAX> it = this.zzZsW.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzzoy, i);
        }
    }
}
