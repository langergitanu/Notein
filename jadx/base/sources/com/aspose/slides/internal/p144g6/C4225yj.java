package com.aspose.slides.internal.p144g6;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p346pw.C9574to;
import com.aspose.slides.internal.p420th.AbstractC10972up;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p420th.C10974v4;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.yj */
/* JADX INFO: loaded from: classes.dex */
public class C4225yj extends AbstractC10972up {

    /* JADX INFO: renamed from: k4 */
    private C6765kp f11526k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f11527x1;

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13521k4(C10950bv c10950bv) {
        this.f11527x1 = true;
    }

    /* JADX INFO: renamed from: kk */
    public final String m17023kk(C10971um c10971um) {
        this.f11526k4 = new C6765kp();
        if (c10971um.m53097h4() == 1) {
            this.f11526k4.m26792k4("F 1 ");
        }
        m53112x1((AbstractC10973uz) c10971um);
        return this.f11526k4.toString();
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13529x1(C10950bv c10950bv) {
        if (c10950bv.m52896k4()) {
            this.f11526k4.m26792k4("Z");
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m17021kk(C12025x6 c12025x6) {
        this.f11526k4.m26792k4(C9574to.m46741k4(c12025x6.m56897x1()));
        this.f11526k4.m26792k4(",");
        this.f11526k4.m26792k4(C9574to.m46741k4(c12025x6.m56895kk()));
        this.f11526k4.m26792k4(" ");
    }

    /* JADX INFO: renamed from: x1 */
    private void m17022x1(C12025x6 c12025x6) {
        this.f11526k4.m26792k4("L");
        m17021kk(c12025x6.Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13523k4(C10955du c10955du) {
        if (this.f11527x1) {
            m17019k4(c10955du.m52919k4().m53050k4().Clone());
            this.f11527x1 = false;
        } else {
            m17022x1(c10955du.m52919k4().m53050k4().Clone());
        }
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 3);
        c10955du.m52919k4().m53057x1().CloneTo(c12025x6Arr[0]);
        c10955du.m52919k4().m53053kk().CloneTo(c12025x6Arr[1]);
        c10955du.m52919k4().m53055to().CloneTo(c12025x6Arr[2]);
        m17020k4(c12025x6Arr);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13528k4(C10974v4 c10974v4) {
        if (c10974v4.m53117k4().size() <= 0) {
            return;
        }
        int i = 0;
        if (this.f11527x1) {
            m17019k4(c10974v4.m53117k4().get_Item(0).Clone());
            this.f11527x1 = false;
            i = 1;
        }
        while (i < c10974v4.m53117k4().size()) {
            m17022x1(c10974v4.m53117k4().get_Item(i).Clone().Clone());
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m17019k4(C12025x6 c12025x6) {
        this.f11526k4.m26792k4("M");
        m17021kk(c12025x6.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m17020k4(C12025x6[] c12025x6Arr) {
        this.f11526k4.m26792k4("C");
        for (C12025x6 c12025x6 : c12025x6Arr) {
            m17021kk(c12025x6.Clone());
        }
    }
}
