package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzPR implements Iterable<zzPT> {
    private zzPQ zzZqn;

    public zzPR() {
        this.zzZqn = new zzPQ();
    }

    private void zzZWd() {
        if (this.zzZqn.isReadOnly()) {
            this.zzZqn = this.zzZqn.zzZWc();
        }
    }

    public final int getCount() {
        return this.zzZqn.getCount();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzPT> iterator() {
        return this.zzZqn.iterator();
    }

    public final void remove(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZKN.equals(str, com.aspose.words.internal.zzZKN.zzU2(str));
        zzZWd();
        this.zzZqn.remove(str);
    }

    public final void zz7(String str, int i) {
        zzZWd();
        this.zzZqn.zz7(str, i);
    }

    public final void zzN(Iterable<zzPT> iterable) {
        zzZWd();
        for (zzPT zzpt : iterable) {
            boolean zZzZWi = zzpt.zzZWi();
            if (!zZzZWi) {
                zzPT zzptZzSx = this.zzZqn.zzSx(zzpt.zzZWo());
                zZzZWi = zzptZzSx == null || !zzptZzSx.zzZWi();
            }
            if (zZzZWi) {
                this.zzZqn.zzZ(zzpt.zzZWo(), zzpt);
            }
            this.zzZqn.zz7(zzpt.zzZWo(), 0);
        }
    }

    public final void zzO(Iterable<zzPT> iterable) {
        zzZWd();
        for (zzPT zzpt : iterable) {
            this.zzZqn.zzZ(zzpt.zzZWo(), zzpt);
            this.zzZqn.zz7(zzpt.zzZWo(), 0);
        }
    }

    public final void zzP(Iterable<zzPT> iterable) {
        zzZWd();
        this.zzZqn.zzP(iterable);
    }

    public final void zzSv(String str) {
        zzZWd();
        this.zzZqn.zzSt(str);
    }

    public final zzPT zzSx(String str) {
        return this.zzZqn.zzSx(str);
    }

    public final int zzSy(String str) {
        return this.zzZqn.zzSy(str);
    }

    public final void zzU(zzPT zzpt) {
        zzZWd();
        this.zzZqn.zzZ(zzpt.zzZWo(), zzpt);
    }

    public final void zzV(zzPT zzpt) {
        zzZWd();
        this.zzZqn.zzZ(zzpt.zzZWo(), zzpt);
        this.zzZqn.zz7(zzpt.zzZWo(), 0);
    }

    public final void zzW(zzPT zzpt) {
        if (zzpt == null || this.zzZqn.zzSx(zzpt.zzZWo()) != null) {
            return;
        }
        zzZWd();
        this.zzZqn.zzY(zzpt);
    }

    public final void zzX(zzPT zzpt) {
        if (zzpt != null) {
            zzZWd();
            this.zzZqn.zzY(zzpt);
        }
    }

    public final void zzY(zzPT zzpt) {
        zzZWd();
        this.zzZqn.zzY(zzpt);
    }

    public final zzPS zzZWe() {
        if (this.zzZqn.getCount() == 0) {
            return zzPS.zzZqo;
        }
        this.zzZqn.zzZWb();
        return new zzPS(this.zzZqn);
    }

    public zzPR(zzPS zzps) {
        this.zzZqn = zzps.zzZWg();
    }

    public final void zzW(String str, zzPS zzps) {
        zzZWd();
        this.zzZqn.zz7(str, zzps.zzSy(str));
    }
}
