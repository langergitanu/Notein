package com.aspose.slides.internal.p550zi;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.ak */
/* JADX INFO: loaded from: classes5.dex */
public class C13590ak {

    /* JADX INFO: renamed from: k4 */
    public static final byte[] f45144k4 = {0, UnsignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, -64, 32, -96, 96, -32, 16, -112, 80, -48, PatternStyle.Wave, -80, 112, -16, 8, -120, 72, -56, 40, -88, 104, -24, 24, -104, 88, -40, 56, -72, 120, -8, 4, -124, 68, -60, 36, -92, 100, -28, 20, -108, 84, -44, PatternStyle.DownwardDiagonal, -76, 116, -12, 12, -116, 76, -52, PatternStyle.Weave, -84, 108, -20, 28, -100, 92, -36, 60, -68, 124, -4, 2, -126, 66, -62, 34, -94, 98, -30, 18, -110, 82, -46, PatternStyle.Vertical, -78, 114, -14, 10, -118, 74, -54, PatternStyle.Plaid, -86, 106, -22, 26, -102, 90, -38, 58, -70, 122, -6, 6, -122, 70, -58, 38, -90, 102, -26, 22, -106, 86, -42, PatternStyle.DiagonalCross, -74, 118, -10, 14, -114, 78, -50, PatternStyle.Divot, -82, 110, -18, 30, -98, 94, -34, 62, -66, 126, -2, 1, -127, 65, -63, 33, -95, 97, -31, 17, -111, 81, -47, PatternStyle.Horizontal, -79, 113, -15, 9, -119, 73, -55, 41, -87, 105, -23, 25, -103, 89, -39, 57, -71, 121, -7, 5, -123, 69, -59, 37, -91, 101, -27, 21, -107, 85, -43, PatternStyle.UpwardDiagonal, -75, 117, -11, 13, -115, 77, -51, PatternStyle.DottedGrid, -83, 109, -19, 29, -99, 93, -35, 61, -67, 125, -3, 3, -125, 67, -61, 35, -93, 99, -29, 19, -109, 83, -45, PatternStyle.Cross, -77, 115, -13, 11, -117, 75, -53, PatternStyle.Sphere, -85, 107, -21, 27, -101, 91, -37, 59, -69, 123, -5, 7, -121, 71, -57, 39, -89, 103, -25, 23, -105, 87, -41, 55, -73, 119, -9, 15, -113, 79, -49, PatternStyle.Shingle, -81, 111, -17, 31, -97, 95, -33, 63, -65, Ascii.DEL, -1};

    /* JADX INFO: renamed from: x1 */
    public static final int[] f45145x1 = {0, 1, 3, 7, 15, 31, 63, 127, 255};

    /* JADX INFO: renamed from: k4 */
    public static int m62705k4(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 5) {
            return 2;
        }
        if (i == 6) {
            return 1;
        }
        throw new ArgumentException("FrameworkException: Only MinIsBlack, RGB and YCbCr photometrics are supported for tiff files with embedded jpeg.");
    }
}
