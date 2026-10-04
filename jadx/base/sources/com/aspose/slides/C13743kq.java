package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.kq */
/* JADX INFO: loaded from: classes3.dex */
class C13743kq {

    /* JADX INFO: renamed from: c5 */
    private float f45827c5;

    /* JADX INFO: renamed from: ck */
    private float f45828ck;

    /* JADX INFO: renamed from: du */
    private float f45829du;

    /* JADX INFO: renamed from: dy */
    private float f45830dy;

    /* JADX INFO: renamed from: fa */
    private float f45831fa;

    /* JADX INFO: renamed from: h4 */
    private float f45832h4;

    /* JADX INFO: renamed from: jd */
    private float f45833jd;

    /* JADX INFO: renamed from: k4 */
    protected C14365qy f45834k4;

    /* JADX INFO: renamed from: kk */
    private float f45835kk;

    /* JADX INFO: renamed from: m9 */
    private float f45836m9;

    /* JADX INFO: renamed from: to */
    private float f45837to;

    /* JADX INFO: renamed from: up */
    private float f45838up;

    /* JADX INFO: renamed from: x1 */
    protected IChartWall f45839x1;

    /* JADX INFO: renamed from: yj */
    private float f45840yj;

    public C13743kq(C14365qy c14365qy, IChartWall iChartWall) {
        this.f45834k4 = c14365qy;
        this.f45839x1 = iChartWall;
    }

    /* JADX INFO: renamed from: c5 */
    public final C12003du m64096c5() {
        C12003du c12003duClone;
        double d;
        C12003du c12003duM56400k4;
        int style = this.f45834k4.m69834fa().getStyle();
        int i = style + 1;
        C12003du c12003duClone2 = C12003du.f40505to.Clone();
        if (i <= 32) {
            c12003duM56400k4 = C12003du.f40505to;
        } else {
            if (i <= 34) {
                this.f45834k4.m69834fa().m506k4((byte) 0).CloneTo(c12003duClone2);
                c12003duClone = c12003duClone2.Clone();
                d = 0.5d;
            } else if (i <= 40) {
                this.f45834k4.m69834fa().m506k4((byte) (style - 33)).CloneTo(c12003duClone2);
                c12003duClone = c12003duClone2.Clone();
                d = 0.2d;
            } else {
                this.f45834k4.m69834fa().m506k4((byte) 0).CloneTo(c12003duClone2);
                c12003duClone = c12003duClone2.Clone();
                d = 0.95d;
            }
            im9.m7690k4(c12003duClone, d).CloneTo(c12003duClone2);
            c12003duM56400k4 = C12003du.m56400k4(255, c12003duClone2.Clone());
        }
        c12003duM56400k4.CloneTo(c12003duClone2);
        return c12003duClone2;
    }

    /* JADX INFO: renamed from: ck */
    public final float m64098ck() {
        return this.f45827c5;
    }

    /* JADX INFO: renamed from: du */
    public final float m64100du() {
        return this.f45832h4;
    }

    /* JADX INFO: renamed from: dy */
    public final float m64102dy() {
        return m64117m9() / (((OooOO0O.OooO0O0(this.f45834k4.m69834fa(), 0) & 65535) / 100.0f) + 1.0f);
    }

