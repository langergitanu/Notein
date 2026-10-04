package com.orion.notein.richeditor.fonts;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class TTFAssetInputStream implements TTFInputStream {
    private final InputStream mIn;

    public TTFAssetInputStream(InputStream inputStream) {
        this.mIn = inputStream;
        if (inputStream.markSupported()) {
            inputStream.mark(-1);
        }
    }

    @Override // com.orion.notein.richeditor.fonts.TTFInputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mIn.close();
    }

    @Override // com.orion.notein.richeditor.fonts.TTFInputStream
    public int read(byte[] bArr) throws IOException {
        return this.mIn.read(bArr);
    }

    @Override // com.orion.notein.richeditor.fonts.TTFInputStream
    public void seek(long j) throws IOException {
        if (this.mIn.markSupported()) {
            this.mIn.reset();
            this.mIn.skip(j);
        }
    }

    @Override // com.orion.notein.richeditor.fonts.TTFInputStream
    public int read() throws IOException {
        return this.mIn.read();
    }
}
