package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6904h4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C6463ts extends C6417c6 {

    /* JADX INFO: renamed from: rv */
    private byte f18249rv;

    public C6463ts(int i, int i2, int i3, InterfaceC6901du interfaceC6901du, C13609qq c13609qq, C12014ne c12014ne, int i4, InterfaceC6901du interfaceC6901du2, C13609qq c13609qq2, int i5, InterfaceC6904h4 interfaceC6904h4, int i6) {
        super(i, i2, i3, interfaceC6901du, c13609qq, c12014ne.Clone(), i4, interfaceC6901du2, c13609qq2, i5, interfaceC6904h4, i6);
    }

    @Override // com.aspose.slides.internal.p279mr.C6417c6, com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7 = this.f18230up;
        int i8 = (((i3 * i7) + i2) - 1) / 8;
        int i9 = (i8 - (i2 / 8)) + 1;
        int i10 = i7 / this.f18223h4;
        int i11 = 8 / i10;
        int i12 = (i2 % (i10 * 8)) / 8;
        boolean z = i8 == ((this.f18225k4.m56668h4() * this.f18230up) - 1) / 8;
        for (int i13 = 0; i13 < i4; i13++) {
            int i14 = (this.f18224jd * i13) + i;
            int i15 = (i13 * i6) + i5;
            int i16 = 0;
            int i17 = i12;
            while (i16 < i9) {
                int i18 = i14 + 1;
                byte b = (byte) ((((byte) ((((C6417c6) this).f18233ks[bArr[i14] & 255] & 255) >> (i11 * i17))) & 255) | (this.f18249rv & 255));
                this.f18249rv = b;
                i17++;
                if (i17 == i10) {
                    bArr2[i15] = b;
                    this.f18249rv = (byte) 0;
                    i15++;
                    i17 = 0;
                }
                i16++;
                i14 = i18;
            }
            if (z && i17 > 0) {
                bArr2[i15] = this.f18249rv;
                this.f18249rv = (byte) 0;
            }
        }
    }
}
