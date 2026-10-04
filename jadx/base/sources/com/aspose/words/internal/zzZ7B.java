package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7B extends zzZDB {
    zzZDD zzWFn;
    zzZDD zzWFu;
    zzZ8C zzWpA;
    zzZ86 zzWpB;
    zzZCG zzWpo;
    zzZCG zzWpp;
    zzZ7D zzWpq;
    zzZ8C zzWpr;
    zzZ7A zzWps;
    zzZ7A zzWpt;
    zzZ7T zzWtv;
    zzZD4 zzWvF;

    private zzZ7B(zzZD4 zzzd4) {
        int i;
        boolean z;
        boolean z2;
        this.zzWvF = zzzd4;
        if (zzzd4.zzg6(0) instanceof zzZCY) {
            this.zzWFn = zzZDD.zzZ((zzZCY) zzzd4.zzg6(0), true);
            i = 0;
        } else {
            this.zzWFn = new zzZDD(0L);
            i = -1;
        }
        if (this.zzWFn.zzXKZ().equals(BigInteger.valueOf(0L))) {
            z2 = false;
            z = true;
        } else if (this.zzWFn.zzXKZ().equals(BigInteger.valueOf(1L))) {
            z = false;
            z2 = true;
        } else {
            if (!this.zzWFn.zzXKZ().equals(BigInteger.valueOf(2L))) {
                throw new IllegalArgumentException("version number not recognised");
            }
            z = false;
            z2 = false;
        }
        this.zzWFu = zzZDD.zzYB(zzzd4.zzg6(i + 1));
        this.zzWpB = zzZ86.zzXm(zzzd4.zzg6(i + 2));
        this.zzWpA = zzZ8C.zzXn(zzzd4.zzg6(i + 3));
        zzZD4 zzzd42 = (zzZD4) zzzd4.zzg6(i + 4);
        this.zzWpt = zzZ7A.zzWV(zzzd42.zzg6(0));
        this.zzWps = zzZ7A.zzWV(zzzd42.zzg6(1));
        this.zzWpr = zzZ8C.zzXn(zzzd4.zzg6(i + 5));
        int i2 = i + 6;
        this.zzWpq = zzZ7D.zzWZ(zzzd4.zzg6(i2));
        int size = (zzzd4.size() - i2) - 1;
        if (size != 0 && z) {
            throw new IllegalArgumentException("version 1 certificate contains extra data");
        }
        while (size > 0) {
            zzZCY zzzcy = (zzZCY) zzzd4.zzg6(i2 + size);
            int iZzXKy = zzzcy.zzXKy();
            if (iZzXKy == 1) {
                this.zzWpp = zzZCG.zzW(zzzcy);
            } else if (iZzXKy == 2) {
                this.zzWpo = zzZCG.zzW(zzzcy);
            } else {
                if (iZzXKy != 3) {
                    throw new IllegalArgumentException("Unknown tag encountered in structure: " + zzzcy.zzXKy());
                }
                if (z2) {
                    throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                }
                this.zzWtv = zzZ7T.zzXa(zzZD4.zzX(zzzcy, true));
            }
            size--;
        }
    }

    public static zzZ7B zzWW(Object obj) {
        if (obj instanceof zzZ7B) {
            return (zzZ7B) obj;
        }
        if (obj != null) {
            return new zzZ7B(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZCG zzXHC() {
        return this.zzWpo;
    }

    public final zzZCG zzXHD() {
        return this.zzWpp;
    }

    public final zzZ86 zzXHG() {
        return this.zzWpB;
    }

    public final zzZ7T zzXIH() {
        return this.zzWtv;
    }

    public final zzZ8C zzXIh() {
        return this.zzWpA;
    }

    public final int zzXIi() {
        return this.zzWFn.zzXKZ().intValue() + 1;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWvF;
    }
}
