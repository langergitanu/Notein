package com.aspose.slides.internal.p071cz;

import com.aspose.slides.C22206OooOOo0;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.zr */
/* JADX INFO: loaded from: classes3.dex */
class C3002zr extends AbstractC2904sx {

    /* JADX INFO: renamed from: k4 */
    private double f8828k4;

    /* JADX INFO: renamed from: kk */
    private double[] f8829kk;

    /* JADX INFO: renamed from: x1 */
    private C12025x6[] f8830x1;

    private C3002zr(double d, C12025x6[] c12025x6Arr, double[] dArr) {
        this.f8828k4 = d;
        this.f8830x1 = c12025x6Arr;
        this.f8829kk = dArr;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2904sx
    /* JADX INFO: renamed from: k4 */
    public double mo12528k4() {
        return this.f8828k4;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2904sx
    /* JADX INFO: renamed from: x1 */
    public C2865q1 mo12531x1(double d) {
        C12025x6 c12025x6 = new C12025x6();
        C12025x6 c12025x62 = new C12025x6();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12025x6[] c12025x6Arr2 = {c12025x62};
        double[] dArr = {0.0d};
        m12648k4(d, c12025x6Arr, c12025x6Arr2, dArr);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12025x6Arr2[0].CloneTo(c12025x62);
        double d2 = dArr[0];
        return new C2865q1((((double) (c12025x62.m56897x1() - c12025x6.m56897x1())) * d2) + ((double) c12025x6.m56897x1()), (((double) (c12025x62.m56895kk() - c12025x6.m56895kk())) * d2) + ((double) c12025x6.m56895kk()));
    }

    public C3002zr(C2865q1 c2865q1, C2865q1 c2865q12, C2865q1 c2865q13, C2865q1 c2865q14) {
        this.f8828k4 = m12646k4(c2865q1.Clone(), c2865q12.Clone(), c2865q13.Clone(), c2865q14.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private double m12646k4(C2865q1 c2865q1, C2865q1 c2865q12, C2865q1 c2865q13, C2865q1 c2865q14) {
        List<C12025x6>[] listArr = {new List()};
        new C2914ts().m12540k4(c2865q1.m12479kk().Clone(), c2865q12.m12479kk().Clone(), c2865q13.m12479kk().Clone(), c2865q14.m12479kk().Clone(), listArr);
        List<C12025x6> list = listArr[0];
        this.f8830x1 = list.toArray(new C12025x6[0]);
        this.f8829kk = new double[list.size()];
        double d = 0.0d;
        int i = 1;
        while (true) {
            C12025x6[] c12025x6Arr = this.f8830x1;
            if (i >= c12025x6Arr.length) {
                return d;
            }
            this.f8829kk[i] = m12647k4(c12025x6Arr[i - 1].Clone(), this.f8830x1[i].Clone());
            d += this.f8829kk[i];
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2904sx, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1 */
    public AbstractC2904sx cloneT() {
        return new C3002zr(this.f8828k4, this.f8830x1, this.f8829kk);
    }

    /* JADX INFO: renamed from: k4 */
    private double m12647k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        float fM56897x1 = c12025x6.m56897x1() - c12025x62.m56897x1();
        float fM56895kk = c12025x6.m56895kk() - c12025x62.m56895kk();
        return C14116yg.m67496rv((fM56895kk * fM56895kk) + (fM56897x1 * fM56897x1));
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2904sx
    /* JADX INFO: renamed from: k4 */
    public AbstractC2904sx mo12529k4(double d) {
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), this.f8830x1.length));
        C12025x6[] c12025x6Arr2 = this.f8830x1;
        double[] dArr = new double[c12025x6Arr2.length];
        int i = 0;
        C12025x6 c12025x6Clone = c12025x6Arr2[0].Clone();
        while (true) {
            C12025x6[] c12025x6Arr3 = this.f8830x1;
            if (i >= c12025x6Arr3.length) {
                break;
            }
            C12025x6 c12025x6Clone2 = c12025x6Arr3[i].Clone();
            C12025x6 c12025x6Clone3 = (i == 0 ? this.f8830x1[i + 1] : c12025x6Clone2).Clone();
            C2968xo c2968xo = new C2968xo(c12025x6Clone.m56897x1() - c12025x6Clone3.m56897x1(), c12025x6Clone.m56895kk() - c12025x6Clone3.m56895kk());
            c2968xo.m12610to().CloneTo(c2968xo);
            c12025x6Arr[i] = new C12025x6((float) (((double) c12025x6Clone2.m56897x1()) - (c2968xo.m12611x1() * d)), (float) ((c2968xo.m12606k4() * d) + ((double) c12025x6Clone2.m56895kk())));
            if (i == 0) {
                c12025x6Clone3 = c12025x6Clone;
            }
            c12025x6Clone3.CloneTo(c12025x6Clone);
            i++;
        }
        double d2 = 0.0d;
        for (int i2 = 1; i2 < this.f8830x1.length; i2++) {
            double dM12647k4 = m12647k4(c12025x6Arr[i2 - 1].Clone(), c12025x6Arr[i2].Clone());
            dArr[i2] = dM12647k4;
            d2 += dM12647k4;
        }
        return new C3002zr(d2, c12025x6Arr, dArr);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2904sx
    /* JADX INFO: renamed from: k4 */
    public C2968xo mo12530k4(double d, double d2, boolean z) {
        C12025x6 c12025x6 = new C12025x6();
        C12025x6 c12025x62 = new C12025x6();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12025x6[] c12025x6Arr2 = {c12025x62};
        m12648k4(d, c12025x6Arr, c12025x6Arr2, new double[]{0.0d});
        c12025x6Arr[0].CloneTo(c12025x6);
        c12025x6Arr2[0].CloneTo(c12025x62);
        C2968xo c2968xoClone = C2865q1.m12475k4(new C2865q1(c12025x6.m56897x1(), c12025x6.m56895kk()), new C2865q1(c12025x62.m56897x1(), c12025x62.m56895kk())).Clone();
        c2968xoClone.m12610to().CloneTo(c2968xoClone);
        double dM12611x1 = c2968xoClone.m12611x1();
        return z ? new C2968xo((-dM12611x1) * d2, c2968xoClone.m12606k4() * d2) : new C2968xo(dM12611x1 * d2, (-c2968xoClone.m12606k4()) * d2);
    }

    /* JADX INFO: renamed from: k4 */
    public final C3002zr m12649k4(C3002zr c3002zr) {
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), (this.f8830x1.length + c3002zr.f8830x1.length) - 1));
        double[] dArr = new double[(this.f8829kk.length + c3002zr.f8830x1.length) - 1];
        C12025x6[] c12025x6Arr2 = this.f8830x1;
        System.arraycopy(c12025x6Arr2, 0, c12025x6Arr, 0, c12025x6Arr2.length);
        C12025x6[] c12025x6Arr3 = c3002zr.f8830x1;
        System.arraycopy(c12025x6Arr3, 1, c12025x6Arr, this.f8830x1.length, c12025x6Arr3.length - 1);
        double[] dArr2 = this.f8829kk;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        double[] dArr3 = c3002zr.f8829kk;
        System.arraycopy(dArr3, 1, dArr, this.f8829kk.length, dArr3.length - 1);
        return new C3002zr(mo12528k4() + c3002zr.mo12528k4(), c12025x6Arr, dArr);
    }

    /* JADX INFO: renamed from: k4 */
    private void m12648k4(double d, C12025x6[] c12025x6Arr, C12025x6[] c12025x6Arr2, double[] dArr) {
        double d2 = d * this.f8828k4;
        this.f8830x1[0].CloneTo(c12025x6Arr[0]);
        int i = 1;
        double d3 = 0.0d;
        while (true) {
            C12025x6[] c12025x6Arr3 = this.f8830x1;
            if (i >= c12025x6Arr3.length) {
                int length = c12025x6Arr3.length;
                int i2 = length - 1;
                double d4 = this.f8829kk[i2];
                c12025x6Arr3[length - 2].CloneTo(c12025x6Arr[0]);
                this.f8830x1[i2].CloneTo(c12025x6Arr2[0]);
                dArr[0] = d4 != 0.0d ? C22206OooOOo0.OooO00o(this.f8828k4 - d4, d2, d4, d4) : 0.0d;
                return;
            }
            c12025x6Arr3[i].CloneTo(c12025x6Arr2[0]);
            double d5 = this.f8829kk[i];
            d3 += d5;
            if (d2 <= d3) {
                dArr[0] = d5 != 0.0d ? C22206OooOOo0.OooO00o(d3, d2, d5, d5) : 0.0d;
                return;
            } else {
                c12025x6Arr2[0].CloneTo(c12025x6Arr[0]);
                i++;
            }
        }
    }
}
