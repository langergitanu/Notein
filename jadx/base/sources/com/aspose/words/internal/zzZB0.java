package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZB0 extends zzZDB {
    private final zzZD9 zzWGt;
    private final zzZ9C zzWGu;
    private final zzZ86 zzWGv;

    public zzZB0(zzZ86 zzz86, zzZ9C zzz9c, byte[] bArr) {
        this.zzWGv = zzz86;
        this.zzWGu = zzz9c;
        this.zzWGt = new zzZC6(zzYGU.zzVI(bArr));
    }

    public static zzZB0 zzYj(Object obj) {
        if (obj instanceof zzZB0) {
            return (zzZB0) obj;
        }
        if (obj != null) {
            return new zzZB0(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] zzXK5() {
        return zzYGU.zzVI(this.zzWGt.zzXL5());
    }

    public final zzZ9C zzXK6() {
        return this.zzWGu;
    }

    public final zzZ86 zzXK7() {
        return this.zzWGv;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWGv);
        zzzdj.zzZ(this.zzWGu);
        zzzdj.zzZ(this.zzWGt);
        return new zzZC2(zzzdj);
    }

    private zzZB0(zzZD4 zzzd4) {
        this.zzWGv = zzZ86.zzXm(zzzd4.zzg6(0));
        this.zzWGu = zzZ9C.zzXN(zzzd4.zzg6(1));
        this.zzWGt = zzZD9.zzYz(zzzd4.zzg6(2));
    }
}
