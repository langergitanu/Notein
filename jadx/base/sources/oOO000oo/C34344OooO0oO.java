package oOO000oo;

import com.aspose.slides.PatternStyle;
import com.google.common.primitives.SignedBytes;

/* JADX INFO: renamed from: oOO000oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34344OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final short[] f123275OooO00o = new short[128];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f123276OooO0O0;

    static {
        byte[] bArr = new byte[112];
        f123276OooO0O0 = bArr;
        byte[] bArr2 = new byte[128];
        OooO00o(bArr2, 0, 15, (byte) 1);
        OooO00o(bArr2, 16, 31, (byte) 2);
        OooO00o(bArr2, 32, 63, (byte) 3);
        OooO00o(bArr2, 64, 65, (byte) 0);
        OooO00o(bArr2, 66, 95, (byte) 4);
        OooO00o(bArr2, 96, 96, (byte) 5);
        OooO00o(bArr2, 97, 108, (byte) 6);
        OooO00o(bArr2, 109, 109, (byte) 7);
        OooO00o(bArr2, 110, 111, (byte) 6);
        OooO00o(bArr2, 112, 112, (byte) 8);
        OooO00o(bArr2, 113, 115, (byte) 9);
        OooO00o(bArr2, 116, 116, (byte) 10);
        OooO00o(bArr2, 117, 127, (byte) 0);
        OooO00o(bArr, 0, bArr.length - 1, (byte) -2);
        OooO00o(bArr, 8, 11, (byte) -1);
        OooO00o(bArr, 24, 27, (byte) 0);
        OooO00o(bArr, 40, 43, (byte) 16);
        OooO00o(bArr, 58, 59, (byte) 0);
        OooO00o(bArr, 72, 73, (byte) 0);
        OooO00o(bArr, 89, 91, (byte) 16);
        OooO00o(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, PatternStyle.Wave, 16, SignedBytes.MAX_POWER_OF_TWO, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            f123275OooO00o[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
        }
    }

    public static void OooO00o(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }
}
