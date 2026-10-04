package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
final class az5 extends AbstractC0857cj<Tint> implements ITintEffectiveData, InterfaceC13788lo, InterfaceC14672vc {
    public az5(Tint tint) {
        super(tint);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        az5 az5Var = (az5) C7019kk.m27452k4(obj, az5.class);
        return az5Var != null && getHue() == az5Var.getHue() && getAmount() == az5Var.getAmount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ITintEffectiveData
    public final float getAmount() {
        if (C14067j2.m66728k4(Float.valueOf(((Tint) this.f4329k4).m3023du()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((Tint) this.f4329k4).m3023du();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ITintEffectiveData
    public final float getHue() {
        if (C14067j2.m66728k4(Float.valueOf(((Tint) this.f4329k4).m3024to()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((Tint) this.f4329k4).m3024to();
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final tc4 mo3873k4(tc4 tc4Var) {
        return Tint.m3022k4(tc4Var, getAmount(), getHue());
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final String mo3874k4() {
        String strMo48540du = C14067j2.m66727k4(this).mo48540du();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        return C14113y2.m67407k4(strMo48540du, chValueOf, C14064he.m66704h4(getHue()), chValueOf, C14064he.m66704h4(getAmount()));
    }
}
