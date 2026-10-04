package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ97 extends zzZDB {
    zzZD9 zzWEv;
    zzZDD zzWyJ;

    public zzZ97(byte[] bArr, int i) {
        this.zzWEv = new zzZC6(bArr);
        this.zzWyJ = new zzZDD(i);
    }

    public static zzZ97 zzXI(Object obj) {
        if (obj instanceof zzZ97) {
            return (zzZ97) obj;
        }
        if (obj != null) {
            return new zzZ97(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getIV() {
        return this.zzWEv.zzXL5();
    }

    public final BigInteger zzXJc() {
        return this.zzWyJ.zzXKZ();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWEv);
        zzzdj.zzZ(this.zzWyJ);
        return new zzZC2(zzzdj);
    }

    private zzZ97(zzZD4 zzzd4) {
        this.zzWEv = (zzZD9) zzzd4.zzg6(0);
        this.zzWyJ = zzZDD.zzYB(zzzd4.zzg6(1));
    }
}
