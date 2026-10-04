package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: loaded from: classes3.dex */
final class vo4 {

    /* JADX INFO: renamed from: du */
    private ISlideComponent f49634du;

    /* JADX INFO: renamed from: h4 */
    private long f49635h4;

    /* JADX INFO: renamed from: k4 */
    private final ColorFormat f49636k4;

    /* JADX INFO: renamed from: kk */
    private byte f49637kk = -1;

    /* JADX INFO: renamed from: to */
    private final InterfaceC14397rj f49638to;

    /* JADX INFO: renamed from: x1 */
    private final ColorFormat f49639x1;

    public vo4(InterfaceC14397rj interfaceC14397rj, ColorFormat colorFormat, ColorFormat colorFormat2) {
        this.f49638to = interfaceC14397rj;
        this.f49636k4 = colorFormat;
        this.f49639x1 = colorFormat2;
    }

    /* JADX INFO: renamed from: m9 */
    private void m72381m9() {
        this.f49635h4++;
    }

    /* JADX INFO: renamed from: du */
    public final IBaseSlide m72382du() {
        ISlideComponent iSlideComponentM72391to = m72391to();
        if (iSlideComponentM72391to != null) {
            return iSlideComponentM72391to.getSlide();
        }
        return null;
    }

    public boolean equals(Object obj) {
        IPatternFormat iPatternFormat = (IPatternFormat) C7019kk.m27452k4(obj, IPatternFormat.class);
        return iPatternFormat == null ? super.equals(obj) : this.f49636k4.equals(iPatternFormat.getForeColor()) && this.f49639x1.equals(iPatternFormat.getBackColor()) && this.f49637kk == iPatternFormat.getPatternStyle();
    }

    /* JADX INFO: renamed from: h4 */
    public final long m72383h4() {
        return ((((this.f49635h4 & 4294967295L) + (this.f49636k4.getVersion() & 4294967295L)) & 4294967295L) + (this.f49639x1.getVersion() & 4294967295L)) & 4294967295L;
    }

    public int hashCode() {
        return 23456;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m72384k4() {
        return this.f49637kk;
    }

    /* JADX INFO: renamed from: kk */
    public final IColorFormat m72390kk() {
        return this.f49639x1;
    }

    /* JADX INFO: renamed from: to */
    public final ISlideComponent m72391to() {
        ISlideComponent iSlideComponent = this.f49634du;
        if (iSlideComponent == null) {
            ISlideComponent[] iSlideComponentArr = {iSlideComponent};
            kke.m63959k4(ISlideComponent.class, this.f49638to, iSlideComponentArr);
            this.f49634du = iSlideComponentArr[0];
        }
        return this.f49634du;
    }

    /* JADX INFO: renamed from: x1 */
    public final IColorFormat m72392x1() {
        return this.f49636k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m72385k4(C12003du c12003du) {
        IBaseSlide iBaseSlideM72382du = m72382du();
        C14321pz c14321pz = new C14321pz(c12003du.Clone());
        return PatternFormat.m2211k4(false, this.f49637kk, this.f49639x1.m1082kk(iBaseSlideM72382du, c14321pz).Clone(), this.f49636k4.m1082kk(iBaseSlideM72382du, c14321pz).Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72393x1(vo4 vo4Var) {
        m72389k4(vo4Var);
        m72381m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m72386k4(C12003du c12003du, C12003du c12003du2) {
        return PatternFormat.m2211k4(false, this.f49637kk, c12003du.Clone(), c12003du2.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72387k4(byte b) {
        this.f49637kk = b;
        m72381m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72388k4(IPatternFormatEffectiveData iPatternFormatEffectiveData) {
        this.f49637kk = iPatternFormatEffectiveData.getPatternStyle();
        n9i n9iVar = (n9i) iPatternFormatEffectiveData;
        this.f49636k4.m1089x1(n9iVar.m67907x1().Clone());
        this.f49639x1.m1089x1(n9iVar.m67905kk().Clone());
        m72381m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72389k4(vo4 vo4Var) {
        this.f49637kk = vo4Var.m72384k4();
        this.f49636k4.m1088x1((ColorFormat) vo4Var.m72392x1());
        this.f49639x1.m1088x1((ColorFormat) vo4Var.m72390kk());
    }
}
