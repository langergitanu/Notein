package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18385v2;

/* JADX INFO: loaded from: classes5.dex */
public final class zz51 {
    private int zzjZ;

    public zz51() {
        this((byte) 0);
    }

    private boolean zzvu() {
        int i = this.zzjZ;
        return i == 2 || i == 5;
    }

    private boolean zzvw() {
        int i = this.zzjZ;
        return i == 4 || i == 5;
    }

    public final int getCompliance() {
        return this.zzjZ;
    }

    public final void setCompliance(int i) {
        this.zzjZ = i;
    }

    public final boolean zzvA() {
        return this.zzjZ == 1 || zzvv();
    }

    public final boolean zzvB() {
        return (zzvz() || zzvy()) ? false : true;
    }

    public final boolean zzvC() {
        return (zzvz() || zzvy()) ? false : true;
    }

    public final boolean zzvD() {
        return (zzvz() || zzvy()) ? false : true;
    }

    public final boolean zzvE() {
        int i = this.zzjZ;
        return i == 2 || i == 5 || i == 7;
    }

    public final boolean zzvF() {
        return !zzvx();
    }

    public final boolean zzvG() {
        return !zzvx();
    }

    public final boolean zzvH() {
        return !zzvx();
    }

    public final String zzvm() {
        return this.zzjZ != 7 ? "" : "1";
    }

    public final String zzvn() {
        return this.zzjZ != 6 ? "" : "2020";
    }

    public final String zzvo() {
        int i = this.zzjZ;
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : C18385v2.f56336h : "U" : "B" : C18385v2.f56336h;
    }

    public final String zzvp() {
        int i = this.zzjZ;
        return (i == 2 || i == 3) ? "1" : (i == 4 || i == 5) ? "2" : i != 6 ? "" : "4";
    }

    public final boolean zzvq() {
        return zzvy() || zzvu();
    }

    public final boolean zzvr() {
        return zzvu() || zzvy();
    }

    public final boolean zzvs() {
        return zzvw() || zzvv() || zzvy();
    }

    public final boolean zzvt() {
        return this.zzjZ == 5 || zzvv();
    }

    public final boolean zzvv() {
        return this.zzjZ == 6;
    }

    public final boolean zzvx() {
        int i = this.zzjZ;
        return i == 2 || i == 3;
    }

    public final boolean zzvy() {
        return this.zzjZ == 7;
    }

    public final boolean zzvz() {
        return zzvx() || zzvw() || zzvv();
    }

    private zz51(byte b) {
        this.zzjZ = 0;
    }
}
