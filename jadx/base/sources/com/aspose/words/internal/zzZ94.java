package com.aspose.words.internal;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ94 extends zzZDB {
    private zzZDD zzWFn;
    private zzZDN zzWwl;
    private zzZD2 zzWwm;
    private zzZD9 zzWwn;
    private zzZ86 zzWwo;

    public zzZ94(zzZ86 zzz86, zzZDK zzzdk) throws IOException {
        this(zzz86, zzzdk, null, null);
    }

    public static zzZ94 zzXG(Object obj) {
        if (obj instanceof zzZ94) {
            return (zzZ94) obj;
        }
        if (obj != null) {
            return new zzZ94(zzZD4.zzYy(obj));
        }
        return null;
    }

    private static int zzZ(zzZDD zzzdd) {
        BigInteger bigIntegerZzXKZ = zzzdd.zzXKZ();
        if (bigIntegerZzXKZ.compareTo(zzYGT.ZERO) < 0 || bigIntegerZzXKZ.compareTo(zzYGT.ONE) > 0) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        return bigIntegerZzXKZ.intValue();
    }

    public final zzZDN zzXJ5() {
        return this.zzWwl;
    }

    public final boolean zzXJ6() {
        return this.zzWwl != null;
    }

    public final zzZDK zzXJ7() throws IOException {
        return zzZD5.zzXo(this.zzWwn.zzXL5());
    }

    public final zzZ86 zzXJ8() {
        return this.zzWwo;
    }

    public final zzZD2 zzXJ9() {
        return this.zzWwm;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFn);
        zzzdj.zzZ(this.zzWwo);
        zzzdj.zzZ(this.zzWwn);
        zzZD2 zzzd2 = this.zzWwm;
        if (zzzd2 != null) {
            zzzdj.zzZ(new zzZBX(false, 0, zzzd2));
        }
        zzZDN zzzdn = this.zzWwl;
        if (zzzdn != null) {
            zzzdj.zzZ(new zzZBX(false, 1, zzzdn));
        }
        return new zzZC2(zzzdj);
    }

    public zzZ94(zzZ86 zzz86, zzZDK zzzdk, zzZD2 zzzd2, byte[] bArr) throws IOException {
        this.zzWFn = new zzZDD(bArr != null ? zzYGT.ONE : zzYGT.ZERO);
        this.zzWwo = zzz86;
        this.zzWwn = new zzZC6(zzzdk);
        this.zzWwm = zzzd2;
        this.zzWwl = bArr == null ? null : new zzZCG(bArr);
    }

    private zzZ94(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        zzZDD zzzddZzYB = zzZDD.zzYB(enumerationZzXKE.nextElement());
        this.zzWFn = zzzddZzYB;
        int iZzZ = zzZ(zzzddZzYB);
        this.zzWwo = zzZ86.zzXm(enumerationZzXKE.nextElement());
        this.zzWwn = zzZD9.zzYz(enumerationZzXKE.nextElement());
        int i = -1;
        while (enumerationZzXKE.hasMoreElements()) {
            zzZCY zzzcy = (zzZCY) enumerationZzXKE.nextElement();
            int iZzXKy = zzzcy.zzXKy();
            if (iZzXKy <= i) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (iZzXKy == 0) {
                this.zzWwm = zzZD2.zzW(zzzcy, false);
            } else {
                if (iZzXKy != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (iZzZ > 0) {
                    this.zzWwl = zzZCG.zzW(zzzcy);
                } else {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
            }
            i = iZzXKy;
        }
    }
}
