package p619oO;

import Oooo0oO.o0Oo0oo;
import oO0oO0Oo.C34032OooOo0O;
import p619oO.OooOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f113644OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C31895OooO0oo f113645OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public byte[] f113646OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f113647OooO0Oo;

    public OooOO0O(OooOOO0 oooOOO0) {
        if (oooOOO0 == null) {
            throw new NullPointerException("params == null");
        }
        this.f113644OooO00o = oooOOO0;
        C34032OooOo0O c34032OooOo0O = oooOOO0.f113654OooO0Oo;
        int i = oooOOO0.f113651OooO00o;
        this.f113645OooO0O0 = new C31895OooO0oo(i, c34032OooOo0O);
        this.f113646OooO0OO = new byte[i];
        this.f113647OooO0Oo = new byte[i];
    }

    public final byte[] OooO00o(byte[] bArr, int i, OooOO0 oooOO02) {
        OooOOO0 oooOOO0 = this.f113644OooO00o;
        int i2 = oooOOO0.f113651OooO00o;
        if (bArr.length != i2) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i2, "startHash needs to be ", "bytes"));
        }
        oooOO02.OooO00o();
        if (i > oooOOO0.f113652OooO0O0 - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i == 0) {
            return bArr;
        }
        byte[] bArrOooO00o = OooO00o(bArr, i - 1, oooOO02);
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
        oooO00o.f113660OooO0O0 = oooOO02.f113655OooO00o;
        oooO00o.f113661OooO0OO = oooOO02.f113656OooO0O0;
        oooO00o.f113642OooO0o0 = oooOO02.f113639OooO0o0;
        oooO00o.f113641OooO0o = oooOO02.f113638OooO0o;
        oooO00o.f113643OooO0oO = i - 1;
        oooO00o.f113662OooO0Oo = 0;
        OooOO0 oooOO03 = new OooOO0(oooO00o);
        byte[] bArr2 = this.f113647OooO0Oo;
        byte[] bArrOooO00o2 = oooOO03.OooO00o();
        C31895OooO0oo c31895OooO0oo = this.f113645OooO0O0;
        byte[] bArrOooO00o3 = c31895OooO0oo.OooO00o(bArr2, bArrOooO00o2);
        OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o();
        oooO00o2.f113660OooO0O0 = oooOO03.f113655OooO00o;
        oooO00o2.f113661OooO0OO = oooOO03.f113656OooO0O0;
        oooO00o2.f113642OooO0o0 = oooOO03.f113639OooO0o0;
        oooO00o2.f113641OooO0o = oooOO03.f113638OooO0o;
        oooO00o2.f113643OooO0oO = oooOO03.f113640OooO0oO;
        oooO00o2.f113662OooO0Oo = 1;
        byte[] bArrOooO00o4 = c31895OooO0oo.OooO00o(this.f113647OooO0Oo, new OooOO0(oooO00o2).OooO00o());
        byte[] bArr3 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr3[i3] = (byte) (bArrOooO00o[i3] ^ bArrOooO00o4[i3]);
        }
        int length = bArrOooO00o3.length;
        int i4 = c31895OooO0oo.f113637OooO0O0;
        if (length != i4) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i2 == i4) {
            return c31895OooO0oo.OooO0O0(0, bArrOooO00o3, bArr3);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    public final OooOOO OooO0O0(OooOO0 oooOO02) {
        OooOOO0 oooOOO0 = this.f113644OooO00o;
        byte[][] bArr = new byte[oooOOO0.f113653OooO0OO][];
        int i = 0;
        while (true) {
            int i2 = oooOOO0.f113653OooO0OO;
            if (i >= i2) {
                return new OooOOO(oooOOO0, bArr);
            }
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
            oooO00o.f113660OooO0O0 = oooOO02.f113655OooO00o;
            oooO00o.f113661OooO0OO = oooOO02.f113656OooO0O0;
            oooO00o.f113642OooO0o0 = oooOO02.f113639OooO0o0;
            oooO00o.f113641OooO0o = i;
            oooO00o.f113643OooO0oO = oooOO02.f113640OooO0oO;
            oooO00o.f113662OooO0Oo = oooOO02.f113658OooO0Oo;
            oooOO02 = new OooOO0(oooO00o);
            if (i < 0 || i >= i2) {
                break;
            }
            bArr[i] = OooO00o(this.f113645OooO0O0.OooO00o(this.f113646OooO0OO, C31904OooOoO.OooO0oo(32, i)), oooOOO0.f113652OooO0O0 - 1, oooOO02);
            i++;
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    public final byte[] OooO0OO(byte[] bArr, OooOO0 oooOO02) {
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
        oooO00o.f113660OooO0O0 = oooOO02.f113655OooO00o;
        oooO00o.f113661OooO0OO = oooOO02.f113656OooO0O0;
        oooO00o.f113642OooO0o0 = oooOO02.f113639OooO0o0;
        return this.f113645OooO0O0.OooO00o(bArr, new OooOO0(oooO00o).OooO00o());
    }

    public final void OooO0Oo(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f113644OooO00o.f113651OooO00o;
        if (length != i) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != i) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.f113646OooO0OO = bArr;
        this.f113647OooO0Oo = bArr2;
    }
}
