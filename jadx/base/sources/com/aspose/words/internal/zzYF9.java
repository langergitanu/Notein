package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzYF9 extends zzZQS {

    /* JADX INFO: renamed from: fq */
    protected zzYF8 f50787fq;

    public zzYF9(zzYF8 zzyf8, String str) {
        super(str);
        if (zzyf8 == null) {
            zzXyf();
        }
        this.f50787fq = zzyf8;
    }

    private static void zzXyf() throws RuntimeException {
        throw new IllegalArgumentException("Validation problem argument can not be null");
    }

    public final zzYF8 zzXyg() {
        return this.f50787fq;
    }

    public zzYF9(zzYF8 zzyf8, String str, zzZQY zzzqy) {
        super(str, zzzqy);
        if (zzyf8 == null) {
            zzXyf();
        }
        this.f50787fq = zzyf8;
    }
}
