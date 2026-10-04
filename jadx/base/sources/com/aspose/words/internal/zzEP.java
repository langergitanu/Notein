package com.aspose.words.internal;

import OooO0O0.C20395OooO0o0;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzEP {
    private double zzwp;
    private double zzwq;
    private double zzwr;
    private double zzws;

    public zzEP(double d, double d2, double d3, double d4) {
        this.zzws = d;
        this.zzwr = d2;
        this.zzwq = d3;
        this.zzwp = d4;
    }

    private boolean isEmpty() {
        return this.zzws == 0.0d && this.zzwr == 0.0d && this.zzwq == 0.0d && this.zzwp == 0.0d;
    }

    public static boolean zzZ(zzEP zzep) {
        return zzep == null || zzep.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzEP.class) {
            return false;
        }
        zzEP zzep = (zzEP) obj;
        return zzAN.zzL(this.zzws, zzep.zzws) && zzAN.zzL(this.zzwr, zzep.zzwr) && zzAN.zzL(this.zzwq, zzep.zzwq) && zzAN.zzL(this.zzwp, zzep.zzwp);
    }

    public final double getCropBottom() {
        return this.zzwp;
    }

    public final double getCropLeft() {
        return this.zzws;
    }

    public final double getCropRight() {
        return this.zzwr;
    }

    public final double getCropTop() {
        return this.zzwq;
    }

    public final int hashCode() {
        return (((zzQO.hashCode(this.zzws) >> 1) ^ (zzQO.hashCode(this.zzwr) << 3)) ^ (zzQO.hashCode(this.zzwq) << 1)) ^ (zzQO.hashCode(this.zzwp) >> 3);
    }

    public final boolean zzDX() {
        return this.zzws > 0.0d || this.zzwr > 0.0d || this.zzwq > 0.0d || this.zzwp > 0.0d;
    }

    public final zzZQ5 zzW(zzZQ5 zzzq5) {
        double dMax = (Math.max(0.0d, this.zzws) * ((double) zzzq5.getWidth())) + ((double) zzzq5.getLeft());
        double dMax2 = ((1.0d - Math.max(0.0d, this.zzwr)) * ((double) zzzq5.getWidth())) + ((double) zzzq5.getLeft());
        return zzZQ5.zzT(zzAN.zzZG(dMax), zzAN.zzZG((Math.max(0.0d, this.zzwq) * ((double) zzzq5.getHeight())) + ((double) zzzq5.getTop())), zzAN.zzZG(dMax2), zzAN.zzZG(((1.0d - Math.max(0.0d, this.zzwp)) * ((double) zzzq5.getHeight())) + ((double) zzzq5.getTop())));
    }

    public final zzXN zzZX(byte[] bArr) throws Exception {
        zzXN zzxn = new zzXN(bArr);
        try {
            return zzxn.zzZ(zzW(new zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight())));
        } finally {
            zzxn.dispose();
        }
    }

    public final zzZQ4 zzw(zzZQ4 zzzq4) {
        double dMin = 1.0d / (1.0d - Math.min(0.0d, this.zzws + this.zzwr));
        double dMin2 = 1.0d / (1.0d - Math.min(0.0d, this.zzwq + this.zzwp));
        double d = -Math.min(0.0d, this.zzws);
        double d2 = -Math.min(0.0d, this.zzwr);
        double d3 = -Math.min(0.0d, this.zzwq);
        double d4 = -Math.min(0.0d, this.zzwp);
        return zzZQ4.zzX((float) C20395OooO0o0.OooO00o(zzzq4.getWidth(), d, dMin, zzzq4.zzZm()), (float) C20395OooO0o0.OooO00o(zzzq4.getHeight(), d3, dMin2, zzzq4.zzZo()), (float) (((1.0d - (d2 * dMin)) * ((double) zzzq4.getWidth())) + ((double) zzzq4.zzZm())), (float) (((1.0d - (d4 * dMin2)) * ((double) zzzq4.getHeight())) + ((double) zzzq4.zzZo())));
    }

    public final zzZQ4 zzx(zzZQ4 zzzq4) {
        double width = (((double) zzzq4.getWidth()) * this.zzws) + ((double) zzzq4.zzZm());
        double dOooO0O0 = C21532OooOOo.OooO0O0(1.0d, this.zzwr, zzzq4.getWidth(), zzzq4.zzZm());
        return zzZQ4.zzX((float) width, (float) ((((double) zzzq4.getHeight()) * this.zzwq) + ((double) zzzq4.zzZo())), (float) dOooO0O0, (float) C21532OooOOo.OooO0O0(1.0d, this.zzwp, zzzq4.getHeight(), zzzq4.zzZo()));
    }
}
