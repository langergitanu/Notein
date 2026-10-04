package o0ooO0oo;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: renamed from: o0ooO0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31488OooO0Oo implements InterfaceC31494OooOO0O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f112658OooOo = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final PushbackInputStream f112659OooOo0o;

    public C31488OooO0Oo(InputStream inputStream) {
        this.f112659OooOo0o = new PushbackInputStream(inputStream, 32767);
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final byte[] OooO0oo(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        do {
            int i3 = read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new EOFException();
            }
            i2 += i3;
        } while (i2 < i);
        return bArr;
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final boolean OooOOOo() throws IOException {
        return peek() == -1;
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final void OooOo0o(int i, byte[] bArr) throws IOException {
        this.f112659OooOo0o.unread(bArr, 0, i);
        this.f112658OooOo -= i;
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final void Oooo0o(byte[] bArr) throws IOException {
        this.f112659OooOo0o.unread(bArr);
        this.f112658OooOo -= bArr.length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f112659OooOo0o.close();
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final long getPosition() throws IOException {
        return this.f112658OooOo;
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final void o0000(int i) throws IOException {
        this.f112659OooOo0o.unread(i);
        this.f112658OooOo--;
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final int peek() throws IOException {
        PushbackInputStream pushbackInputStream = this.f112659OooOo0o;
        int i = pushbackInputStream.read();
        if (i != -1) {
            pushbackInputStream.unread(i);
        }
        return i;
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final int read() throws IOException {
        int i = this.f112659OooOo0o.read();
        this.f112658OooOo++;
        return i;
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final int read(byte[] bArr) throws IOException {
        int i = this.f112659OooOo0o.read(bArr);
        if (i <= 0) {
            return -1;
        }
        this.f112658OooOo += i;
        return i;
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f112659OooOo0o.read(bArr, i, i2);
        if (i3 <= 0) {
            return -1;
        }
        this.f112658OooOo += i3;
        return i3;
    }
}
