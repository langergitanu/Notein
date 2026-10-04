package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzXZG {
    private zzXZH zzWSA;
    private String zzWSS;
    private zzXZI zzWSx;
    private zzXZP zzWSy;
    private zzXZQ zzWSz;

    public zzXZG(zzXZH zzxzh, zzXZQ zzxzq, zzXZI zzxzi, zzXZP zzxzp) {
        this(zzxzh, zzxzq, zzxzi, zzxzp, null);
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzXZG.class) {
            return false;
        }
        zzXZG zzxzg = (zzXZG) obj;
        return com.aspose.words.internal.zzZKO.equals(zzxzg.zzWSA, this.zzWSA) && com.aspose.words.internal.zzZKO.equals(zzxzg.zzWSz, this.zzWSz) && com.aspose.words.internal.zzZKO.equals(zzxzg.zzWSx, this.zzWSx) && com.aspose.words.internal.zzZKO.equals(zzxzg.zzWSy, this.zzWSy) && com.aspose.words.internal.zzZKN.equals(zzxzg.zzWSS, this.zzWSS);
    }

    public int hashCode() {
        zzXZH zzxzh = this.zzWSA;
        int iHashCode = (zzxzh != null ? zzxzh.hashCode() : 0) * 397;
        zzXZQ zzxzq = this.zzWSz;
        int iHashCode2 = (iHashCode ^ (zzxzq != null ? zzxzq.hashCode() : 0)) * 397;
        zzXZI zzxzi = this.zzWSx;
        int iHashCode3 = (iHashCode2 ^ (zzxzi != null ? zzxzi.hashCode() : 0)) * 397;
        zzXZP zzxzp = this.zzWSy;
        int iHashCode4 = (iHashCode3 ^ (zzxzp != null ? zzxzp.hashCode() : 0)) * 397;
        String str = this.zzWSS;
        return iHashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    public final zzXZI zzXR5() {
        return this.zzWSx;
    }

    public final zzXZP zzXR6() {
        return this.zzWSy;
    }

    public final zzXZQ zzXR7() {
        return this.zzWSz;
    }

    public final zzXZH zzXR8() {
        return this.zzWSA;
    }

    public final String zzXRc() {
        return this.zzWSS;
    }

    public zzXZG(zzXZH zzxzh, zzXZQ zzxzq, zzXZI zzxzi, zzXZP zzxzp, String str) {
        this.zzWSA = zzxzh;
        this.zzWSz = zzxzq;
        this.zzWSx = zzxzi;
        this.zzWSy = zzxzp;
        this.zzWSS = str;
    }
}
