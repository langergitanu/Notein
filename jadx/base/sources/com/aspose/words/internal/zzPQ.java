package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzPQ {
    private boolean zzHU;
    private float zzHV;

    public zzPQ() {
        this((byte) 0);
    }

    public static boolean zzZ(zzPQ zzpq, zzPQ zzpq2) {
        if (zzZKO.zzA(zzpq, zzpq2)) {
            return true;
        }
        return !zzZKO.zzA(null, zzpq) && !zzZKO.zzA(null, zzpq2) && zzpq.zzHV == zzpq2.zzHV && zzpq.zzHU == zzpq2.zzHU;
    }

    public boolean equals(Object obj) {
        return zzZ(this, (zzPQ) zzZKW.zzZ(obj, zzPQ.class));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.zzHV) ^ zzZKP.zzYY(this.zzHU);
    }

    public final boolean zzPu() {
        return this.zzHU;
    }

    public final float zzPv() {
        return this.zzHV;
    }

    private zzPQ(byte b) {
        this(0.0f, false);
    }

    public zzPQ(float f, boolean z) {
        this.zzHV = f;
        this.zzHU = z;
    }
}
