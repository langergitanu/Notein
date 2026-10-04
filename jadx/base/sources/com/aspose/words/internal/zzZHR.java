package com.aspose.words.internal;

import Oooo0oO.C21034OooOOOo;
import com.aspose.words.ControlChar;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHR {
    private static final int[] zzZGZ;
    private static final char[] zzZH0;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        zzZH0 = charArray;
        int[] iArr = new int[256];
        zzZGZ = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            zzZGZ[zzZH0[i]] = i;
        }
        zzZGZ[61] = 0;
    }

    private static int zzV(char[] cArr, int i) {
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (i2 < i) {
            long j = ((long) cArr[i2]) & 4294967295L;
            i2++;
            if (j <= 32) {
                i3--;
            } else if (j == 61) {
                i3--;
                i4++;
            }
        }
        if (i4 != 0) {
            if (i4 == 1) {
                i4 = 2;
            } else {
                if (i4 != 2) {
                    throw new NumberFormatException("Format_BadBase64Char");
                }
                i4 = 1;
            }
        }
        return ((i3 / 4) * 3) + i4;
    }

    public static byte[] zzW(char[] cArr, int i) {
        while (i > 0) {
            char c = cArr[i - 1];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                break;
            }
            i--;
        }
        int iZzV = zzV(cArr, i);
        byte[] bArr = new byte[iZzV];
        zzZ(cArr, i, bArr, iZzV);
        return bArr;
    }

    public static String zzX(byte[] bArr, int i, int i2, boolean z) {
        return new String(zzY(bArr, i, i2, false));
    }

    private static char[] zzY(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (bArr == null || bArr.length == 0) {
            return new char[0];
        }
        int i4 = (i2 / 3) * 3;
        int iOooO00o = C21034OooOOOo.OooO00o(i2, 1, 3, 1) << 2;
        int i5 = iOooO00o + (z ? ((iOooO00o - 1) / 76) << 1 : 0);
        char[] cArr = new char[i5];
        int i6 = i;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = i + i4;
            if (i6 >= i3) {
                break;
            }
            int i9 = i6 + 2;
            int i10 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16);
            i6 += 3;
            int i11 = i10 | (bArr[i9] & 255);
            char[] cArr2 = zzZH0;
            cArr[i7] = cArr2[(i11 >>> 18) & 63];
            cArr[i7 + 1] = cArr2[(i11 >>> 12) & 63];
            cArr[i7 + 2] = cArr2[(i11 >>> 6) & 63];
            int i12 = i7 + 4;
            cArr[i7 + 3] = cArr2[i11 & 63];
            if (z && (i8 = i8 + 1) == 19 && i12 < i5 - 2) {
                int i13 = i7 + 5;
                cArr[i12] = ControlChar.PARAGRAPH_BREAK_CHAR;
                i7 += 6;
                cArr[i13] = '\n';
                i8 = 0;
            } else {
                i7 = i12;
            }
        }
        int i14 = i2 - i4;
        if (i14 > 0) {
            int i15 = ((bArr[i3] & 255) << 10) | (i14 == 2 ? (bArr[(i + i2) - 1] & 255) << 2 : 0);
            char[] cArr3 = zzZH0;
            cArr[i5 - 4] = cArr3[i15 >>> 12];
            cArr[i5 - 3] = cArr3[(i15 >>> 6) & 63];
            cArr[i5 - 2] = i14 == 2 ? cArr3[i15 & 63] : '=';
            cArr[i5 - 1] = '=';
        }
        return cArr;
    }

    public static String zzYI(byte[] bArr) {
        return zzX(bArr, 0, bArr.length, false);
    }

    private static int zzZ(char[] cArr, int i, byte[] bArr, int i2) {
        boolean z;
        long j;
        int i3;
        char c;
        long j2;
        int i4 = 0;
        int i5 = 0;
        long j3 = 255;
        while (true) {
            if (i4 >= i) {
                z = true;
                j = 255;
                break;
            }
            j = 255;
            long j4 = ((long) cArr[i4]) & 4294967295L;
            i4++;
            long j5 = (j4 - 65) & 4294967295L;
            if (j5 > 25) {
                if (((j4 - 97) & 4294967295L) <= 25) {
                    j2 = 71;
                } else if (((j4 - 48) & 4294967295L) <= 9) {
                    j2 = 4294967292L;
                } else if (43 == j4) {
                    j5 = 62;
                } else if (47 == j4) {
                    j5 = 63;
                } else if (13 != j4 && 10 != j4 && 32 != j4 && 9 != j4) {
                    if (61 != j4) {
                        throw new NumberFormatException("Format_BadBase64Char");
                    }
                    z = false;
                }
                j5 = (j4 - j2) & 4294967295L;
            }
            long j6 = (j3 << 6) | j5;
            j3 = j6 & 4294967295L;
            if ((j6 & 2147483648L) == 0) {
                continue;
            } else {
                if (i2 - i5 < 3) {
                    return -1;
                }
                bArr[i5] = (byte) (j3 >>> 16);
                bArr[i5 + 1] = (byte) ((j3 >>> 8) + 256);
                bArr[i5 + 2] = (byte) (j3 + 256);
                i5 += 3;
                j3 = 255;
            }
        }
        if (!z) {
            if (i4 == i) {
                if (((j3 << 6) & 2147483648L) == 0) {
                    throw new NumberFormatException("Format_BadBase64CharArrayLength");
                }
                if (i2 - i5 < 2) {
                    return -1;
                }
                bArr[i5] = (byte) ((r0 >>> 16) + 256);
                bArr[i5 + 1] = (byte) ((r0 >>> 8) + 256);
                i5 += 2;
            } else {
                while (true) {
                    i3 = i - 1;
                    if (i4 >= i3 || !((c = cArr[i4]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                        break;
                    }
                    i4++;
                }
                if (i4 != i3 || cArr[i4] != '=') {
                    throw new NumberFormatException("Format_BadBase64Char");
                }
                if (((j3 << 12) & 2147483648L) == 0) {
                    throw new NumberFormatException("Format_BadBase64CharArrayLength");
                }
                if (i2 - i5 <= 0) {
                    return -1;
                }
                bArr[i5] = (byte) ((r0 >>> 16) + 256);
                i5++;
            }
            j3 = j;
        }
        if (j3 == j) {
            return i5;
        }
        throw new NumberFormatException("Format_BadBase64CharArrayLength");
    }
}
