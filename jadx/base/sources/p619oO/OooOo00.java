package p619oO;

import OooOOO0.AbstractC20449OooO0Oo;
import java.io.IOException;
import oOO000oO.InterfaceC34334OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00 extends C31899OooOOo0 implements InterfaceC34334OooO0OO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f113701OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C31898OooOOo f113702OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final byte[] f113703OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final byte[] f113704OooOoo0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C31898OooOOo f113705OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public byte[] f113706OooO0O0 = null;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public byte[] f113707OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte[] f113708OooO0Oo = null;

        public OooO00o(C31898OooOOo c31898OooOOo) {
            this.f113705OooO00o = c31898OooOOo;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OooOo00(OooO00o oooO00o) {
        C31898OooOOo c31898OooOOo = oooO00o.f113705OooO00o;
        C31903OooOo0o c31903OooOo0o = c31898OooOOo.f113666OooO0O0;
        super(c31903OooOo0o.f113715OooO0o0);
        this.f113702OooOoO0 = c31898OooOOo;
        byte[] bArr = oooO00o.f113708OooO0Oo;
        int i = c31903OooOo0o.f113714OooO0o;
        if (bArr != null) {
            if (bArr.length == i + i) {
                this.f113701OooOoO = 0;
                this.f113703OooOoOO = C31904OooOoO.OooO0o(0, i, bArr);
                this.f113704OooOoo0 = C31904OooOoO.OooO0o(i, i, bArr);
                return;
            } else {
                int i2 = i + 4;
                if (bArr.length != i2 + i) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f113701OooOoO = AbstractC20449OooO0Oo.OooO0oo(0, bArr);
                this.f113703OooOoOO = C31904OooOoO.OooO0o(4, i, bArr);
                this.f113704OooOoo0 = C31904OooOoO.OooO0o(i2, i, bArr);
                return;
            }
        }
        C31892OooO0Oo c31892OooO0Oo = c31898OooOOo.f113665OooO00o;
        if (c31892OooO0Oo != null) {
            this.f113701OooOoO = c31892OooO0Oo.f113625OooO00o;
        } else {
            this.f113701OooOoO = 0;
        }
        byte[] bArr2 = oooO00o.f113706OooO0O0;
        if (bArr2 == null) {
            this.f113703OooOoOO = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f113703OooOoOO = bArr2;
        }
        byte[] bArr3 = oooO00o.f113707OooO0OO;
        if (bArr3 == null) {
            this.f113704OooOoo0 = new byte[i];
        } else {
            if (bArr3.length != i) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f113704OooOoo0 = bArr3;
        }
    }

    public final byte[] OooO0Oo() {
        byte[] bArr;
        int i = this.f113702OooOoO0.f113666OooO0O0.f113714OooO0o;
        int i2 = 0;
        int i3 = this.f113701OooOoO;
        if (i3 != 0) {
            bArr = new byte[i + 4 + i];
            AbstractC20449OooO0Oo.OooOoo(i3, 0, bArr);
            i2 = 4;
        } else {
            bArr = new byte[i + i];
        }
        C31904OooOoO.OooO0Oo(i2, bArr, this.f113703OooOoOO);
        C31904OooOoO.OooO0Oo(i2 + i, bArr, this.f113704OooOoo0);
        return bArr;
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        return OooO0Oo();
    }
}
