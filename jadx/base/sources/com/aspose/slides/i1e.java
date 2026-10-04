package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
final class i1e extends AbstractC0857cj<SoftEdge> implements ISoftEdgeEffectiveData, InterfaceC13788lo, InterfaceC14672vc {
    public i1e(SoftEdge softEdge) {
        super(softEdge);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        i1e i1eVar = (i1e) C7019kk.m27452k4(obj, i1e.class);
        return i1eVar != null && getRadius() == i1eVar.getRadius();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISoftEdgeEffectiveData
    public final double getRadius() {
        if (C14067j2.m66728k4(Double.valueOf(((SoftEdge) this.f4329k4).getRadius()), Double.valueOf(Double.NaN))) {
            return 0.0d;
        }
        return ((SoftEdge) this.f4329k4).getRadius();
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final tc4 mo3873k4(tc4 tc4Var) {
        return tc4Var;
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final String mo3874k4() {
        return C14113y2.m67407k4(C14067j2.m66727k4(this).mo48540du(), Character.valueOf(ControlChar.SPACE_CHAR), C14044b3.m66425h4(getRadius()));
    }
}
