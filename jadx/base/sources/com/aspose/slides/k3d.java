package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
final class k3d {

    /* JADX INFO: renamed from: c5 */
    private final Camera f45599c5;

    /* JADX INFO: renamed from: ck */
    private final spu f45600ck;

    /* JADX INFO: renamed from: du */
    private final ShapeBevel f45601du;

    /* JADX INFO: renamed from: dy */
    private final ColorFormat f45602dy;

    /* JADX INFO: renamed from: fa */
    private long f45603fa;

    /* JADX INFO: renamed from: h4 */
    private final ShapeBevel f45604h4;

    /* JADX INFO: renamed from: jd */
    private final LightRig f45605jd;

    /* JADX INFO: renamed from: m9 */
    private final ColorFormat f45608m9;

    /* JADX INFO: renamed from: up */
    private C14093tq<Boolean> f45610up = new C14093tq<>();

    /* JADX INFO: renamed from: k4 */
    private double f45606k4 = 0.0d;

    /* JADX INFO: renamed from: x1 */
    private double f45611x1 = 0.0d;

    /* JADX INFO: renamed from: kk */
    private double f45607kk = 0.0d;

    /* JADX INFO: renamed from: to */
    private int f45609to = -1;

    public k3d(ShapeBevel shapeBevel, ShapeBevel shapeBevel2, ColorFormat colorFormat, ColorFormat colorFormat2, Camera camera, LightRig lightRig, spu spuVar) {
        this.f45601du = shapeBevel;
        this.f45604h4 = shapeBevel2;
        this.f45608m9 = colorFormat;
        this.f45602dy = colorFormat2;
        this.f45599c5 = camera;
        this.f45605jd = lightRig;
        this.f45600ck = spuVar;
    }

    /* JADX INFO: renamed from: up */
    private void m63595up() {
        this.f45603fa++;
    }

    /* JADX INFO: renamed from: c5 */
    public final spu m63596c5() {
        return this.f45600ck;
    }

    /* JADX INFO: renamed from: ck */
    public final void m63597ck() {
        m63596c5().m70718k4(spu.f48887x1);
        this.f45599c5.m450h4();
        this.f45608m9.m1073h4();
        this.f45606k4 = 0.0d;
        this.f45607kk = 0.0d;
        this.f45602dy.m1073h4();
        this.f45611x1 = 0.0d;
        this.f45605jd.m1866h4();
        this.f45609to = -1;
        this.f45604h4.m2600k4((IShapeBevel) ShapeBevel.f3338kk);
        this.f45601du.m2600k4((IShapeBevel) ShapeBevel.f3339x1);
        m63595up();
    }

    /* JADX INFO: renamed from: du */
    public final IShapeBevel m63598du() {
        return this.f45604h4;
    }

    /* JADX INFO: renamed from: dy */
    public final int m63599dy() {
        return this.f45609to;
    }

    public boolean equals(Object obj) {
        IThreeDFormat iThreeDFormat = (IThreeDFormat) C7019kk.m27452k4(obj, IThreeDFormat.class);
        return iThreeDFormat != null && this.f45606k4 == iThreeDFormat.getContourWidth() && this.f45611x1 == iThreeDFormat.getExtrusionHeight() && this.f45607kk == iThreeDFormat.getDepth() && this.f45609to == iThreeDFormat.getMaterial() && this.f45601du.equals(iThreeDFormat.getBevelTop()) && this.f45604h4.equals(iThreeDFormat.getBevelBottom()) && this.f45608m9.equals(iThreeDFormat.getContourColor()) && this.f45602dy.equals(iThreeDFormat.getExtrusionColor()) && this.f45599c5.equals(iThreeDFormat.getCamera()) && this.f45605jd.equals(iThreeDFormat.getLightRig());
    }

