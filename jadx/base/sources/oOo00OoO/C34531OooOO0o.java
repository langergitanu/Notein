package oOo00OoO;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: oOo00OoO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34531OooOO0o implements InterfaceC34544OooOoO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Deflater f123742OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34540OooOo0 f123743OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f123744OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C34528OooO0oo f123745OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final CRC32 f123746OooOoOO;

    public C34531OooOO0o(InterfaceC34526OooO0o0 sink) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        C34540OooOo0 c34540OooOo0 = new C34540OooOo0(sink);
        this.f123743OooOo0o = c34540OooOo0;
        Deflater deflater = new Deflater(-1, true);
        this.f123742OooOo = deflater;
        this.f123745OooOoO0 = new C34528OooO0oo(c34540OooOo0, deflater);
        this.f123746OooOoOO = new CRC32();
        C34524OooO0Oo c34524OooO0Oo = c34540OooOo0.f123766OooOo;
        c34524OooO0Oo.o000OOoO(8075);
        c34524OooO0Oo.o0OoO0o(8);
        c34524OooO0Oo.o0OoO0o(0);
        c34524OooO0Oo.o000OOo0(0);
        c34524OooO0Oo.o0OoO0o(0);
        c34524OooO0Oo.o0OoO0o(0);
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        int value;
        boolean z;
        C34524OooO0Oo c34524OooO0Oo;
        Deflater deflater = this.f123742OooOo;
        C34540OooOo0 c34540OooOo0 = this.f123743OooOo0o;
        if (this.f123744OooOoO) {
            return;
        }
        try {
            C34528OooO0oo c34528OooO0oo = this.f123745OooOoO0;
            c34528OooO0oo.f123738OooOo.finish();
            c34528OooO0oo.OooO00o(false);
            value = (int) this.f123746OooOoOO.getValue();
            z = c34540OooOo0.f123768OooOoO0;
            c34524OooO0Oo = c34540OooOo0.f123766OooOo;
        } catch (Throwable th) {
            th = th;
        }
        if (z) {
            throw new IllegalStateException("closed");
        }
        c34524OooO0Oo.getClass();
        c34524OooO0Oo.o000OOo0(C34522OooO0O0.OooO0OO(value));
        c34540OooOo0.o000000();
        int bytesRead = (int) deflater.getBytesRead();
        if (c34540OooOo0.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        c34524OooO0Oo.getClass();
        c34524OooO0Oo.o000OOo0(C34522OooO0O0.OooO0OO(bytesRead));
        c34540OooOo0.o000000();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            c34540OooOo0.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f123744OooOoO = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
    public final void flush() throws IOException {
        this.f123745OooOoO0.flush();
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public final C34547OooOoo timeout() {
        return this.f123743OooOo0o.f123767OooOo0o.timeout();
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public final void write(C34524OooO0Oo source, long j) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return;
        }
        C34543OooOo0o c34543OooOo0o = source.f123724OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
            this.f123746OooOoOO.update(c34543OooOo0o.f123780OooO00o, c34543OooOo0o.f123781OooO0O0, iMin);
            j2 -= (long) iMin;
            c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        }
        this.f123745OooOoO0.write(source, j);
    }
}
