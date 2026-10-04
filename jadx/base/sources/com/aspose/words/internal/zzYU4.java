package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYU4 extends zzZ41 {
    private zzYUI zzVZj;
    private final boolean zzVZo = zzZ5L.zzXH0();
    private final String zzVZp;

    public zzYU4(String str, zzYUI zzyui) {
        this.zzVZp = str;
        this.zzVZj = zzyui;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        this.zzVZj.update(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        this.zzVZj.update(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        this.zzVZj.update((byte) i);
    }
}
