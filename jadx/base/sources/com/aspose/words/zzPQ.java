package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzPQ implements Iterable<zzPT> {
    private boolean zzZqk;
    private com.aspose.words.internal.zzZYI zzZql;
    private com.aspose.words.internal.zzZYG<zzPT> zzZqm;

    public zzPQ() {
        this(new com.aspose.words.internal.zzZYG(), null);
    }

    private void zzT(zzPT zzpt) {
        this.zzZqm.zzW(zzpt.zzZWo(), zzpt);
    }

    private void zzZWa() {
        if (this.zzZqk) {
            throw new IllegalStateException();
        }
    }

    public final int getCount() {
        return this.zzZqm.getCount();
    }

    public final boolean isReadOnly() {
        return this.zzZqk;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzPT> iterator() {
        return this.zzZqm.zzCJ().iterator();
    }

    public final void remove(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZKN.equals(str, com.aspose.words.internal.zzZKN.zzU2(str));
        zzZWa();
        this.zzZqm.zzXn(str);
        com.aspose.words.internal.zzZYI zzzyi = this.zzZql;
        if (zzzyi != null) {
            zzzyi.zzXn(str);
        }
    }

    public final void zz7(String str, int i) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZKN.equals(str, com.aspose.words.internal.zzZKN.zzU2(str));
        zzZWa();
        if (i == 0 && this.zzZql == null) {
            return;
        }
        this.zzZqm.containsKey(str);
        if (this.zzZql == null) {
            this.zzZql = new com.aspose.words.internal.zzZYI(this.zzZqm.getCount());
        }
        this.zzZql.set(str, i);
    }

    public final void zzP(Iterable<zzPT> iterable) {
        zzZWa();
        Iterator<zzPT> it = iterable.iterator();
        while (it.hasNext()) {
            zzT(it.next());
        }
    }

    public final void zzSt(String str) {
        zz7(str, zzSy(str) | 1);
    }

    public final boolean zzSu(String str) {
        return (zzSy(str) & 1) != 0;
    }

    public final zzPT zzSx(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZKN.equals(str, com.aspose.words.internal.zzZKN.zzU2(str));
        return this.zzZqm.get(str);
    }

    public final int zzSy(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZKN.equals(str, com.aspose.words.internal.zzZKN.zzU2(str));
        com.aspose.words.internal.zzZYI zzzyi = this.zzZql;
        if (zzzyi != null && zzzyi.containsKey(str)) {
            return this.zzZql.get(str);
        }
        return 0;
    }

    public final void zzY(zzPT zzpt) {
        zzZWa();
        zzT(zzpt);
    }

    public final void zzZ(zzPT[] zzptArr) {
        zzZWa();
        for (zzPT zzpt : zzptArr) {
            zzT(zzpt);
        }
    }

    public final void zzZWb() {
        this.zzZqk = true;
    }

    public final zzPQ zzZWc() {
        com.aspose.words.internal.zzZYI zzzyi = this.zzZql;
        return new zzPQ(new com.aspose.words.internal.zzZYG(this.zzZqm), (zzzyi == null || zzzyi.getCount() <= 0) ? null : new com.aspose.words.internal.zzZYI(this.zzZql));
    }

    private zzPQ(com.aspose.words.internal.zzZYG<zzPT> zzzyg, com.aspose.words.internal.zzZYI zzzyi) {
        this.zzZqm = zzzyg;
        this.zzZql = zzzyi;
    }

    public final void zzZ(String str, zzPT zzpt) {
        com.aspose.words.internal.zzZKN.equals(zzpt.zzZWo(), str);
        zzZWa();
        this.zzZqm.set(zzpt.zzZWo(), zzpt);
    }
}
