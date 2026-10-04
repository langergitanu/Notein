package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class AlphaBiLevel extends ImageTransformOperation implements IAlphaBiLevel, lft {

    /* JADX INFO: renamed from: kk */
    private C14789xk f189kk;

    /* JADX INFO: renamed from: x1 */
    private float f190x1;

    public AlphaBiLevel(float f, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f190x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public static tc4 m233k4(tc4 tc4Var, float f) {
        int iOooO00o = OooO00o.OooO00o(f, 2.55d, 14);
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            byte[] bArrM71087to = tc4Var.m71087to();
            int i2 = i + 3;
            int i3 = 255;
            if ((tc4Var.m71087to()[i2] & 255) < iOooO00o) {
                i3 = 0;
            }
            bArrM71087to[i2] = (byte) i3;
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        AlphaBiLevel alphaBiLevel = (AlphaBiLevel) C7019kk.m27452k4(obj, AlphaBiLevel.class);
        if (alphaBiLevel == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13089k4(this.f190x1, alphaBiLevel.f190x1);
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IAlphaBiLevelEffectiveData getEffective() {
        return m235k4();
    }

    @Override // com.aspose.slides.IAlphaBiLevel
    public final float getThreshold() {
        return this.f190x1;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.IAlphaBiLevel
    public final void setThreshold(float f) {
        this.f190x1 = f;
        m1750m9();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        return m233k4(tc4Var, getThreshold());
    }

    /* JADX INFO: renamed from: k4 */
    public final C14789xk m235k4() {
        if (this.f189kk == null) {
            this.f189kk = new C14789xk(this);
        }
        return this.f189kk;
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        return C14113y2.m67408k4(super.mo236k4(iBaseSlide, c14321pz), C14064he.m66704h4(this.f190x1));
    }
}
