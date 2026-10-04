package com.aspose.words.internal;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes5.dex */
final class zzZRY extends zzZRX {
    private ZipInputStream zz5q;
    private ZipEntry zz5s;

    public zzZRY(zzZOP zzzop) throws Exception {
        this.zz5q = new ZipInputStream(new zzZK7(zzzop));
    }

    @Override // com.aspose.words.internal.zzZRX, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.aspose.words.internal.zzZRX
    public final void zzZQ(zzZOP zzzop) throws Exception {
        zzZKB.zzZ(this.zz5q, zzzop, (int) this.zz5s.getSize());
    }

    @Override // com.aspose.words.internal.zzZRX
    public final int zzlW() {
        return (int) this.zz5s.getSize();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final zzZQ9 zzlX() {
        return new zzZQ9(this.zz5s.getTime(), 2L);
    }

    @Override // com.aspose.words.internal.zzZRX
    public final int zzlY() {
        return this.zz5s.getMethod();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final String zzlZ() {
        return this.zz5s.getName();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final boolean zzm0() throws Exception {
        ZipEntry nextEntry = this.zz5q.getNextEntry();
        this.zz5s = nextEntry;
        return nextEntry != null;
    }
}
