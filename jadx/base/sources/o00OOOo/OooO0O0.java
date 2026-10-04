package o00OOOo;

import com.aspose.slides.PatternStyle;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    public static abstract class OooO00o {
    }

    /* JADX INFO: renamed from: o00OOOo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C19666OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final int[] f84897OooO00o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    public static class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final byte[] f84898OooO00o = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, PatternStyle.Sphere, PatternStyle.Shingle};
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dc, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] OooO00o(byte[] bArr) {
        int length = bArr.length;
        int i = (length * 3) / 4;
        byte[] bArr2 = new byte[i];
        int[] iArr = C19666OooO0O0.f84897OooO00o;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < length) {
            if (i3 == 0) {
                while (true) {
                    int i6 = i2 + 4;
                    if (i6 > length || (i4 = (iArr[bArr[i2] & 255] << 18) | (iArr[bArr[i2 + 1] & 255] << 12) | (iArr[bArr[i2 + 2] & 255] << 6) | iArr[bArr[i2 + 3] & 255]) < 0) {
                        break;
                    }
                    bArr2[i5 + 2] = (byte) i4;
                    bArr2[i5 + 1] = (byte) (i4 >> 8);
                    bArr2[i5] = (byte) (i4 >> 16);
                    i5 += 3;
                    i2 = i6;
                }
                if (i2 >= length) {
                    break;
                }
            }
            int i7 = i2 + 1;
            int i8 = iArr[bArr[i2] & 255];
            if (i3 != 0) {
                if (i3 == 1) {
                    if (i8 < 0) {
                        if (i8 != -1) {
                            break;
                        }
                        i2 = i7;
                    }
                    i8 |= i4 << 6;
                } else if (i3 == 2) {
                    if (i8 < 0) {
                        if (i8 != -2) {
                            if (i8 != -1) {
                                break;
                            }
                        } else {
                            bArr2[i5] = (byte) (i4 >> 4);
                            i3 = 4;
                            i5++;
                        }
                        i2 = i7;
                    }
                    i8 |= i4 << 6;
                } else if (i3 != 3) {
                    if (i3 == 4) {
                        if (i8 != -2) {
                            if (i8 != -1) {
                                break;
                            }
                        } else {
                            i3++;
                        }
                        i2 = i7;
                    } else {
                        if (i3 == 5 && i8 != -1) {
                            break;
                        }
                        i2 = i7;
                    }
                } else if (i8 >= 0) {
                    i8 |= i4 << 6;
                    bArr2[i5 + 2] = (byte) i8;
                    bArr2[i5 + 1] = (byte) (i8 >> 8);
                    bArr2[i5] = (byte) (i8 >> 16);
                    i5 += 3;
                    i3 = 0;
                } else {
                    if (i8 != -2) {
                        if (i8 != -1) {
                            break;
                        }
                    } else {
                        bArr2[i5 + 1] = (byte) (i4 >> 2);
                        bArr2[i5] = (byte) (i4 >> 10);
                        i5 += 2;
                        i3 = 5;
                    }
                    i2 = i7;
                }
                i3++;
            } else {
                if (i8 < 0) {
                    if (i8 != -1) {
                        break;
                    }
                    i2 = i7;
                }
                i3++;
            }
            i4 = i8;
            i2 = i7;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                bArr2[i5] = (byte) (i4 >> 4);
                i5++;
            } else if (i3 == 3) {
                int i9 = i5 + 1;
                bArr2[i5] = (byte) (i4 >> 10);
                i5 += 2;
                bArr2[i9] = (byte) (i4 >> 2);
            }
            if (i5 == i) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr2, 0, bArr3, 0, i5);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] OooO0O0(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = OooO0OO.f84898OooO00o;
        int i = (length / 3) * 4;
        if (length % 3 > 0) {
            i += 4;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int i5 = i2 + 3;
            if (i5 > length) {
                break;
            }
            int i6 = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            bArr3[i4] = bArr2[(i6 >> 18) & 63];
            bArr3[i4 + 1] = bArr2[(i6 >> 12) & 63];
            bArr3[i4 + 2] = bArr2[(i6 >> 6) & 63];
            bArr3[i4 + 3] = bArr2[i6 & 63];
            int i7 = i4 + 4;
            i3--;
            if (i3 == 0) {
                i4 += 5;
                bArr3[i7] = 10;
                i3 = 19;
            } else {
                i4 = i7;
            }
            i2 = i5;
        }
        if (i2 == length - 1) {
            int i8 = (bArr[i2] & 255) << 4;
            bArr3[i4] = bArr2[(i8 >> 6) & 63];
            bArr3[i4 + 1] = bArr2[i8 & 63];
            bArr3[i4 + 2] = 61;
            bArr3[i4 + 3] = 61;
            return bArr3;
        }
        if (i2 == length - 2) {
            int i9 = ((bArr[i2 + 1] & 255) << 2) | ((bArr[i2] & 255) << 10);
            bArr3[i4] = bArr2[(i9 >> 12) & 63];
            bArr3[i4 + 1] = bArr2[(i9 >> 6) & 63];
            bArr3[i4 + 2] = bArr2[i9 & 63];
            bArr3[i4 + 3] = 61;
        }
        return bArr3;
    }

    public static String OooO0OO(byte[] bArr) {
        try {
            return new String(OooO0O0(bArr), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
