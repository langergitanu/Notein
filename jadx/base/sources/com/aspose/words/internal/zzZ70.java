package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ70 extends zzZDB {
    private zzYLX zzWor;
    private zzYM1 zzWos;
    private final zzZD9 zzWot;

    public zzZ70(zzYLX zzylx) {
        this(zzylx, (byte) 0);
    }

    public final synchronized zzYLX zzXHr() {
        try {
            if (this.zzWor == null) {
                this.zzWor = this.zzWos.zzVO(this.zzWot.zzXL5()).zzXze();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzWor;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWot;
    }

    private zzZ70(zzYLX zzylx, byte b) {
        this.zzWor = zzylx.zzXze();
        this.zzWot = new zzZC6(zzylx.zzOC(false));
    }

    public zzZ70(zzYM1 zzym1, byte[] bArr) {
        this.zzWos = zzym1;
        this.zzWot = new zzZC6(zzYGU.zzVI(bArr));
    }

    public zzZ70(zzYM1 zzym1, zzZD9 zzzd9) {
        this(zzym1, zzzd9.zzXL5());
    }
}
