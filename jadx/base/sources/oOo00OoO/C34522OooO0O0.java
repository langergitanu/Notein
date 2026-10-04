package oOo00OoO;

import o00oO0O.o0OoOo0;
import oOo00OoO.C34524OooO0Oo;
import ooOOoOOO.C35147OooO0O0;

/* JADX INFO: renamed from: oOo00OoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34522OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34524OooO0Oo.OooO00o f123717OooO00o = new C34524OooO0Oo.OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f123718OooO0O0 = -1234567890;

    public static final boolean OooO00o(int i, int i2, int i3, byte[] a, byte[] b) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(a, "a");
        kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a[i4 + i] != b[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void OooO0O0(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "size=", " offset=");
            sbOooO00o.append(j2);
            sbOooO00o.append(" byteCount=");
            sbOooO00o.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbOooO00o.toString());
        }
    }

    public static final int OooO0OO(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final String OooO0Oo(byte b) {
        char[] cArr = C35147OooO0O0.f126203OooO00o;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }
}
