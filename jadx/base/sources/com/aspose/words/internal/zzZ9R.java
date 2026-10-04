package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9R extends zzZDB {
    private final BigInteger zzWAO;
    private final BigInteger zzWAP;
    private final BigInteger zzWAQ;
    private final byte[] zzWAR;
    private final BigInteger zzWFs;

    public zzZ9R(byte[] bArr, int i, int i2, int i3, int i4) {
        this(bArr, BigInteger.valueOf(i), BigInteger.valueOf(i2), BigInteger.valueOf(i3), BigInteger.valueOf(64L));
    }

    public static zzZ9R zzXW(Object obj) {
        if (obj instanceof zzZ9R) {
            return (zzZ9R) obj;
        }
        if (obj != null) {
            return new zzZ9R(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getSalt() {
        return zzYGU.zzVI(this.zzWAR);
    }

    public final BigInteger zzXJO() {
        return this.zzWFs;
    }

    public final BigInteger zzXJq() {
        return this.zzWAO;
    }

    public final BigInteger zzXJr() {
        return this.zzWAP;
    }

    public final BigInteger zzXJs() {
        return this.zzWAQ;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZC6(this.zzWAR));
        zzzdj.zzZ(new zzZDD(this.zzWAQ));
        zzzdj.zzZ(new zzZDD(this.zzWAP));
        zzzdj.zzZ(new zzZDD(this.zzWAO));
        BigInteger bigInteger = this.zzWFs;
        if (bigInteger != null) {
            zzzdj.zzZ(new zzZDD(bigInteger));
        }
        return new zzZC2(zzzdj);
    }

    public zzZ9R(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.zzWAR = zzYGU.zzVI(bArr);
        this.zzWAQ = bigInteger;
        this.zzWAP = bigInteger2;
        this.zzWAO = bigInteger3;
        this.zzWFs = bigInteger4;
    }

    private zzZ9R(zzZD4 zzzd4) {
        if (zzzd4.size() != 4 && zzzd4.size() != 5) {
            throw new IllegalArgumentException("invalid sequence: size = " + zzzd4.size());
        }
        this.zzWAR = zzYGU.zzVI(zzZD9.zzYz(zzzd4.zzg6(0)).zzXL5());
        this.zzWAQ = zzZDD.zzYB(zzzd4.zzg6(1)).zzXKZ();
        this.zzWAP = zzZDD.zzYB(zzzd4.zzg6(2)).zzXKZ();
        this.zzWAO = zzZDD.zzYB(zzzd4.zzg6(3)).zzXKZ();
        if (zzzd4.size() == 5) {
            this.zzWFs = zzZDD.zzYB(zzzd4.zzg6(4)).zzXKZ();
        } else {
            this.zzWFs = null;
        }
    }
}
