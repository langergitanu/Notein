package com.aspose.slides.internal.p219k6;

import com.aspose.slides.internal.p044bq.C1834du;
import com.aspose.slides.internal.p044bq.C1835h4;
import com.aspose.slides.internal.p044bq.C1837kk;
import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p340pm.C9464du;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.k6.du */
/* JADX INFO: loaded from: classes.dex */
public class C5617du extends AbstractC5618k4 {

    /* JADX INFO: renamed from: k4 */
    private float f15436k4;

    /* JADX INFO: renamed from: x1 */
    private C9464du f15437x1;

    public C5617du(C12026yj c12026yj) {
        float fM56930ne = (c12026yj.m56930ne() / 2.0f) * c12026yj.m56928ks();
        this.f15436k4 = fM56930ne;
        this.f15437x1 = C9464du.m46500k4(fM56930ne, c12026yj.m56940x6());
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m22998k4(C12025x6 c12025x6, C12025x6 c12025x62, float f, float f2, float f3) {
        C12025x6 c12025x63 = new C12025x6(c12025x62.m56897x1() - c12025x6.m56897x1(), c12025x62.m56895kk() - c12025x6.m56895kk());
        C12025x6[] c12025x6ArrM46504k4 = this.f15437x1.m46504k4(new C9468x1(new C12025x6(f2, f3), c12025x63));
        if (c12025x6ArrM46504k4 == null) {
            return null;
        }
        C12025x6 c12025x64 = C9467to.m46521k4(c12025x6ArrM46504k4[0], c12025x63) < C9467to.m46521k4(c12025x6ArrM46504k4[1], c12025x63) ? c12025x6ArrM46504k4[0] : c12025x6ArrM46504k4[1];
        c12025x64.m56891k4(c12025x6.m56897x1() + c12025x64.m56897x1());
        c12025x64.m56898x1(c12025x6.m56895kk() + c12025x64.m56895kk());
        return C9467to.m46521k4(c12025x6, c12025x64) > ((double) f) ? c12025x62 : c12025x64;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m23001x1(C1837kk c1837kk, C1835h4 c1835h4, boolean z) {
        return c1835h4.f6639k4.mo16589kk() || !c1837kk.m9601to() || m23005k4(c1835h4.f6635dy, z);
    }

    /* JADX INFO: renamed from: k4 */
    private void m22999k4(C1837kk c1837kk, C1834du c1834du, C1835h4 c1835h4, C12025x6 c12025x6, C7024du c7024du, boolean z) {
        float f;
        float f2;
        C7024du c7024du2;
        float fM56897x1 = c1834du.f6626h4.m56897x1();
        float fM56895kk = c1834du.f6626h4.m56895kk();
        float fM56897x12 = c12025x6.m56897x1();
        float fM56895kk2 = c12025x6.m56895kk();
        float fM56897x13 = c1834du.f6624du.m56897x1();
        float fM56895kk3 = c1834du.f6624du.m56895kk();
        C7024du c7024du3 = c1835h4.f6642to;
        if (m23000k4(c1837kk, c1835h4, z)) {
            f = fM56895kk3;
            f2 = fM56897x13;
            c7024du2 = c7024du3;
            C12025x6[] c12025x6ArrM23003k4 = m23003k4(f2, f, fM56897x1, fM56895kk, fM56897x12, fM56895kk2, c7024du3.f19088k4, c7024du3.f19091x1, c7024du.f19088k4, c7024du.f19091x1, this.f15436k4);
            if (C9467to.m46528k4(c12025x6ArrM23003k4[0]) && C9467to.m46528k4(c12025x6ArrM23003k4[1])) {
                c1835h4.f6632c5 = c12025x6ArrM23003k4[0];
                c1835h4.f6638jd = c12025x6ArrM23003k4[1];
            }
        } else {
            f = fM56895kk3;
            f2 = fM56897x13;
            c7024du2 = c7024du3;
        }
        if (m23001x1(c1837kk, c1835h4, z)) {
            C12025x6[] c12025x6ArrM23003k42 = m23003k4(f2, f, fM56897x1, fM56895kk, fM56897x12, fM56895kk2, c7024du2.f19089kk, c7024du2.f19090to, c7024du.f19089kk, c7024du.f19090to, this.f15436k4);
            if (C9467to.m46528k4(c12025x6ArrM23003k42[0]) && C9467to.m46528k4(c12025x6ArrM23003k42[1])) {
                c1835h4.f6633ck = c12025x6ArrM23003k42[0];
                c1835h4.f6636fa = c12025x6ArrM23003k42[1];
            }
        }
    }

    @Override // com.aspose.slides.internal.p219k6.InterfaceC5620to
    /* JADX INFO: renamed from: k4 */
    public void mo23002k4(C1837kk c1837kk, C1835h4 c1835h4, C12025x6 c12025x6, C7024du c7024du, boolean z) {
        m22999k4(c1837kk, c1837kk.m9583h4(), c1835h4, c12025x6, c7024du, z);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m23000k4(C1837kk c1837kk, C1835h4 c1835h4, boolean z) {
        if (c1835h4.f6639k4.mo16589kk()) {
            return false;
        }
        return !c1837kk.m9601to() || m23005k4(c1835h4.f6641m9, z);
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6[] m23003k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        C12025x6 c12025x6 = new C12025x6(f + f7, f2 + f8);
        C12025x6 c12025x62 = new C12025x6(f + f9, f2 + f10);
        C12025x6 c12025x6M23004k4 = m23004k4(f, f2, f3, f4, f5, f6, f7, f8, f9, f10);
        C12025x6 c12025x63 = new C12025x6(f, f2);
        float fM46521k4 = (float) C9467to.m46521k4(c12025x63, c12025x6M23004k4);
        if (f11 < fM46521k4) {
            C12025x6 c12025x6M22998k4 = m22998k4(c12025x63, c12025x6M23004k4, fM46521k4, f7, f8);
            if (c12025x6M22998k4 != null) {
                c12025x6 = c12025x6M22998k4;
            }
            C12025x6 c12025x6M22998k42 = m22998k4(c12025x63, c12025x6M23004k4, fM46521k4, f9, f10);
            if (c12025x6M22998k42 != null) {
                c12025x62 = c12025x6M22998k42;
            }
            c12025x6M23004k4 = c12025x6;
        } else {
            c12025x62 = c12025x6M23004k4;
        }
        return new C12025x6[]{c12025x6M23004k4, c12025x62};
    }
}
