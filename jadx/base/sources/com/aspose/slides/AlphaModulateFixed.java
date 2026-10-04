package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class AlphaModulateFixed extends ImageTransformOperation implements IAlphaModulateFixed, lft {

    /* JADX INFO: renamed from: kk */
    private C14352qm f195kk;

    /* JADX INFO: renamed from: x1 */
    private float f196x1;

    public AlphaModulateFixed(float f, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f196x1 = C3085sv.m13070k4(f, 0.0f, Float.POSITIVE_INFINITY);
        m1750m9();
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        AlphaModulateFixed alphaModulateFixed = (AlphaModulateFixed) C7019kk.m27452k4(obj, AlphaModulateFixed.class);
        if (alphaModulateFixed == null) {
            return false;
        }
        return C3085sv.m13089k4(this.f196x1, alphaModulateFixed.f196x1);
    }

    @Override // com.aspose.slides.IAlphaModulateFixed
    public final float getAmount() {
        return this.f196x1;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IAlphaModulateFixedEffectiveData getEffective() {
        return m245k4();
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final C14352qm m245k4() {
        if (this.f195kk == null) {
            this.f195kk = new C14352qm(this);
        }
        return this.f195kk;
    }

    @Override // com.aspose.slides.IAlphaModulateFixed
    public final void setAmount(float f) {
        this.f196x1 = f;
        m1750m9();
    }

    /* JADX INFO: renamed from: k4 */
    public static tc4 m244k4(tc4 tc4Var, float f) {
        float f2 = f / 100.0f;
        tc4Var.m71082dy();
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            tc4Var.m71087to()[i + 3] = C7019kk.m27442k4(Float.valueOf(C3085sv.m13070k4((tc4Var.m71087to()[r2] & 255) * f2, 0.0f, 255.0f)), 13);
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        return m244k4(tc4Var, this.f196x1);
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        return C14113y2.m67408k4(super.mo236k4(iBaseSlide, c14321pz), C14064he.m66704h4(this.f196x1));
    }
}
