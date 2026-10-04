package com.aspose.slides.internal.p345pu;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.internal.p266m5.C6317k4;
import com.aspose.slides.internal.p266m5.C6318kk;
import com.aspose.slides.internal.p370qv.AbstractC9947x1;
import com.aspose.slides.internal.p370qv.C9946to;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p475wh.C12003du;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.pu.x1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9570x1<T extends AbstractC9947x1> extends AbstractC9565k4<T> {

    /* JADX INFO: renamed from: kk */
    protected float[] f34548kk;

    /* JADX INFO: renamed from: x1 */
    protected float[] f34549x1;

    public AbstractC9570x1(C11906rv c11906rv) {
        super(c11906rv);
        this.f34549x1 = c11906rv.m55686h4().m55747x1();
        this.f34548kk = c11906rv.m55686h4().m55744kk();
    }

    /* JADX INFO: renamed from: k4 */
    public double m46729k4(double d, double d2, double d3, double d4, double d5) {
        double d6 = d - d2;
        return d4 <= d5 ? C21532OooOOo.OooO0O0(d5, d4, d6 / (d3 - d2), d4) : C21532OooOOo.OooO0O0(d4, d5, 1.0d - (d6 / (d3 - d2)), d5);
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m46733x1(double d, C12003du c12003du, double d2, double d3, double d4, double d5) {
        return m46717k4(c12003du, 1.0d - m46729k4(d, d2, d3, d4, d5));
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m46730k4(double d, C12003du c12003du, double d2, double d3, double d4, double d5) {
        return m46717k4(c12003du, m46729k4(d, d2, d3, d4, d5));
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m46731k4(List<C12003du[]> list, C9946to c9946to, double d) {
        double dMax = Math.max(0.0d, Math.min(1.0d, d));
        for (int length = this.f34548kk.length - 1; length > 0; length--) {
            float[] fArr = this.f34548kk;
            int i = length - 1;
            float f = fArr[i];
            float f2 = fArr[length];
            double d2 = f;
            if (d2 <= dMax && dMax <= f2) {
                return m46718k4(list.get(i), (dMax - d2) / ((double) (f2 - f)));
            }
            if (f2 <= dMax && dMax <= d2) {
                return m46718k4(list.get(i), (d2 - dMax) / ((double) (f - f2)));
            }
        }
        return C12003du.m56396k4(0);
    }

    /* JADX INFO: renamed from: k4 */
    public List<C12003du[]> m46732k4() {
        C12003du c12003duM55698m9 = this.f34546k4.m55698m9();
        int i = 0;
        C12003du c12003du = this.f34546k4.m55682ck()[0];
        ArrayList arrayList = new ArrayList(this.f34548kk.length - 1);
        while (true) {
            float[] fArr = this.f34548kk;
            if (i >= fArr.length - 1) {
                return arrayList;
            }
            float f = fArr[i];
            int i2 = i + 1;
            float f2 = fArr[i2];
            float[] fArr2 = this.f34549x1;
            float f3 = fArr2[i];
            float f4 = fArr2[i2];
            double d = f3;
            double d2 = 1.0f - f3;
            C12003du c12003du2 = c12003du;
            arrayList.add(new C6318kk((int) Math.ceil(Math.abs(f2 - f) * 256.0f)).m25871k4(C6317k4.m25866k4(c12003duM55698m9, c12003du2, d, d2), C6317k4.m25866k4(c12003duM55698m9, c12003du2, f4, 1.0f - f4)));
            c12003du = c12003du2;
            i = i2;
        }
    }
}
