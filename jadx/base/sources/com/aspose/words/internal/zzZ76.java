package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ76 extends zzZDB {
    private zzZDD zzWp0;
    private zzZCG zzWp1;

    public zzZ76(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        }
        this.zzWp1 = new zzZCG(bArr);
        this.zzWp0 = new zzZDD(i);
    }

    public static zzZ76 zzWT(Object obj) {
        if (obj instanceof zzZ76) {
            return (zzZ76) obj;
        }
        if (obj != null) {
            return new zzZ76(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getSeed() {
        return this.zzWp1.getBytes();
    }

    public final BigInteger zzXHz() {
        return this.zzWp0.zzXKM();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWp1);
        zzzdj.zzZ(this.zzWp0);
        return new zzZC2(zzzdj);
    }

    public zzZ76(zzZCG zzzcg, zzZDD zzzdd) {
        this.zzWp1 = zzzcg;
        this.zzWp0 = zzzdd;
    }

    private zzZ76(zzZD4 zzzd4) {
        if (zzzd4.size() == 2) {
            this.zzWp1 = zzZCG.zzYu(zzzd4.zzg6(0));
            this.zzWp0 = zzZDD.zzYB(zzzd4.zzg6(1));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
    }
}
