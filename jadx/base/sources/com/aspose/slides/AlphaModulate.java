package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public final class AlphaModulate extends ImageTransformOperation implements IAlphaModulate, lft {
    public AlphaModulate(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        return ((AlphaModulate) C7019kk.m27452k4(obj, AlphaModulate.class)) != null;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IAlphaModulateEffectiveData getEffective() {
        return C0836bz.f4257k4;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        return tc4Var;
    }
}
