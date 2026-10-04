package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class Blur extends ImageTransformOperation implements IBlur, lft {

    /* JADX INFO: renamed from: kk */
    private boolean f1230kk;

    /* JADX INFO: renamed from: to */
    private C1194hc f1231to;

    /* JADX INFO: renamed from: x1 */
    private double f1232x1;

    public Blur(double d, boolean z, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1232x1 = d;
        this.f1230kk = z;
        m1750m9();
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        Blur blur = (Blur) C7019kk.m27452k4(obj, Blur.class);
        if (blur == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13088k4(this.f1232x1, blur.f1232x1) && C3085sv.m13090k4(Boolean.valueOf(this.f1230kk), Boolean.valueOf(blur.f1230kk));
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IBlurEffectiveData getEffective() {
        return m428x1();
    }

    @Override // com.aspose.slides.IBlur
    public final boolean getGrow() {
        return this.f1230kk;
    }

    @Override // com.aspose.slides.IBlur
    public final double getRadius() {
        return this.f1232x1;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        C12009k4 c12009k4M71080c5 = tc4Var.m71080c5();
        if (c12009k4M71080c5.mo15753jd() != 2498570) {
            c12009k4M71080c5 = c12009k4M71080c5.m56602k4(new C12014ne(0, 0, c12009k4M71080c5.mo15760yj(), c12009k4M71080c5.mo15757m9()), 2498570);
        }
        C14381rb.m70052k4(c12009k4M71080c5, (byte) 0, 1);
        C1234i0.m7346k4(c12009k4M71080c5, (getRadius() * 12700.0d) / 3.0d, 3);
        return tc4.m71076k4(c12009k4M71080c5);
    }

    @Override // com.aspose.slides.IBlur
    public final void setGrow(boolean z) {
        this.f1230kk = z;
        m1750m9();
    }

    @Override // com.aspose.slides.IBlur
    public final void setRadius(double d) {
        this.f1232x1 = d;
        m1750m9();
    }

    /* JADX INFO: renamed from: x1 */
    public final C1194hc m428x1() {
        if (this.f1231to == null) {
            this.f1231to = new C1194hc(this);
        }
        return this.f1231to;
    }

    public Blur(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        return C14113y2.m67407k4(super.mo236k4(iBaseSlide, c14321pz), C14044b3.m66425h4(this.f1232x1), Boolean.valueOf(this.f1230kk));
    }
}
