package com.huawei.hms.network.embedded;

import java.nio.charset.Charset;
import o00oO0O.o0OoOo0;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.mc */
/* JADX INFO: loaded from: classes9.dex */
public final class C18276mc {

    /* JADX INFO: renamed from: a */
    public static final Charset f55722a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static int m79199a(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX INFO: renamed from: b */
    public static <T extends Throwable> void m79205b(Throwable th) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public static long m79200a(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    /* JADX INFO: renamed from: a */
    public static short m79201a(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    /* JADX INFO: renamed from: a */
    public static void m79202a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "size=", " offset=");
            sbOooO00o.append(j2);
            sbOooO00o.append(" byteCount=");
            sbOooO00o.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbOooO00o.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m79203a(Throwable th) throws Throwable {
        m79205b(th);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79204a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
