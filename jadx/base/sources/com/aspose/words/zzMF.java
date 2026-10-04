package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzMF {
    private ArrayList<zzMG> zzZoR = new ArrayList<>();
    private com.aspose.words.internal.zzZQC<ArrayList<zzMG>> zzZoQ = null;
    private com.aspose.words.internal.zzZQC<zzNV> zzZoP = null;

    public final boolean isTopLevel() {
        com.aspose.words.internal.zzZQC<ArrayList<zzMG>> zzzqc = this.zzZoQ;
        return zzzqc == null || zzzqc.size() == 0;
    }

    public final void zzZ(zzNV zznv) {
        if (this.zzZoQ == null) {
            this.zzZoQ = new com.aspose.words.internal.zzZQC<>();
        }
        if (this.zzZoP == null) {
            this.zzZoP = new com.aspose.words.internal.zzZQC<>();
        }
        this.zzZoQ.push(new ArrayList<>());
        this.zzZoP.push(zznv);
    }

    public final void zzZVE() {
        if (this.zzZoQ.size() == 0 || this.zzZoP.size() == 0) {
            throw new IllegalStateException("The stack of nested rule lists is empty.");
        }
        this.zzZoP.pop();
        this.zzZoQ.pop();
    }

    public final zzNV zzZVn() {
        if (isTopLevel()) {
            return null;
        }
        return this.zzZoP.peek();
    }

    public final ArrayList<zzMG> zzZVo() {
        return isTopLevel() ? this.zzZoR : this.zzZoQ.peek();
    }
}
