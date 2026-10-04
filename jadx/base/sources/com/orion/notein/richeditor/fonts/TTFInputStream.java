package com.orion.notein.richeditor.fonts;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public interface TTFInputStream extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    int read() throws IOException;

    int read(byte[] bArr) throws IOException;

    void seek(long j) throws IOException;
}
