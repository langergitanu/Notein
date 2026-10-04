package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.n8 */
/* JADX INFO: loaded from: classes3.dex */
final class C14172n8 {

    /* JADX INFO: renamed from: du */
    private final GradientFormat f47482du;

    /* JADX INFO: renamed from: dy */
    private long f47483dy;

    /* JADX INFO: renamed from: h4 */
    private final PictureFillFormat f47484h4;

    /* JADX INFO: renamed from: m9 */
    private final PatternFormat f47487m9;

    /* JADX INFO: renamed from: to */
    private final ColorFormat f47488to;

    /* JADX INFO: renamed from: kk */
    private C14093tq<Boolean> f47486kk = new C14093tq<>();

    /* JADX INFO: renamed from: k4 */
    private byte f47485k4 = -1;

    /* JADX INFO: renamed from: x1 */
    private byte f47489x1 = -1;

    public C14172n8(ColorFormat colorFormat, PictureFillFormat pictureFillFormat, GradientFormat gradientFormat, PatternFormat patternFormat) {
        this.f47488to = colorFormat;
        this.f47484h4 = pictureFillFormat;
        this.f47482du = gradientFormat;
        this.f47487m9 = patternFormat;
    }

    /* JADX INFO: renamed from: dy */
    private void m67880dy() {
        this.f47483dy++;
    }

    /* JADX INFO: renamed from: du */
    public final void m67881du() {
        if (this.f47485k4 == -1) {
            return;
        }
        this.f47485k4 = (byte) -1;
        this.f47488to.m1073h4();
        this.f47482du.m1604du();
        this.f47484h4.m2248dy();
        this.f47487m9.m2219to();
        this.f47489x1 = (byte) -1;
        m67880dy();
    }

    public boolean equals(Object obj) {
        IFillFormat iFillFormat = (IFillFormat) C7019kk.m27452k4(obj, IFillFormat.class);
        if (iFillFormat == null) {
            return super.equals(obj);
        }
        if (this.f47485k4 != iFillFormat.getFillType()) {
            return false;
        }
        byte b = this.f47485k4;
        if (b == 1) {
            return this.f47488to.equals(iFillFormat.getSolidFillColor());
        }
        if (b == 2) {
            return this.f47482du.equals(iFillFormat.getGradientFormat()) && this.f47489x1 == iFillFormat.getRotateWithShape();
        }
        if (b == 3) {
            return this.f47487m9.equals(iFillFormat.getPatternFormat()) && this.f47489x1 == iFillFormat.getRotateWithShape();
        }
        if (b != 4) {
            return true;
        }
        return this.f47484h4.equals(iFillFormat.getPictureFillFormat()) && this.f47489x1 == iFillFormat.getRotateWithShape();
    }

    /* JADX INFO: renamed from: h4 */
    public final long m67882h4() {
        return ((((((((this.f47483dy & 4294967295L) + (this.f47488to.getVersion() & 4294967295L)) & 4294967295L) + (this.f47482du.getVersion() & 4294967295L)) & 4294967295L) + (this.f47484h4.getVersion() & 4294967295L)) & 4294967295L) + (this.f47487m9.getVersion() & 4294967295L)) & 4294967295L;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m67883k4() {
        return this.f47485k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m67887kk() {
        return this.f47489x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m67888m9() {
        return this.f47485k4 == -1;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m67889to() {
        C14093tq c14093tq;
        if (!this.f47486kk.m67302x1()) {
            C14093tq<Boolean> c14093tq2 = new C14093tq<>(Boolean.FALSE);
            this.f47486kk = c14093tq2;
            if (c14093tq2.m67302x1()) {
                boolean z = true;
                if (!this.f47486kk.m67298k4(Boolean.TYPE).booleanValue() && m67883k4() <= 1 && (m67883k4() != 1 || (((ColorFormat) m67890x1()).m1084to().m56501c5() & 255) == 255)) {
                    z = false;
                }
                c14093tq = new C14093tq(Boolean.valueOf(z));
            } else {
                c14093tq = new C14093tq();
            }
            c14093tq.CloneTo((C14093tq) this.f47486kk);
        }
        return this.f47486kk.m67297k4().booleanValue();
    }

    public String toString() {
        switch (this.f47485k4) {
            case -1:
                return "FillFormat: NotDefined";
            case 0:
                return "FillFormat: NoFill";
            case 1:
                return C14113y2.m67408k4("FillFormat: ", this.f47488to.toString());
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
    public final IColorFormat m67890x1() {
        return this.f47488to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67884k4(byte b) {
        this.f47485k4 = b;
        m67880dy();
        this.f47486kk = new C14093tq<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m67891x1(byte b) {
        this.f47489x1 = b;
        m67880dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67885k4(FillFormat fillFormat) {
        if (this.f47485k4 == -1 && fillFormat.getFillType() == -1) {
            return;
        }
        this.f47485k4 = fillFormat.getFillType();
        this.f47488to.m1079k4((ColorFormat) fillFormat.getSolidFillColor());
        this.f47482du.m1608k4((GradientFormat) fillFormat.getGradientFormat());
        this.f47484h4.m2252k4((PictureFillFormat) fillFormat.getPictureFillFormat());
        this.f47487m9.m2217k4((PatternFormat) fillFormat.getPatternFormat());
        this.f47489x1 = fillFormat.getRotateWithShape();
        m67880dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67886k4(IFillFormatEffectiveData iFillFormatEffectiveData) {
        this.f47485k4 = iFillFormatEffectiveData.getFillType();
        switch (iFillFormatEffectiveData.getFillType()) {
            case -1:
            case 5:
                throw new ArgumentException();
            case 0:
                break;
            case 1:
                this.f47488to.m1089x1(((C14176nc) iFillFormatEffectiveData).m67938m9().Clone());
                break;
            case 2:
                this.f47482du.m1609k4(iFillFormatEffectiveData.getGradientFormat());
                break;
            case 3:
                this.f47487m9.m2216k4(iFillFormatEffectiveData.getPatternFormat());
                break;
            case 4:
                this.f47484h4.m2251k4(iFillFormatEffectiveData.getPictureFillFormat());
                break;
            default:
                throw new ArgumentException();
        }
        this.f47489x1 = iFillFormatEffectiveData.getRotateWithShape() ? (byte) 1 : (byte) 0;
        m67880dy();
    }
}
