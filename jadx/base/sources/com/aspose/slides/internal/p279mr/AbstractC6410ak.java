package com.aspose.slides.internal.p279mr;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.ak */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6410ak extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ix */
    protected final InterfaceC6901du f18203ix;

    /* JADX INFO: renamed from: ks */
    protected final int f18204ks;

    /* JADX INFO: renamed from: ne */
    protected final int f18205ne;

    /* JADX INFO: renamed from: rv */
    protected final int f18206rv;

    /* JADX INFO: renamed from: u4 */
    private byte[][] f18207u4;

    /* JADX INFO: renamed from: x6 */
    protected final int f18208x6;

    public AbstractC6410ak(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4, InterfaceC6901du interfaceC6901du) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        if (interfaceC6901du == null) {
            throw new ArgumentNullException("sourcePalette");
        }
        this.f18203ix = interfaceC6901du;
        this.f18205ne = ((int) C14116yg.m67469du(2.0d, this.f18230up)) - 1;
        int i5 = this.f18230up;
        this.f18208x6 = 8 / i5;
        int i6 = this.f18223h4;
        this.f18206rv = i6 / i5;
        this.f18204ks = i6 / 8;
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        if (this.f18207u4 == null) {
            this.f18207u4 = mo26308k4(AbstractC6416c5.m26310k4(this.f18203ix, this.f18230up).mo27032x1());
        }
        int i7 = i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = this.f18230up;
            int i10 = (i3 * i9) + i2;
            int i11 = (((i10 - 1) / 8) - (i2 / 8)) + 1;
            int i12 = ((i2 % 8) / i9) * this.f18204ks;
            int i13 = i2;
            int i14 = 0;
            int i15 = 0;
            while (i14 < i11) {
                byte[] bArr3 = this.f18207u4[bArr[C22213OooOoOO.OooO0O0(this.f18224jd, i8, i14, i)] & 255];
                int iM67507x1 = (C14116yg.m67507x1(((i13 + 8) / 8) * 8, i10) - i13) / this.f18230up;
                int i16 = this.f18204ks * iM67507x1;
                System.arraycopy(bArr3, i12, bArr2, i7 + i15, i16);
                i13 += iM67507x1 * this.f18230up;
                i15 += i16;
                i14++;
                i12 = 0;
            }
            i7 += i6;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract byte[][] mo26308k4(int[] iArr);
}
