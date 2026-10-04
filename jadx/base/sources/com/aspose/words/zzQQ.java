package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzQQ {
    private zzRL zzZrg;
    private zzRL zzZrh;
    private zzRL zzZri;
    private zzRL zzZrj;

    public zzQQ(zzRL zzrl, zzRL zzrl2, zzRL zzrl3, zzRL zzrl4) {
        this.zzZrh = zzrl;
        this.zzZri = zzrl2;
        this.zzZrg = zzrl3;
        this.zzZrj = zzrl4;
    }

    public static zzQQ zzZ(zzPS zzps, boolean z) {
        return new zzQQ(zzRL.zzZ(zzps, 3, z), zzRL.zzZ(zzps, 2, z), zzRL.zzZ(zzps, 0, z), zzRL.zzZ(zzps, 1, z));
    }

    public static zzQQ zzZX8() {
        return new zzQQ(zzRL.zzZXm(), zzRL.zzZXm(), zzRL.zzZXm(), zzRL.zzZXm());
    }

    public final zzRL zzMy(int i) {
        if (i == 0) {
            return this.zzZrg;
        }
        if (i == 1) {
            return this.zzZrj;
        }
        if (i == 2) {
            return this.zzZri;
        }
        if (i == 3) {
            return this.zzZrh;
        }
        throw new IllegalStateException("Unknown border type.");
    }

    public final void zzX(BorderCollection borderCollection) throws Exception {
        this.zzZrh.zzI(borderCollection.getTop());
        this.zzZri.zzI(borderCollection.getRight());
        this.zzZrg.zzI(borderCollection.getBottom());
        this.zzZrj.zzI(borderCollection.getLeft());
    }

    public final zzRL zzZX4() {
        return this.zzZrg;
    }

    public final zzRL zzZX5() {
        return this.zzZrh;
    }

    public final zzRL zzZX6() {
        return this.zzZri;
    }

    public final zzRL zzZX7() {
        return this.zzZrj;
    }
}
