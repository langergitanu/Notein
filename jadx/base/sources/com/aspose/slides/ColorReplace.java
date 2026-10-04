package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class ColorReplace extends ImageTransformOperation implements IColorReplace, lft, Cloneable {

    /* JADX INFO: renamed from: kk */
    private C14223od f1976kk;

    /* JADX INFO: renamed from: x1 */
    private ColorFormat f1977x1;

    public ColorReplace(ColorFormat colorFormat, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        m1121to();
        this.f1977x1.m1079k4(colorFormat);
    }

    /* JADX INFO: renamed from: to */
    private void m1121to() {
        ColorFormat colorFormat = new ColorFormat(this);
        this.f1977x1 = colorFormat;
        colorFormat.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.ColorReplace.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperation.OnImageTransformOperationChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                ColorReplace.this.m1749dy();
            }
        });
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        ColorReplace colorReplace = (ColorReplace) C7019kk.m27452k4(obj, ColorReplace.class);
        if (colorReplace == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13090k4(this.f1977x1, colorReplace.f1977x1);
    }

    @Override // com.aspose.slides.IColorReplace
    public final IColorFormat getColor() {
        return this.f1977x1;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IColorReplaceEffectiveData getEffective() {
        return m1122x1();
    }

    @Override // com.aspose.slides.ImageTransformOperation, com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        return ((super.getVersion() & 4294967295L) + (this.f1977x1.getVersion() & 4294967295L)) & 4294967295L;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        C12003du c12003duClone = this.f1977x1.m1082kk(iBaseSlide, null).Clone();
        c12003duClone.m56507jd();
        c12003duClone.m56502ck();
        c12003duClone.m56505fa();
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            tc4Var.m71087to()[i + 2] = c12003duClone.m56507jd();
            tc4Var.m71087to()[i + 1] = c12003duClone.m56502ck();
            tc4Var.m71087to()[i] = c12003duClone.m56505fa();
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: kk */
    public ImageTransformOperation mo241kk() {
        final ColorReplace colorReplace = (ColorReplace) memberwiseClone();
        ColorFormat colorFormat = new ColorFormat(null);
        colorReplace.f1977x1 = colorFormat;
        colorFormat.m1079k4(this.f1977x1);
        colorReplace.f1977x1.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.ColorReplace.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(colorReplace) + "Aspose.Slides.Effects.ImageTransformOperation.OnImageTransformOperationChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                colorReplace.m1749dy();
            }
        });
        return colorReplace;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    public Object memberwiseClone() {
        try {
            ColorReplace colorReplace = (ColorReplace) clone();
            ColorFormat colorFormat = this.f1977x1;
            if (colorFormat == null) {
                return colorReplace;
            }
            colorReplace.f1977x1.m1079k4(colorFormat);
            return colorReplace;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C14223od m1122x1() {
        if (this.f1976kk == null) {
            this.f1976kk = new C14223od(this);
        }
        this.f1976kk.m63282k4(C14223od.class);
        return this.f1976kk;
    }

    public ColorReplace(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        m1121to();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        return C14113y2.m67408k4(super.mo236k4(iBaseSlide, c14321pz), this.f1977x1.m1082kk(iBaseSlide, c14321pz).toString());
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public void mo240k4(InterfaceC14397rj interfaceC14397rj) {
        super.mo240k4(interfaceC14397rj);
        this.f1977x1.m1081k4((InterfaceC14397rj) this);
        m1750m9();
    }
}
