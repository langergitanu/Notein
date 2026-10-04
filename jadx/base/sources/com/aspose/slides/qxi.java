package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: loaded from: classes3.dex */
final class qxi extends AbstractC1137ga<PictureFillFormat, qxi> implements IPictureFillFormatEffectiveData {

    /* JADX INFO: renamed from: c5 */
    private int f48418c5;

    /* JADX INFO: renamed from: dy */
    private byte f48420dy;

    /* JADX INFO: renamed from: m9 */
    private int f48424m9;

    /* JADX INFO: renamed from: to */
    private int f48425to;

    /* JADX INFO: renamed from: du */
    private tbp f48419du = new tbp();

    /* JADX INFO: renamed from: h4 */
    private oju f48421h4 = new oju();

    /* JADX INFO: renamed from: k4 */
    private ku2 f48422k4 = new ku2();

    /* JADX INFO: renamed from: x1 */
    private bia f48426x1 = new bia();

    /* JADX INFO: renamed from: kk */
    private bia f48423kk = new bia();

    public qxi(C14176nc c14176nc) {
        oju.f47835to.CloneTo(this.f48421h4);
        this.f48424m9 = 0;
        this.f48420dy = (byte) 0;
    }

    /* JADX INFO: renamed from: c5 */
    public final ku2 m69789c5() {
        return this.f48422k4;
    }

    /* JADX INFO: renamed from: du */
    public final tbp m69790du() {
        return this.f48419du;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m69791dy() {
        return this.f48420dy;
    }

    @Override // com.aspose.slides.IPictureFillFormatEffectiveData
    public final float getCropBottom() {
        return m69801x1().f48078du;
    }

    @Override // com.aspose.slides.IPictureFillFormatEffectiveData
    public final float getCropLeft() {
        return m69801x1().f48081x1;
    }

    @Override // com.aspose.slides.IPictureFillFormatEffectiveData
    public final float getCropRight() {
        return m69801x1().f48080to;
    }

    @Override // com.aspose.slides.IPictureFillFormatEffectiveData
    public final float getCropTop() {
        return m69801x1().f48079kk;
    }

    @Override // com.aspose.slides.IPictureFillFormatEffectiveData
    public final int getDpi() {
        return this.f48418c5;
    }

    @Override // com.aspose.slides.IPictureFillFormatEffectiveData
    public final IPictureEffectiveData getPicture() {
        return this.f48422k4;
    }

    @Override // com.aspose.slides.IPictureFillFormatEffectiveData
    public final int getPictureFillMode() {
        return this.f48425to;
    }

    /* JADX INFO: renamed from: h4 */
    public final oju m69792h4() {
        return this.f48421h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m69793k4(int i, int i2) {
        return this.f48426x1.m4217k4(new C12007ix(0.0f, 0.0f, i, i2));
    }

    /* JADX INFO: renamed from: kk */
    public final bia m69798kk() {
        return this.f48426x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m69799m9() {
        return this.f48424m9;
    }

    /* JADX INFO: renamed from: to */
    public final bia m69800to() {
        return this.f48423kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final pj5 m69801x1() {
        ohe oheVarClone = this.f48426x1.m4218k4().Clone();
        return pj5.m69111k4(new pj5(oheVarClone.f47808k4.Clone(), oju.m68622x1(oju.f47835to, oheVarClone.m68567k4()).Clone()), 100.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69794k4() {
        this.f48422k4.m64177k4();
        this.f48426x1.m4222x1();
        this.f48423kk.m4222x1();
        oju.f47835to.CloneTo(this.f48421h4);
        this.f48424m9 = 0;
        this.f48420dy = (byte) 0;
        this.f48418c5 = 0;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f48422k4.mo4833k4(iBaseSlide, dm6Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69795k4(PictureFillFormat pictureFillFormat) {
        if (pictureFillFormat == null) {
            return;
        }
        this.f48422k4.m64178k4((Picture) pictureFillFormat.getPicture());
        this.f48426x1.m4220k4(pictureFillFormat.m2255m9().m74652x1().m4218k4().Clone());
        this.f48425to = pictureFillFormat.getPictureFillMode();
        this.f48423kk.m4220k4(pictureFillFormat.m2255m9().m74642k4().Clone());
        pictureFillFormat.m2255m9().m74649kk().CloneTo(this.f48419du);
        pictureFillFormat.m2255m9().m74651to().CloneTo(this.f48421h4);
        this.f48424m9 = pictureFillFormat.m2255m9().m74639du();
        this.f48420dy = pictureFillFormat.m2255m9().m74641h4();
        this.f48418c5 = pictureFillFormat.getDpi();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69796k4(InterfaceC14672vc interfaceC14672vc) {
        qxi qxiVar = (qxi) interfaceC14672vc;
        this.f48422k4.m64179k4((InterfaceC14672vc) qxiVar.f48422k4);
        this.f48426x1.m4220k4(qxiVar.f48426x1.m4218k4().Clone());
        this.f48425to = qxiVar.getPictureFillMode();
        this.f48423kk.m4220k4(qxiVar.f48423kk.m4218k4().Clone());
        qxiVar.m69790du().CloneTo(this.f48419du);
        qxiVar.m69792h4().CloneTo(this.f48421h4);
        this.f48424m9 = qxiVar.m69799m9();
        this.f48420dy = qxiVar.m69791dy();
        this.f48418c5 = qxiVar.getDpi();
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, PictureFillFormat pictureFillFormat) {
        m69796k4(interfaceC14672vc);
        m69795k4(pictureFillFormat);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(qxi qxiVar) {
        return qxiVar != null && this.f48422k4.mo4836k4(qxiVar.f48422k4) && this.f48426x1.m4223x1(qxiVar.f48426x1) && this.f48423kk.m4223x1(qxiVar.f48423kk) && this.f48425to == qxiVar.f48425to && !tbp.m71057to(this.f48419du, qxiVar.f48419du) && !oju.m68621to(this.f48421h4, qxiVar.f48421h4) && this.f48424m9 == qxiVar.f48424m9 && this.f48420dy == qxiVar.f48420dy && this.f48418c5 == qxiVar.f48418c5;
    }
}
