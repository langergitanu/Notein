package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ84 extends zzZDB {
    zzZDD zzWr0;
    zzZDM zzWr1;

    private zzZ84(zzZD4 zzzd4) {
        this.zzWr1 = zzZDM.zzOQ(false);
        this.zzWr0 = null;
        if (zzzd4.size() == 0) {
            this.zzWr1 = null;
            this.zzWr0 = null;
            return;
        }
        if (zzzd4.zzg6(0) instanceof zzZDM) {
            this.zzWr1 = zzZDM.zzYE(zzzd4.zzg6(0));
        } else {
            this.zzWr1 = null;
            this.zzWr0 = zzZDD.zzYB(zzzd4.zzg6(0));
        }
        if (zzzd4.size() > 1) {
            if (this.zzWr1 == null) {
                throw new IllegalArgumentException("wrong sequence in constructor");
            }
            this.zzWr0 = zzZDD.zzYB(zzzd4.zzg6(1));
        }
    }

    public static zzZ84 zzXk(Object obj) {
        if (obj instanceof zzZ84) {
            return (zzZ84) obj;
        }
        if (obj != null) {
            return new zzZ84(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final String toString() {
        if (this.zzWr0 != null) {
            return "BasicConstraints: isCa(" + zzXIm() + "), pathLenConstraint = " + this.zzWr0.zzXKZ();
        }
        if (this.zzWr1 == null) {
            return "BasicConstraints: isCa(false)";
        }
        return "BasicConstraints: isCa(" + zzXIm() + ")";
    }

    public final BigInteger zzXIl() {
        zzZDD zzzdd = this.zzWr0;
        if (zzzdd != null) {
            return zzzdd.zzXKZ();
        }
        return null;
    }

    public final boolean zzXIm() {
        zzZDM zzzdm = this.zzWr1;
        return zzzdm != null && zzzdm.zzXL1();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzZDM zzzdm = this.zzWr1;
        if (zzzdm != null) {
            zzzdj.zzZ(zzzdm);
        }
        zzZDD zzzdd = this.zzWr0;
        if (zzzdd != null) {
            zzzdj.zzZ(zzzdd);
        }
        return new zzZC2(zzzdj);
    }
}
