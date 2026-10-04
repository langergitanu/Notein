package oOO000o;

import o0Oo0o00.o0OOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f123238OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f123239OooO0O0;

    public OooO0O0(byte[] bArr) {
        this.f123238OooO00o = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int iOooO0OO = 2;
        int i = ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        this.f123239OooO0O0 = i;
        if (i != 0) {
            int iOooO00o = o0OOO0o.OooO00o(i) >>> 1;
            for (int i2 = 0; i2 < iOooO00o; i2++) {
                iOooO0OO = o0OOO0o.OooO0OO(iOooO0OO, iOooO0OO, i);
                int i3 = iOooO0OO ^ 2;
                int i4 = i;
                while (i4 != 0) {
                    int iOooO0Oo = o0OOO0o.OooO0Oo(i3, i4);
                    i3 = i4;
                    i4 = iOooO0Oo;
                }
                if (i3 == 1) {
                }
            }
            this.f123238OooO00o = o0OOO0o.OooO00o(this.f123239OooO0O0);
            return;
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }

    public final int OooO00o(int i) {
        int i2 = (1 << this.f123238OooO00o) - 2;
        if (i2 != 0) {
            if (i == 0) {
                return 0;
            }
            if (i != 1) {
                if (i2 < 0) {
                    i = OooO00o(i);
                    i2 = -i2;
                }
                int iOooO0OO = 1;
                while (i2 != 0) {
                    int i3 = i2 & 1;
                    int i4 = this.f123239OooO0O0;
                    if (i3 == 1) {
                        iOooO0OO = o0OOO0o.OooO0OO(iOooO0OO, i, i4);
                    }
                    i = o0OOO0o.OooO0OO(i, i, i4);
                    i2 >>>= 1;
                }
                return iOooO0OO;
            }
        }
        return 1;
    }

    public final boolean OooO0O0(int i) {
        int i2 = this.f123238OooO00o;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof OooO0O0)) {
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (this.f123238OooO00o == oooO0O0.f123238OooO00o && this.f123239OooO0O0 == oooO0O0.f123239OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f123239OooO0O0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Finite Field GF(2^");
        sb.append(this.f123238OooO00o);
        sb.append(") = GF(2)[X]/<");
        int i = this.f123239OooO0O0;
        if (i == 0) {
            str = "0";
        } else {
            String str2 = ((byte) (i & 1)) == 1 ? "1" : "";
            int i2 = i >>> 1;
            int i3 = 1;
            while (i2 != 0) {
                if (((byte) (i2 & 1)) == 1) {
                    str2 = str2 + "+x^" + i3;
                }
                i2 >>>= 1;
                i3++;
            }
            str = str2;
        }
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "> ");
    }
}
