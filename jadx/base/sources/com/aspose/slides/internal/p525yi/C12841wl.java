package com.aspose.slides.internal.p525yi;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C12841wl extends AbstractC12839uz {

    /* JADX INFO: renamed from: c5 */
    private static byte[] f42726c5 = {41, PatternStyle.Divot, 67, -55, -94, -40, 124, 1, 61, PatternStyle.DiagonalCross, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, PatternStyle.Sphere, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, PatternStyle.Shingle, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, UnsignedBytes.MAX_POWER_OF_TWO, Ascii.DEL, 93, -102, 90, -112, PatternStyle.Vertical, 39, PatternStyle.UpwardDiagonal, 62, -52, -25, -65, -9, -105, 3, -1, 25, PatternStyle.Wave, -77, 72, -91, -75, -47, -41, 94, -110, PatternStyle.Plaid, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, PatternStyle.DottedGrid, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, PatternStyle.DownwardDiagonal, SignedBytes.MAX_POWER_OF_TWO, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, PatternStyle.Weave, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, PatternStyle.Horizontal, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, PatternStyle.Cross, -97, 17, -125, 20};

    /* JADX INFO: renamed from: m9 */
    private int f42731m9;

    /* JADX INFO: renamed from: k4 */
    private byte[] f42730k4 = new byte[16];

    /* JADX INFO: renamed from: du */
    private byte[] f42727du = new byte[16];

    /* JADX INFO: renamed from: h4 */
    private byte[] f42729h4 = new byte[16];

    /* JADX INFO: renamed from: dy */
    private byte[] f42728dy = new byte[48];

    public C12841wl() {
        mo18846c5();
    }

    /* JADX INFO: renamed from: k4 */
    private void m59705k4(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = 0;
        C14058fa.m66596k4(bArr, 0, this.f42728dy, 0, 16);
        C14058fa.m66596k4(bArr3, i, this.f42728dy, 16, 16);
        for (int i3 = 0; i3 < 16; i3++) {
            this.f42728dy[i3 + 32] = (byte) ((bArr[i3] & 255) ^ (bArr3[i + i3] & 255));
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 18) {
            int i6 = 0;
            int i7 = i5;
            while (i6 < 48) {
                byte[] bArr4 = this.f42728dy;
                byte b = (byte) (f42726c5[i7] ^ bArr4[i6]);
                bArr4[i6] = b;
                i6++;
                i7 = b;
            }
            int i8 = (i7 + i4) & 255;
            i4++;
            i5 = i8;
        }
        C14058fa.m66596k4(this.f42728dy, 0, bArr, 0, 16);
        int i9 = bArr2[15] & 255;
        while (i2 < 16) {
            byte b2 = (byte) (f42726c5[i9 ^ (bArr3[i + i2] & 255)] ^ bArr2[i2]);
            bArr2[i2] = b2;
            i2++;
            i9 = b2;
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: c5 */
    public void mo18846c5() {
        this.f42731m9 = 0;
        AbstractC14092to.m67225k4(this.f42730k4, 0, 16);
        AbstractC14092to.m67225k4(this.f42727du, 0, 16);
        AbstractC14092to.m67225k4(this.f42729h4, 0, 16);
        AbstractC14092to.m67225k4(this.f42728dy, 0, 48);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: dy */
    public byte[] mo18847dy() {
        int i = 16 - this.f42731m9;
        if (i > 0) {
            mo18849x1(m59706k4(i), 0, i);
        }
        mo18849x1(this.f42727du, 0, 16);
        byte[] bArr = (byte[]) this.f42730k4.clone();
        mo18846c5();
        return bArr;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: x1 */
    public void mo18849x1(byte[] bArr, int i, int i2) {
        int i3 = this.f42731m9;
        this.f42731m9 = (i3 + i2) & 15;
        int i4 = 16 - i3;
        int i5 = 0;
        if (i2 >= i4) {
            C14058fa.m66596k4(bArr, i, this.f42729h4, i3, i4);
            m59705k4(this.f42730k4, this.f42727du, this.f42729h4, 0);
            while (i4 + 15 < i2) {
                m59705k4(this.f42730k4, this.f42727du, bArr, i + i4);
                i4 += 16;
            }
            i3 = 0;
            i5 = i4;
        }
        C14058fa.m66596k4(bArr, i + i5, this.f42729h4, i3, i2 - i5);
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m59706k4(int i) {
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) i;
        }
        return bArr;
    }
}
