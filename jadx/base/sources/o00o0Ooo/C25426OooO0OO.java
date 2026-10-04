package o00o0Ooo;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: o00o0Ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25426OooO0OO extends FilterOutputStream {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f86699OooOo0o;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f86699OooOo0o += (long) i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.f86699OooOo0o++;
    }
}
