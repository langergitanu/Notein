package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.m8 */
/* JADX INFO: loaded from: classes3.dex */
class C13824m8 extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private IChartDataPoint f46182k4;

    /* JADX INFO: renamed from: x1 */
    private lyj f46183x1;

    public C13824m8(C13847mr c13847mr, IChartDataPoint iChartDataPoint) {
        this.f46182k4 = iChartDataPoint;
        Marker marker = new Marker(null, c13847mr.m64945h4());
        marker.setSymbol(0);
        marker.f2675k4 = 4;
        C12003du c12003duClone = igr.m7634x1(c13847mr.m64945h4().m734m9().Clone(), 0.25d).Clone();
        C12003du.m56400k4(255, c12003duClone.Clone()).CloneTo(c12003duClone);
        marker.getFormat().getLine().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) marker.getFormat().getLine().getFillFormat().getSolidFillColor()).m1080k4(c12003duClone.Clone());
        C12003du.m56400k4(255, c13847mr.m64945h4().m734m9().Clone().Clone()).CloneTo(c12003duClone);
        marker.getFormat().getFill().setFillType((byte) 1);
        ((ColorFormat) marker.getFormat().getFill().getSolidFillColor()).m1080k4(c12003duClone.Clone());
        lyj lyjVar = new lyj(marker, c13847mr);
        this.f46183x1 = lyjVar;
        m73215k4(lyjVar);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(0.0f);
        m73222to(0.0f);
        this.f46183x1.m73210fa(new C14713vw(100.0f, 100.0f));
    }

    /* JADX INFO: renamed from: to */
    public final IChartDataPoint m64787to() {
        return this.f46182k4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        lyj lyjVar = this.f46183x1;
        lyjVar.m73208du((-lyjVar.m73225wy()) / 2.0f);
        lyj lyjVar2 = this.f46183x1;
        lyjVar2.m73212h4((-lyjVar2.m73203ak()) / 2.0f);
        this.f46183x1.m73220ss();
    }
}
