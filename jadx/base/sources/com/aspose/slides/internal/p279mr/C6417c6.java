package com.aspose.slides.internal.p279mr;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6904h4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6417c6 extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ks */
    protected final byte[] f18233ks;

    /* JADX INFO: renamed from: rv */
    private int f18234rv;

    /* JADX INFO: renamed from: x6 */
    private final int f18235x6;

    public C6417c6(int i, int i2, int i3, InterfaceC6901du interfaceC6901du, C13609qq c13609qq, C12014ne c12014ne, int i4, InterfaceC6901du interfaceC6901du2, C13609qq c13609qq2, int i5, InterfaceC6904h4 interfaceC6904h4, int i6) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        if (interfaceC6901du == null) {
            throw new ArgumentNullException("sourcePalette");
        }
        if (interfaceC6901du2 == null) {
            throw new ArgumentNullException("destinationPalette");
        }
        int iM67469du = (int) C14116yg.m67469du(2.0d, this.f18230up);
        char c = '\b';
        int i7 = 8 / this.f18230up;
        int i8 = iM67469du - 1;
        int iM67469du2 = (int) C14116yg.m67469du(2.0d, this.f18223h4);
        int i9 = iM67469du2 - 1;
        int i10 = 8 / this.f18223h4;
        int i11 = i7 / i10;
        this.f18234rv = i11;
        if (i11 == 0) {
            this.f18234rv = 1;
            i10 = i7;
        }
        int i12 = this.f18234rv;
        this.f18235x6 = 8 / i12;
        this.f18233ks = new byte[i12 * 256];
        if (i5 == 1) {
            int[] iArrMo27032x1 = AbstractC6416c5.m26310k4(interfaceC6901du, this.f18230up).mo27032x1();
            for (int i13 = 0; i13 < 256; i13++) {
                int i14 = 8 - this.f18230up;
                int i15 = 0;
                int i16 = 0;
                while (i15 < i7) {
                    int i17 = 8 - this.f18223h4;
                    char c2 = c;
                    byte b = 0;
                    for (int i18 = 0; i18 < i10; i18++) {
                        int iMo27030k4 = interfaceC6901du2.mo27030k4(iArrMo27032x1[(i13 >> i14) & i8]);
                        if (iMo27030k4 > i9) {
                            iMo27030k4 = i6;
                        }
                        b = (byte) ((b & 255) | ((iMo27030k4 << i17) & 255));
                        i14 -= this.f18230up;
                        i17 -= this.f18223h4;
                    }
                    this.f18233ks[i13 + i16] = b;
                    i15 += i10;
                    i16 += 256;
                    c = c2;
                }
            }
            return;
        }
        if (i5 != 0) {
            byte[] bArrM26311k4 = AbstractC6416c5.m26311k4(interfaceC6904h4, c13609qq, c13609qq2, iM67469du, iM67469du2);
            for (int i19 = 0; i19 < 256; i19++) {
                int i20 = 8 - this.f18230up;
                int i21 = 0;
                int i22 = 0;
                while (i21 < i7) {
                    int i23 = 8 - this.f18223h4;
                    byte b2 = 0;
                    for (int i24 = 0; i24 < i10; i24++) {
                        b2 = (byte) ((b2 & 255) | (((bArrM26311k4[(i19 >> i20) & i8] & 255) << i23) & 255));
                        i20 -= this.f18230up;
                        i23 -= this.f18223h4;
                    }
                    this.f18233ks[i19 + i22] = b2;
                    i21 += i10;
                    i22 += 256;
                }
            }
            return;
        }
        for (int i25 = 0; i25 < 256; i25++) {
            int i26 = 8 - this.f18230up;
            int i27 = 0;
            int i28 = 0;
            while (i27 < i7) {
                int i29 = 8 - this.f18223h4;
                byte b3 = 0;
                for (int i30 = 0; i30 < i10; i30++) {
                    int i31 = (i25 >> i26) & i8;
                    if (i31 > i9) {
                        i31 = i6;
                    }
                    b3 = (byte) ((b3 & 255) | ((i31 << i29) & 255));
                    i26 -= this.f18230up;
                    i29 -= this.f18223h4;
                }
                this.f18233ks[i25 + i28] = b3;
                i27 += i10;
                i28 += 256;
            }
        }
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7 = (((((this.f18230up * i3) + i2) - 1) / 8) - (i2 / 8)) + 1;
        int i8 = this.f18234rv;
        int i9 = ((((r1 * i8) - 1) / 8) - ((i2 * i8) / 8)) + 1;
        int i10 = (i2 / this.f18235x6) % i8;
        for (int i11 = 0; i11 < i4; i11++) {
            int i12 = (this.f18224jd * i11) + i;
            int i13 = (i11 * i6) + i5;
            int i14 = i10 * 256;
            int i15 = i10;
            int i16 = 0;
            int i17 = 0;
            while (i16 < i7) {
                int i18 = i12 + 1;
                int i19 = bArr[i12];
                int i20 = this.f18234rv;
                int iM67507x1 = C14116yg.m67507x1(C14116yg.m67507x1(i20, i20 - i15), i9 - i17);
                int i21 = 0;
                while (i21 < iM67507x1) {
                    bArr2[i17 + i13] = this.f18233ks[(i19 & 255) + i14];
                    i14 += 256;
                    i21++;
                    i17++;
                }
                i16++;
                i12 = i18;
                i14 = 0;
                i15 = 0;
            }
        }
    }
}
