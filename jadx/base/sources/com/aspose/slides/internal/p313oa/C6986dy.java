package com.aspose.slides.internal.p313oa;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C6986dy {

    /* JADX INFO: renamed from: du */
    private float[] f19000du;

    /* JADX INFO: renamed from: h4 */
    private float[] f19001h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f19002k4;

    /* JADX INFO: renamed from: kk */
    private ArrayList f19003kk;

    /* JADX INFO: renamed from: to */
    private float[] f19004to;

    /* JADX INFO: renamed from: x1 */
    private int f19005x1;

    public C6986dy() {
        this(true, 1061109567);
    }

    /* JADX INFO: renamed from: k4 */
    public int m27335k4() {
        return this.f19001h4.length;
    }

    public C6986dy(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        this(true, 1061109567);
        m27336k4(abstractC3150x6);
        m27336k4(abstractC3150x62);
    }

    /* JADX INFO: renamed from: k4 */
    public void m27336k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        C7010x6 c7010x6 = new C7010x6();
        c7010x6.m27422k4(abstractC3150x6);
        m27337k4(c7010x6);
        c7010x6.m27421k4();
    }

    public C6986dy(boolean z, int i) {
        this.f19002k4 = z;
        this.f19005x1 = i;
        this.f19003kk = new ArrayList();
        this.f19004to = new float[3];
        this.f19000du = new float[3];
        this.f19001h4 = new float[3];
    }

    /* JADX INFO: renamed from: k4 */
    public void m27337k4(C7010x6 c7010x6) {
        int i;
        int i2;
        if (c7010x6 == null) {
            throw new ArgumentNullException("profile");
        }
        int i3 = c7010x6.m27423x1().f19023to;
        if (i3 != 1935896178 && i3 != 1835955314 && i3 != 1886549106) {
            throw new NotSupportedException(C14113y2.m67402k4("Type of profile {0} is not supported", C6979b3.m27303du(i3)));
        }
        if (this.f19002k4) {
            i = c7010x6.m27423x1().f19012du;
            i2 = c7010x6.m27423x1().f19015h4;
        } else {
            i = c7010x6.m27423x1().f19015h4;
            i2 = c7010x6.m27423x1().f19012du;
        }
        if (this.f19005x1 == 1061109567) {
            if (this.f19002k4) {
                this.f19005x1 = c7010x6.m27423x1().f19027yj;
            }
            if (this.f19005x1 == 1061109567) {
                this.f19005x1 = 0;
            }
        }
        if (this.f19003kk.size() > 0) {
            if (!C6979b3.m27307k4(((AbstractC7008wy) this.f19003kk.get_Item(r2.size() - 1)).m27409kk(), i)) {
                throw new C6993kk();
            }
        }
        if (this.f19003kk.size() == 0 && this.f19000du.length != C7019kk.m27462to(Byte.valueOf(C6979b3.m27308kk(i)), 6)) {
            this.f19000du = new float[C6979b3.m27308kk(i)];
        }
        if (this.f19001h4.length != C7019kk.m27462to(Byte.valueOf(C6979b3.m27308kk(i2)), 6)) {
            this.f19001h4 = new float[C6979b3.m27308kk(i2)];
        }
        if (this.f19004to.length < C14116yg.m67483k4(this.f19000du.length, this.f19001h4.length)) {
            this.f19004to = new float[C14116yg.m67483k4(this.f19000du.length, this.f19001h4.length)];
        }
        AbstractC7008wy abstractC7008wyM27404k4 = AbstractC7008wy.m27404k4(c7010x6, this.f19002k4, this.f19005x1);
        abstractC7008wyM27404k4.mo27326k4();
        this.f19003kk.addItem(abstractC7008wyM27404k4);
        this.f19002k4 = !this.f19002k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo27338k4(double[] dArr, double[] dArr2) {
        if (dArr == null) {
            throw new ArgumentNullException("srcPixel");
        }
        if (dArr2 == null) {
            throw new ArgumentNullException("dstPixel");
        }
        int i = 0;
        if (this.f19003kk.size() == 0) {
            while (i < dArr.length) {
                dArr2[i] = dArr[i];
                i++;
            }
        } else {
            if (dArr.length != this.f19000du.length) {
                throw new C6988fa();
            }
            if (dArr2.length != this.f19001h4.length) {
                throw new C6988fa();
            }
            for (int i2 = 0; i2 < dArr.length; i2++) {
                this.f19000du[i2] = (float) dArr[i2];
            }
            mo27339k4(this.f19000du, this.f19001h4);
            while (i < dArr2.length) {
                dArr2[i] = this.f19001h4[i];
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo27339k4(float[] fArr, float[] fArr2) {
        if (fArr == null) {
            throw new ArgumentNullException("srcPixel");
        }
        if (fArr2 == null) {
            throw new ArgumentNullException("dstPixel");
        }
        int i = 0;
        if (this.f19003kk.size() == 0) {
            while (i < fArr.length) {
                fArr2[i] = fArr[i];
                i++;
            }
            return;
        }
        if (fArr.length != this.f19000du.length) {
            throw new C6988fa();
        }
        if (fArr2.length != this.f19001h4.length) {
            throw new C6988fa();
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            this.f19004to[i2] = fArr[i2];
        }
        AbstractC7008wy abstractC7008wy = null;
        for (AbstractC7008wy abstractC7008wy2 : this.f19003kk) {
            C6999rv.m27386k4(this.f19004to, abstractC7008wy, abstractC7008wy2);
            abstractC7008wy2.mo27327k4(this.f19004to);
            abstractC7008wy = abstractC7008wy2;
        }
        C6999rv.m27385k4(this.f19004to, abstractC7008wy);
        while (i < fArr2.length) {
            fArr2[i] = this.f19004to[i];
            i++;
        }
    }
}
