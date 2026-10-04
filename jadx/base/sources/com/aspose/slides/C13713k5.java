package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.k5 */
/* JADX INFO: loaded from: classes3.dex */
class C13713k5 extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private ChartDataPointLevel f45612k4;

    /* JADX INFO: renamed from: kk */
    private C0879d3 f45613kk;

    /* JADX INFO: renamed from: x1 */
    private C14365qy f45614x1;

    public C13713k5(ChartDataPointLevel chartDataPointLevel, C14365qy c14365qy) {
        this.f45612k4 = chartDataPointLevel;
        this.f45614x1 = c14365qy;
        C0879d3 c0879d3 = new C0879d3(chartDataPointLevel, c14365qy);
        this.f45613kk = c0879d3;
        m73215k4(c0879d3);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(15.0f);
        this.f45613kk.m73210fa(c14713vw);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (this.f45612k4.m652m9().m596to().m640x1().getParentLabelLayout() != 0) {
            return;
        }
        this.f45614x1.m69870wy().mo68795k4(new C12014ne(C7019kk.m27462to(Float.valueOf(m73227xk()), 13), C7019kk.m27462to(Float.valueOf(m73206c6()), 13), C7019kk.m27462to(Float.valueOf(m73225wy()), 13), C7019kk.m27462to(Float.valueOf(m73203ak()), 13)), new azo(C12003du.m56385i5().Clone(), 0.15f), new C0962es(C12003du.m56398k4(255, 166, 166, 166).Clone()));
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        C0879d3 c0879d3 = this.f45613kk;
        c0879d3.m73208du(c0879d3.m73205bz() + 3.0f);
        this.f45613kk.m73220ss();
    }
}
