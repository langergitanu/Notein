package com.orion.notein.richeditor.fonts;

import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes9.dex */
public class TTFRandomAccessFile implements TTFInputStream {
    private final RandomAccessFile mFile;

    public TTFRandomAccessFile(RandomAccessFile randomAccessFile) {
        this.mFile = randomAccessFile;
    }

    @Override // com.orion.notein.richeditor.fonts.TTFInputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mFile.close();
    }

    @Override // com.orion.notein.richeditor.fonts.TTFInputStream
    public int read(byte[] bArr) throws IOException {
        return this.mFile.read(bArr);
    }

    @Override // com.orion.notein.richeditor.fonts.TTFInputStream
    public void seek(long j) throws IOException {
        this.mFile.seek(j);
    }

    @Override // com.orion.notein.richeditor.fonts.TTFInputStream
    public int read() throws IOException {
        return this.mFile.read();
    }
}
