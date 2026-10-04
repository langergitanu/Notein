package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class BiLevel extends ImageTransformOperation implements IBiLevel, lft {

    /* JADX INFO: renamed from: kk */
    private C13841ml f1224kk;

    /* JADX INFO: renamed from: x1 */
    private float f1225x1;

    public BiLevel(float f, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1225x1 = f;
        m1750m9();
    }

    /* JADX INFO: renamed from: k4 */
    public static tc4 m425k4(tc4 tc4Var, float f) {
        float f2 = (255.0f * f) / 100.0f;
        if (f <= 0.0f) {
            f2 = -1.0f;
        }
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            int i2 = i + 2;
            int i3 = i + 1;
            if (((tc4Var.m71087to()[i] & 255) * 0.0722f) + ((tc4Var.m71087to()[i3] & 255) * 0.7151f) + ((tc4Var.m71087to()[i2] & 255) * 0.2126f) > f2) {
                tc4Var.m71087to()[i2] = -1;
                tc4Var.m71087to()[i3] = -1;
                tc4Var.m71087to()[i] = -1;
            } else {
                tc4Var.m71087to()[i2] = 0;
                tc4Var.m71087to()[i3] = 0;
                tc4Var.m71087to()[i] = 0;
            }
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        BiLevel biLevel = (BiLevel) C7019kk.m27452k4(obj, BiLevel.class);
        if (biLevel == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13089k4(this.f1225x1, biLevel.f1225x1);
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IBiLevelEffectiveData getEffective() {
        return m427x1();
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: to */
    public final float m426to() {
        return this.f1225x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13841ml m427x1() {
        if (this.f1224kk == null) {
            this.f1224kk = new C13841ml(this);
        }
        return this.f1224kk;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        return m425k4(tc4Var, m426to());
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        return C14113y2.m67408k4(super.mo236k4(iBaseSlide, c14321pz), C14064he.m66704h4(this.f1225x1));
    }
}
