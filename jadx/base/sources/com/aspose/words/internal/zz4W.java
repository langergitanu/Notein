package com.aspose.words.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zz4W {
    private zz2R zzjD;
    private zz4N zzjE;
    private int zzjF;
    private zz4L zzjB = new zz4L();
    private float zzjA = -3.4028235E38f;
    private zz4U zzjz = new zz4U();
    private HashMap<String, Object> zzjC = new HashMap<>();
    private zz5V zzjG = new zz5V(this);

    public zz4W(zz4N zz4n, zz2R zz2r) {
        this.zzjE = zz4n;
        this.zzjD = zz2r;
    }

    public final void zz2(String str) {
        this.zzjD.zzI().zzZ(2, 5, str);
    }

    public final void zz6(float f) {
        this.zzjA = f;
    }

    public final String zzJ(String str, int i) {
        if (!zzZYD.zzXk(str)) {
            str = "AcroFormField";
        }
        if (this.zzjC.containsKey(str)) {
            return zzZKN.format("{0}_{1}", str, Integer.valueOf(i));
        }
        zzZQF.zzY(this.zzjC, str, null);
        return str;
    }

    public final zz5V zzv1() {
        return this.zzjG;
    }

    public final zzA2 zzv2() {
        return this.zzjE.zzv2();
    }

    public final zz4U zzv3() {
        return this.zzjz;
    }

    public final float zzv4() {
        return this.zzjA;
    }

    public final zz4L zzv5() {
        return this.zzjB;
    }

    public final boolean zzv6() {
        return this.zzjD.zzv6();
    }

    public final zz51 zzv7() {
        return this.zzjD.zzv7();
    }

    public final zz4D zzv8() {
        return this.zzjE.zzv8();
    }

    public final zzQR zzv9() {
        return this.zzjE.zzv9();
    }

    public final String zzvR() {
        return this.zzjE.zzvR();
    }

    public final zz5U zzvU() {
        return this.zzjE.zzvU();
    }

    public final zz2Q zzvV() {
        return this.zzjE.zzvV();
    }

    public final zz2I zzvW() {
        return this.zzjE.zzvW();
    }

    public final zz5H zzva() {
        return this.zzjE.zzva();
    }

    public final zz4K zzvb() {
        return this.zzjE.zzvb();
    }

    public final zz2R zzvc() {
        return this.zzjD;
    }

    public final int zzvd() {
        int i = this.zzjF + 1;
        this.zzjF = i;
        return i;
    }
}
