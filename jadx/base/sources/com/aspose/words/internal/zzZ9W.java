package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9W extends zzZDB {
    zzZDD zzWBu;
    zzZD9 zzWEv;

    public zzZ9W(byte[] bArr, int i) {
        this.zzWEv = new zzZC6(zzYGU.zzVI(bArr));
        this.zzWBu = new zzZDD(i);
    }

    public static zzZ9W zzXY(Object obj) {
        if (obj instanceof zzZ9W) {
            return (zzZ9W) obj;
        }
        if (obj != null) {
            return new zzZ9W(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getIV() {
        return zzYGU.zzVI(this.zzWEv.zzXL5());
    }

    public final int getKeyLength() {
        return this.zzWBu.zzXKZ().intValue();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWEv);
        zzzdj.zzZ(this.zzWBu);
        return new zzZC2(zzzdj);
    }

    private zzZ9W(zzZD4 zzzd4) {
        this.zzWEv = (zzZD9) zzzd4.zzg6(0);
        this.zzWBu = (zzZDD) zzzd4.zzg6(1);
    }
}
