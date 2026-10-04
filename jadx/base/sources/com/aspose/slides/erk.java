package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class erk extends AbstractC1137ga<LineFillFormat, erk> implements ILineFillFormatEffectiveData {

    /* JADX INFO: renamed from: du */
    private n9i f4853du;

    /* JADX INFO: renamed from: kk */
    private C14811xp f4855kk;

    /* JADX INFO: renamed from: to */
    private C13787ln f4856to;

    /* JADX INFO: renamed from: k4 */
    byte f4854k4 = -1;

    /* JADX INFO: renamed from: x1 */
    boolean f4857x1 = false;

    /* JADX INFO: renamed from: du */
    public final n9i m5647du() {
        if (this.f4853du == null) {
            this.f4853du = new n9i();
        }
        return this.f4853du;
    }

    @Override // com.aspose.slides.ILineFillFormatEffectiveData
    public final byte getFillType() {
        return this.f4854k4;
    }

    @Override // com.aspose.slides.ILineFillFormatEffectiveData
    public final IGradientFormatEffectiveData getGradientFormat() {
        if (getFillType() == 2) {
            return this.f4856to;
        }
        throw new InvalidOperationException(C14113y2.m67408k4("GradientFormat is unavailable for FillType=", C14042ak.m66410k4(FillType.class, getFillType())));
    }

    @Override // com.aspose.slides.ILineFillFormatEffectiveData
    public final IPatternFormatEffectiveData getPatternFormat() {
        if (getFillType() == 3) {
            return this.f4853du;
        }
        throw new InvalidOperationException(C14113y2.m67408k4("PatternFormat is unavailable for FillType=", C14042ak.m66410k4(FillType.class, getFillType())));
    }

    @Override // com.aspose.slides.ILineFillFormatEffectiveData
    public final boolean getRotateWithShape() {
        return this.f4857x1;
    }

    @Override // com.aspose.slides.ILineFillFormatEffectiveData
    public final Integer getSolidFillColor() {
        return (Integer) C12003du.m56473x1(m5654x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5648k4() {
        this.f4854k4 = (byte) -1;
        this.f4857x1 = false;
        C14811xp c14811xp = this.f4855kk;
        if (c14811xp != null) {
            c14811xp.m73529to();
        }
        C13787ln c13787ln = this.f4856to;
        if (c13787ln != null) {
            c13787ln.m64486k4();
        }
        n9i n9iVar = this.f4853du;
        if (n9iVar != null) {
            n9iVar.m67901k4();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final C14811xp m5652kk() {
        if (this.f4855kk == null) {
            this.f4855kk = new C14811xp();
        }
        return this.f4855kk;
    }

    /* JADX INFO: renamed from: to */
    public final C13787ln m5653to() {
        if (this.f4856to == null) {
            this.f4856to = new C13787ln();
        }
        return this.f4856to;
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m5654x1() {
        if (getFillType() == 1) {
            return this.f4855kk.m73522k4();
        }
        throw new InvalidOperationException(C14113y2.m67408k4("SolidFillColor is unavailable for FillType=", C14042ak.m66410k4(FillType.class, getFillType())));
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        byte fillType = getFillType();
        if (fillType == 1) {
            m5652kk().m73524k4(iBaseSlide, dm6Var);
        } else if (fillType == 2) {
            m5653to().mo4833k4(iBaseSlide, dm6Var);
        } else {
            if (fillType != 3) {
                return;
            }
            m5647du().mo4833k4(iBaseSlide, dm6Var);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5649k4(LineFillFormat lineFillFormat) {
        if (lineFillFormat.getFillType() != -1) {
            this.f4854k4 = lineFillFormat.getFillType();
            switch (getFillType()) {
                case -1:
                    throw new ArgumentException();
                case 0:
                    break;
                case 1:
                    if (((ColorFormat) lineFillFormat.getSolidFillColor()).m2138ix()) {
                        m5652kk().m73523k4((ColorFormat) lineFillFormat.getSolidFillColor());
                    }
                    break;
                case 2:
                    if (((GradientFormat) lineFillFormat.getGradientFormat()).m2138ix()) {
                        m5653to().m64487k4((GradientFormat) lineFillFormat.getGradientFormat());
                    }
                    break;
                case 3:
                    if (((PatternFormat) lineFillFormat.getPatternFormat()).m2138ix()) {
                        m5647du().m67902k4((PatternFormat) lineFillFormat.getPatternFormat());
                    }
                    break;
                case 4:
                case 5:
                    throw new ArgumentException();
                default:
                    throw new ArgumentException();
            }
            if (lineFillFormat.getRotateWithShape() != -1) {
                this.f4857x1 = lineFillFormat.getRotateWithShape() == 1;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5650k4(InterfaceC14672vc interfaceC14672vc) {
        erk erkVar = (erk) interfaceC14672vc;
        this.f4854k4 = erkVar.f4854k4;
        this.f4857x1 = erkVar.f4857x1;
        byte fillType = getFillType();
        if (fillType == 1) {
            m5652kk().m73526k4(erkVar.m5652kk());
        } else if (fillType == 2) {
            m5653to().m64488k4((InterfaceC14672vc) erkVar.m5653to());
        } else {
            if (fillType != 3) {
                return;
            }
            m5647du().m67903k4((InterfaceC14672vc) erkVar.m5647du());
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, LineFillFormat lineFillFormat) {
        m5650k4(interfaceC14672vc);
        m5649k4(lineFillFormat);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(erk erkVar) {
        byte b;
        if (erkVar == null || (b = this.f4854k4) != erkVar.f4854k4) {
            return false;
        }
        if (b == 1) {
            return m5652kk().equals(erkVar.m5652kk());
        }
        if (b == 2) {
            return m5653to().equals(erkVar.m5653to()) && this.f4857x1 == erkVar.f4857x1;
        }
        if (b != 3) {
            return true;
        }
        return m5647du().equals(erkVar.m5647du()) && this.f4857x1 == erkVar.f4857x1;
    }
}
