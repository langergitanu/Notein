package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
public final class AlphaInverse extends ImageTransformOperation implements IAlphaInverse, lft {

    /* JADX INFO: renamed from: x1 */
    private ColorFormat f191x1;

    public AlphaInverse(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        ColorFormat colorFormat = new ColorFormat(this);
        this.f191x1 = colorFormat;
        colorFormat.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.AlphaInverse.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperation.OnImageTransformOperationChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                AlphaInverse.this.m1749dy();
            }
        });
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        AlphaInverse alphaInverse = (AlphaInverse) C7019kk.m27452k4(obj, AlphaInverse.class);
        if (alphaInverse == null) {
            return false;
        }
        return C3085sv.m13090k4(this.f191x1, alphaInverse.f191x1);
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IAlphaInverseEffectiveData getEffective() {
        return m239k4();
    }

    @Override // com.aspose.slides.ImageTransformOperation, com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        return ((super.getVersion() & 4294967295L) + (this.f191x1.getVersion() & 4294967295L)) & 4294967295L;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final C0922e0 m239k4() {
        return C0922e0.f4699k4;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: kk */
    public ImageTransformOperation mo241kk() {
        final AlphaInverse alphaInverse = new AlphaInverse(null);
        ColorFormat colorFormat = new ColorFormat(null);
        alphaInverse.f191x1 = colorFormat;
        colorFormat.m1079k4(this.f191x1);
        alphaInverse.f191x1.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.AlphaInverse.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(alphaInverse) + "Aspose.Slides.Effects.ImageTransformOperation.OnImageTransformOperationChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                alphaInverse.m1749dy();
            }
        });
        return alphaInverse;
    }

    /* JADX INFO: renamed from: x1 */
    public final ColorFormat m242x1() {
        return this.f191x1;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        byte bM56507jd = this.f191x1.m1084to().m56507jd();
        byte bM56502ck = this.f191x1.m1084to().m56502ck();
        byte bM56505fa = this.f191x1.m1084to().m56505fa();
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            tc4Var.m71087to()[i] = bM56505fa;
            tc4Var.m71087to()[i + 1] = bM56502ck;
            tc4Var.m71087to()[i + 2] = bM56507jd;
            int i2 = i + 3;
            tc4Var.m71087to()[i2] = (byte) (255 - (tc4Var.m71087to()[i2] & 255));
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public void mo240k4(InterfaceC14397rj interfaceC14397rj) {
        super.mo240k4(interfaceC14397rj);
        this.f191x1.m1081k4((InterfaceC14397rj) this);
        m1750m9();
    }
}
