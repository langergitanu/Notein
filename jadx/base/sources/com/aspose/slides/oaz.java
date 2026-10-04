package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
final class oaz extends AbstractC0857cj<Luminance> implements ILuminanceEffectiveData, InterfaceC13788lo, InterfaceC14672vc {
    public oaz(Luminance luminance) {
        super(luminance);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        oaz oazVar = (oaz) C7019kk.m27452k4(obj, oaz.class);
        return oazVar != null && getBrightness() == oazVar.getBrightness() && getContrast() == oazVar.getContrast();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ILuminanceEffectiveData
    public final float getBrightness() {
        if (C14067j2.m66728k4(Float.valueOf(((Luminance) this.f4329k4).m1926to()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((Luminance) this.f4329k4).m1926to();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ILuminanceEffectiveData
    public final float getContrast() {
        if (C14067j2.m66728k4(Float.valueOf(((Luminance) this.f4329k4).m1925du()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((Luminance) this.f4329k4).m1925du();
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final tc4 mo3873k4(tc4 tc4Var) {
        float brightness = (((getBrightness() / 100.0f) / 2.0f) - 0.5f) * 255.0f;
        float f = brightness + 255.0f;
        float fM67466c5 = (float) C14116yg.m67466c5((((double) ((getContrast() / 100.0f) + 1.0f)) * 3.141592653589793d) / 4.0d);
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            tc4Var.m71087to()[i + 2] = C7019kk.m27442k4(Float.valueOf(C3085sv.m13070k4((((tc4Var.m71087to()[r6] & 255) + brightness) * fM67466c5) + f, 0.0f, 255.0f)), 13);
            tc4Var.m71087to()[i + 1] = C7019kk.m27442k4(Float.valueOf(C3085sv.m13070k4((((tc4Var.m71087to()[r6] & 255) + brightness) * fM67466c5) + f, 0.0f, 255.0f)), 13);
            tc4Var.m71087to()[i] = C7019kk.m27442k4(Float.valueOf(C3085sv.m13070k4((((tc4Var.m71087to()[i] & 255) + brightness) * fM67466c5) + f, 0.0f, 255.0f)), 13);
        }
        return tc4Var;
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final String mo3874k4() {
        String strMo48540du = C14067j2.m66727k4(this).mo48540du();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        return C14113y2.m67407k4(strMo48540du, chValueOf, C14064he.m66704h4(getBrightness()), chValueOf, C14064he.m66704h4(getContrast()), chValueOf);
    }
}
