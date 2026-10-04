package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYU1 extends zzZ41 {
    protected zzYUB zzVZi;
    private final boolean zzVZo = zzZ5L.zzXH0();
    private final String zzVZp;

    public zzYU1(zzYUB zzyub) {
        this.zzVZp = zzyub.zzXGi();
        this.zzVZi = zzyub;
    }

    public final void reset() {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        this.zzVZi.reset();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        this.zzVZi.update((byte) i);
    }

    public final int zzr(byte[] bArr, int i, int i2) {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        return this.zzVZi.zzB(bArr, 0, i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        this.zzVZi.update(bArr, i, i2);
    }
}
