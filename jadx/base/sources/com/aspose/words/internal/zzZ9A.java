package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9A extends zzZDB {
    zzZD9 zzWyI;
    zzZDD zzWyJ;

    public zzZ9A(byte[] bArr, int i) {
        if (bArr.length != 8) {
            throw new IllegalArgumentException("salt length must be 8");
        }
        this.zzWyI = new zzZC6(bArr);
        this.zzWyJ = new zzZDD(i);
    }

    public static zzZ9A zzXL(Object obj) {
        if (obj != null) {
            return new zzZ9A(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getSalt() {
        return this.zzWyI.zzXL5();
    }

    public final BigInteger zzXJh() {
        return this.zzWyJ.zzXKZ();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWyI);
        zzzdj.zzZ(this.zzWyJ);
        return new zzZC2(zzzdj);
    }

    private zzZ9A(zzZD4 zzzd4) {
        this.zzWyI = (zzZD9) zzzd4.zzg6(0);
        this.zzWyJ = (zzZDD) zzzd4.zzg6(1);
    }
}
