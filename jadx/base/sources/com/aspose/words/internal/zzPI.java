package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPI implements Cloneable {
    private float zzHq;
    private zzPV zzZf;

    public zzPI() {
        this.zzZf = zzPV.zzHZ;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean zzZ(zzPI zzpi, zzPI zzpi2) {
        if (zzZKO.zzA(zzpi, zzpi2)) {
            return true;
        }
        return !zzZKO.zzA(null, zzpi) && !zzZKO.zzA(null, zzpi2) && zzPV.zzZ(zzpi.zzZf, zzpi2.zzZf) && zzAN.zzS(zzpi.zzHq, zzpi2.zzHq);
    }

    public final void zzO(float f) {
        this.zzHq = f;
    }

    public final zzPI zzOF() {
        return (zzPI) memberwiseClone();
    }

    public final float zzOG() {
        return this.zzHq;
    }

    public final void zzY(zzPV zzpv) {
        this.zzZf = zzpv;
    }

    public final zzPV zzZy() {
        return this.zzZf;
    }

    public zzPI(zzPV zzpv, float f) {
        zzPV zzpv2 = zzPV.zzKh;
        this.zzZf = zzpv;
        this.zzHq = f;
    }
}
