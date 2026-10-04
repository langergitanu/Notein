package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAZ extends zzZDB {
    private final zzZD9 zzWGr;
    private final zzZDA zzWGs;

    public zzZAZ(zzZDA zzzda, byte[] bArr) {
        this.zzWGs = zzzda;
        this.zzWGr = new zzZC6(zzYGU.zzVI(bArr));
    }

    public static zzZAZ zzYi(Object obj) {
        if (obj != null) {
            return new zzZAZ(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZDA zzXK3() {
        return this.zzWGs;
    }

    public final byte[] zzXK4() {
        return zzYGU.zzVI(this.zzWGr.zzXL5());
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWGs);
        zzzdj.zzZ(this.zzWGr);
        return new zzZC2(zzzdj);
    }

    private zzZAZ(zzZD4 zzzd4) {
        this.zzWGs = zzZDA.zzYA(zzzd4.zzg6(0));
        this.zzWGr = zzZD9.zzYz(zzzd4.zzg6(1));
    }
}
