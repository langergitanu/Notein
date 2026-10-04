package com.aspose.slides.internal.p279mr;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6904h4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.internal.p550zi.C13622yd;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.xk */
/* JADX INFO: loaded from: classes4.dex */
public final class C6480xk extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ks */
    private final byte[] f18268ks;

    public C6480xk(int i, int i2, int i3, InterfaceC6901du interfaceC6901du, C13609qq c13609qq, C12014ne c12014ne, int i4, InterfaceC6901du interfaceC6901du2, int i5, InterfaceC6904h4 interfaceC6904h4, int i6) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq, i4);
        if (interfaceC6901du == null) {
            throw new ArgumentNullException("sourcePalette");
        }
        if (interfaceC6901du2 == null) {
            throw new ArgumentNullException("destinationPalette");
        }
        this.f18268ks = new byte[256];
        int iM67469du = (int) C14116yg.m67469du(2.0d, this.f18230up);
        int i7 = this.f18230up;
        int i8 = 8 / i7;
        int i9 = iM67469du - 1;
        if (i5 == 2) {
            byte[] bArrM26311k4 = AbstractC6416c5.m26311k4(interfaceC6904h4, c13609qq, c13609qq, iM67469du, iM67469du);
            for (int i10 = 0; i10 < 256; i10++) {
                int i11 = 8 - this.f18230up;
                byte b = 0;
                for (int i12 = 0; i12 < i8; i12++) {
                    b = (byte) ((b & 255) | (((bArrM26311k4[(i10 >> i11) & i9] & 255) << i11) & 255));
                    i11 -= this.f18230up;
                }
                this.f18268ks[i10] = b;
            }
            return;
        }
        int[] iArrMo27032x1 = AbstractC6416c5.m26310k4(interfaceC6901du, i7).mo27032x1();
        C13622yd c13622yd = new C13622yd(interfaceC6901du2);
        for (int i13 = 0; i13 < 256; i13++) {
            int i14 = 8 - this.f18230up;
            byte b2 = 0;
            for (int i15 = 0; i15 < i8; i15++) {
                int iMo27030k4 = c13622yd.mo27030k4(iArrMo27032x1[(i13 >> i14) & i9]);
                if (iMo27030k4 > i9) {
                    iMo27030k4 = i6;
                }
                b2 = (byte) ((b2 & 255) | ((iMo27030k4 << i14) & 255));
                i14 -= this.f18230up;
            }
            this.f18268ks[i13] = b2;
        }
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7 = (((((i3 * this.f18230up) + i2) - 1) / 8) - (i2 / 8)) + 1;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = (this.f18224jd * i8) + i;
            int i10 = (i8 * i6) + i5;
            for (int i11 = 0; i11 < i7; i11++) {
                bArr2[i10 + i11] = this.f18268ks[bArr[i9 + i11] & 255];
            }
        }
    }
}
