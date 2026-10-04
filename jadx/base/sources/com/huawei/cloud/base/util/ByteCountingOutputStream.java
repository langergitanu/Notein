package com.huawei.cloud.base.util;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
final class ByteCountingOutputStream extends OutputStream {
    long count;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.count += (long) i2;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.count++;
    }
}
