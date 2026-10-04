package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAT extends zzZDB {
    private int zzWFV;
    private byte[] zzWFW;

    private zzZAT(zzZD4 zzzd4) {
        this.zzWFW = zzZD9.zzYz(zzzd4.zzg6(0)).zzXL5();
        if (zzzd4.size() == 2) {
            this.zzWFV = zzZDD.zzYB(zzzd4.zzg6(1)).zzXKZ().intValue();
        } else {
            this.zzWFV = 12;
        }
    }

    public static zzZAT zzYe(Object obj) {
        if (obj instanceof zzZAT) {
            return (zzZAT) obj;
        }
        if (obj != null) {
            return new zzZAT(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final int zzXJX() {
        return this.zzWFV;
    }

    public final byte[] zzXJY() {
        return zzYGU.zzVI(this.zzWFW);
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZC6(this.zzWFW));
        int i = this.zzWFV;
        if (i != 12) {
            zzzdj.zzZ(new zzZDD(i));
        }
        return new zzZC2(zzzdj);
    }

    public zzZAT(byte[] bArr, int i) {
        this.zzWFW = zzYGU.zzVI(bArr);
        this.zzWFV = i;
    }
}
