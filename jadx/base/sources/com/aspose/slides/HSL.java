package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
public final class HSL extends ImageTransformOperation implements IHSL, lft {

    /* JADX INFO: renamed from: du */
    private C14723w4 f2433du;

    /* JADX INFO: renamed from: kk */
    private float f2434kk;

    /* JADX INFO: renamed from: to */
    private float f2435to;

    /* JADX INFO: renamed from: x1 */
    private float f2436x1;

    public HSL(float f, float f2, float f3, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2436x1 = f;
        this.f2434kk = f2;
        this.f2435to = f3;
        m1750m9();
    }

    /* JADX INFO: renamed from: k4 */
    public static tc4 m1656k4(tc4 tc4Var, float f, float f2, float f3) {
        float f4 = f2 / 100.0f;
        float f5 = f3 / 100.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        int i = 0;
        while (i < tc4Var.m71087to().length) {
            float[] fArr = {f6};
            float[] fArr2 = {f7};
            float[] fArr3 = {f8};
            int i2 = i + 2;
            int i3 = i + 1;
            ColorFormat.m1063k4((tc4Var.m71087to()[i2] & 255) / 255.0f, (tc4Var.m71087to()[i3] & 255) / 255.0f, (tc4Var.m71087to()[i] & 255) / 255.0f, fArr, fArr2, fArr3);
            float f9 = fArr[0];
            float f10 = fArr2[0];
            float f11 = fArr3[0];
            float f12 = (f % 360.0f) + f9;
            if (f12 < 0.0f) {
                f12 += 360.0f;
            }
            f6 = f12;
            C14321pz c14321pzM1065to = ColorFormat.m1065to(f6, C3085sv.m13070k4(f10 * f5, 0.0f, 1.0f), C3085sv.m13070k4(f11 * f4, 0.0f, 1.0f));
            tc4Var.m71087to()[i2] = C22202OooO0oo.OooO00o(c14321pzM1065to.f48208x1, 255.0f, 13);
            tc4Var.m71087to()[i3] = C22202OooO0oo.OooO00o(c14321pzM1065to.f48206kk, 255.0f, 13);
            tc4Var.m71087to()[i] = C22202OooO0oo.OooO00o(c14321pzM1065to.f48207to, 255.0f, 13);
            i += 4;
            f7 = f10;
            f8 = f11;
        }
        return tc4Var;
    }

    /* JADX INFO: renamed from: du */
    public final float m1657du() {
        return this.f2434kk;
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        HSL hsl = (HSL) C7019kk.m27452k4(obj, HSL.class);
        if (hsl == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C3085sv.m13089k4(this.f2436x1, hsl.f2436x1) && C3085sv.m13089k4(this.f2434kk, hsl.f2434kk) && C3085sv.m13089k4(this.f2435to, hsl.f2435to);
    }

    /* JADX INFO: renamed from: h4 */
    public final float m1658h4() {
        return this.f2435to;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: to */
    public final float m1659to() {
        return this.f2436x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14723w4 m1660x1() {
        if (this.f2433du == null) {
            this.f2433du = new C14723w4(this);
        }
        return this.f2433du;
    }

    @Override // com.aspose.slides.IAccessiblePVIObject, com.aspose.slides.lft
    public final IHSLEffectiveData getEffective() {
        return m1660x1();
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide) {
        return m1656k4(tc4Var, m1659to(), m1657du(), m1658h4());
    }

    @Override // com.aspose.slides.ImageTransformOperation
    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        String strMo236k4 = super.mo236k4(iBaseSlide, c14321pz);
        String strM66704h4 = C14064he.m66704h4(this.f2436x1);
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        return C14113y2.m67407k4(strMo236k4, strM66704h4, chValueOf, C14064he.m66704h4(this.f2434kk), chValueOf, C14064he.m66704h4(this.f2435to));
    }
}
