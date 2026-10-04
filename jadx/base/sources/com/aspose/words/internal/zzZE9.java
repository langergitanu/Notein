package com.aspose.words.internal;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZE9 extends Writer {
    protected final zzZEA zzWKf;
    private char[] zzZnz = null;

    public static final class zzZ extends zzZE9 {
        public zzZ(zzZEA zzzea) {
            super(zzzea);
        }

        @Override // com.aspose.words.internal.zzZE9, java.io.Writer
        public final void write(char[] cArr, int i, int i2) throws IOException {
            this.zzWKf.zzS(cArr, i, i2);
        }

        @Override // java.io.Writer
        public final void write(String str, int i, int i2) throws IOException {
            this.zzWKf.zzr(str, i, i2);
        }

        @Override // java.io.Writer
        public final void write(String str) throws IOException {
            this.zzWKf.zzr(str, 0, str.length());
        }
    }

    public zzZE9(zzZEA zzzea) {
        this.zzWKf = zzzea;
    }

    public static zzZE9 zzZ(zzZEA zzzea) {
        return new zzZ(zzzea);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzWKf.zzOT(false);
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.zzWKf.flush();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public abstract void write(char[] cArr, int i, int i2) throws IOException;

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        if (this.zzZnz == null) {
            this.zzZnz = new char[1];
        }
        char[] cArr = this.zzZnz;
        cArr[0] = (char) i;
        write(cArr, 0, 1);
    }
}