    /* JADX INFO: renamed from: fa */
    public final long m63600fa() {
        return ((((((((((((((this.f45603fa & 4294967295L) + (this.f45600ck.m70722to() & 4294967295L)) & 4294967295L) + (this.f45601du.getVersion() & 4294967295L)) & 4294967295L) + (this.f45604h4.getVersion() & 4294967295L)) & 4294967295L) + (this.f45608m9.getVersion() & 4294967295L)) & 4294967295L) + (this.f45602dy.getVersion() & 4294967295L)) & 4294967295L) + (this.f45599c5.getVersion() & 4294967295L)) & 4294967295L) + (this.f45605jd.getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: h4 */
    public final ICamera m63601h4() {
        return this.f45599c5;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m63602jd() {
        C14093tq c14093tq;
        if (!this.f45610up.m67302x1()) {
            C14093tq<Boolean> c14093tq2 = new C14093tq<>(Boolean.FALSE);
            this.f45610up = c14093tq2;
            if (c14093tq2.m67302x1()) {
                c14093tq = new C14093tq(Boolean.valueOf(this.f45610up.m67298k4(Boolean.TYPE).booleanValue() || m63612to().getBevelType() != -1 || m63598du().getBevelType() != -1 || (m63599dy() > -1 && m63599dy() < 3) || m63599dy() > 6));
            } else {
                c14093tq = new C14093tq();
            }
            c14093tq.CloneTo((C14093tq) this.f45610up);
        }
        return this.f45610up.m67297k4().booleanValue();
    }

    /* JADX INFO: renamed from: k4 */
    public final double m63603k4() {
        return this.f45606k4;
    }

    /* JADX INFO: renamed from: kk */
    public final double m63609kk() {
        return this.f45607kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final ILightRig m63611m9() {
        return this.f45605jd;
    }

    /* JADX INFO: renamed from: to */
    public final IShapeBevel m63612to() {
        return this.f45601du;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m63613x1() {
        return this.f45611x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63604k4(double d) {
        this.f45606k4 = d;
        m63595up();
    }

    /* JADX INFO: renamed from: kk */
    public final void m63610kk(double d) {
        this.f45607kk = d;
        m63595up();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m63614x1(double d) {
        this.f45611x1 = d;
        m63595up();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63605k4(int i) {
        this.f45609to = i;
        m63595up();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63606k4(ThreeDFormat threeDFormat) {
        m63596c5().m70718k4(threeDFormat.m3011to());
        this.f45599c5.m451k4(threeDFormat.getCamera());
        this.f45608m9.m1079k4((ColorFormat) threeDFormat.getContourColor());
        this.f45606k4 = threeDFormat.getContourWidth();
        this.f45607kk = threeDFormat.getDepth();
        this.f45602dy.m1079k4((ColorFormat) threeDFormat.getExtrusionColor());
        this.f45611x1 = threeDFormat.getExtrusionHeight();
        this.f45605jd.m1868k4((LightRig) threeDFormat.getLightRig());
        this.f45609to = threeDFormat.getMaterial();
        this.f45604h4.m2600k4(threeDFormat.getBevelBottom());
        this.f45601du.m2600k4(threeDFormat.getBevelTop());
        m63595up();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63607k4(fpw fpwVar) {
        this.f45599c5.m452k4(fpwVar.getCamera());
        this.f45608m9.m1089x1(fpwVar.m6259m9().Clone());
        this.f45606k4 = fpwVar.getContourWidth();
        this.f45607kk = fpwVar.getDepth();
        this.f45602dy.m1089x1(fpwVar.m6253dy().Clone());
        this.f45611x1 = fpwVar.getExtrusionHeight();
        this.f45605jd.m1867k4(fpwVar.getLightRig());
        this.f45609to = fpwVar.getMaterial();
        this.f45604h4.m2601k4(fpwVar.getBevelBottom());
        this.f45601du.m2601k4(fpwVar.getBevelTop());
        m63596c5().m70719k4(fpwVar.m6252c5());
        m63596c5().m70717k4(fpwVar.m6255jd());
        m63596c5().m70721kk().setAnchorPoint(fpwVar.f5092to.m68405kk());
        m63596c5().m70721kk().setNormalVector(fpwVar.f5092to.m68407x1());
        m63596c5().m70721kk().setUpVector(fpwVar.f5092to.m68406to());
        m63595up();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63608k4(boolean z) {
        int i;
        return ((!z || (i = this.f45609to) == -1 || i == 14) && this.f45599c5.getCameraType() == -1 && this.f45605jd.getLightType() == -1) ? false : true;
    }
}
