package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public final class GrayScale extends ImageTransformOperation implements IGrayScale, lft {
    public GrayScale(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
    }

    /* JADX INFO: renamed from: k4 */
    public static tc4 m1639k4(tc4 tc4Var) {
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            int i2 = i + 2;
            int i3 = i + 1;
            byte bOooO00o = (byte) C22201OooO0oO.OooO00o(((double) (tc4Var.m71087to()[i] & 255)) * 0.0722d, (((double) (tc4Var.m71087to()[i3] & 255)) * 0.7151d) + (((double) (tc4Var.m71087to()[i2] & 255)) * 0.2126d), 14);
            tc4Var.m71087to()[i2] = bOooO00o;
            tc4Var.m71087to()[i3] = bOooO00o;
            tc4Var.m71087to()[i] = bOooO00o;
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        return ((GrayScale) C7019kk.m27452k4(obj, GrayScale.class)) != null;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IGrayScaleEffectiveData getEffective() {
        return C14555te.f49115k4;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        return m1639k4(tc4Var);
    }
}
