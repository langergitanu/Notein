package com.aspose.slides.internal.p174hz;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.huawei.hms.network.embedded.C18163eb;
import java.util.Collections;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.x1 */
/* JADX INFO: loaded from: classes.dex */
class C4766x1 {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f13320k4 = {128, 192, 256};

    /* JADX INFO: renamed from: x1 */
    private static final int[] f13326x1 = {10, 12, 14};

    /* JADX INFO: renamed from: kk */
    private static final int[] f13321kk = {4, 6, 8};

    /* JADX INFO: renamed from: to */
    private static final int[] f13324to = {4, 4, 4};

    /* JADX INFO: renamed from: du */
    private static final byte[] f13315du = {2, 3, 1, 1, 1, 2, 3, 1, 1, 1, 2, 3, 3, 1, 1, 2};

    /* JADX INFO: renamed from: h4 */
    private static final byte[] f13318h4 = {14, 11, 13, 9, 9, 14, 11, 13, 13, 9, 14, 11, 11, 13, 9, 14};

    /* JADX INFO: renamed from: m9 */
    private static final long[] f13323m9 = {C18163eb.f54662y, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, 2147483648L, 452984832, 905969664, 1811939328, 3623878656L, 2868903936L, 3976200192L, 2583691264L};

    /* JADX INFO: renamed from: dy */
    private static final byte[] f13316dy = {99, 124, 119, 123, -14, 107, 111, -59, PatternStyle.Wave, 1, 103, PatternStyle.Sphere, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, PatternStyle.DiagonalCross, 63, -9, -52, PatternStyle.DownwardDiagonal, -91, -27, -15, 113, -40, PatternStyle.Horizontal, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, UnsignedBytes.MAX_POWER_OF_TWO, -30, -21, 39, -78, 117, 9, -125, PatternStyle.Weave, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, PatternStyle.Shingle, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, PatternStyle.Cross, -123, 69, -7, 2, Ascii.DEL, 80, 60, -97, -88, 81, -93, SignedBytes.MAX_POWER_OF_TWO, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, PatternStyle.Plaid, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, PatternStyle.Vertical, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, PatternStyle.Divot, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, PatternStyle.UpwardDiagonal, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, PatternStyle.DottedGrid, 15, -80, 84, -69, 22};

    /* JADX INFO: renamed from: c5 */
    private static final byte[] f13313c5 = {82, 9, 106, -43, PatternStyle.Wave, PatternStyle.DiagonalCross, -91, 56, -65, SignedBytes.MAX_POWER_OF_TWO, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, PatternStyle.Shingle, -1, -121, PatternStyle.DownwardDiagonal, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, PatternStyle.Vertical, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, PatternStyle.Divot, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, PatternStyle.Weave, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, PatternStyle.UpwardDiagonal, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, PatternStyle.Cross, -120, 7, -57, PatternStyle.Horizontal, -79, 18, 16, 89, 39, UnsignedBytes.MAX_POWER_OF_TWO, -20, 95, 96, 81, Ascii.DEL, -87, 25, -75, 74, 13, PatternStyle.DottedGrid, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, PatternStyle.Plaid, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, PatternStyle.Sphere, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};

