package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzXZP {
    static zzXZP zzWTd = zzXRF();
    private boolean zzWTe;
    private boolean zzWTf;
    private boolean zzWTg;
    private zzXZO zzWTh;
    private zzXZO zzWTi;
    private zzXZO zzWTj;
    private zzXZO zzWTk;
    private zzXZO zzWTl;
    private zzXZO zzWTm;
    private zzXZO zzWTn;

    private zzXZP() {
    }

    public static zzXZP zzV(BorderCollection borderCollection) throws Exception {
        zzXZP zzxzp = new zzXZP();
        zzxzp.zzWTn = zzXZO.zzt(borderCollection.getLeft());
        zzxzp.zzWTm = zzXZO.zzt(borderCollection.getRight());
        zzxzp.zzWTl = zzXZO.zzt(borderCollection.getTop());
        zzxzp.zzWTk = zzXZO.zzt(borderCollection.getBottom());
        zzxzp.zzWTi = zzZ(borderCollection, 5);
        zzxzp.zzWTh = zzZ(borderCollection, 4);
        zzXZO zzxzoZzZ = zzZ(borderCollection, 6);
        zzxzp.zzWTf = zzxzoZzZ.getStyle() != 0;
        zzXZO zzxzoZzZ2 = zzZ(borderCollection, 7);
        zzxzp.zzWTg = zzxzoZzZ2.getStyle() != 0;
        if (!zzxzp.zzWTf) {
            zzxzoZzZ = zzxzoZzZ2;
        }
        zzxzp.zzWTj = zzxzoZzZ;
        zzxzp.zzWTe = true;
        return zzxzp;
    }

    private static zzXZP zzXRF() {
        zzXZP zzxzp = new zzXZP();
        zzXZO zzxzo = zzXZO.zzWTc;
        zzxzp.zzWTn = zzxzo;
        zzxzp.zzWTm = zzxzo;
        zzxzp.zzWTl = zzxzo;
        zzxzp.zzWTk = zzxzo;
        zzxzp.zzWTh = zzxzo;
        zzxzp.zzWTi = zzxzo;
        zzxzp.zzWTj = zzxzo;
        zzxzp.zzWTf = false;
        zzxzp.zzWTg = false;
        zzxzp.zzWTe = true;
        return zzxzp;
    }

    private static zzXZO zzZ(BorderCollection borderCollection, int i) throws Exception {
        return borderCollection.zzOO(i) ? zzXZO.zzt(borderCollection.getByBorderType(i)) : zzXZO.zzWTc;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzXZP.class) {
            return false;
        }
        zzXZP zzxzp = (zzXZP) obj;
        return com.aspose.words.internal.zzZKO.equals(zzxzp.zzWTn, this.zzWTn) && com.aspose.words.internal.zzZKO.equals(zzxzp.zzWTm, this.zzWTm) && com.aspose.words.internal.zzZKO.equals(zzxzp.zzWTl, this.zzWTl) && com.aspose.words.internal.zzZKO.equals(zzxzp.zzWTk, this.zzWTk) && com.aspose.words.internal.zzZKO.equals(zzxzp.zzWTj, this.zzWTj) && com.aspose.words.internal.zzZKO.equals(zzxzp.zzWTi, this.zzWTi) && com.aspose.words.internal.zzZKO.equals(zzxzp.zzWTh, this.zzWTh) && zzxzp.zzWTg == this.zzWTg && zzxzp.zzWTf == this.zzWTf && zzxzp.zzWTe == this.zzWTe;
    }

    public final boolean getOutline() {
        return this.zzWTe;
    }

    public int hashCode() {
        zzXZO zzxzo = this.zzWTn;
        int iHashCode = (zzxzo != null ? zzxzo.hashCode() : 0) * 397;
        zzXZO zzxzo2 = this.zzWTm;
        int iHashCode2 = (iHashCode ^ (zzxzo2 != null ? zzxzo2.hashCode() : 0)) * 397;
        zzXZO zzxzo3 = this.zzWTl;
        int iHashCode3 = (iHashCode2 ^ (zzxzo3 != null ? zzxzo3.hashCode() : 0)) * 397;
        zzXZO zzxzo4 = this.zzWTk;
        int iHashCode4 = (iHashCode3 ^ (zzxzo4 != null ? zzxzo4.hashCode() : 0)) * 397;
        zzXZO zzxzo5 = this.zzWTj;
        int iHashCode5 = (iHashCode4 ^ (zzxzo5 != null ? zzxzo5.hashCode() : 0)) * 397;
        zzXZO zzxzo6 = this.zzWTi;
        int iHashCode6 = (iHashCode5 ^ (zzxzo6 != null ? zzxzo6.hashCode() : 0)) * 397;
        zzXZO zzxzo7 = this.zzWTh;
        return ((((((iHashCode6 ^ (zzxzo7 != null ? zzxzo7.hashCode() : 0)) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzWTg)) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzWTf)) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzWTe);
    }

    public final zzXZO zzXRA() {
        return this.zzWTj;
    }

    public final zzXZO zzXRB() {
        return this.zzWTk;
    }

    public final zzXZO zzXRC() {
        return this.zzWTl;
    }

    public final zzXZO zzXRD() {
        return this.zzWTm;
    }

    public final zzXZO zzXRE() {
        return this.zzWTn;
    }

    public final boolean zzXRw() {
        return this.zzWTf;
    }

    public final boolean zzXRx() {
        return this.zzWTg;
    }

    public final zzXZO zzXRy() {
        return this.zzWTh;
    }

    public final zzXZO zzXRz() {
        return this.zzWTi;
    }
}
