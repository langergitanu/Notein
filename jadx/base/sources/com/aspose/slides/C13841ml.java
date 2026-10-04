package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.ml */
/* JADX INFO: loaded from: classes3.dex */
final class C13841ml extends AbstractC0857cj<BiLevel> implements IBiLevelEffectiveData, InterfaceC13788lo, InterfaceC14672vc {
    public C13841ml(BiLevel biLevel) {
        super(biLevel);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        C13841ml c13841ml = (C13841ml) C7019kk.m27452k4(obj, C13841ml.class);
        return c13841ml != null && getThreshold() == c13841ml.getThreshold();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IBiLevelEffectiveData
    public final float getThreshold() {
        if (C14067j2.m66728k4(Float.valueOf(((BiLevel) this.f4329k4).m426to()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((BiLevel) this.f4329k4).m426to();
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final tc4 mo3873k4(tc4 tc4Var) {
        return BiLevel.m425k4(tc4Var, getThreshold());
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final String mo3874k4() {
        return C14113y2.m67407k4(C14067j2.m66727k4(this).mo48540du(), Character.valueOf(ControlChar.SPACE_CHAR), C14064he.m66704h4(getThreshold()));
    }
}
