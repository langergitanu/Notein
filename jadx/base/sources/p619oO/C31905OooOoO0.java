package p619oO;

import OooOOO0.AbstractC20449OooO0Oo;
import java.io.IOException;
import oOO000oO.InterfaceC34334OooO0OO;

/* JADX INFO: renamed from: oO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31905OooOoO0 extends C31897OooOOOo implements InterfaceC34334OooO0OO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f113720OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C31903OooOo0o f113721OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final byte[] f113722OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final byte[] f113723OooOoo0;

    /* JADX INFO: renamed from: oO.OooOoO0$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C31903OooOo0o f113724OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public byte[] f113725OooO0O0 = null;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public byte[] f113726OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte[] f113727OooO0Oo = null;

        public OooO00o(C31903OooOo0o c31903OooOo0o) {
            this.f113724OooO00o = c31903OooOo0o;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31905OooOoO0(OooO00o oooO00o) {
        C31903OooOo0o c31903OooOo0o = oooO00o.f113724OooO00o;
        super(c31903OooOo0o.f113715OooO0o0);
        this.f113721OooOoO0 = c31903OooOo0o;
        byte[] bArr = oooO00o.f113727OooO0Oo;
        int i = c31903OooOo0o.f113714OooO0o;
        if (bArr != null) {
            if (bArr.length == i + i) {
                this.f113720OooOoO = 0;
                this.f113722OooOoOO = C31904OooOoO.OooO0o(0, i, bArr);
                this.f113723OooOoo0 = C31904OooOoO.OooO0o(i, i, bArr);
                return;
            } else {
                int i2 = i + 4;
                if (bArr.length != i2 + i) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f113720OooOoO = AbstractC20449OooO0Oo.OooO0oo(0, bArr);
                this.f113722OooOoOO = C31904OooOoO.OooO0o(4, i, bArr);
                this.f113723OooOoo0 = C31904OooOoO.OooO0o(i2, i, bArr);
                return;
            }
        }
        C31893OooO0o0 c31893OooO0o0 = c31903OooOo0o.f113710OooO00o;
        if (c31893OooO0o0 != null) {
            this.f113720OooOoO = c31893OooO0o0.f113630OooO00o;
        } else {
            this.f113720OooOoO = 0;
        }
        byte[] bArr2 = oooO00o.f113725OooO0O0;
        if (bArr2 == null) {
            this.f113722OooOoOO = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f113722OooOoOO = bArr2;
        }
        byte[] bArr3 = oooO00o.f113726OooO0OO;
        if (bArr3 == null) {
            this.f113723OooOoo0 = new byte[i];
        } else {
            if (bArr3.length != i) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f113723OooOoo0 = bArr3;
        }
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        byte[] bArr;
        int i = this.f113721OooOoO0.f113714OooO0o;
        int i2 = 0;
        int i3 = this.f113720OooOoO;
        if (i3 != 0) {
            bArr = new byte[i + 4 + i];
            AbstractC20449OooO0Oo.OooOoo(i3, 0, bArr);
            i2 = 4;
        } else {
            bArr = new byte[i + i];
        }
        C31904OooOoO.OooO0Oo(i2, bArr, this.f113722OooOoOO);
        C31904OooOoO.OooO0Oo(i2 + i, bArr, this.f113723OooOoo0);
        return bArr;
    }
}
