package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class jjy {

    /* JADX INFO: renamed from: du */
    private float f45501du;

    /* JADX INFO: renamed from: k4 */
    private final C12025x6[] f45502k4;

    /* JADX INFO: renamed from: kk */
    private float f45503kk;

    /* JADX INFO: renamed from: to */
    private float f45504to;

    /* JADX INFO: renamed from: x1 */
    private float f45505x1;

    public jjy(C12007ix c12007ix) {
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
        this.f45502k4 = c12025x6Arr;
        c12025x6Arr[0] = new C12025x6(c12007ix.m56571to(), c12007ix.m56554dy());
        c12025x6Arr[1] = new C12025x6(c12007ix.m56556h4(), c12007ix.m56554dy());
        c12025x6Arr[2] = new C12025x6(c12007ix.m56556h4(), c12007ix.m56558k4());
        c12025x6Arr[3] = new C12025x6(c12007ix.m56571to(), c12007ix.m56558k4());
        m63349h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m63349h4() {
        C12025x6[] c12025x6Arr = this.f45502k4;
        if (c12025x6Arr.length == 0) {
            this.f45503kk = 0.0f;
            this.f45505x1 = 0.0f;
            this.f45501du = 0.0f;
            this.f45504to = 0.0f;
            return;
        }
        float fM56897x1 = c12025x6Arr[0].m56897x1();
        float fM56895kk = this.f45502k4[0].m56895kk();
        float fM56897x12 = this.f45502k4[0].m56897x1();
        float fM56895kk2 = this.f45502k4[0].m56895kk();
        int i = 1;
        while (true) {
            C12025x6[] c12025x6Arr2 = this.f45502k4;
            if (i >= c12025x6Arr2.length) {
                this.f45504to = fM56897x1;
                this.f45501du = fM56895kk;
                this.f45505x1 = fM56897x12 - fM56897x1;
                this.f45503kk = fM56895kk2 - fM56895kk;
                return;
            }
            float[] fArr = {fM56897x1};
            float[] fArr2 = {fM56895kk};
            float[] fArr3 = {fM56897x12};
            float[] fArr4 = {fM56895kk2};
            C14873z5.m74326k4(c12025x6Arr2[i].Clone(), fArr, fArr2, fArr3, fArr4);
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr3[0];
            i++;
            fM56895kk = f2;
            fM56897x1 = f;
            fM56895kk2 = fArr4[0];
            fM56897x12 = f3;
        }
    }

    /* JADX INFO: renamed from: du */
    public final C12025x6 m63352du() {
        return new C12025x6((this.f45505x1 / 2.0f) + this.f45504to, (this.f45503kk / 2.0f) + this.f45501du);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63353k4(float f) {
        jjy jjyVar = this;
        if (f == 0.0f) {
            return;
        }
        double d = (((double) (f < 0.0f ? f + 360.0f : f)) * 0.017453292519943295d) % 6.283185307179586d;
        double dM67470dy = C14116yg.m67470dy(d);
        double dM67495m9 = C14116yg.m67495m9(d);
        C12025x6 c12025x6Clone = jjyVar.m63352du().Clone();
        C12025x6 c12025x6 = new C12025x6();
        int i = 0;
        while (true) {
            C12025x6[] c12025x6Arr = jjyVar.f45502k4;
            if (i >= c12025x6Arr.length) {
                m63349h4();
                return;
            }
            c12025x6Arr[i].CloneTo(c12025x6);
            float fM56897x1 = c12025x6Clone.m56897x1() - c12025x6.m56897x1();
            double d2 = fM56897x1;
            double dM56895kk = c12025x6Clone.m56895kk() - c12025x6.m56895kk();
            double d3 = dM67495m9;
            jjyVar.f45502k4[i] = new C12025x6((float) (((d2 * dM67470dy) + ((double) c12025x6Clone.m56897x1())) - (dM56895kk * dM67495m9)), (float) ((dM56895kk * dM67470dy) + (d2 * d3) + ((double) c12025x6Clone.m56895kk())));
            i++;
            jjyVar = this;
            dM67495m9 = d3;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final float m63358kk() {
        return this.f45503kk;
    }

    /* JADX INFO: renamed from: to */
    public final C12007ix m63359to() {
        return new C12007ix(this.f45504to, this.f45501du, this.f45505x1, this.f45503kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final float m63360x1() {
        return this.f45505x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63354k4(C12025x6 c12025x6) {
        C12025x6 c12025x6Clone = m63352du().Clone();
        float fM56897x1 = c12025x6.m56897x1() - c12025x6Clone.m56897x1();
        float fM56895kk = c12025x6.m56895kk() - c12025x6Clone.m56895kk();
        this.f45504to += fM56897x1;
        this.f45501du += fM56895kk;
        C12025x6 c12025x62 = new C12025x6();
        int i = 0;
        while (true) {
            C12025x6[] c12025x6Arr = this.f45502k4;
            if (i >= c12025x6Arr.length) {
                return;
            }
            c12025x6Arr[i].CloneTo(c12025x62);
            this.f45502k4[i] = new C12025x6(c12025x62.m56897x1() + fM56897x1, c12025x62.m56895kk() + fM56895kk);
            i++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m63361x1(C12025x6 c12025x6) {
        return m63350k4(c12025x6.Clone(), this.f45502k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63355k4(IGenericEnumerable<jjy> iGenericEnumerable, float f) {
        C12007ix c12007ixClone = m63359to().Clone();
        c12007ixClone.m56561k4(f, f);
        IGenericEnumerator<jjy> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                if (c12007ixClone.m56569kk(it.next().m63359to().Clone())) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m63362x1(jjy jjyVar) {
        for (C12025x6 c12025x6 : this.f45502k4) {
            if (m63350k4(c12025x6.Clone(), jjyVar.f45502k4)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m63350k4(C12025x6 c12025x6, C12025x6[] c12025x6Arr) {
        int length = c12025x6Arr.length;
        int i = length - 1;
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            if ((c12025x6Arr[i2].m56895kk() > c12025x6.m56895kk()) != (c12025x6Arr[i].m56895kk() > c12025x6.m56895kk())) {
                if (c12025x6.m56897x1() < c12025x6Arr[i2].m56897x1() + (((c12025x6.m56895kk() - c12025x6Arr[i2].m56895kk()) * (c12025x6Arr[i].m56897x1() - c12025x6Arr[i2].m56897x1())) / (c12025x6Arr[i].m56895kk() - c12025x6Arr[i2].m56895kk()))) {
                    z = !z;
                }
            }
            i = i2;
        }
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63356k4(jjy jjyVar) {
        return m63351k4(this.f45502k4, jjyVar.f45502k4);
    }

    public jjy(C12007ix[] c12007ixArr) {
        this.f45502k4 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c12007ixArr.length * 4));
        for (int i = 0; i < c12007ixArr.length; i++) {
            int i2 = i * 4;
            C12007ix c12007ixClone = c12007ixArr[i].Clone();
            this.f45502k4[i2] = new C12025x6(c12007ixClone.m56571to(), c12007ixClone.m56554dy());
            this.f45502k4[i2 + 1] = new C12025x6(c12007ixClone.m56556h4(), c12007ixClone.m56554dy());
            this.f45502k4[i2 + 2] = new C12025x6(c12007ixClone.m56556h4(), c12007ixClone.m56558k4());
            this.f45502k4[i2 + 3] = new C12025x6(c12007ixClone.m56571to(), c12007ixClone.m56558k4());
        }
        m63349h4();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m63351k4(C12025x6[] c12025x6Arr, C12025x6[] c12025x6Arr2) {
        for (C12025x6 c12025x6 : c12025x6Arr) {
            if (!m63350k4(c12025x6.Clone(), c12025x6Arr2)) {
                return false;
            }
        }
        return true;
    }

    public jjy(C12025x6[] c12025x6Arr) {
        this.f45502k4 = c12025x6Arr;
        m63349h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6[] m63357k4() {
        return this.f45502k4;
    }
}
