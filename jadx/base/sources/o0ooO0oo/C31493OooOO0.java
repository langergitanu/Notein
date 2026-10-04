package o0ooO0oo;

import java.io.IOException;
import o0ooO0o.InterfaceC31461OooO0oO;

/* JADX INFO: renamed from: o0ooO0oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31493OooOO0 implements InterfaceC31494OooOO0O {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC31461OooO0oO f112669OooOo0o;

    public C31493OooOO0(InterfaceC31461OooO0oO interfaceC31461OooO0oO) {
        this.f112669OooOo0o = interfaceC31461OooO0oO;
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final byte[] OooO0oo(int i) throws IOException {
        return this.f112669OooOo0o.OooO0oo(i);
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final boolean OooOOOo() throws IOException {
        return this.f112669OooOo0o.OooOOOo();
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final void OooOo0o(int i, byte[] bArr) throws IOException {
        this.f112669OooOo0o.Ooooo00(i);
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final void Oooo0o(byte[] bArr) throws IOException {
        this.f112669OooOo0o.Ooooo00(bArr.length);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f112669OooOo0o.close();
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final long getPosition() throws IOException {
        return this.f112669OooOo0o.getPosition();
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final void o0000(int i) throws IOException {
        this.f112669OooOo0o.Ooooo00(1);
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final int peek() throws IOException {
        return this.f112669OooOo0o.peek();
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final int read() throws IOException {
        return this.f112669OooOo0o.read();
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final int read(byte[] bArr) throws IOException {
        return this.f112669OooOo0o.read(bArr);
    }

    @Override // o0ooO0oo.InterfaceC31494OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f112669OooOo0o.read(bArr, 0, 10);
    }
}
