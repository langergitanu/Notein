package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public final class AlphaCeiling extends ImageTransformOperation implements IAlphaCeiling, lft {
    public AlphaCeiling(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
    }

    /* JADX INFO: renamed from: k4 */
    public static tc4 m237k4(tc4 tc4Var) {
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            int i2 = i + 3;
            if ((tc4Var.m71087to()[i2] & 255) > 0) {
                tc4Var.m71087to()[i2] = -1;
            }
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        return ((AlphaCeiling) C7019kk.m27452k4(obj, AlphaCeiling.class)) != null;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IAlphaCeilingEffectiveData getEffective() {
        return C0843c6.f4281k4;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        return m237k4(tc4Var);
    }
}
