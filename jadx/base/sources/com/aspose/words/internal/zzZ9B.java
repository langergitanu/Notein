package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9B extends zzZDB {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    byte[] zzWAR;
    BigInteger zzWyK;
    zzZ7X zzWyL;

    private zzZ9B(zzZD4 zzzd4) {
        this.zzWyL = zzZ7X.zzXe(zzzd4.zzg6(0));
        this.zzWAR = zzYGU.zzVI(zzZD9.zzYz(zzzd4.zzg6(1)).zzXL5());
        if (zzzd4.size() == 3) {
            this.zzWyK = zzZDD.zzYB(zzzd4.zzg6(2)).zzXKZ();
        } else {
            this.zzWyK = ONE;
        }
    }

    public static zzZ9B zzXM(Object obj) {
        if (obj instanceof zzZ9B) {
            return (zzZ9B) obj;
        }
        if (obj != null) {
            return new zzZ9B(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getSalt() {
        return zzYGU.zzVI(this.zzWAR);
    }

    public final BigInteger zzXJh() {
        return this.zzWyK;
    }

    public final zzZ7X zzXJi() {
        return this.zzWyL;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWyL);
        zzzdj.zzZ(new zzZC6(this.zzWAR));
        if (!this.zzWyK.equals(ONE)) {
            zzzdj.zzZ(new zzZDD(this.zzWyK));
        }
        return new zzZC2(zzzdj);
    }

    public zzZ9B(zzZ7X zzz7x, byte[] bArr) {
        this.zzWyL = zzz7x;
        this.zzWAR = zzYGU.zzVI(bArr);
        this.zzWyK = BigInteger.valueOf(1024L);
    }
}
