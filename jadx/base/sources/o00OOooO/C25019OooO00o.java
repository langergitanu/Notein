package o00OOooO;

import com.aspose.words.StyleIdentifier;
import com.google.common.primitives.UnsignedBytes;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: o00OOooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25019OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f84951OooO00o = new byte[128];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final char[] f84952OooO0O0 = new char[64];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            f84951OooO00o[i2] = -1;
        }
        for (int i3 = 90; i3 >= 65; i3--) {
            f84951OooO00o[i3] = (byte) (i3 - 65);
        }
        for (int i4 = 122; i4 >= 97; i4--) {
            f84951OooO00o[i4] = (byte) (i4 - 71);
        }
        for (int i5 = 57; i5 >= 48; i5--) {
            f84951OooO00o[i5] = (byte) (i5 + 4);
        }
        byte[] bArr = f84951OooO00o;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i6 = 0; i6 <= 25; i6++) {
            f84952OooO0O0[i6] = (char) (i6 + 65);
        }
        int i7 = 26;
        int i8 = 0;
        while (i7 <= 51) {
            f84952OooO0O0[i7] = (char) (i8 + 97);
            i7++;
            i8++;
        }
        int i9 = 52;
        while (i9 <= 61) {
            f84952OooO0O0[i9] = (char) (i + 48);
            i9++;
            i++;
        }
        char[] cArr = f84952OooO0O0;
        cArr[62] = '+';
        cArr[63] = IOUtils.DIR_SEPARATOR_UNIX;
    }

    public static String OooO00o(byte[] bArr) {
        char[] cArr;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i = length % 24;
        int i2 = length / 24;
        char[] cArr2 = new char[(i != 0 ? i2 + 1 : i2) * 4];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            cArr = f84952OooO0O0;
            if (i3 >= i2) {
                break;
            }
            byte b = bArr[i4];
            int i6 = i4 + 2;
            byte b2 = bArr[i4 + 1];
            i4 += 3;
            byte b3 = bArr[i6];
            byte b4 = (byte) (b2 & 15);
            byte b5 = (byte) (b & 3);
            int i7 = b & UnsignedBytes.MAX_POWER_OF_TWO;
            int i8 = b >> 2;
            if (i7 != 0) {
                i8 ^= 192;
            }
            byte b6 = (byte) i8;
            int i9 = b2 & UnsignedBytes.MAX_POWER_OF_TWO;
            int i10 = b2 >> 4;
            if (i9 != 0) {
                i10 ^= 240;
            }
            byte b7 = (byte) i10;
            byte b8 = (byte) ((b3 & UnsignedBytes.MAX_POWER_OF_TWO) == 0 ? b3 >> 6 : (b3 >> 6) ^ StyleIdentifier.MEDIUM_LIST_2_ACCENT_6);
            cArr2[i5] = cArr[b6];
            cArr2[i5 + 1] = cArr[b7 | (b5 << 4)];
            int i11 = i5 + 3;
            cArr2[i5 + 2] = cArr[(b4 << 2) | b8];
            i5 += 4;
            cArr2[i11] = cArr[b3 & 63];
            i3++;
        }
        if (i == 8) {
            byte b9 = bArr[i4];
            byte b10 = (byte) (b9 & 3);
            int i12 = b9 & UnsignedBytes.MAX_POWER_OF_TWO;
            int i13 = b9 >> 2;
            if (i12 != 0) {
                i13 ^= 192;
            }
            cArr2[i5] = cArr[(byte) i13];
            cArr2[i5 + 1] = cArr[b10 << 4];
            cArr2[i5 + 2] = '=';
            cArr2[i5 + 3] = '=';
        } else if (i == 16) {
            byte b11 = bArr[i4];
            byte b12 = bArr[i4 + 1];
            byte b13 = (byte) (b12 & 15);
            byte b14 = (byte) (b11 & 3);
            int i14 = b11 & UnsignedBytes.MAX_POWER_OF_TWO;
            int i15 = b11 >> 2;
            if (i14 != 0) {
                i15 ^= 192;
            }
            byte b15 = (byte) i15;
            int i16 = b12 & UnsignedBytes.MAX_POWER_OF_TWO;
            int i17 = b12 >> 4;
            if (i16 != 0) {
                i17 ^= 240;
            }
            byte b16 = (byte) i17;
            cArr2[i5] = cArr[b15];
            cArr2[i5 + 1] = cArr[b16 | (b14 << 4)];
            cArr2[i5 + 2] = cArr[b13 << 2];
            cArr2[i5 + 3] = '=';
        }
        return new String(cArr2);
    }

    public static boolean OooO0O0(char c) {
        return c < 128 && f84951OooO00o[c] != -1;
    }

    public static byte[] OooO0OO(String str) {
        int i;
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            i = 0;
        } else {
            i = 0;
            for (char c : charArray) {
                if (c != ' ' && c != '\r' && c != '\n' && c != '\t') {
                    charArray[i] = c;
                    i++;
                }
            }
        }
        if (i % 4 != 0) {
            return null;
        }
        int i2 = i / 4;
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i2 * 3];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i2 - 1;
            byte[] bArr2 = f84951OooO00o;
            if (i3 >= i6) {
                int i7 = i4 + 1;
                char c2 = charArray[i4];
                if (!OooO0O0(c2)) {
                    return null;
                }
                int i8 = i4 + 2;
                char c3 = charArray[i7];
                if (!OooO0O0(c3)) {
                    return null;
                }
                byte b = bArr2[c2];
                byte b2 = bArr2[c3];
                char c4 = charArray[i8];
                char c5 = charArray[i4 + 3];
                if (OooO0O0(c4) && OooO0O0(c5)) {
                    byte b3 = bArr2[c4];
                    byte b4 = bArr2[c5];
                    bArr[i5] = (byte) ((b << 2) | (b2 >> 4));
                    bArr[i5 + 1] = (byte) (((b2 & 15) << 4) | ((b3 >> 2) & 15));
                    bArr[i5 + 2] = (byte) (b4 | (b3 << 6));
                    return bArr;
                }
                if (c4 == '=' && c5 == '=') {
                    if ((b2 & 15) != 0) {
                        return null;
                    }
                    int i9 = i3 * 3;
                    byte[] bArr3 = new byte[i9 + 1];
                    System.arraycopy(bArr, 0, bArr3, 0, i9);
                    bArr3[i5] = (byte) ((b << 2) | (b2 >> 4));
                    return bArr3;
                }
                if (c4 == '=' || c5 != '=') {
                    return null;
                }
                byte b5 = bArr2[c4];
                if ((b5 & 3) != 0) {
                    return null;
                }
                int i10 = i3 * 3;
                byte[] bArr4 = new byte[i10 + 2];
                System.arraycopy(bArr, 0, bArr4, 0, i10);
                bArr4[i5] = (byte) ((b << 2) | (b2 >> 4));
                bArr4[i5 + 1] = (byte) (((b5 >> 2) & 15) | ((b2 & 15) << 4));
                return bArr4;
            }
            int i11 = i4 + 1;
            char c6 = charArray[i4];
            if (!OooO0O0(c6)) {
                return null;
            }
            int i12 = i4 + 2;
            char c7 = charArray[i11];
            if (!OooO0O0(c7)) {
                return null;
            }
            int i13 = i4 + 3;
            char c8 = charArray[i12];
            if (!OooO0O0(c8)) {
                return null;
            }
            i4 += 4;
            char c9 = charArray[i13];
            if (!OooO0O0(c9)) {
                return null;
            }
            byte b6 = bArr2[c6];
            byte b7 = bArr2[c7];
            byte b8 = bArr2[c8];
            byte b9 = bArr2[c9];
            bArr[i5] = (byte) ((b6 << 2) | (b7 >> 4));
            int i14 = i5 + 2;
            bArr[i5 + 1] = (byte) (((b7 & 15) << 4) | ((b8 >> 2) & 15));
            i5 += 3;
            bArr[i14] = (byte) ((b8 << 6) | b9);
            i3++;
        }
    }
}
