package o0000o0O;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo extends OutputStream {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final FileOutputStream f81797OooOo0o;

    public o0Oo0oo(FileOutputStream fileOutputStream) {
        this.f81797OooOo0o = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f81797OooOo0o.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f81797OooOo0o.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
        this.f81797OooOo0o.write(b);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i, int i2) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bytes, "bytes");
        this.f81797OooOo0o.write(bytes, i, i2);
    }
}
