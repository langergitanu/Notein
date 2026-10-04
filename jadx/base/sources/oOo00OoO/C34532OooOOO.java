package oOo00OoO;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: oOo00OoO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34532OooOOO implements InterfaceC34548OooOoo0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Inflater f123747OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34542OooOo0O f123748OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f123749OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f123750OooOoO0;

    public C34532OooOOO(C34542OooOo0O c34542OooOo0O, Inflater inflater) {
        this.f123748OooOo0o = c34542OooOo0O;
        this.f123747OooOo = inflater;
    }

    public final long OooO00o(C34524OooO0Oo sink, long j) throws IOException {
        Inflater inflater = this.f123747OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: ").toString());
        }
        if (this.f123749OooOoO) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                C34543OooOo0o c34543OooOo0oO0000Oo0 = sink.o0000Oo0(1);
                int iMin = (int) Math.min(j, 8192 - c34543OooOo0oO0000Oo0.f123782OooO0OO);
                boolean zNeedsInput = inflater.needsInput();
                C34542OooOo0O c34542OooOo0O = this.f123748OooOo0o;
                if (zNeedsInput && !c34542OooOo0O.o0000o0O()) {
                    C34543OooOo0o c34543OooOo0o = c34542OooOo0O.f123776OooOo.f123724OooOo0o;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                    int i = c34543OooOo0o.f123782OooO0OO;
                    int i2 = c34543OooOo0o.f123781OooO0O0;
                    int i3 = i - i2;
                    this.f123750OooOoO0 = i3;
                    inflater.setInput(c34543OooOo0o.f123780OooO00o, i2, i3);
                }
                int iInflate = inflater.inflate(c34543OooOo0oO0000Oo0.f123780OooO00o, c34543OooOo0oO0000Oo0.f123782OooO0OO, iMin);
                int i4 = this.f123750OooOoO0;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f123750OooOoO0 -= remaining;
                    c34542OooOo0O.skip(remaining);
                }
                if (iInflate > 0) {
                    c34543OooOo0oO0000Oo0.f123782OooO0OO += iInflate;
                    long j2 = iInflate;
                    sink.f123723OooOo += j2;
                    return j2;
                }
                if (c34543OooOo0oO0000Oo0.f123781OooO0O0 == c34543OooOo0oO0000Oo0.f123782OooO0OO) {
                    sink.f123724OooOo0o = c34543OooOo0oO0000Oo0.OooO00o();
                    C34539OooOo.OooO00o(c34543OooOo0oO0000Oo0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f123749OooOoO) {
            return;
        }
        this.f123747OooOo.end();
        this.f123749OooOoO = true;
        this.f123748OooOo0o.close();
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final long read(C34524OooO0Oo sink, long j) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        do {
            long jOooO00o = OooO00o(sink, j);
            if (jOooO00o > 0) {
                return jOooO00o;
            }
            Inflater inflater = this.f123747OooOo;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f123748OooOo0o.o0000o0O());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final C34547OooOoo timeout() {
        return this.f123748OooOo0o.f123777OooOo0o.timeout();
    }
}
