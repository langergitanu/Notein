package o00o000O;

import androidx.fragment.app.C21929Ooooo0o;
import o00OooO.InterfaceC25145OooOo0o;

/* JADX INFO: renamed from: o00o000O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25242OooO0O0 implements InterfaceC25145OooOo0o<byte[]> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f85964OooOo0o;

    public C25242OooO0O0(byte[] bArr) {
        C21929Ooooo0o.OooO0OO(bArr, "Argument must not be null");
        this.f85964OooOo0o = bArr;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Class<byte[]> OooO00o() {
        return byte[].class;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final byte[] get() {
        return this.f85964OooOo0o;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final int getSize() {
        return this.f85964OooOo0o.length;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final void recycle() {
    }
}
