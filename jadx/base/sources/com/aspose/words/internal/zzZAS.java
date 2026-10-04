package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAS extends zzZDB {
    private final zzZ86 zzWFT;
    private final zzZ86 zzWFU;
    private final zzZ86 zzWGv;

    public zzZAS(zzZ86 zzz86, zzZ86 zzz862) {
        if (zzz86 == null || zzz862 == null) {
            throw new NullPointerException("AlgorithmIdentifiers cannot be null");
        }
        this.zzWFU = zzz86;
        this.zzWFT = zzz862;
        this.zzWGv = null;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFU);
        zzZ86 zzz86 = this.zzWFT;
        if (zzz86 != null) {
            zzzdj.zzZ(new zzZBX(false, 1, zzz86));
        }
        zzZ86 zzz862 = this.zzWGv;
        if (zzz862 != null) {
            zzzdj.zzZ(new zzZBX(false, 2, zzz862));
        }
        return new zzZC2(zzzdj);
    }
}
