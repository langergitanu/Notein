package com.huawei.hms.network.embedded;

import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.network.embedded.C18261lb;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.fb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18177fb {

    /* JADX INFO: renamed from: a */
    public static final String f54841a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* JADX INFO: renamed from: b */
    public static final int f54842b = 128;

    /* JADX INFO: renamed from: c */
    public static final int f54843c = 64;

    /* JADX INFO: renamed from: d */
    public static final int f54844d = 32;

    /* JADX INFO: renamed from: e */
    public static final int f54845e = 16;

    /* JADX INFO: renamed from: f */
    public static final int f54846f = 15;

    /* JADX INFO: renamed from: g */
    public static final int f54847g = 8;

    /* JADX INFO: renamed from: h */
    public static final int f54848h = 128;

    /* JADX INFO: renamed from: i */
    public static final int f54849i = 127;

    /* JADX INFO: renamed from: j */
    public static final int f54850j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f54851k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f54852l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f54853m = 8;

    /* JADX INFO: renamed from: n */
    public static final int f54854n = 9;

    /* JADX INFO: renamed from: o */
    public static final int f54855o = 10;

    /* JADX INFO: renamed from: p */
    public static final long f54856p = 125;

    /* JADX INFO: renamed from: q */
    public static final long f54857q = 123;

    /* JADX INFO: renamed from: r */
    public static final int f54858r = 126;

    /* JADX INFO: renamed from: s */
    public static final long f54859s = 65535;

    /* JADX INFO: renamed from: t */
    public static final int f54860t = 127;

    /* JADX INFO: renamed from: u */
    public static final int f54861u = 1001;

    /* JADX INFO: renamed from: v */
    public static final int f54862v = 1005;

    public C18177fb() {
        throw new AssertionError("No instances.");
    }

    /* JADX INFO: renamed from: a */
    public static String m78504a(int i) {
        if (i < 1000 || i >= 5000) {
            return C21532OooOOo.OooO0OO(i, "Code must be in range [1000,5000): ");
        }
        if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        }
        return o0Oo0oo.OooO0O0(i, "Code ", " is reserved and may not be used.");
    }

    /* JADX INFO: renamed from: b */
    public static void m78507b(int i) {
        String strM78504a = m78504a(i);
        if (strM78504a != null) {
            throw new IllegalArgumentException(strM78504a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m78505a(String str) {
        return C18303ob.m79299d(str + f54841a).mo78734g().mo78727b();
    }

    /* JADX INFO: renamed from: a */
    public static void m78506a(C18261lb.c cVar, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = cVar.f55638e;
            int i2 = cVar.f55639f;
            int i3 = cVar.f55640g;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (cVar.m79106s() != -1);
    }
}
