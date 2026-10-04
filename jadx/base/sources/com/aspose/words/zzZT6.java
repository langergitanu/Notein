package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZT6 implements Iterable<zzZT7> {
    private ArrayList<zzZT7> zzZm = new ArrayList<>();

    public final int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZT7> iterator() {
        return this.zzZm.iterator();
    }

    public final zzZT7 zzEi(int i) {
        return this.zzZm.get(i);
    }

    public final int zzS(zzZSP zzzsp) throws Exception {
        long position = zzzsp.zzq().getPosition();
        Iterator<zzZT7> it = this.zzZm.iterator();
        while (it.hasNext()) {
            it.next().zzS(zzzsp);
        }
        return (int) (zzzsp.zzq().getPosition() - position);
    }

    public final void zzY(zzZT7 zzzt7) {
        this.zzZm.remove(zzzt7);
    }

    public final void zzZ(com.aspose.words.internal.zzZOX zzzox, int i, IWarningCallback iWarningCallback) throws Exception {
        long jMin = Math.min(zzzox.zzq().getPosition() + ((long) i), zzzox.zzq().getLength());
        while (zzzox.zzq().getPosition() < jMin) {
            zzZT7 zzzt7ZzZ = zzZT5.zzZ(zzzox, iWarningCallback);
            if (zzzt7ZzZ != null) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzzt7ZzZ);
            }
        }
    }

    public final void zzZ(zzZT7 zzzt7) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzzt7);
    }
}
