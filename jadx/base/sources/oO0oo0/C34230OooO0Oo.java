package oO0oo0;

import oO0oOoo.C34205OooO00o;
import oO0oo0O0.C34243OooO00o;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34230OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34205OooO00o f122944OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f122945OooO0O0;

    public C34230OooO0Oo(C34205OooO00o c34205OooO00o, byte[] bArr) {
        this.f122944OooO00o = c34205OooO00o;
        this.f122945OooO0O0 = bArr;
    }

    public final C34243OooO00o OooO00o(C34227OooO00o c34227OooO00o) {
        C34243OooO00o c34243OooO00o = new C34243OooO00o();
        c34243OooO00o.f122991OooO0oo = 0L;
        c34243OooO00o.f122984OooO00o = c34227OooO00o;
        c34243OooO00o.f122985OooO0O0 = this.f122944OooO00o;
        c34243OooO00o.f122986OooO0OO = 256;
        c34243OooO00o.f122989OooO0o0 = 256;
        c34243OooO00o.f122987OooO0Oo = 384;
        c34227OooO00o.getClass();
        byte[] bArrOooO00o = c34243OooO00o.OooO00o(384, C34332OooO00o.OooO0OO(c34243OooO00o.OooO0o(), this.f122945OooO0O0));
        byte[] bArr = new byte[32];
        c34243OooO00o.f122988OooO0o = bArr;
        byte[] bArr2 = new byte[16];
        c34243OooO00o.f122990OooO0oO = bArr2;
        c34243OooO00o.OooO0O0(bArrOooO00o, bArr, bArr2);
        c34243OooO00o.f122991OooO0oo = 1L;
        return c34243OooO00o;
    }
}
