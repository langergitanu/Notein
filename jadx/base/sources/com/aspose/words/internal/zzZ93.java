package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ93 extends zzZDB {
    zzZD9 zzWEv;
    zzZDD zzWFn;

    public zzZ93(byte[] bArr) {
        this.zzWFn = null;
        this.zzWEv = new zzZC6(bArr);
    }

    public static zzZ93 zzXF(Object obj) {
        if (obj instanceof zzZ93) {
            return (zzZ93) obj;
        }
        if (obj != null) {
            return new zzZ93(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getIV() {
        return this.zzWEv.zzXL5();
    }

    public final BigInteger zzXJ4() {
        zzZDD zzzdd = this.zzWFn;
        if (zzzdd == null) {
            return null;
        }
        return zzzdd.zzXKZ();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzZDD zzzdd = this.zzWFn;
        if (zzzdd != null) {
            zzzdj.zzZ(zzzdd);
        }
        zzzdj.zzZ(this.zzWEv);
        return new zzZC2(zzzdj);
    }

    public zzZ93(int i, byte[] bArr) {
        this.zzWFn = new zzZDD(i);
        this.zzWEv = new zzZC6(bArr);
    }

    private zzZ93(zzZD4 zzzd4) {
        if (zzzd4.size() == 1) {
            this.zzWFn = null;
            this.zzWEv = (zzZD9) zzzd4.zzg6(0);
        } else {
            this.zzWFn = (zzZDD) zzzd4.zzg6(0);
            this.zzWEv = (zzZD9) zzzd4.zzg6(1);
        }
    }
}
