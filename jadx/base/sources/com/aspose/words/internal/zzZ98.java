package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ98 extends zzZDB {
    private static final zzZ86 zzWyF = new zzZ86(zzZ96.zzWy4, zzZC8.zzWHS);
    private final zzZDD zzWBu;
    private final zzZ86 zzWyC;
    private final zzZDD zzWyD;
    private final zzZD9 zzWyE;

    public zzZ98(byte[] bArr, int i) {
        this(bArr, i, (byte) 0);
    }

    public static zzZ98 zzXJ(Object obj) {
        if (obj instanceof zzZ98) {
            return (zzZ98) obj;
        }
        if (obj != null) {
            return new zzZ98(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getSalt() {
        return this.zzWyE.zzXL5();
    }

    public final BigInteger zzXJO() {
        zzZDD zzzdd = this.zzWBu;
        if (zzzdd != null) {
            return zzzdd.zzXKZ();
        }
        return null;
    }

    public final zzZ86 zzXJd() {
        zzZ86 zzz86 = this.zzWyC;
        return zzz86 != null ? zzz86 : zzWyF;
    }

    public final boolean zzXJe() {
        zzZ86 zzz86 = this.zzWyC;
        return zzz86 == null || zzz86.equals(zzWyF);
    }

    public final BigInteger zzXJh() {
        return this.zzWyD.zzXKZ();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWyE);
        zzzdj.zzZ(this.zzWyD);
        zzZDD zzzdd = this.zzWBu;
        if (zzzdd != null) {
            zzzdj.zzZ(zzzdd);
        }
        zzZ86 zzz86 = this.zzWyC;
        if (zzz86 != null && !zzz86.equals(zzWyF)) {
            zzzdj.zzZ(this.zzWyC);
        }
        return new zzZC2(zzzdj);
    }

    private zzZ98(byte[] bArr, int i, byte b) {
        this(bArr, i, 0, null);
    }

    public zzZ98(byte[] bArr, int i, int i2, zzZ86 zzz86) {
        this.zzWyE = new zzZC6(zzYGU.zzVI(bArr));
        this.zzWyD = new zzZDD(i);
        if (i2 > 0) {
            this.zzWBu = new zzZDD(i2);
        } else {
            this.zzWBu = null;
        }
        this.zzWyC = zzz86;
    }

    private zzZ98(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        this.zzWyE = (zzZD9) enumerationZzXKE.nextElement();
        this.zzWyD = (zzZDD) enumerationZzXKE.nextElement();
        if (enumerationZzXKE.hasMoreElements()) {
            Object objNextElement = enumerationZzXKE.nextElement();
            if (objNextElement instanceof zzZDD) {
                this.zzWBu = zzZDD.zzYB(objNextElement);
                objNextElement = enumerationZzXKE.hasMoreElements() ? enumerationZzXKE.nextElement() : null;
            } else {
                this.zzWBu = null;
            }
            if (objNextElement != null) {
                this.zzWyC = zzZ86.zzXm(objNextElement);
                return;
            } else {
                this.zzWyC = null;
                return;
            }
        }
        this.zzWBu = null;
        this.zzWyC = null;
    }
}
