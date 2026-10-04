package com.huawei.hms.drive;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.huawei.hms.drive.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17874i extends OutputStream {

    /* JADX INFO: renamed from: a */
    private final OutputStream f53409a;

    public AbstractC17874i(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f53409a = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f53409a.close();
    }

    public final OutputStream delegate() {
        return this.f53409a;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f53409a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f53409a.toString() + ")";
    }
}
