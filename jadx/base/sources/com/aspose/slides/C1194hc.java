package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.hc */
/* JADX INFO: loaded from: classes3.dex */
final class C1194hc extends AbstractC0857cj<Blur> implements IBlurEffectiveData, InterfaceC13788lo, InterfaceC14672vc {
    public C1194hc(Blur blur) {
        super(blur);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        C1194hc c1194hc = (C1194hc) C7019kk.m27452k4(obj, C1194hc.class);
        return c1194hc != null && getRadius() == c1194hc.getRadius() && getGrow() == c1194hc.getGrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IBlurEffectiveData
    public final boolean getGrow() {
        return ((Blur) this.f4329k4).getGrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IBlurEffectiveData
    public final double getRadius() {
        if (C14067j2.m66728k4(Double.valueOf(((Blur) this.f4329k4).getRadius()), Double.valueOf(Double.NaN))) {
            return 0.0d;
        }
        return ((Blur) this.f4329k4).getRadius();
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final tc4 mo3873k4(tc4 tc4Var) {
        return tc4Var;
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final String mo3874k4() {
        String strMo48540du = C14067j2.m66727k4(this).mo48540du();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        return C14113y2.m67407k4(strMo48540du, chValueOf, C14044b3.m66425h4(getRadius()), chValueOf, Boolean.valueOf(getGrow()));
    }
}
