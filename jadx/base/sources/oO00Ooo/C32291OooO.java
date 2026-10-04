package oO00Ooo;

import java.util.Arrays;

/* JADX INFO: renamed from: oO00Ooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32291OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f116175OooO00o;

    static {
        char[] cArr = new char[512];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | 256] = "0123456789abcdef".charAt(i & 15);
        }
        f116175OooO00o = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < 16; i2++) {
            bArr["0123456789abcdef".charAt(i2)] = (byte) i2;
        }
    }

    public static void OooO00o(byte b, char[] cArr, int i) {
        int i2 = b & 255;
        char[] cArr2 = f116175OooO00o;
        cArr[i] = cArr2[i2];
        cArr[i + 1] = cArr2[i2 | 256];
    }

    public static void OooO0O0(char[] cArr, int i) {
        OooO00o((byte) 0, cArr, i);
        OooO00o((byte) 0, cArr, i + 2);
        OooO00o((byte) 0, cArr, i + 4);
        OooO00o((byte) 0, cArr, i + 6);
        OooO00o((byte) 0, cArr, i + 8);
        OooO00o((byte) 0, cArr, i + 10);
        OooO00o((byte) 0, cArr, i + 12);
        OooO00o((byte) 0, cArr, i + 14);
    }
}