    /* JADX INFO: renamed from: fa */
    public final float m64104fa() {
        return this.f45833jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m64106h4() {
        return (m64121to() / 2.0f) + m64124x1();
    }

    /* JADX INFO: renamed from: jd */
    public final float m64108jd() {
        return this.f45830dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m64110k4(boolean z, int i, int i2) {
        return ((z ? m64100du() : m64121to()) / i) / (i2 + ((this.f45834k4.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0f));
    }

    /* JADX INFO: renamed from: kk */
    public final float m64114kk() {
        return this.f45837to;
    }

    /* JADX INFO: renamed from: ks */
    public final float m64116ks() {
        return this.f45838up;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m64117m9() {
        return this.f45836m9;
    }

    /* JADX INFO: renamed from: ne */
    public final C12007ix m64119ne() {
        return new C12007ix(m64124x1(), m64114kk() - m64100du(), m64121to(), m64100du());
    }

    /* JADX INFO: renamed from: rv */
    public final float m64120rv() {
        return this.f45840yj;
    }

    /* JADX INFO: renamed from: to */
    public final float m64121to() {
        return this.f45829du;
    }

    /* JADX INFO: renamed from: up */
    public final float m64123up() {
        return this.f45828ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m64124x1() {
        return this.f45835kk;
    }

    /* JADX INFO: renamed from: x6 */
    public void m64126x6() {
        float f;
        IChartWall iChartWall = this.f45839x1;
        if (iChartWall == null) {
            return;
        }
        FillFormat fillFormat = (FillFormat) iChartWall.getFormat().getFill();
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(new C12007ix(m64123up(), m64127yj(), m64116ks() - m64123up(), m64120rv() - m64127yj()));
        C0962es c0962esM7684k4 = im9.m7684k4(m64096c5().Clone().Clone(), fillFormat, this.f45834k4, 1.0f, c11896dy);
        if (c0962esM7684k4.m5681to() == 0) {
            return;
        }
        float f2 = -m64117m9();
        C12007ix c12007ixClone = m64119ne().Clone();
        if (this.f45834k4.m69834fa().getRotation3D().getRightAngleAxes()) {
            f = 0.0f;
        } else {
            float depthPercents = ((this.f45834k4.m69834fa().getRotation3D().getDepthPercents() & 65535) / 100.0f) * this.f45834k4.m69833e0().m64102dy();
            float f3 = -OooOOOO.OooO00o(OooOO0O.OooO0O0(this.f45834k4.m69834fa(), 0) & 65535, 100.0f, depthPercents, depthPercents);
            this.f45834k4.m69855qm().CloneTo(c12007ixClone);
            f = f3;
        }
        C1236i2 c1236i2M69832dy = this.f45834k4.m69832dy();
        if (c0962esM7684k4.m5681to() == 0 || c0962esM7684k4.m5681to() == -1) {
            return;
        }
        if (f2 != 0.0f) {
            c1236i2M69832dy.m7393k4(true);
        }
        c1236i2M69832dy.m7391k4(c12007ixClone.Clone(), c0962esM7684k4, (azo) null, c11896dy, f2, f);
        c1236i2M69832dy.m7393k4(false);
    }

    /* JADX INFO: renamed from: yj */
    public final float m64127yj() {
        return this.f45831fa;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m64097c5(float f) {
        this.f45828ck = f;
    }

    /* JADX INFO: renamed from: ck */
    public final void m64099ck(float f) {
        this.f45838up = f;
    }

    /* JADX INFO: renamed from: du */
    public final void m64101du(float f) {
        this.f45836m9 = f;
    }

    /* JADX INFO: renamed from: fa */
    public final void m64105fa(float f) {
        this.f45840yj = f;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m64107h4(float f) {
        this.f45830dy = f;
    }

    /* JADX INFO: renamed from: jd */
    public final void m64109jd(float f) {
        this.f45831fa = f;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo5519k4() {
        if (this.f45839x1 != null) {
            throw new NotImplementedException("ChartWallRenderContext.DrawBorder3D");
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m64115kk(float f) {
        this.f45829du = f;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m64118m9(float f) {
        this.f45827c5 = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m64122to(float f) {
        this.f45832h4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64125x1(float f) {
        this.f45837to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64111k4(float f) {
        this.f45835kk = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64112k4(C11896dy c11896dy) {
        C12003du c12003duClone = (this.f45839x1 == this.f45834k4.m69834fa().getFloor() ? this.f45834k4.m69834fa().m506k4((byte) 0) : C12003du.f40505to).Clone();
        im9.m7717kk(c12003duClone.Clone(), C12003du.f40505to.Clone(), this.f45834k4, c11896dy, (LineFormat) this.f45839x1.getFormat().getLine(), (FillFormat) this.f45839x1.getFormat().getFill(), this.f45839x1.getFormat().getEffect(), 1.0f);
        im9.m7705k4(c12003duClone.Clone(), this.f45834k4, c11896dy, (LineFormat) this.f45839x1.getFormat().getLine(), this.f45839x1.getFormat().getEffect());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64113k4(C11896dy c11896dy, float f) {
        im9.m7703k4(m64096c5().Clone().Clone(), this.f45834k4, c11896dy, (FillFormat) this.f45839x1.getFormat().getFill(), f, this.f45839x1.getFormat().getEffect());
    }

    /* JADX INFO: renamed from: dy */
    public final void m64103dy(float f) {
        this.f45833jd = f;
    }
}
