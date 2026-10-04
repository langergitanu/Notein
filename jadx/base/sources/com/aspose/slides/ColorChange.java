package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
public final class ColorChange extends ImageTransformOperation implements IColorChange, lft {

    /* JADX INFO: renamed from: du */
    private C14410rr f1925du;

    /* JADX INFO: renamed from: kk */
    private ColorFormat f1926kk;

    /* JADX INFO: renamed from: to */
    private boolean f1927to;

    /* JADX INFO: renamed from: x1 */
    private ColorFormat f1928x1;

    public ColorChange(ColorFormat colorFormat, ColorFormat colorFormat2, boolean z, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1927to = true;
        m1057du();
        this.f1928x1.m1079k4(colorFormat);
        this.f1926kk.m1079k4(colorFormat2);
        this.f1927to = z;
        m1750m9();
    }

    /* JADX INFO: renamed from: du */
    private void m1057du() {
        this.f1928x1 = new ColorFormat(this);
        this.f1926kk = new ColorFormat(this);
        this.f1928x1.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.ColorChange.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperation.OnImageTransformOperationChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                ColorChange.this.m1749dy();
            }
        });
        this.f1926kk.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.ColorChange.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperation.OnImageTransformOperationChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                ColorChange.this.m1749dy();
            }
        });
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        ColorChange colorChange = (ColorChange) C7019kk.m27452k4(obj, ColorChange.class);
        if (colorChange == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13090k4(this.f1928x1, colorChange.f1928x1) && C3085sv.m13090k4(this.f1926kk, colorChange.f1926kk) && this.f1927to == colorChange.f1927to;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IColorChangeEffectiveData getEffective() {
        return m1060x1();
    }

    @Override // com.aspose.slides.IColorChange
    public final IColorFormat getFromColor() {
        return this.f1928x1;
    }

    @Override // com.aspose.slides.IColorChange
    public final IColorFormat getToColor() {
        return this.f1926kk;
    }

    @Override // com.aspose.slides.ImageTransformOperation, com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        return ((((super.getVersion() & 4294967295L) + (this.f1928x1.getVersion() & 4294967295L)) & 4294967295L) + (this.f1926kk.getVersion() & 4294967295L)) & 4294967295L;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        C12003du c12003duClone = this.f1928x1.m1082kk(iBaseSlide, null).Clone();
        C12003du c12003duClone2 = this.f1926kk.m1082kk(iBaseSlide, null).Clone();
        int iM56507jd = (c12003duClone.m56507jd() & 255) - 17;
        int iM56507jd2 = (c12003duClone.m56507jd() & 255) + 17;
        int iM56502ck = (c12003duClone.m56502ck() & 255) - 17;
        int iM56502ck2 = (c12003duClone.m56502ck() & 255) + 17;
        int iM56505fa = (c12003duClone.m56505fa() & 255) - 17;
        int iM56505fa2 = (c12003duClone.m56505fa() & 255) + 17;
        int i = 0;
        if (this.f1927to) {
            int iM56501c5 = (c12003duClone.m56501c5() & 255) - 17;
            int iM56501c52 = (c12003duClone.m56501c5() & 255) + 17;
            while (i < tc4Var.m71087to().length) {
                int i2 = i + 3;
                if (iM56501c5 < (tc4Var.m71087to()[i2] & 255) && (tc4Var.m71087to()[i2] & 255) < iM56501c52) {
                    int i3 = i + 2;
                    if (iM56507jd < (tc4Var.m71087to()[i3] & 255) && (tc4Var.m71087to()[i3] & 255) < iM56507jd2) {
                        int i4 = i + 1;
                        if (iM56502ck < (tc4Var.m71087to()[i4] & 255) && (tc4Var.m71087to()[i4] & 255) < iM56502ck2 && iM56505fa < (tc4Var.m71087to()[i] & 255) && (tc4Var.m71087to()[i] & 255) < iM56505fa2) {
                            tc4Var.m71087to()[i2] = c12003duClone2.m56501c5();
                            tc4Var.m71087to()[i3] = c12003duClone2.m56507jd();
                            tc4Var.m71087to()[i4] = c12003duClone2.m56502ck();
                            tc4Var.m71087to()[i] = c12003duClone2.m56505fa();
                        }
                    }
                }
                i += 4;
            }
        } else {
            while (i < tc4Var.m71087to().length) {
                int i5 = i + 2;
                if (iM56507jd < (tc4Var.m71087to()[i5] & 255) && (tc4Var.m71087to()[i5] & 255) < iM56507jd2) {
                    int i6 = i + 1;
                    if (iM56502ck < (tc4Var.m71087to()[i6] & 255) && (tc4Var.m71087to()[i6] & 255) < iM56502ck2 && iM56505fa < (tc4Var.m71087to()[i] & 255) && (tc4Var.m71087to()[i] & 255) < iM56505fa2) {
                        tc4Var.m71087to()[i5] = c12003duClone2.m56507jd();
                        tc4Var.m71087to()[i6] = c12003duClone2.m56502ck();
                        tc4Var.m71087to()[i] = c12003duClone2.m56505fa();
                    }
                }
                i += 4;
            }
        }
        return tc4Var;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m1059to() {
        return this.f1927to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14410rr m1060x1() {
        if (this.f1925du == null) {
            this.f1925du = new C14410rr(this);
        }
        this.f1925du.m63282k4(C14410rr.class);
        return this.f1925du;
    }

    public ColorChange(C12003du c12003du, int i, boolean z, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1927to = true;
        m1057du();
        this.f1928x1.m1080k4(c12003du.Clone());
        this.f1926kk.setSchemeColor(i);
        this.f1927to = z;
        m1750m9();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        return C14113y2.m67407k4(super.mo236k4(iBaseSlide, c14321pz), this.f1928x1.m1082kk(iBaseSlide, c14321pz), " ", this.f1926kk.m1082kk(iBaseSlide, c14321pz), Character.valueOf(ControlChar.SPACE_CHAR), Boolean.valueOf(this.f1927to));
    }

    public ColorChange(C12003du c12003du, C12003du c12003du2, boolean z, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1927to = true;
        m1057du();
        this.f1928x1.m1080k4(c12003du.Clone());
        this.f1926kk.m1080k4(c12003du2.Clone());
        this.f1927to = z;
        m1750m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1058k4(boolean z) {
        this.f1927to = z;
        m1750m9();
    }

    public ColorChange(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1927to = true;
        m1057du();
    }
}
