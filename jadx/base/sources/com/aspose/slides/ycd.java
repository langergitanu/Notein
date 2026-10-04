package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class ycd {

    /* JADX INFO: renamed from: du */
    private final GradientFormat f50332du;

    /* JADX INFO: renamed from: h4 */
    private final PatternFormat f50333h4;

    /* JADX INFO: renamed from: m9 */
    private long f50336m9;

    /* JADX INFO: renamed from: to */
    private final ColorFormat f50337to;

    /* JADX INFO: renamed from: kk */
    private C14093tq<Boolean> f50335kk = new C14093tq<>();

    /* JADX INFO: renamed from: k4 */
    private byte f50334k4 = -1;

    /* JADX INFO: renamed from: x1 */
    private byte f50338x1 = -1;

    public ycd(ColorFormat colorFormat, GradientFormat gradientFormat, PatternFormat patternFormat) {
        this.f50337to = colorFormat;
        this.f50332du = gradientFormat;
        this.f50333h4 = patternFormat;
    }

    /* JADX INFO: renamed from: dy */
    private void m73841dy() {
        this.f50336m9++;
    }

    /* JADX INFO: renamed from: du */
    public final void m73842du() {
        this.f50334k4 = (byte) -1;
        this.f50337to.m1083m9();
        this.f50332du.m1611k4(false);
        this.f50333h4.m2218k4(false);
        this.f50338x1 = (byte) -1;
        m73841dy();
    }

    public boolean equals(Object obj) {
        ILineFillFormat iLineFillFormat = (ILineFillFormat) C7019kk.m27452k4(obj, ILineFillFormat.class);
        if (iLineFillFormat == null || this.f50334k4 != iLineFillFormat.getFillType()) {
            return false;
        }
        byte b = this.f50334k4;
        if (b == 1) {
            return this.f50337to.equals(iLineFillFormat.getSolidFillColor());
        }
        if (b == 2) {
            return this.f50332du.equals(iLineFillFormat.getGradientFormat()) && this.f50338x1 == iLineFillFormat.getRotateWithShape();
        }
        if (b != 3) {
            return true;
        }
        return this.f50333h4.equals(iLineFillFormat.getPatternFormat()) && this.f50338x1 == iLineFillFormat.getRotateWithShape();
    }

    /* JADX INFO: renamed from: h4 */
    public final long m73843h4() {
        return ((((((this.f50336m9 & 4294967295L) + (this.f50337to.getVersion() & 4294967295L)) & 4294967295L) + (this.f50332du.getVersion() & 4294967295L)) & 4294967295L) + (this.f50333h4.getVersion() & 4294967295L)) & 4294967295L;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m73844k4() {
        return this.f50334k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m73848kk() {
        return this.f50338x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m73849m9() {
        return this.f50334k4 == -1;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m73850to() {
        C14093tq c14093tq;
        if (!this.f50335kk.m67302x1()) {
            C14093tq<Boolean> c14093tq2 = new C14093tq<>(Boolean.FALSE);
            this.f50335kk = c14093tq2;
            if (c14093tq2.m67302x1()) {
                boolean z = true;
                if (!this.f50335kk.m67298k4(Boolean.TYPE).booleanValue() && m73844k4() <= 1 && (m73844k4() != 1 || (((ColorFormat) m73851x1()).m1084to().m56501c5() & 255) == 255)) {
                    z = false;
                }
                c14093tq = new C14093tq(Boolean.valueOf(z));
            } else {
                c14093tq = new C14093tq();
            }
            c14093tq.CloneTo((C14093tq) this.f50335kk);
        }
        return this.f50335kk.m67297k4().booleanValue();
    }

    public String toString() {
        switch (this.f50334k4) {
            case -1:
                return "FillFormat: NotDefined";
            case 0:
                return "FillFormat: NoFill";
            case 1:
                return C14113y2.m67408k4("FillFormat: ", this.f50337to.toString());
            case 2:
                return "FillFormat: Gradient";
            case 3:
                return "FillFormat: Pattern";
            case 4:
                return "FillFormat: Picture";
            case 5:
                return "FillFormat: Group";
            default:
                throw new ArgumentOutOfRangeException();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final IColorFormat m73851x1() {
        return this.f50337to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73845k4(byte b) {
        this.f50334k4 = b;
        m73841dy();
        this.f50335kk = new C14093tq<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73852x1(byte b) {
        this.f50338x1 = b;
        m73841dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73846k4(ILineFillFormat iLineFillFormat) {
        m73853x1(iLineFillFormat);
        m73841dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73853x1(ILineFillFormat iLineFillFormat) {
        this.f50334k4 = iLineFillFormat.getFillType();
        this.f50337to.m1088x1((ColorFormat) iLineFillFormat.getSolidFillColor());
        this.f50332du.m1615x1((GradientFormat) iLineFillFormat.getGradientFormat());
        this.f50333h4.m2223x1((PatternFormat) iLineFillFormat.getPatternFormat());
        this.f50338x1 = iLineFillFormat.getRotateWithShape();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73847k4(ILineFillFormatEffectiveData iLineFillFormatEffectiveData) {
        this.f50334k4 = iLineFillFormatEffectiveData.getFillType();
        switch (iLineFillFormatEffectiveData.getFillType()) {
            case -1:
            case 4:
            case 5:
                throw new ArgumentException();
            case 0:
                break;
            case 1:
                this.f50337to.m1089x1(((erk) iLineFillFormatEffectiveData).m5654x1().Clone());
                break;
            case 2:
                this.f50332du.m1609k4(iLineFillFormatEffectiveData.getGradientFormat());
                break;
            case 3:
                this.f50333h4.m2216k4(iLineFillFormatEffectiveData.getPatternFormat());
                break;
            default:
                throw new ArgumentException();
        }
        this.f50338x1 = iLineFillFormatEffectiveData.getRotateWithShape() ? (byte) 1 : (byte) 0;
        m73841dy();
    }
}
