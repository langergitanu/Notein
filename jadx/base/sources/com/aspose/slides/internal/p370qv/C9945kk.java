package com.aspose.slides.internal.p370qv;

import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.qv.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9945kk {

    /* JADX INFO: renamed from: du */
    public List<C9946to> f35831du = new ArrayList();

    /* JADX INFO: renamed from: dy */
    public C9468x1 f35832dy;

    /* JADX INFO: renamed from: h4 */
    public C12003du f35833h4;

    /* JADX INFO: renamed from: k4 */
    public C12025x6 f35834k4;

    /* JADX INFO: renamed from: kk */
    public C12025x6 f35835kk;

    /* JADX INFO: renamed from: m9 */
    public C12003du f35836m9;

    /* JADX INFO: renamed from: to */
    public C12025x6 f35837to;

    /* JADX INFO: renamed from: x1 */
    public C12025x6 f35838x1;

    public C9945kk(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64, C12003du c12003du, C12003du c12003du2) {
        this.f35834k4 = c12025x6;
        this.f35838x1 = c12025x62;
        this.f35835kk = c12025x63;
        this.f35837to = c12025x64;
        this.f35833h4 = c12003du;
        this.f35836m9 = c12003du2;
        this.f35832dy = new C9468x1(c12025x63, c12025x64);
        m48886k4();
    }

    /* JADX INFO: renamed from: k4 */
    public C9946to m48887k4(C12025x6 c12025x6) {
        List<C9946to> list = this.f35831du;
        ListIterator<C9946to> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C9946to c9946toPrevious = listIterator.previous();
            if (c9946toPrevious.mo48883k4(c12025x6.m56897x1(), c12025x6.m56895kk())) {
                return c9946toPrevious;
            }
        }
        C9946to c9946to = null;
        float f = 0.0f;
        for (C9946to c9946to2 : this.f35831du) {
            float fMin = Math.min(c9946to2.f35843fa.m46539k4(c12025x6), c9946to2.f35850up.m46539k4(c12025x6));
            if (c9946to == null || fMin < f) {
                c9946to = c9946to2;
                f = fMin;
            }
        }
        return c9946to;
    }

    /* JADX INFO: renamed from: k4 */
    private void m48886k4() {
        if (C9467to.m46521k4(this.f35834k4, this.f35838x1) <= 1.0d) {
            this.f35831du.add(new C9946to(C9467to.m46535x1(this.f35834k4, this.f35838x1), this.f35835kk, this.f35837to, this.f35833h4, this.f35836m9));
            return;
        }
        float fM46521k4 = (float) C9467to.m46521k4(this.f35834k4, this.f35838x1);
        float fM46521k42 = ((float) C9467to.m46521k4(this.f35835kk, this.f35837to)) / fM46521k4;
        int i = (int) ((fM46521k4 * 1.0f) + 1.0f);
        C12025x6 c12025x6Clone = this.f35834k4.Clone();
        C12025x6 c12025x6Clone2 = this.f35835kk.Clone();
        C9468x1 c9468x1 = new C9468x1(this.f35834k4, this.f35838x1);
        C9468x1 c9468x12 = new C9468x1(this.f35835kk, this.f35837to);
        int i2 = 0;
        C12025x6 c12025x6 = c12025x6Clone2;
        while (true) {
            C12025x6 c12025x62 = c12025x6Clone;
            if (i2 >= i) {
                return;
            }
            c12025x6Clone = C9467to.m46524k4(c9468x1, c12025x62, this.f35838x1, 1.0f);
            C12025x6 c12025x6M46524k4 = C9467to.m46524k4(c9468x12, c12025x6, this.f35837to, fM46521k42);
            this.f35831du.add(new C9946to(c12025x62, c12025x6, c12025x6M46524k4, this.f35833h4, this.f35836m9));
            i2++;
            c12025x6 = c12025x6M46524k4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m48888k4(double d, double d2) {
        return AbstractC9947x1.m48891k4(this.f35834k4, this.f35835kk, this.f35837to, d, d2) || AbstractC9947x1.m48891k4(this.f35834k4, this.f35837to, this.f35838x1, d, d2);
    }
}
