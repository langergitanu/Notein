package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.g8 */
/* JADX INFO: loaded from: classes3.dex */
final class C1135g8 extends AbstractC0857cj<AlphaReplace> implements IAlphaReplaceEffectiveData, InterfaceC13788lo, InterfaceC14672vc {
    public C1135g8(AlphaReplace alphaReplace) {
        super(alphaReplace);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        C1135g8 c1135g8 = (C1135g8) C7019kk.m27452k4(obj, C1135g8.class);
        return c1135g8 != null && getAlpha() == c1135g8.getAlpha();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IAlphaReplaceEffectiveData
    public final float getAlpha() {
        if (C14067j2.m66728k4(Float.valueOf(((AlphaReplace) this.f4329k4).m248x1()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((AlphaReplace) this.f4329k4).m248x1();
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final tc4 mo3873k4(tc4 tc4Var) {
        return AlphaReplace.m246k4(tc4Var, getAlpha());
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final String mo3874k4() {
        return C14113y2.m67407k4(C14067j2.m66727k4(this).mo48540du(), Character.valueOf(ControlChar.SPACE_CHAR), C14064he.m66704h4(getAlpha()));
    }
}
