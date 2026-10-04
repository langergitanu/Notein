package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzPV {
    private int zzYF;
    private com.aspose.words.internal.zzZYG<zzQ1> zzZqs = new com.aspose.words.internal.zzZYG<>();

    private zzQ1 zzSI(String str) {
        zzQ1 zzq1 = this.zzZqs.get(str);
        if (zzq1 != null) {
            return zzq1;
        }
        zzQ1 zzq12 = new zzQ1(this.zzYF);
        this.zzZqs.zzW(str, zzq12);
        return zzq12;
    }

    public final void zz8(String str, int i) {
        zzSI(str).zzMu(i);
    }

    public final void zz9(String str, int i) {
        zzSI(str).reset(i);
    }

    public final int[] zzSJ(String str) {
        return zzSI(str).zzZWl();
    }

    public final int zzXp(String str) {
        return zzSI(str).getValue();
    }

    public final void zzZWm() {
        Iterator<zzQ1> it = this.zzZqs.zzCJ().iterator();
        while (it.hasNext()) {
            it.next().zzZWm();
        }
        this.zzYF--;
    }

    public final void zzZWn() {
        this.zzYF++;
        Iterator<zzQ1> it = this.zzZqs.zzCJ().iterator();
        while (it.hasNext()) {
            it.next().zzZWn();
        }
    }
}
