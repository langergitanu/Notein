package oOo00OoO;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: oOo00OoO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34538OooOOoo implements InterfaceC34544OooOoO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34547OooOoo f123761OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OutputStream f123762OooOo0o;

    public C34538OooOOoo(OutputStream outputStream, C34547OooOoo c34547OooOoo) {
        this.f123762OooOo0o = outputStream;
        this.f123761OooOo = c34547OooOoo;
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f123762OooOo0o.close();
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
    public final void flush() throws IOException {
        this.f123762OooOo0o.flush();
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public final C34547OooOoo timeout() {
        return this.f123761OooOo;
    }

    public final String toString() {
        return "sink(" + this.f123762OooOo0o + ')';
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public final void write(C34524OooO0Oo source, long j) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        C34522OooO0O0.OooO0O0(source.f123723OooOo, 0L, j);
        while (j > 0) {
            this.f123761OooOo.throwIfReached();
            C34543OooOo0o c34543OooOo0o = source.f123724OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            int iMin = (int) Math.min(j, c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
            this.f123762OooOo0o.write(c34543OooOo0o.f123780OooO00o, c34543OooOo0o.f123781OooO0O0, iMin);
            int i = c34543OooOo0o.f123781OooO0O0 + iMin;
            c34543OooOo0o.f123781OooO0O0 = i;
            long j2 = iMin;
            j -= j2;
            source.f123723OooOo -= j2;
            if (i == c34543OooOo0o.f123782OooO0OO) {
                source.f123724OooOo0o = c34543OooOo0o.OooO00o();
                C34539OooOo.OooO00o(c34543OooOo0o);
            }
        }
    }
}
