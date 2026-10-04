package oO0OO0OO;

import Oooo0oO.o0Oo0oo;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import oO000Oo.InterfaceC32047o0000oO;
import oOo00OoO.C34522OooO0O0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34539OooOo;
import oOo00OoO.C34543OooOo0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 extends oO000Oo.OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34524OooO0Oo f118735OooOo0o;

    public OooOOO0(C34524OooO0Oo c34524OooO0Oo) {
        this.f118735OooOo0o = c34524OooO0Oo;
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final int OooO0O0() {
        return (int) this.f118735OooOo0o.f123723OooOo;
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final InterfaceC32047o0000oO OooOo0O(int i) {
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        c34524OooO0Oo.write(this.f118735OooOo0o, i);
        return new OooOOO0(c34524OooO0Oo);
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final void Oooo0oO(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // oO000Oo.OooO0O0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.f118735OooOo0o.OooO00o();
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final void o0000o(int i, int i2, byte[] bArr) {
        while (i2 > 0) {
            int i3 = this.f118735OooOo0o.read(bArr, i, i2);
            if (i3 == -1) {
                throw new IndexOutOfBoundsException(o0Oo0oo.OooO0O0(i2, "EOF trying to read ", " bytes"));
            }
            i2 -= i3;
            i += i3;
        }
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final void o000O0(OutputStream out, int i) throws IOException {
        long j = i;
        C34524OooO0Oo c34524OooO0Oo = this.f118735OooOo0o;
        c34524OooO0Oo.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(out, "out");
        C34522OooO0O0.OooO0O0(c34524OooO0Oo.f123723OooOo, 0L, j);
        C34543OooOo0o c34543OooOo0o = c34524OooO0Oo.f123724OooOo0o;
        while (j > 0) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            int iMin = (int) Math.min(j, c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
            out.write(c34543OooOo0o.f123780OooO00o, c34543OooOo0o.f123781OooO0O0, iMin);
            int i2 = c34543OooOo0o.f123781OooO0O0 + iMin;
            c34543OooOo0o.f123781OooO0O0 = i2;
            long j2 = iMin;
            c34524OooO0Oo.f123723OooOo -= j2;
            j -= j2;
            if (i2 == c34543OooOo0o.f123782OooO0OO) {
                C34543OooOo0o c34543OooOo0oOooO00o = c34543OooOo0o.OooO00o();
                c34524OooO0Oo.f123724OooOo0o = c34543OooOo0oOooO00o;
                C34539OooOo.OooO00o(c34543OooOo0o);
                c34543OooOo0o = c34543OooOo0oOooO00o;
            }
        }
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final int readUnsignedByte() {
        try {
            return this.f118735OooOo0o.readByte() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final void skipBytes(int i) {
        try {
            this.f118735OooOo0o.skip(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
