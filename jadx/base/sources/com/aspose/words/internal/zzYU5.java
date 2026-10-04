package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYU5 extends zzZ41 {
    protected zzYUR zzVZk;
    private final boolean zzVZo = zzZ5L.zzXH0();
    private final String zzVZp;

    public zzYU5(zzYUR zzyur) {
        this.zzVZp = zzyur.zzXGi();
        this.zzVZk = zzyur;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        this.zzVZk.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        this.zzVZk.update(bArr, i, i2);
    }
}
