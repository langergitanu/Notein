package com.aspose.slides.internal.p413t1;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5060vt;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.wy */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10835wy extends AbstractC5120du {
    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        C12014ne c12014neClone = ((C5060vt) c5061vw).m21552k4().m58249dy().Clone();
        if (c4201h4.m16688dy() == null) {
            c12014neClone.m56684x1(c12014neClone.m56663c5() - 1);
            c12014neClone.m56671k4(c12014neClone.m56683x1() - 1);
        }
        if (c4201h4.m16781yj()) {
            c4201h4.m16755up().m55579x1(c12014neClone.Clone());
        } else {
            mo16620k4(c12014neClone.Clone(), c4201h4);
        }
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return !c4201h4.m16781yj();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16620k4(C12014ne c12014ne, C4201h4 c4201h4);
}
