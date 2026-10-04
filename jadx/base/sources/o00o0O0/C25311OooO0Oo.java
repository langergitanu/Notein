package o00o0O0;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import o00o000.OooOo;

/* JADX INFO: renamed from: o00o0O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25311OooO0Oo extends InputStream {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final ArrayDeque f86146OooOoO0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public IOException f86147OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOo f86148OooOo0o;

    static {
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        f86146OooOoO0 = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f86148OooOo0o.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f86148OooOo0o.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f86148OooOo0o.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f86148OooOo0o.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f86148OooOo0o.read();
        } catch (IOException e) {
            this.f86147OooOo = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f86148OooOo0o.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f86148OooOo0o.skip(j);
        } catch (IOException e) {
            this.f86147OooOo = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f86148OooOo0o.read(bArr);
        } catch (IOException e) {
            this.f86147OooOo = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f86148OooOo0o.read(bArr, i, i2);
        } catch (IOException e) {
            this.f86147OooOo = e;
            throw e;
        }
    }
}
