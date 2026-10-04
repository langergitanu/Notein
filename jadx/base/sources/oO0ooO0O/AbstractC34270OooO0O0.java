package oO0ooO0O;

import java.math.BigInteger;

/* JADX INFO: renamed from: oO0ooO0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34270OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34273OooO0o0 f123048OooO00o = new C34273OooO0o0(BigInteger.valueOf(2));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C34273OooO0o0 f123049OooO0O0 = new C34273OooO0o0(BigInteger.valueOf(3));

    public static C34272OooO0Oo OooO00o(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] <= iArr[i - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be monotonically increasing");
            }
        }
        return new C34272OooO0Oo(f123048OooO00o, new C34271OooO0OO(iArr));
    }
}
