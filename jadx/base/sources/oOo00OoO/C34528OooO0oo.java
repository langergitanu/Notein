package oOo00OoO;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: oOo00OoO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34528OooO0oo implements InterfaceC34544OooOoO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Deflater f123738OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34540OooOo0 f123739OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f123740OooOoO0;

    public C34528OooO0oo(C34540OooOo0 c34540OooOo0, Deflater deflater) {
        this.f123739OooOo0o = c34540OooOo0;
        this.f123738OooOo = deflater;
    }

    public final void OooO00o(boolean z) throws IOException {
        C34524OooO0Oo c34524OooO0Oo;
        C34543OooOo0o c34543OooOo0oO0000Oo0;
        int iDeflate;
        C34540OooOo0 c34540OooOo0 = this.f123739OooOo0o;
        while (true) {
            c34524OooO0Oo = c34540OooOo0.f123766OooOo;
            c34543OooOo0oO0000Oo0 = c34524OooO0Oo.o0000Oo0(1);
            Deflater deflater = this.f123738OooOo;
            byte[] bArr = c34543OooOo0oO0000Oo0.f123780OooO00o;
            if (z) {
                int i = c34543OooOo0oO0000Oo0.f123782OooO0OO;
                iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                int i2 = c34543OooOo0oO0000Oo0.f123782OooO0OO;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                c34543OooOo0oO0000Oo0.f123782OooO0OO += iDeflate;
                c34524OooO0Oo.f123723OooOo += (long) iDeflate;
                c34540OooOo0.o000000();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c34543OooOo0oO0000Oo0.f123781OooO0O0 == c34543OooOo0oO0000Oo0.f123782OooO0OO) {
            c34524OooO0Oo.f123724OooOo0o = c34543OooOo0oO0000Oo0.OooO00o();
            C34539OooOo.OooO00o(c34543OooOo0oO0000Oo0);
        }
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f123738OooOo;
        if (this.f123740OooOoO0) {
            return;
        }
        try {
            deflater.finish();
            OooO00o(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f123739OooOo0o.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f123740OooOoO0 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
    public final void flush() throws IOException {
        OooO00o(true);
        this.f123739OooOo0o.flush();
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public final C34547OooOoo timeout() {
        return this.f123739OooOo0o.f123767OooOo0o.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f123739OooOo0o + ')';
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public final void write(C34524OooO0Oo source, long j) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        C34522OooO0O0.OooO0O0(source.f123723OooOo, 0L, j);
        while (j > 0) {
            C34543OooOo0o c34543OooOo0o = source.f123724OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            int iMin = (int) Math.min(j, c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
            this.f123738OooOo.setInput(c34543OooOo0o.f123780OooO00o, c34543OooOo0o.f123781OooO0O0, iMin);
            OooO00o(false);
            long j2 = iMin;
            source.f123723OooOo -= j2;
            int i = c34543OooOo0o.f123781OooO0O0 + iMin;
            c34543OooOo0o.f123781OooO0O0 = i;
            if (i == c34543OooOo0o.f123782OooO0OO) {
                source.f123724OooOo0o = c34543OooOo0o.OooO00o();
                C34539OooOo.OooO00o(c34543OooOo0o);
            }
            j -= j2;
        }
    }
}
