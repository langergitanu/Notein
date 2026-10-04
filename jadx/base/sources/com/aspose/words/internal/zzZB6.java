package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZB6 extends zzZDB {
    private final zzZD9 zzWGI;
    private final zzZ86 zzWGJ;

    public zzZB6(zzZ86 zzz86, byte[] bArr) {
        this.zzWGJ = zzz86;
        this.zzWGI = new zzZC6(zzYGU.zzVI(bArr));
    }

    public static zzZB6 zzYp(Object obj) {
        if (obj != null) {
            return new zzZB6(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] zzXKg() {
        return zzYGU.zzVI(this.zzWGI.zzXL5());
    }

    public final zzZ86 zzXKh() {
        return this.zzWGJ;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWGJ);
        zzzdj.zzZ(this.zzWGI);
        return new zzZC2(zzzdj);
    }

    private zzZB6(zzZD4 zzzd4) {
        this.zzWGJ = zzZ86.zzXm(zzzd4.zzg6(0));
        this.zzWGI = zzZD9.zzYz(zzzd4.zzg6(1));
    }
}
