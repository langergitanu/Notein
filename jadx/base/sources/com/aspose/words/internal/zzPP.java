package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzPP {
    private zzPQ zzHS;
    private zzPQ zzHT;

    public zzPP(float f, boolean z, float f2, boolean z2) {
        this(new zzPQ(f, z), new zzPQ(f2, z2));
    }

    public static boolean zzZ(zzPP zzpp, zzPP zzpp2) {
        if (zzZKO.zzA(zzpp, zzpp2)) {
            return true;
        }
        return !zzZKO.zzA(null, zzpp) && !zzZKO.zzA(null, zzpp2) && zzPQ.zzZ(zzpp.zzHT, zzpp2.zzHT) && zzPQ.zzZ(zzpp.zzHS, zzpp2.zzHS);
    }

    public boolean equals(Object obj) {
        return zzZ(this, (zzPP) zzZKW.zzZ(obj, zzPP.class));
    }

    public int hashCode() {
        return this.zzHT.hashCode() ^ this.zzHS.hashCode();
    }

    public final zzPQ zzPr() {
        return this.zzHS;
    }

    public final zzPQ zzPs() {
        return this.zzHT;
    }

    public final long zzPt() {
        return zzZPY.zzG(this.zzHT.zzPv(), this.zzHS.zzPv());
    }

    private zzPP(zzPQ zzpq, zzPQ zzpq2) {
        this.zzHT = zzpq;
        this.zzHS = zzpq2;
    }

    public zzPP() {
        this(new zzPQ(), new zzPQ());
    }

    public zzPP(long j) {
        this(Float.intBitsToFloat((int) j), false, zzZPY.zzYC(j), false);
    }
}
