package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class r1l {

    /* JADX INFO: renamed from: ks */
    private LineFillFormat f48520ks;

    /* JADX INFO: renamed from: ne */
    private long f48522ne;

    /* JADX INFO: renamed from: rv */
    private SketchFormat f48523rv;

    /* JADX INFO: renamed from: x6 */
    private C14093tq<Boolean> f48527x6 = new C14093tq<>();

    /* JADX INFO: renamed from: k4 */
    private double f48518k4 = Double.NaN;

    /* JADX INFO: renamed from: x1 */
    private byte f48526x1 = -1;

    /* JADX INFO: renamed from: kk */
    private float[] f48519kk = null;

    /* JADX INFO: renamed from: to */
    private byte f48524to = -1;

    /* JADX INFO: renamed from: du */
    private byte f48513du = -1;

    /* JADX INFO: renamed from: h4 */
    private byte f48516h4 = -1;

    /* JADX INFO: renamed from: m9 */
    private byte f48521m9 = -1;

    /* JADX INFO: renamed from: dy */
    private float f48514dy = Float.NaN;

    /* JADX INFO: renamed from: c5 */
    private byte f48511c5 = -1;

    /* JADX INFO: renamed from: jd */
    private byte f48517jd = -1;

    /* JADX INFO: renamed from: ck */
    private byte f48512ck = -1;

    /* JADX INFO: renamed from: fa */
    private byte f48515fa = -1;

    /* JADX INFO: renamed from: up */
    private byte f48525up = -1;

    /* JADX INFO: renamed from: yj */
    private byte f48528yj = -1;

    public r1l(LineFillFormat lineFillFormat, SketchFormat sketchFormat) {
        this.f48520ks = lineFillFormat;
        this.f48523rv = sketchFormat;
    }

    /* JADX INFO: renamed from: ix */
    private void m69977ix() {
        this.f48522ne++;
    }

    /* JADX INFO: renamed from: c5 */
    public final float m69978c5() {
        return this.f48514dy;
    }

    /* JADX INFO: renamed from: ck */
    public final byte m69980ck() {
        return this.f48517jd;
    }

    /* JADX INFO: renamed from: du */
    public final byte m69982du() {
        return this.f48524to;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m69984dy() {
        return this.f48521m9;
    }

    public final boolean equals(Object obj) {
        if (obj == null || ((LineFormat) C7019kk.m27452k4(obj, LineFormat.class)) == null) {
            return false;
        }
        return m69997k4((LineFormat) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final byte m69986fa() {
        return this.f48512ck;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m69987h4() {
        return this.f48513du;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f48519kk) + C12569rv.m58664k4(Double.valueOf(this.f48518k4), Byte.valueOf(this.f48526x1), Byte.valueOf(this.f48524to), Byte.valueOf(this.f48513du), Byte.valueOf(this.f48516h4), Byte.valueOf(this.f48521m9), Float.valueOf(this.f48514dy), Byte.valueOf(this.f48511c5), Byte.valueOf(this.f48517jd), Byte.valueOf(this.f48512ck), Byte.valueOf(this.f48515fa), Byte.valueOf(this.f48525up), Byte.valueOf(this.f48528yj));
    }

    /* JADX INFO: renamed from: jd */
    public final byte m69989jd() {
        return this.f48511c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69991k4(byte b) {
        this.f48526x1 = b;
        m69977ix();
    }

    /* JADX INFO: renamed from: kk */
    public final byte m69998kk() {
        return this.f48526x1;
    }

    /* JADX INFO: renamed from: ks */
    public final byte m70001ks() {
        return this.f48528yj;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte m70002m9() {
        return this.f48516h4;
    }

    /* JADX INFO: renamed from: ne */
    public final long m70004ne() {
        return ((((this.f48522ne & 4294967295L) + (this.f48520ks.getVersion() & 4294967295L)) & 4294967295L) + (this.f48523rv.getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: rv */
    public final boolean m70005rv() {
        if (this.f48520ks.m1881to()) {
            return true;
        }
        if (!this.f48527x6.m67302x1()) {
            this.f48527x6 = new C14093tq<>(Boolean.FALSE);
        }
        return this.f48527x6.m67297k4().booleanValue();
    }

    /* JADX INFO: renamed from: to */
    public final void m70006to(byte b) {
        this.f48516h4 = b;
        m69977ix();
    }

    public String toString() {
        return C14113y2.m67408k4("LineFormat: ", C14042ak.m66410k4(LineStyle.class, this.f48513du), ", width ", C14044b3.m66425h4(this.f48518k4));
    }

    /* JADX INFO: renamed from: up */
    public final byte m70008up() {
        return this.f48515fa;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m70009x1() {
        return this.f48518k4;
    }

    /* JADX INFO: renamed from: x6 */
    public final void m70012x6() {
        if (this.f48520ks.m1876du() && this.f48523rv.m2672h4() && C3085sv.m13088k4(this.f48518k4, Double.NaN) && this.f48516h4 == -1 && this.f48513du == -1 && this.f48521m9 == -1 && this.f48524to == -1 && C3085sv.m13089k4(this.f48514dy, Float.NaN) && this.f48511c5 == -1 && this.f48525up == -1 && this.f48512ck == -1 && this.f48517jd == -1 && this.f48528yj == -1 && this.f48515fa == -1 && this.f48526x1 == -1) {
            return;
        }
        this.f48526x1 = (byte) -1;
        this.f48518k4 = Double.NaN;
        this.f48524to = (byte) -1;
        this.f48513du = (byte) -1;
        this.f48516h4 = (byte) -1;
        this.f48521m9 = (byte) -1;
        this.f48514dy = Float.NaN;
        this.f48511c5 = (byte) -1;
        this.f48517jd = (byte) -1;
        this.f48512ck = (byte) -1;
        this.f48515fa = (byte) -1;
        this.f48525up = (byte) -1;
        this.f48528yj = (byte) -1;
        this.f48519kk = null;
        this.f48520ks.m1877h4();
        this.f48523rv.m2677m9();
        m69977ix();
    }

    /* JADX INFO: renamed from: yj */
    public final byte m70013yj() {
        return this.f48525up;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m69979c5(byte b) {
        this.f48515fa = b;
        m69977ix();
    }

    /* JADX INFO: renamed from: ck */
    public final void m69981ck(byte b) {
        this.f48528yj = b;
        m69977ix();
    }

    /* JADX INFO: renamed from: du */
    public final void m69983du(byte b) {
        this.f48521m9 = b;
        m69977ix();
    }

    /* JADX INFO: renamed from: dy */
    public final void m69985dy(byte b) {
        this.f48512ck = b;
        m69977ix();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m69988h4(byte b) {
        this.f48511c5 = b;
        m69977ix();
    }

    /* JADX INFO: renamed from: jd */
    public final void m69990jd(byte b) {
        this.f48525up = b;
        m69977ix();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69992k4(double d) {
        this.f48518k4 = C3085sv.m13069k4(d, 0.0d, 4096.0d);
        m69977ix();
    }

    /* JADX INFO: renamed from: kk */
    public final void m69999kk(byte b) {
        this.f48513du = b;
        m69977ix();
    }

    /* JADX INFO: renamed from: m9 */
    public final void m70003m9(byte b) {
        this.f48517jd = b;
        m69977ix();
    }

    /* JADX INFO: renamed from: to */
    public final float[] m70007to() {
        return this.f48519kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70010x1(byte b) {
        this.f48524to = b;
        m69977ix();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69993k4(float f) {
        this.f48514dy = f;
        m69977ix();
    }

    /* JADX INFO: renamed from: kk */
    public final void m70000kk(LineFormat lineFormat) {
        this.f48526x1 = lineFormat.getDashStyle();
        this.f48518k4 = lineFormat.getWidth();
        this.f48524to = lineFormat.getCapStyle();
        this.f48513du = lineFormat.getStyle();
        this.f48516h4 = lineFormat.getAlignment();
        this.f48521m9 = lineFormat.getJoinStyle();
        this.f48514dy = lineFormat.getMiterLimit();
        this.f48511c5 = lineFormat.getBeginArrowheadStyle();
        this.f48517jd = lineFormat.getEndArrowheadStyle();
        this.f48512ck = lineFormat.getBeginArrowheadWidth();
        this.f48515fa = lineFormat.getEndArrowheadWidth();
        this.f48525up = lineFormat.getBeginArrowheadLength();
        this.f48528yj = lineFormat.getEndArrowheadLength();
        this.f48519kk = lineFormat.getCustomDashPattern();
        this.f48520ks.m1878k4(lineFormat.getFillFormat());
        this.f48523rv.m2674k4(lineFormat.getSketchFormat());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70011x1(LineFormat lineFormat) {
        if (m69997k4(lineFormat)) {
            return;
        }
        m70000kk(lineFormat);
        m69977ix();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69994k4(ILineFormatEffectiveData iLineFormatEffectiveData) {
        this.f48526x1 = iLineFormatEffectiveData.getDashStyle();
        this.f48518k4 = iLineFormatEffectiveData.getWidth();
        this.f48524to = iLineFormatEffectiveData.getCapStyle();
        this.f48513du = iLineFormatEffectiveData.getStyle();
        this.f48516h4 = iLineFormatEffectiveData.getAlignment();
        this.f48521m9 = iLineFormatEffectiveData.getJoinStyle();
        this.f48514dy = iLineFormatEffectiveData.getMiterLimit();
        this.f48511c5 = iLineFormatEffectiveData.getBeginArrowheadStyle();
        this.f48517jd = iLineFormatEffectiveData.getEndArrowheadStyle();
        this.f48512ck = iLineFormatEffectiveData.getBeginArrowheadWidth();
        this.f48515fa = iLineFormatEffectiveData.getEndArrowheadWidth();
        this.f48525up = iLineFormatEffectiveData.getBeginArrowheadLength();
        this.f48528yj = iLineFormatEffectiveData.getEndArrowheadLength();
        this.f48519kk = iLineFormatEffectiveData.getCustomDashPattern();
        if (iLineFormatEffectiveData.getFillFormat().getFillType() != -1) {
            this.f48520ks.m1879k4(iLineFormatEffectiveData.getFillFormat());
        }
        if (iLineFormatEffectiveData.getSketchFormat().getSketchType() != -1) {
            this.f48523rv.m2675k4(iLineFormatEffectiveData.getSketchFormat());
        }
        m69977ix();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69995k4(float[] fArr) {
        this.f48519kk = fArr;
        if (fArr != null) {
            this.f48526x1 = (byte) 11;
        }
        m69977ix();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m69996k4() {
        return this.f48520ks.getFillType() == -1 && this.f48523rv.getSketchType() == -1 && C14044b3.m66437kk(this.f48518k4) && this.f48516h4 == -1 && this.f48513du == -1 && this.f48521m9 == -1 && this.f48524to == -1 && this.f48526x1 == -1 && C14064he.m66715kk(this.f48514dy) && this.f48511c5 == -1 && this.f48525up == -1 && this.f48512ck == -1 && this.f48517jd == -1 && this.f48528yj == -1 && this.f48515fa == -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m69997k4(LineFormat lineFormat) {
        return lineFormat != null && this.f48520ks.equals(lineFormat.getFillFormat()) && this.f48523rv.equals(lineFormat.getSketchFormat()) && C3085sv.m13088k4(this.f48518k4, lineFormat.getWidth()) && this.f48516h4 == lineFormat.getAlignment() && this.f48513du == lineFormat.getStyle() && this.f48521m9 == lineFormat.getJoinStyle() && this.f48524to == lineFormat.getCapStyle() && C3085sv.m13089k4(this.f48514dy, lineFormat.getMiterLimit()) && this.f48511c5 == lineFormat.getBeginArrowheadStyle() && this.f48525up == lineFormat.getBeginArrowheadLength() && this.f48512ck == lineFormat.getBeginArrowheadWidth() && this.f48517jd == lineFormat.getEndArrowheadStyle() && this.f48528yj == lineFormat.getEndArrowheadLength() && this.f48515fa == lineFormat.getEndArrowheadWidth() && this.f48526x1 == lineFormat.getDashStyle();
    }
}
