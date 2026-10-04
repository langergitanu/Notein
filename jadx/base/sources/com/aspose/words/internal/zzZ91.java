package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ91 extends zzZDB {
    private BigInteger zzWGz;
    private zzZD4 zzWw7;
    private BigInteger zzWw8;
    private BigInteger zzWw9;
    private BigInteger zzWwa;
    private BigInteger zzWwb;
    private BigInteger zzWwc;
    private BigInteger zzWwd;
    private BigInteger zzWwe;
    private BigInteger zzWwf;

    public zzZ91(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.zzWw7 = null;
        this.zzWGz = BigInteger.valueOf(0L);
        this.zzWwf = bigInteger;
        this.zzWwe = bigInteger2;
        this.zzWwd = bigInteger3;
        this.zzWwc = bigInteger4;
        this.zzWwb = bigInteger5;
        this.zzWwa = bigInteger6;
        this.zzWw9 = bigInteger7;
        this.zzWw8 = bigInteger8;
    }

    public static zzZ91 zzXD(Object obj) {
        if (obj instanceof zzZ91) {
            return (zzZ91) obj;
        }
        if (obj != null) {
            return new zzZ91(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final BigInteger getModulus() {
        return this.zzWwf;
    }

    public final BigInteger getPrivateExponent() {
        return this.zzWwd;
    }

    public final BigInteger getPublicExponent() {
        return this.zzWwe;
    }

    public final BigInteger zzXIW() {
        return this.zzWw8;
    }

    public final BigInteger zzXIX() {
        return this.zzWw9;
    }

    public final BigInteger zzXIY() {
        return this.zzWwa;
    }

    public final BigInteger zzXIZ() {
        return this.zzWwb;
    }

    public final BigInteger zzXJ0() {
        return this.zzWwc;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(this.zzWGz));
        zzzdj.zzZ(new zzZDD(this.zzWwf));
        zzzdj.zzZ(new zzZDD(this.zzWwe));
        zzzdj.zzZ(new zzZDD(this.zzWwd));
        zzzdj.zzZ(new zzZDD(this.zzWwc));
        zzzdj.zzZ(new zzZDD(this.zzWwb));
        zzzdj.zzZ(new zzZDD(this.zzWwa));
        zzzdj.zzZ(new zzZDD(this.zzWw9));
        zzzdj.zzZ(new zzZDD(this.zzWw8));
        zzZD4 zzzd4 = this.zzWw7;
        if (zzzd4 != null) {
            zzzdj.zzZ(zzzd4);
        }
        return new zzZC2(zzzdj);
    }

    private zzZ91(zzZD4 zzzd4) {
        this.zzWw7 = null;
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        BigInteger bigIntegerZzXKZ = ((zzZDD) enumerationZzXKE.nextElement()).zzXKZ();
        if (bigIntegerZzXKZ.intValue() != 0 && bigIntegerZzXKZ.intValue() != 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.zzWGz = bigIntegerZzXKZ;
        this.zzWwf = ((zzZDD) enumerationZzXKE.nextElement()).zzXKZ();
        this.zzWwe = ((zzZDD) enumerationZzXKE.nextElement()).zzXKZ();
        this.zzWwd = ((zzZDD) enumerationZzXKE.nextElement()).zzXKZ();
        this.zzWwc = ((zzZDD) enumerationZzXKE.nextElement()).zzXKZ();
        this.zzWwb = ((zzZDD) enumerationZzXKE.nextElement()).zzXKZ();
        this.zzWwa = ((zzZDD) enumerationZzXKE.nextElement()).zzXKZ();
        this.zzWw9 = ((zzZDD) enumerationZzXKE.nextElement()).zzXKZ();
        this.zzWw8 = ((zzZDD) enumerationZzXKE.nextElement()).zzXKZ();
        if (enumerationZzXKE.hasMoreElements()) {
            this.zzWw7 = (zzZD4) enumerationZzXKE.nextElement();
        }
    }
}
