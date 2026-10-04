package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZB8 extends zzZDB {
    private final zzZD9 zzWGM;
    private final zzZ86 zzWGN;

    public zzZB8(zzZ86 zzz86, byte[] bArr) {
        this.zzWGN = zzz86;
        this.zzWGM = new zzZC6(bArr);
    }

    public static zzZB8 zzYr(Object obj) {
        if (obj instanceof zzZB8) {
            return (zzZB8) obj;
        }
        if (obj != null) {
            return new zzZB8(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZ86 zzXKk() {
        return this.zzWGN;
    }

    public final zzZD9 zzXKl() {
        return this.zzWGM;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWGN);
        zzzdj.zzZ(this.zzWGM);
        return new zzZC2(zzzdj);
    }

    private zzZB8(zzZD4 zzzd4) {
        this.zzWGN = zzZ86.zzXm(zzzd4.zzg6(0));
        this.zzWGM = zzZD9.zzYz(zzzd4.zzg6(1));
    }
}
