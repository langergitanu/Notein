package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
public final class AlphaReplace extends ImageTransformOperation implements IAlphaReplace, lft {

    /* JADX INFO: renamed from: kk */
    private C1135g8 f197kk;

    /* JADX INFO: renamed from: x1 */
    private float f198x1;

    public AlphaReplace(float f, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f198x1 = f;
        m1750m9();
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        AlphaReplace alphaReplace = (AlphaReplace) C7019kk.m27452k4(obj, AlphaReplace.class);
        if (alphaReplace == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13089k4(this.f198x1, alphaReplace.f198x1);
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IAlphaReplaceEffectiveData getEffective() {
        return m247k4();
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final C1135g8 m247k4() {
        if (this.f197kk == null) {
            this.f197kk = new C1135g8(this);
        }
        return this.f197kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m248x1() {
        return this.f198x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static tc4 m246k4(tc4 tc4Var, float f) {
        if (f < 100.0f) {
            tc4Var.m71083h4();
        } else {
            tc4Var.m71086m9();
        }
        byte bM13072k4 = (byte) C3085sv.m13072k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to((f * 255.0f) / 100.0f)), 14), 0, 255);
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            tc4Var.m71087to()[i + 3] = bM13072k4;
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        return m246k4(tc4Var, this.f198x1);
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        return C14113y2.m67408k4(super.mo236k4(iBaseSlide, c14321pz), C14064he.m66704h4(this.f198x1));
    }
}
