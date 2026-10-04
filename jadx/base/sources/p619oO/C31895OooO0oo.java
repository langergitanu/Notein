package p619oO;

import oO0oO0Oo.C34032OooOo0O;
import oO0oOoOo.InterfaceC34201OooO0Oo;
import oO0oOoOo.InterfaceC34204OooO0oO;

/* JADX INFO: renamed from: oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31895OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34201OooO0Oo f113636OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f113637OooO0O0;

    public C31895OooO0oo(int i, C34032OooOo0O c34032OooOo0O) {
        if (c34032OooOo0O == null) {
            throw new NullPointerException("digest == null");
        }
        this.f113636OooO00o = OooO0o.OooO00o(c34032OooOo0O);
        this.f113637OooO0O0 = i;
    }

    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f113637OooO0O0) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return OooO0O0(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }

    public final byte[] OooO0O0(int i, byte[] bArr, byte[] bArr2) {
        long j = i;
        int i2 = this.f113637OooO0O0;
        byte[] bArrOooO0oo = C31904OooOoO.OooO0oo(i2, j);
        int length = bArrOooO0oo.length;
        InterfaceC34201OooO0Oo interfaceC34201OooO0Oo = this.f113636OooO00o;
        interfaceC34201OooO0Oo.update(bArrOooO0oo, 0, length);
        interfaceC34201OooO0Oo.update(bArr, 0, bArr.length);
        interfaceC34201OooO0Oo.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[i2];
        if (interfaceC34201OooO0Oo instanceof InterfaceC34204OooO0oO) {
            ((InterfaceC34204OooO0oO) interfaceC34201OooO0Oo).OooO00o(0, i2, bArr3);
            return bArr3;
        }
        interfaceC34201OooO0Oo.doFinal(bArr3, 0);
        return bArr3;
    }
}
