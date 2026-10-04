package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ78 extends zzZDB {
    private final zzZDD zzWEo;
    private final zzZDD zzWEp;
    private final zzZ76 zzWp2;
    private final zzZDD zzWp3;
    private final zzZDD zzWz5;

    public zzZ78(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, zzZ76 zzz76) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (bigInteger3 == null) {
            throw new IllegalArgumentException("'q' cannot be null");
        }
        this.zzWEp = new zzZDD(bigInteger);
        this.zzWz5 = new zzZDD(bigInteger2);
        this.zzWEo = new zzZDD(bigInteger3);
        if (bigInteger4 != null) {
            this.zzWp3 = new zzZDD(bigInteger4);
        } else {
            this.zzWp3 = null;
        }
        this.zzWp2 = zzz76;
    }

    public static zzZ78 zzWU(Object obj) {
        if (obj instanceof zzZ78) {
            return (zzZ78) obj;
        }
        if (obj != null) {
            return new zzZ78(zzZD4.zzYy(obj));
        }
        return null;
    }

    private static zzZDK zzZ(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (zzZDK) enumeration.nextElement();
        }
        return null;
    }

    public final BigInteger getG() {
        return this.zzWz5.zzXKM();
    }

    public final BigInteger getP() {
        return this.zzWEp.zzXKM();
    }

    public final BigInteger getQ() {
        return this.zzWEo.zzXKM();
    }

    public final zzZ76 zzXHA() {
        return this.zzWp2;
    }

    public final BigInteger zzXHB() {
        zzZDD zzzdd = this.zzWp3;
        if (zzzdd == null) {
            return null;
        }
        return zzzdd.zzXKM();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWEp);
        zzzdj.zzZ(this.zzWz5);
        zzzdj.zzZ(this.zzWEo);
        zzZDD zzzdd = this.zzWp3;
        if (zzzdd != null) {
            zzzdj.zzZ(zzzdd);
        }
        zzZ76 zzz76 = this.zzWp2;
        if (zzz76 != null) {
            zzzdj.zzZ(zzz76);
        }
        return new zzZC2(zzzdj);
    }

    private zzZ78(zzZD4 zzzd4) {
        if (zzzd4.size() >= 3 && zzzd4.size() <= 5) {
            Enumeration enumerationZzXKE = zzzd4.zzXKE();
            this.zzWEp = zzZDD.zzYB(enumerationZzXKE.nextElement());
            this.zzWz5 = zzZDD.zzYB(enumerationZzXKE.nextElement());
            this.zzWEo = zzZDD.zzYB(enumerationZzXKE.nextElement());
            zzZDK zzzdkZzZ = zzZ(enumerationZzXKE);
            if (zzzdkZzZ != null && (zzzdkZzZ instanceof zzZDD)) {
                this.zzWp3 = zzZDD.zzYB(zzzdkZzZ);
                zzzdkZzZ = zzZ(enumerationZzXKE);
            } else {
                this.zzWp3 = null;
            }
            if (zzzdkZzZ != null) {
                this.zzWp2 = zzZ76.zzWT(zzzdkZzZ.zzXL0());
                return;
            } else {
                this.zzWp2 = null;
                return;
            }
        }
        throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
    }
}
