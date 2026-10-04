package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYU6 extends zzZ41 {
    private final boolean zzVZo = zzZ5L.zzXH0();
    private final String zzVZp;
    protected zzYUX zzWkt;

    public zzYU6(zzYUX zzyux) {
        this.zzVZp = zzyux.zzXGi();
        this.zzWkt = zzyux;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        this.zzWkt.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        this.zzWkt.update(bArr, i, i2);
    }
}
