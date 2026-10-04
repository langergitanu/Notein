package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.qm */
/* JADX INFO: loaded from: classes3.dex */
final class C14352qm extends AbstractC0857cj<AlphaModulateFixed> implements IAlphaModulateFixedEffectiveData, InterfaceC13788lo, InterfaceC14672vc {
    public C14352qm(AlphaModulateFixed alphaModulateFixed) {
        super(alphaModulateFixed);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        C14352qm c14352qm = (C14352qm) C7019kk.m27452k4(obj, C14352qm.class);
        return c14352qm != null && getAmount() == c14352qm.getAmount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IAlphaModulateFixedEffectiveData
    public final float getAmount() {
        float fM13070k4 = C3085sv.m13070k4(((AlphaModulateFixed) this.f4329k4).getAmount(), 0.0f, Float.POSITIVE_INFINITY);
        if (C14067j2.m66728k4(Float.valueOf(fM13070k4), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return fM13070k4;
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final tc4 mo3873k4(tc4 tc4Var) {
        return AlphaModulateFixed.m244k4(tc4Var, getAmount());
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final String mo3874k4() {
        return C14113y2.m67407k4(C14067j2.m66727k4(this).mo48540du(), Character.valueOf(ControlChar.SPACE_CHAR), C14064he.m66704h4(getAmount()));
    }
}
