package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p420th.AbstractC10972up;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p420th.C10974v4;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6251u4 extends AbstractC10972up {

    /* JADX INFO: renamed from: du */
    private boolean f17717du;

    /* JADX INFO: renamed from: to */
    private boolean f17721to;

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f17719k4 = new C12025x6();

    /* JADX INFO: renamed from: x1 */
    private C12025x6 f17722x1 = new C12025x6();

    /* JADX INFO: renamed from: kk */
    private C12025x6 f17720kk = new C12025x6();

    /* JADX INFO: renamed from: h4 */
    private boolean f17718h4 = true;

    private C6251u4() {
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m25364kk(C10971um c10971um) {
        C6251u4 c6251u4 = new C6251u4();
        c6251u4.m53112x1((AbstractC10973uz) c10971um);
        return c6251u4.f17718h4 || c10971um.m53106m9();
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13521k4(C10950bv c10950bv) {
        this.f17717du = true;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13529x1(C10950bv c10950bv) {
        if (c10950bv.m52896k4()) {
            this.f17722x1.CloneTo(this.f17720kk);
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13523k4(C10955du c10955du) {
        if (this.f17721to) {
            c10955du.m52919k4().m53050k4().CloneTo(this.f17719k4);
            this.f17719k4.CloneTo(this.f17722x1);
        }
        if (this.f17717du && !this.f17721to) {
            c10955du.m52919k4().m53050k4().CloneTo(this.f17722x1);
            this.f17718h4 &= this.f17720kk.equals(this.f17722x1.Clone());
        }
        this.f17721to = false;
        this.f17717du = false;
        c10955du.m52919k4().m53055to().CloneTo(this.f17720kk);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13516x1(C10971um c10971um) {
        this.f17721to = true;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13515k4(C10971um c10971um) {
        this.f17718h4 &= this.f17720kk.equals(this.f17719k4.Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13528k4(C10974v4 c10974v4) {
        if (c10974v4.m53117k4().size() <= 0) {
            return;
        }
        if (this.f17721to) {
            c10974v4.m53117k4().get_Item(0).CloneTo(this.f17719k4);
            this.f17719k4.CloneTo(this.f17722x1);
        }
        if (this.f17717du && !this.f17721to) {
            c10974v4.m53117k4().get_Item(0).CloneTo(this.f17722x1);
            this.f17718h4 &= this.f17720kk.equals(this.f17722x1.Clone());
        }
        this.f17721to = false;
        this.f17717du = false;
        c10974v4.m53117k4().get_Item(c10974v4.m53117k4().size() - 1).CloneTo(this.f17720kk);
    }
}
