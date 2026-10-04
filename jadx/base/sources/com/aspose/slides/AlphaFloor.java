package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public final class AlphaFloor extends ImageTransformOperation implements IAlphaFloor, lft {
    public AlphaFloor(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
    }

    /* JADX INFO: renamed from: k4 */
    public static tc4 m238k4(tc4 tc4Var) {
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            int i2 = i + 3;
            if ((tc4Var.m71087to()[i2] & 255) < 255) {
                tc4Var.m71087to()[i2] = 0;
            }
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        return ((AlphaFloor) C7019kk.m27452k4(obj, AlphaFloor.class)) != null;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IAlphaFloorEffectiveData getEffective() {
        return C14574ts.f49185k4;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        return m238k4(tc4Var);
    }
}
