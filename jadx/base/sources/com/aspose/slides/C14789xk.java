package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.xk */
/* JADX INFO: loaded from: classes3.dex */
final class C14789xk extends AbstractC0857cj<AlphaBiLevel> implements IAlphaBiLevelEffectiveData, InterfaceC13788lo, InterfaceC14672vc {
    public C14789xk(AlphaBiLevel alphaBiLevel) {
        super(alphaBiLevel);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        C14789xk c14789xk = (C14789xk) C7019kk.m27452k4(obj, C14789xk.class);
        return c14789xk != null && getThreshold() == c14789xk.getThreshold();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IAlphaBiLevelEffectiveData
    public final float getThreshold() {
        if (C14067j2.m66728k4(Float.valueOf(((AlphaBiLevel) this.f4329k4).getThreshold()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((AlphaBiLevel) this.f4329k4).getThreshold();
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final tc4 mo3873k4(tc4 tc4Var) {
        return AlphaBiLevel.m233k4(tc4Var, getThreshold());
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final String mo3874k4() {
        return C14113y2.m67407k4(C14067j2.m66727k4(this).mo48540du(), Character.valueOf(ControlChar.SPACE_CHAR), C14064he.m66704h4(getThreshold()));
    }
}
