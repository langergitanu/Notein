package oO0oOoO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0oo.C34089OooO0o0;
import oO0oOOoo.C34135OooO0OO;
import oO0oOo.C34140OooO0o0;
import oO0oOo0.C34146OooO0o;
import oO0oOo0.C34150OooOO0;
import oO0oOo0.C34151OooOO0O;
import oO0oOo0.C34162OooOo00;
import oO0oOo0.C34163OooOo0O;
import oOO000oO.C34332OooO00o;
import oOO000oO.InterfaceC34337OooO0o0;

/* JADX INFO: renamed from: oO0oOoO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34196OooO0O0 implements InterfaceC34337OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34135OooO0OO f122846OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122847OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final BigInteger f122848OooOoO0;

    public C34196OooO0O0(C34135OooO0OO c34135OooO0OO, BigInteger bigInteger, byte[] bArr) {
        this.f122846OooOo = c34135OooO0OO;
        this.f122848OooOoO0 = bigInteger;
        this.f122847OooOo0o = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oOO000oO.InterfaceC34337OooO0o0
    public final boolean Oooo0(C34140OooO0o0 c34140OooO0o0) {
        byte[] bArr = this.f122847OooOo0o;
        if (c34140OooO0o0 != 0) {
            BigInteger bigInteger = this.f122848OooOoO0;
            if (bigInteger != null) {
                C34146OooO0o c34146OooO0o = c34140OooO0o0.f122681OooOo0o;
                C34089OooO0o0 c34089OooO0o0 = new C34089OooO0o0();
                C34163OooOo0O c34163OooOo0O = c34146OooO0o.f122692OooOo;
                C34135OooO0OO c34135OooO0OO = c34163OooOo0O.f122756OooOoOO;
                c34089OooO0o0.f122487OooOo0o = c34135OooO0OO;
                C34029OooOOo0 c34029OooOOo0 = c34163OooOo0O.f122755OooOoO0;
                c34089OooO0o0.f122486OooOo = c34029OooOOo0;
                if (c34135OooO0OO.equals(this.f122846OooOo) && C34029OooOOo0.OooOo00(c34029OooOOo0.f122348OooOo, c34029OooOOo0.f122349OooOo0o) == bigInteger.intValue() && c34029OooOOo0.OooOOo().equals(bigInteger)) {
                    return true;
                }
            } else if (bArr != null) {
                C34032OooOo0O c34032OooOo0O = C34150OooOO0.f122711OooOoO;
                C34151OooOO0O c34151OooOO0O = c34140OooO0o0.f122680OooOo;
                C34150OooOO0 c34150OooOO0 = c34151OooOO0O != null ? (C34150OooOO0) c34151OooOO0O.f122717OooOo0o.get(c34032OooOo0O) : null;
                if (c34150OooOO0 != null) {
                    return Arrays.equals(bArr, AbstractC34033OooOo0o.OooOOo0(c34150OooOO0.OooO0oo()).f122362OooOo0o);
                }
                C34162OooOo00 c34162OooOo00 = c34140OooO0o0.f122681OooOo0o.f122692OooOo.f122760OooOooo;
                C34195OooO00o c34195OooO00o = new C34195OooO00o();
                c34195OooO00o.f122837OooO00o = new byte[4];
                c34195OooO00o.f122838OooO0O0 = 0;
                c34195OooO00o.f122836OooO = new int[80];
                c34195OooO00o.OooO0OO();
                byte[] bArr2 = new byte[20];
                try {
                    byte[] bArrOooO0oO = c34162OooOo00.OooO0oO();
                    int length = bArrOooO0oO.length;
                    int length2 = 0;
                    while (c34195OooO00o.f122838OooO0O0 != 0 && length > 0) {
                        c34195OooO00o.OooO0Oo(bArrOooO0oO[length2]);
                        length2++;
                        length--;
                    }
                    while (true) {
                        byte[] bArr3 = c34195OooO00o.f122837OooO00o;
                        if (length <= bArr3.length) {
                            break;
                        }
                        c34195OooO00o.OooO0O0(length2, bArrOooO0oO);
                        length2 += bArr3.length;
                        length -= bArr3.length;
                        c34195OooO00o.f122839OooO0OO += (long) bArr3.length;
                    }
                    while (length > 0) {
                        c34195OooO00o.OooO0Oo(bArrOooO0oO[length2]);
                        length2++;
                        length--;
                    }
                    long j = c34195OooO00o.f122839OooO0OO << 3;
                    c34195OooO00o.OooO0Oo(UnsignedBytes.MAX_POWER_OF_TWO);
                    while (c34195OooO00o.f122838OooO0O0 != 0) {
                        c34195OooO00o.OooO0Oo((byte) 0);
                    }
                    if (c34195OooO00o.f122845OooOO0 > 14) {
                        c34195OooO00o.OooO00o();
                    }
                    int[] iArr = c34195OooO00o.f122836OooO;
                    iArr[14] = (int) (j >>> 32);
                    iArr[15] = (int) j;
                    c34195OooO00o.OooO00o();
                    AbstractC20449OooO0Oo.OooOoo(c34195OooO00o.f122840OooO0Oo, 0, bArr2);
                    AbstractC20449OooO0Oo.OooOoo(c34195OooO00o.f122842OooO0o0, 4, bArr2);
                    AbstractC20449OooO0Oo.OooOoo(c34195OooO00o.f122841OooO0o, 8, bArr2);
                    AbstractC20449OooO0Oo.OooOoo(c34195OooO00o.f122843OooO0oO, 12, bArr2);
                    AbstractC20449OooO0Oo.OooOoo(c34195OooO00o.f122844OooO0oo, 16, bArr2);
                    c34195OooO00o.OooO0OO();
                } catch (IOException unused) {
                    bArr2 = new byte[0];
                }
                return Arrays.equals(bArr, bArr2);
            }
        } else if (c34140OooO0o0 instanceof byte[]) {
            return Arrays.equals(bArr, (byte[]) c34140OooO0o0);
        }
        return false;
    }

    public final Object clone() {
        return new C34196OooO0O0(this.f122846OooOo, this.f122848OooOoO0, this.f122847OooOo0o);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34196OooO0O0) {
            C34196OooO0O0 c34196OooO0O0 = (C34196OooO0O0) obj;
            if (Arrays.equals(this.f122847OooOo0o, c34196OooO0O0.f122847OooOo0o)) {
                BigInteger bigInteger = this.f122848OooOoO0;
                BigInteger bigInteger2 = c34196OooO0O0.f122848OooOoO0;
                if (bigInteger != null ? bigInteger.equals(bigInteger2) : bigInteger2 == null) {
                    C34135OooO0OO c34135OooO0OO = this.f122846OooOo;
                    C34135OooO0OO c34135OooO0OO2 = c34196OooO0O0.f122846OooOo;
                    if (c34135OooO0OO != null ? c34135OooO0OO.equals(c34135OooO0OO2) : c34135OooO0OO2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iOooO0o0 = C34332OooO00o.OooO0o0(this.f122847OooOo0o);
        BigInteger bigInteger = this.f122848OooOoO0;
        if (bigInteger != null) {
            iOooO0o0 ^= bigInteger.hashCode();
        }
        C34135OooO0OO c34135OooO0OO = this.f122846OooOo;
        return c34135OooO0OO != null ? iOooO0o0 ^ c34135OooO0OO.hashCode() : iOooO0o0;
    }
}
