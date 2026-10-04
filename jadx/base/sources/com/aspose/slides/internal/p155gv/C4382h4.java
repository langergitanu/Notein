package com.aspose.slides.internal.p155gv;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.internal.p420th.AbstractC10972up;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p420th.C10974v4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: renamed from: com.aspose.slides.internal.gv.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C4382h4 extends AbstractC10972up {

    /* JADX INFO: renamed from: k4 */
    private final C10894bv f11911k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f11912x1;

    public C4382h4(C10894bv c10894bv) {
        this.f11911k4 = c10894bv;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13521k4(C10950bv c10950bv) {
        this.f11912x1 = true;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13529x1(C10950bv c10950bv) {
        if (this.f11912x1 || !c10950bv.m52896k4()) {
            return;
        }
        this.f11911k4.m52429kk(C18773h.f57233c);
    }

    /* JADX INFO: renamed from: x1 */
    private void m17713x1(C12025x6 c12025x6) {
        float f = 1;
        String strM52639x1 = C10921yd.m52639x1(c12025x6.m56897x1() / f);
        String strM52639x12 = C10921yd.m52639x1(c12025x6.m56895kk() / f);
        this.f11911k4.m52429kk(strM52639x1);
        this.f11911k4.m52429kk(strM52639x12);
        this.f11911k4.m52426k4("l ");
        int iM27462to = 1;
        while (true) {
            float f2 = iM27462to;
            if (f2 <= 32767.0f) {
                break;
            } else {
                iM27462to = C7019kk.m27462to(Float.valueOf(f2 / 32767.0f), 13) + 1;
            }
        }
        for (int i = 1; i < iM27462to; i++) {
            this.f11911k4.m52429kk(strM52639x1);
            this.f11911k4.m52429kk(strM52639x12);
            this.f11911k4.m52426k4("l ");
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13523k4(C10955du c10955du) {
        if (this.f11912x1) {
            m17711k4(c10955du.m52919k4().m53050k4().Clone());
            this.f11912x1 = false;
        } else {
            m17713x1(c10955du.m52919k4().m53050k4().Clone());
        }
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 3);
        c10955du.m52919k4().m53057x1().CloneTo(c12025x6Arr[0]);
        c10955du.m52919k4().m53053kk().CloneTo(c12025x6Arr[1]);
        c10955du.m52919k4().m53055to().CloneTo(c12025x6Arr[2]);
        m17712k4(c12025x6Arr);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13528k4(C10974v4 c10974v4) {
        if (c10974v4.m53117k4().size() <= 0) {
            return;
        }
        for (int i = 0; i < c10974v4.m53117k4().size(); i++) {
            if (this.f11912x1) {
                m17711k4(c10974v4.m53117k4().get_Item(0).Clone());
                this.f11912x1 = false;
            } else {
                m17713x1(c10974v4.m53117k4().get_Item(i).Clone());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m17711k4(C12025x6 c12025x6) {
        this.f11911k4.m52425k4(c12025x6.Clone());
        this.f11911k4.m52426k4(" m ");
    }

    /* JADX INFO: renamed from: k4 */
    private void m17712k4(C12025x6[] c12025x6Arr) {
        for (int i = 0; i < c12025x6Arr.length; i++) {
            this.f11911k4.m52425k4(c12025x6Arr[i].Clone());
            if (i < c12025x6Arr.length - 1) {
                this.f11911k4.m52426k4(" ");
            }
        }
        this.f11911k4.m52426k4(" c ");
    }
}
