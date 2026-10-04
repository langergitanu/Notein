package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
public final class Tint extends ImageTransformOperation implements ITint, lft {

    /* JADX INFO: renamed from: kk */
    private float f3602kk;

    /* JADX INFO: renamed from: to */
    private az5 f3603to;

    /* JADX INFO: renamed from: x1 */
    private float f3604x1;

    public Tint(float f, float f2, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f3604x1 = f;
        this.f3602kk = f2;
        m1750m9();
    }

    /* JADX INFO: renamed from: k4 */
    public static tc4 m3022k4(tc4 tc4Var, float f, float f2) {
        float f3 = f / 100.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i = 0;
        while (i < tc4Var.m71087to().length) {
            float[] fArr = {f4};
            float[] fArr2 = {f5};
            float[] fArr3 = {f6};
            int i2 = i + 2;
            int i3 = i + 1;
            ColorFormat.m1063k4((tc4Var.m71087to()[i2] & 255) / 255.0f, (tc4Var.m71087to()[i3] & 255) / 255.0f, (tc4Var.m71087to()[i] & 255) / 255.0f, fArr, fArr2, fArr3);
            float f7 = fArr[0];
            float f8 = fArr2[0];
            float f9 = fArr3[0];
            float f10 = (f2 - f7) % 360.0f;
            if (f10 < -180.0f) {
                f10 += 360.0f;
            } else if (f10 > 180.0f) {
                f10 -= 360.0f;
            }
            f4 = ((f10 * f3) + f7) % 360.0f;
            C14321pz c14321pzM1065to = ColorFormat.m1065to(f4, f8, f9);
            tc4Var.m71087to()[i2] = C22202OooO0oo.OooO00o(c14321pzM1065to.f48208x1, 255.0f, 13);
            tc4Var.m71087to()[i3] = C22202OooO0oo.OooO00o(c14321pzM1065to.f48206kk, 255.0f, 13);
            tc4Var.m71087to()[i] = C22202OooO0oo.OooO00o(c14321pzM1065to.f48207to, 255.0f, 13);
            i += 4;
            f5 = f8;
            f6 = f9;
        }
        return tc4Var;
    }

    /* JADX INFO: renamed from: du */
    public final float m3023du() {
        return this.f3602kk;
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        Tint tint = (Tint) C7019kk.m27452k4(obj, Tint.class);
        if (tint == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13089k4(this.f3604x1, tint.f3604x1) && C3085sv.m13089k4(this.f3602kk, tint.f3602kk);
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: to */
    public final float m3024to() {
        return this.f3604x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final az5 m3025x1() {
        if (this.f3603to == null) {
            this.f3603to = new az5(this);
        }
        return this.f3603to;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final ITintEffectiveData getEffective() {
        return m3025x1();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        return m3022k4(tc4Var, m3023du(), m3024to());
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        return C14113y2.m67407k4(super.mo236k4(iBaseSlide, c14321pz), C14064he.m66704h4(this.f3604x1), Character.valueOf(ControlChar.SPACE_CHAR), C14064he.m66704h4(this.f3602kk));
    }
}