    /* JADX INFO: renamed from: jd */
    private static final byte[] f13319jd = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, PatternStyle.Plaid, PatternStyle.Weave, PatternStyle.Divot, PatternStyle.Wave, PatternStyle.Vertical, PatternStyle.DownwardDiagonal, PatternStyle.DiagonalCross, 56, 58, 60, 62, SignedBytes.MAX_POWER_OF_TWO, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 118, 120, 122, 124, 126, UnsignedBytes.MAX_POWER_OF_TWO, -126, -124, -122, -120, -118, -116, -114, -112, -110, -108, -106, -104, -102, -100, -98, -96, -94, -92, -90, -88, -86, -84, -82, -80, -78, -76, -74, -72, -70, -68, -66, -64, -62, -60, -58, -56, -54, -52, -50, -48, -46, -44, -42, -40, -38, -36, -34, -32, -30, -28, -26, -24, -22, -20, -18, -16, -14, -12, -10, -8, -6, -4, -2, 27, 25, 31, 29, 19, 17, 23, 21, 11, 9, 15, 13, 3, 1, 7, 5, 59, 57, 63, 61, PatternStyle.Cross, PatternStyle.Horizontal, 55, PatternStyle.UpwardDiagonal, PatternStyle.Sphere, 41, PatternStyle.Shingle, PatternStyle.DottedGrid, 35, 33, 39, 37, 91, 89, 95, 93, 83, 81, 87, 85, 75, 73, 79, 77, 67, 65, 71, 69, 123, 121, Ascii.DEL, 125, 115, 113, 119, 117, 107, 105, 111, 109, 99, 97, 103, 101, -101, -103, -97, -99, -109, -111, -105, -107, -117, -119, -113, -115, -125, -127, -121, -123, -69, -71, -65, -67, -77, -79, -73, -75, -85, -87, -81, -83, -93, -95, -89, -91, -37, -39, -33, -35, -45, -47, -41, -43, -53, -55, -49, -51, -61, -63, -57, -59, -5, -7, -1, -3, -13, -15, -9, -11, -21, -23, -17, -19, -29, -31, -25, -27};

    /* JADX INFO: renamed from: ck */
    private static final byte[] f13314ck = {0, 3, 6, 5, 12, 15, 10, 9, 24, 27, 30, 29, 20, 23, 18, 17, PatternStyle.Wave, PatternStyle.Cross, PatternStyle.DiagonalCross, PatternStyle.UpwardDiagonal, 60, 63, 58, 57, 40, PatternStyle.Sphere, PatternStyle.Divot, PatternStyle.DottedGrid, 36, 39, 34, 33, 96, 99, 102, 101, 108, 111, 106, 105, 120, 123, 126, 125, 116, 119, 114, 113, 80, 83, 86, 85, 92, 95, 90, 89, 72, 75, 78, 77, 68, 71, 66, 65, -64, -61, -58, -59, -52, -49, -54, -55, -40, -37, -34, -35, -44, -41, -46, -47, -16, -13, -10, -11, -4, -1, -6, -7, -24, -21, -18, -19, -28, -25, -30, -31, -96, -93, -90, -91, -84, -81, -86, -87, -72, -69, -66, -67, -76, -73, -78, -79, -112, -109, -106, -107, -100, -97, -102, -103, -120, -117, -114, -115, -124, -121, -126, -127, -101, -104, -99, -98, -105, -108, -111, -110, -125, UnsignedBytes.MAX_POWER_OF_TWO, -123, -122, -113, -116, -119, -118, -85, -88, -83, -82, -89, -92, -95, -94, -77, -80, -75, -74, -65, -68, -71, -70, -5, -8, -3, -2, -9, -12, -15, -14, -29, -32, -27, -26, -17, -20, -23, -22, -53, -56, -51, -50, -57, -60, -63, -62, -45, -48, -43, -42, -33, -36, -39, -38, 91, 88, 93, 94, 87, 84, 81, 82, 67, SignedBytes.MAX_POWER_OF_TWO, 69, 70, 79, 76, 73, 74, 107, 104, 109, 110, 103, 100, 97, 98, 115, 112, 117, 118, Ascii.DEL, 124, 121, 122, 59, 56, 61, 62, 55, PatternStyle.DownwardDiagonal, PatternStyle.Horizontal, PatternStyle.Vertical, 35, 32, 37, 38, PatternStyle.Shingle, PatternStyle.Weave, 41, PatternStyle.Plaid, 11, 8, 13, 14, 7, 4, 1, 2, 19, 16, 21, 22, 31, 28, 25, 26};

    /* JADX INFO: renamed from: fa */
    private static final byte[] f13317fa = {0, 9, 18, 27, 36, PatternStyle.DottedGrid, PatternStyle.DiagonalCross, 63, 72, 65, 90, 83, 108, 101, 126, 119, -112, -103, -126, -117, -76, -67, -90, -81, -40, -47, -54, -61, -4, -11, -18, -25, 59, PatternStyle.Vertical, 41, 32, 31, 22, 13, 4, 115, 122, 97, 104, 87, 94, 69, 76, -85, -94, -71, -80, -113, -122, -99, -108, -29, -22, -15, -8, -57, -50, -43, -36, 118, Ascii.DEL, 100, 109, 82, 91, SignedBytes.MAX_POWER_OF_TWO, 73, 62, 55, PatternStyle.Weave, 37, 26, 19, 8, 1, -26, -17, -12, -3, -62, -53, -48, -39, -82, -89, -68, -75, -118, -125, -104, -111, 77, 68, 95, 86, 105, 96, 123, 114, 5, 12, 23, 30, 33, 40, PatternStyle.Cross, 58, -35, -44, -49, -58, -7, -16, -21, -30, -107, -100, -121, -114, -79, -72, -93, -86, -20, -27, -2, -9, -56, -63, -38, -45, -92, -83, -74, -65, UnsignedBytes.MAX_POWER_OF_TWO, -119, -110, -101, 124, 117, 110, 103, 88, 81, 74, 67, PatternStyle.DownwardDiagonal, 61, 38, PatternStyle.Shingle, 16, 25, 2, 11, -41, -34, -59, -52, -13, -6, -31, -24, -97, -106, -115, -124, -69, -78, -87, -96, 71, 78, 85, 92, 99, 106, 113, 120, 15, 6, 29, 20, PatternStyle.Sphere, 34, 57, PatternStyle.Wave, -102, -109, -120, -127, -66, -73, -84, -91, -46, -37, -64, -55, -10, -1, -28, -19, 10, 3, 24, 17, PatternStyle.Divot, 39, 60, PatternStyle.UpwardDiagonal, 66, 75, 80, 89, 102, 111, 116, 125, -95, -88, -77, -70, -123, -116, -105, -98, -23, -32, -5, -14, -51, -60, -33, -42, PatternStyle.Horizontal, 56, 35, PatternStyle.Plaid, 21, 28, 7, 14, 121, 112, 107, 98, 93, 84, 79, 70};

    /* JADX INFO: renamed from: up */
    private static final byte[] f13325up = {0, 11, 22, 29, PatternStyle.Weave, 39, 58, PatternStyle.Horizontal, 88, 83, 78, 69, 116, Ascii.DEL, 98, 105, -80, -69, -90, -83, -100, -105, -118, -127, -24, -29, -2, -11, -60, -49, -46, -39, 123, 112, 109, 102, 87, 92, 65, 74, 35, 40, PatternStyle.UpwardDiagonal, 62, 15, 4, 25, 18, -53, -64, -35, -42, -25, -20, -15, -6, -109, -104, -123, -114, -65, -76, -87, -94, -10, -3, -32, -21, -38, -47, -52, -57, -82, -91, -72, -77, -126, -119, -108, -97, 70, 77, 80, 91, 106, 97, 124, 119, 30, 21, 8, 3, PatternStyle.Vertical, 57, 36, PatternStyle.Shingle, -115, -122, -101, -112, -95, -86, -73, -68, -43, -34, -61, -56, -7, -14, -17, -28, 61, PatternStyle.DiagonalCross, PatternStyle.Sphere, 32, 17, 26, 7, 12, 101, 110, 115, 120, 73, 66, 95, 84, -9, -4, -31, -22, -37, -48, -51, -58, -81, -92, -71, -78, -125, -120, -107, -98, 71, 76, 81, 90, 107, 96, 125, 118, 31, 20, 9, 2, PatternStyle.Cross, 56, 37, PatternStyle.Divot, -116, -121, -102, -111, -96, -85, -74, -67, -44, -33, -62, -55, -8, -13, -18, -27, 60, 55, PatternStyle.Plaid, 33, 16, 27, 6, 13, 100, 111, 114, 121, 72, 67, 94, 85, 1, 10, 23, 28, PatternStyle.DottedGrid, 38, 59, PatternStyle.Wave, 89, 82, 79, 68, 117, 126, 99, 104, -79, -70, -89, -84, -99, -106, -117, UnsignedBytes.MAX_POWER_OF_TWO, -23, -30, -1, -12, -59, -50, -45, -40, 122, 113, 108, 103, 86, 93, SignedBytes.MAX_POWER_OF_TWO, 75, 34, 41, PatternStyle.DownwardDiagonal, 63, 14, 5, 24, 19, -54, -63, -36, -41, -26, -19, -16, -5, -110, -103, -124, -113, -66, -75, -88, -93};

    /* JADX INFO: renamed from: yj */
    private static final byte[] f13327yj = {0, 13, 26, 23, PatternStyle.DownwardDiagonal, 57, PatternStyle.Divot, 35, 104, 101, 114, Ascii.DEL, 92, 81, 70, 75, -48, -35, -54, -57, -28, -23, -2, -13, -72, -75, -94, -81, -116, -127, -106, -101, -69, -74, -95, -84, -113, -126, -107, -104, -45, -34, -55, -60, -25, -22, -3, -16, 107, 102, 113, 124, 95, 82, 69, 72, 3, 14, 25, 20, 55, 58, PatternStyle.DottedGrid, 32, 109, 96, 119, 122, 89, 84, 67, 78, 5, 8, 31, 18, PatternStyle.Horizontal, 60, PatternStyle.Sphere, 38, -67, -80, -89, -86, -119, -124, -109, -98, -43, -40, -49, -62, -31, -20, -5, -10, -42, -37, -52, -63, -30, -17, -8, -11, -66, -77, -92, -87, -118, -121, -112, -99, 6, 11, 28, 17, PatternStyle.Vertical, 63, 40, 37, 110, 99, 116, 121, 90, 87, SignedBytes.MAX_POWER_OF_TWO, 77, -38, -41, -64, -51, -18, -29, -12, -7, -78, -65, -88, -91, -122, -117, -100, -111, 10, 7, 16, 29, 62, PatternStyle.Cross, 36, 41, 98, 111, 120, 117, 86, 91, 76, 65, 97, 108, 123, 118, 85, 88, 79, 66, 9, 4, 19, 30, 61, PatternStyle.Wave, 39, PatternStyle.Plaid, -79, -68, -85, -90, -123, -120, -97, -110, -39, -44, -61, -50, -19, -32, -9, -6, -73, -70, -83, -96, -125, -114, -103, -108, -33, -46, -59, -56, -21, -26, -15, -4, 103, 106, 125, 112, 83, 94, 73, 68, 15, 2, 21, 24, 59, PatternStyle.DiagonalCross, 33, PatternStyle.Weave, 12, 1, 22, 27, 56, PatternStyle.UpwardDiagonal, 34, PatternStyle.Shingle, 100, 105, 126, 115, 80, 93, 74, 71, -36, -47, -58, -53, -24, -27, -14, -1, -76, -71, -82, -93, UnsignedBytes.MAX_POWER_OF_TWO, -115, -102, -105};

    /* JADX INFO: renamed from: ks */
    private static final byte[] f13322ks = {0, 14, 28, 18, 56, PatternStyle.DiagonalCross, 36, PatternStyle.Plaid, 112, 126, 108, 98, 72, 70, 84, 90, -32, -18, -4, -14, -40, -42, -60, -54, -112, -98, -116, -126, -88, -90, -76, -70, -37, -43, -57, -55, -29, -19, -1, -15, -85, -91, -73, -71, -109, -99, -113, -127, 59, PatternStyle.UpwardDiagonal, 39, 41, 3, 13, 31, 17, 75, 69, 87, 89, 115, 125, 111, 97, -83, -93, -79, -65, -107, -101, -119, -121, -35, -45, -63, -49, -27, -21, -7, -9, 77, 67, 81, 95, 117, 123, 105, 103, 61, PatternStyle.Cross, 33, PatternStyle.Shingle, 5, 11, 25, 23, 118, 120, 106, 100, 78, SignedBytes.MAX_POWER_OF_TWO, 82, 92, 6, 8, 26, 20, 62, PatternStyle.Wave, 34, PatternStyle.Weave, -106, -104, -118, -124, -82, -96, -78, -68, -26, -24, -6, -12, -34, -48, -62, -52, 65, 79, 93, 83, 121, 119, 101, 107, PatternStyle.Horizontal, 63, PatternStyle.DottedGrid, 35, 9, 7, 21, 27, -95, -81, -67, -77, -103, -105, -123, -117, -47, -33, -51, -61, -23, -25, -11, -5, -102, -108, -122, -120, -94, -84, -66, -80, -22, -28, -10, -8, -46, -36, -50, -64, 122, 116, 102, 104, 66, 76, 94, 80, 10, 4, 22, 24, PatternStyle.Vertical, 60, PatternStyle.Divot, 32, -20, -30, -16, -2, -44, -38, -56, -58, -100, -110, UnsignedBytes.MAX_POWER_OF_TWO, -114, -92, -86, -72, -74, 12, 2, 16, 30, PatternStyle.DownwardDiagonal, 58, 40, 38, 124, 114, 96, 110, 68, 74, 88, 86, 55, 57, PatternStyle.Sphere, 37, 15, 1, 19, 29, 71, 73, 91, 85, Ascii.DEL, 113, 99, 109, -41, -39, -53, -59, -17, -31, -13, -3, -89, -87, -69, -75, -97, -111, -125, -115};

    /* JADX INFO: renamed from: du */
    private static void m19798du(byte[] bArr, int i) {
        byte[] bArr2 = new byte[4];
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                bArr2[i3] = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    bArr2[i3] = (byte) ((bArr2[i3] & 255) ^ (m19800k4(bArr[(i2 * 4) + i4], f13315du[(i3 * 4) + i4]) & 255));
                }
            }
            System.arraycopy(bArr2, 0, bArr, i2 * 4, 4);
        }
    }

    /* JADX INFO: renamed from: h4 */
    private static void m19799h4(byte[] bArr, int i) {
        byte[] bArr2 = new byte[4];
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                bArr2[i3] = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    bArr2[i3] = (byte) ((bArr2[i3] & 255) ^ (m19813x1(bArr[(i2 * 4) + i4], f13318h4[(i3 * 4) + i4]) & 255));
                }
            }
            System.arraycopy(bArr2, 0, bArr, i2 * 4, 4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte m19800k4(byte b, byte b2) {
        int i = b2 & 255;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            return f13319jd[b & 255];
        }
        if (i == 3) {
            return f13314ck[b & 255];
        }
        throw new ArgumentOutOfRangeException("y", "Multiplication matrix coefficient is unknown.");
    }

    /* JADX INFO: renamed from: kk */
    private static long m19809kk(long j) {
        return (((j & 4278190080L) >> 24) | ((255 & j) << 24) | ((65280 & j) << 8) | ((16711680 & j) >> 8)) & 4294967295L;
    }

    /* JADX INFO: renamed from: m9 */
    private static long m19811m9(byte[] bArr, int i) {
        int i2 = i * 4;
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) & 4294967295L;
    }

    /* JADX INFO: renamed from: to */
    private static void m19812to(byte[] bArr, int i) {
        int i2;
        for (int i3 = 1; i3 < i; i3++) {
            for (int i4 = 0; i4 < i - i3; i4++) {
                byte b = bArr[i3];
                int i5 = 0;
                while (true) {
                    i2 = i - 1;
                    if (i5 < i2) {
                        int i6 = (i5 * 4) + i3;
                        i5++;
                        bArr[i6] = bArr[(i5 * 4) + i3];
                    }
                }
                bArr[(i2 * 4) + i3] = b;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static byte m19813x1(byte b, byte b2) {
        int i = b2 & 255;
        if (i == 9) {
            return f13317fa[b & 255];
        }
        if (i == 11) {
            return f13325up[b & 255];
        }
        if (i == 13) {
            return f13327yj[b & 255];
        }
        if (i == 14) {
            return f13322ks[b & 255];
        }
        throw new ArgumentOutOfRangeException("y", "Multiplication matrix coefficient is unknown.");
    }

    /* JADX INFO: renamed from: k4 */
    public static int m19801k4() {
        return 128;
    }

    /* JADX INFO: renamed from: kk */
    private static void m19810kk(byte[] bArr, int i) {
        int i2;
        for (int i3 = 1; i3 < i; i3++) {
            for (int i4 = 0; i4 < i3; i4++) {
                byte b = bArr[i3];
                int i5 = 0;
                while (true) {
                    i2 = i - 1;
                    if (i5 < i2) {
                        int i6 = (i5 * 4) + i3;
                        i5++;
                        bArr[i6] = bArr[(i5 * 4) + i3];
                    }
                }
                bArr[(i2 * 4) + i3] = b;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static long m19814x1(long j) {
        return (((j & 255) << 24) | ((j & 4294967295L) >> 8)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    private static long m19802k4(long j) {
        long j2 = j & 4294967295L;
        long j3 = (j2 >> 8) & 255;
        long j4 = (j2 >> 16) & 255;
        byte[] bArr = f13316dy;
        return ((long) ((bArr[(int) (j & 255)] & 255) | ((bArr[(int) j3] & 255) << 8) | ((bArr[(int) j4] & 255) << 16) | ((bArr[(int) ((j2 >> 24) & 255)] & 255) << 24))) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m19815x1(byte[] bArr, int i) {
        for (int i2 = 0; i2 < i * 4; i2++) {
            bArr[i2] = f13313c5[bArr[i2] & 255];
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m19803k4(byte[] bArr, int i) {
        for (int i2 = 0; i2 < i * 4; i2++) {
            bArr[i2] = f13316dy[bArr[i2] & 255];
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m19816x1(byte[] bArr, int i, int i2, byte[] bArr2) {
        byte[] bArr3 = new byte[240];
        byte[] bArr4 = new byte[16];
        m19807k4(bArr2, bArr3);
        int iIndexOf = Collections.singletonList(f13320k4).indexOf(Integer.valueOf(bArr2.length * 8));
        int i3 = f13324to[iIndexOf];
        int i4 = f13326x1[iIndexOf];
        while (i < i2) {
            int i5 = i3 * 4;
            System.arraycopy(bArr, i, bArr4, 0, i5);
            m19806k4(bArr4, i3, bArr3, i4);
            m19812to(bArr4, i3);
            m19815x1(bArr4, i3);
            for (int i6 = i4 - 1; i6 > 0; i6--) {
                m19806k4(bArr4, i3, bArr3, i6);
                m19799h4(bArr4, i3);
                m19812to(bArr4, i3);
                m19815x1(bArr4, i3);
            }
            m19806k4(bArr4, i3, bArr3, 0);
            System.arraycopy(bArr4, 0, bArr, i, i5);
            i += i5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m19804k4(byte[] bArr, int i, int i2, byte[] bArr2) {
        byte[] bArr3 = new byte[240];
        byte[] bArr4 = new byte[16];
        m19807k4(bArr2, bArr3);
        int iIndexOf = Collections.singletonList(f13320k4).indexOf(Integer.valueOf(bArr2.length * 8));
        int i3 = f13324to[iIndexOf];
        int i4 = f13326x1[iIndexOf];
        while (i < i2) {
            int i5 = i3 * 4;
            System.arraycopy(bArr, i, bArr4, 0, i5);
            m19806k4(bArr4, i3, bArr3, 0);
            int i6 = 1;
            while (true) {
                m19803k4(bArr4, i3);
                m19810kk(bArr4, i3);
                if (i6 < i4) {
                    m19798du(bArr4, i3);
                    m19806k4(bArr4, i3, bArr3, i6);
                    i6++;
                }
            }
            m19806k4(bArr4, i3, bArr3, i4);
            System.arraycopy(bArr4, 0, bArr, i, i5);
            i += i5;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m19817x1(byte[] bArr, int i, int i2, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[240];
        byte[] bArr5 = new byte[16];
        byte[] bArr6 = new byte[16];
        m19807k4(bArr2, bArr4);
        System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        int iIndexOf = Collections.singletonList(f13320k4).indexOf(Integer.valueOf(bArr2.length * 8));
        int i3 = f13324to[iIndexOf];
        int i4 = f13326x1[iIndexOf];
        int i5 = i;
        while (i5 < i2 + i) {
            int i6 = i3 * 4;
            System.arraycopy(bArr, i5, bArr5, 0, i6);
            m19806k4(bArr5, i3, bArr4, i4);
            m19812to(bArr5, i3);
            m19815x1(bArr5, i3);
            for (int i7 = i4 - 1; i7 > 0; i7--) {
                m19806k4(bArr5, i3, bArr4, i7);
                m19799h4(bArr5, i3);
                m19812to(bArr5, i3);
                m19815x1(bArr5, i3);
            }
            m19806k4(bArr5, i3, bArr4, 0);
            for (int i8 = 0; i8 < i6; i8++) {
                byte b = (byte) ((bArr5[i8] & 255) ^ (bArr6[i8] & 255));
                int i9 = i5 + i8;
                bArr6[i8] = bArr[i9];
                bArr[i9] = b;
            }
            i5 += i6;
        }
        return bArr6;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m19805k4(byte[] bArr, int i, long j) {
        int i2 = i * 4;
        long j2 = 4294967295L & j;
        bArr[i2] = (byte) (j & 255);
        bArr[i2 + 1] = (byte) ((j2 >> 8) & 255);
        bArr[i2 + 2] = (byte) ((j2 >> 16) & 255);
        bArr[i2 + 3] = (byte) ((j2 >> 24) & 255);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m19806k4(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * 4;
            int i5 = ((i2 * i) + i3) * 4;
            bArr[i4] = (byte) ((bArr[i4] & 255) ^ (bArr2[i5] & 255));
            int i6 = i4 + 1;
            bArr[i6] = (byte) ((bArr[i6] & 255) ^ (bArr2[i5 + 1] & 255));
            int i7 = i4 + 2;
            bArr[i7] = (byte) ((bArr[i7] & 255) ^ (bArr2[i5 + 2] & 255));
            int i8 = i4 + 3;
            bArr[i8] = (byte) ((bArr2[i5 + 3] & 255) ^ (bArr[i8] & 255));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m19807k4(byte[] bArr, byte[] bArr2) {
        int iIndexOf = Collections.singletonList(f13320k4).indexOf(Integer.valueOf(bArr.length * 8));
        int i = f13324to[iIndexOf];
        int i2 = f13326x1[iIndexOf];
        int i3 = f13321kk[iIndexOf];
        System.arraycopy(bArr, 0, bArr2, 0, i3 * 4);
        for (int i4 = i3; i4 < (i2 + 1) * i; i4++) {
            long jM19811m9 = m19811m9(bArr2, i4 - 1);
            int i5 = i4 % i3;
            if (i5 == 0) {
                jM19811m9 = (m19802k4(m19814x1(jM19811m9)) ^ m19809kk(f13323m9[(i4 / i3) - 1])) & 4294967295L;
            } else if (i3 > 6 && i5 == 4) {
                jM19811m9 = m19802k4(jM19811m9);
            }
            m19805k4(bArr2, i4, (jM19811m9 ^ m19811m9(bArr2, i4 - i3)) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m19808k4(byte[] bArr, int i, int i2, byte[] bArr2, byte[] bArr3) {
        int i3;
        byte[] bArr4 = new byte[240];
        byte[] bArr5 = new byte[16];
        byte[] bArr6 = new byte[16];
        m19807k4(bArr2, bArr4);
        System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        int iIndexOf = Collections.singletonList(f13320k4).indexOf(Integer.valueOf(bArr2.length * 8));
        int i4 = f13324to[iIndexOf];
        int i5 = f13326x1[iIndexOf];
        while (i < i2) {
            int i6 = 0;
            while (true) {
                i3 = i4 * 4;
                if (i6 >= i3) {
                    break;
                }
                bArr5[i6] = (byte) ((bArr[i + i6] & 255) ^ (bArr6[i6] & 255));
                i6++;
            }
            m19806k4(bArr5, i4, bArr4, 0);
            int i7 = 1;
            while (true) {
                m19803k4(bArr5, i4);
                m19810kk(bArr5, i4);
                if (i7 >= i5) {
                    break;
                }
                m19798du(bArr5, i4);
                m19806k4(bArr5, i4, bArr4, i7);
                i7++;
            }
            m19806k4(bArr5, i4, bArr4, i5);
            for (int i8 = 0; i8 < i3; i8++) {
                byte b = bArr5[i8];
                bArr6[i8] = b;
                bArr[i + i8] = b;
            }
            i += i3;
        }
        return bArr6;
    }
}
