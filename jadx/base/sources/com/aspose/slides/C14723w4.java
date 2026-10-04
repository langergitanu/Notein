package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.w4 */
/* JADX INFO: loaded from: classes3.dex */
final class C14723w4 extends AbstractC0857cj<HSL> implements IHSLEffectiveData, InterfaceC13788lo, InterfaceC14672vc {
    public C14723w4(HSL hsl) {
        super(hsl);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        C14723w4 c14723w4 = (C14723w4) C7019kk.m27452k4(obj, C14723w4.class);
        return c14723w4 != null && getHue() == c14723w4.getHue() && getSaturation() == c14723w4.getSaturation() && getLuminance() == c14723w4.getLuminance();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IHSLEffectiveData
    public final float getHue() {
        if (C14067j2.m66728k4(Float.valueOf(((HSL) this.f4329k4).m1659to()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((HSL) this.f4329k4).m1659to();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IHSLEffectiveData
    public final float getLuminance() {
        if (C14067j2.m66728k4(Float.valueOf(((HSL) this.f4329k4).m1658h4()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((HSL) this.f4329k4).m1658h4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IHSLEffectiveData
    public final float getSaturation() {
        if (C14067j2.m66728k4(Float.valueOf(((HSL) this.f4329k4).m1657du()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((HSL) this.f4329k4).m1657du();
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final tc4 mo3873k4(tc4 tc4Var) {
        return HSL.m1656k4(tc4Var, getHue(), getSaturation(), getLuminance());
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final String mo3874k4() {
        String strMo48540du = C14067j2.m66727k4(this).mo48540du();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        return C14113y2.m67407k4(strMo48540du, chValueOf, C14064he.m66704h4(getHue()), chValueOf, C14064he.m66704h4(getSaturation()), chValueOf, C14064he.m66704h4(getLuminance()));
    }
}
