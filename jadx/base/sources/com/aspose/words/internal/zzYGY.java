package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGY {
    private static final zzYHJ zzWn5 = new zzYHJ();

    /* JADX INFO: renamed from: es */
    private zzZDA f50839es;

    /* JADX INFO: renamed from: et */
    private zzZ7S f50840et = new zzZ7S();
    private zzZDM zzWtt;

    public final void zzXyp() {
        this.zzWtt = zzZDM.zzOQ(true);
    }

    public final zzYGZ zzZ(zzZDA zzzda, byte[] bArr) {
        return zzZ(zzWn5.zzA(zzzda), bArr);
    }

    private zzYGZ zzZ(zzZ86 zzz86, byte[] bArr) {
        if (zzz86 != null) {
            return new zzYGZ(new zzZ8N(new zzZ8P(zzz86, bArr), this.f50839es, null, this.zzWtt, !this.f50840et.isEmpty() ? this.f50840et.zzXHW() : null));
        }
        throw new IllegalArgumentException("digest algorithm not specified");
    }
}
