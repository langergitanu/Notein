package oOo00OoO;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: oOo00OoO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34534OooOOOO implements InterfaceC34548OooOoo0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34547OooOoo f123756OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InputStream f123757OooOo0o;

    public C34534OooOOOO(InputStream input, C34547OooOoo timeout) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        kotlin.jvm.internal.OooOOO0.OooO0oO(timeout, "timeout");
        this.f123757OooOo0o = input;
        this.f123756OooOo = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f123757OooOo0o.close();
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final long read(C34524OooO0Oo sink, long j) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: ").toString());
        }
        try {
            this.f123756OooOo.throwIfReached();
            C34543OooOo0o c34543OooOo0oO0000Oo0 = sink.o0000Oo0(1);
            int i = this.f123757OooOo0o.read(c34543OooOo0oO0000Oo0.f123780OooO00o, c34543OooOo0oO0000Oo0.f123782OooO0OO, (int) Math.min(j, 8192 - c34543OooOo0oO0000Oo0.f123782OooO0OO));
            if (i != -1) {
                c34543OooOo0oO0000Oo0.f123782OooO0OO += i;
                long j2 = i;
                sink.f123723OooOo += j2;
                return j2;
            }
            if (c34543OooOo0oO0000Oo0.f123781OooO0O0 != c34543OooOo0oO0000Oo0.f123782OooO0OO) {
                return -1L;
            }
            sink.f123724OooOo0o = c34543OooOo0oO0000Oo0.OooO00o();
            C34539OooOo.OooO00o(c34543OooOo0oO0000Oo0);
            return -1L;
        } catch (AssertionError e) {
            if (C34535OooOOOo.OooO0OO(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final C34547OooOoo timeout() {
        return this.f123756OooOo;
    }

    public final String toString() {
        return "source(" + this.f123757OooOo0o + ')';
    }
}
