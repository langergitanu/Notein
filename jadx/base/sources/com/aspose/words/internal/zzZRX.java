package com.aspose.words.internal;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZRX implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public void dispose() throws IOException {
        close();
    }

    public abstract void zzZQ(zzZOP zzzop) throws Exception;

    public zzZOR zzlT() throws Exception {
        return zzlV();
    }

    public byte[] zzlU() throws Exception {
        return zzZYQ.zzZX(zzlV());
    }

    public zzZOR zzlV() throws Exception {
        zzZOR zzzor = new zzZOR();
        zzZQ(zzzor);
        zzzor.zzH(0L);
        return zzzor;
    }

    public abstract int zzlW();

    public abstract zzZQ9 zzlX();

    public abstract int zzlY();

    public abstract String zzlZ();

    public abstract boolean zzm0() throws Exception;
}
