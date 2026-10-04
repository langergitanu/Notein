package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8P extends zzZDB {
    zzZ86 zzWDP;
    byte[] zzWtD;

    private zzZ8P(zzZD4 zzzd4) {
        this.zzWDP = zzZ86.zzXm(zzzd4.zzg6(0));
        this.zzWtD = zzZD9.zzYz(zzzd4.zzg6(1)).zzXL5();
    }

    public static zzZ8P zzXx(Object obj) {
        if (obj instanceof zzZ8P) {
            return (zzZ8P) obj;
        }
        if (obj != null) {
            return new zzZ8P(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] zzXIN() {
        return zzYGU.zzVI(this.zzWtD);
    }

    public final zzZ86 zzXJ3() {
        return this.zzWDP;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWDP);
        zzzdj.zzZ(new zzZC6(this.zzWtD));
        return new zzZC2(zzzdj);
    }

    public zzZ8P(zzZ86 zzz86, byte[] bArr) {
        this.zzWDP = zzz86;
        this.zzWtD = zzYGU.zzVI(bArr);
    }
}
