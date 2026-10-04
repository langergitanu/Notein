package com.aspose.slides.internal.p279mr;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p313oa.C6986dy;
import com.aspose.slides.internal.p313oa.C6992k4;
import com.aspose.slides.internal.p313oa.C7004up;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.internal.p550zi.C13623yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C6414bv extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ks */
    protected C6986dy f18216ks;

    /* JADX INFO: renamed from: rv */
    private Dictionary<Object, double[]> f18217rv;

    public C6414bv(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4, C13618wy c13618wy, C13618wy c13618wy2) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        this.f18217rv = new Dictionary<>();
        C6992k4 c6992k4 = new C6992k4();
        this.f18216ks = c6992k4;
        try {
            c6992k4.m27336k4(c13618wy.m62861x1());
        } catch (C7004up unused) {
            this.f18216ks.m27336k4(C13623yj.m62875k4().m14472k4());
        }
        try {
            this.f18216ks.m27336k4(c13618wy2.m62861x1());
        } catch (C7004up unused2) {
            this.f18216ks.m27336k4(C13623yj.m62876x1().m14472k4());
        }
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        double d;
        int iM62786du = this.f18222fa.m62786du();
        int iM62786du2 = this.f18229to.m62786du();
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = (this.f18224jd * i7) + i;
            int i9 = (i7 * i6) + i5;
            double[] dArr = new double[iM62786du];
            double[] dArr2 = new double[iM62786du2];
            for (int i10 = 0; i10 < i3; i10++) {
                int i11 = 0;
                while (true) {
                    d = 255.0d;
                    if (i11 >= iM62786du) {
                        break;
                    }
                    dArr[i11] = ((double) (bArr[i8] & 255)) / 255.0d;
                    i11++;
                    i8++;
                }
                this.f18216ks.mo27338k4(dArr, dArr2);
                int i12 = 0;
                while (i12 < iM62786du2) {
                    bArr2[i9] = (byte) (dArr2[i12] * r17);
                    i12++;
                    i9++;
                    d = d;
                }
            }
        }
    }
}
