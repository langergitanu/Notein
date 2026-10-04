package com.aspose.slides.internal.p413t1;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p183ij.C5068x1;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10820k4 extends AbstractC5120du {
    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        C5068x1 c5068x1 = (C5068x1) c5061vw;
        if (c4201h4.m16688dy() != null) {
            C12014ne c12014ne = new C12014ne((int) ((((long) c5068x1.m21600k4().m58194k4()) - (c5068x1.m21607x1() & 4294967295L)) & 4294967295L), (int) ((((long) c5068x1.m21600k4().m58199x1()) - (c5068x1.m21607x1() & 4294967295L)) & 4294967295L), (int) ((c5068x1.m21607x1() & 4294967295L) * 2), (int) ((c5068x1.m21607x1() & 4294967295L) * 2));
            float fM21605kk = c5068x1.m21605kk();
            float fM21606to = c5068x1.m21606to();
            float f = 360.0f - (fM21605kk + fM21606to);
            double d = ((double) (f / 180.0f)) * 3.141592653589793d;
            C12025x6 c12025x6 = new C12025x6((float) ((C14116yg.m67495m9(d) * (c5068x1.m21607x1() & 4294967295L)) + ((double) c5068x1.m21600k4().m58194k4())), (float) ((C14116yg.m67470dy(d) * (c5068x1.m21607x1() & 4294967295L)) + ((double) c5068x1.m21600k4().m58199x1())));
            if (c4201h4.m16781yj()) {
                c4201h4.m16755up().m55545k4(c12014ne.Clone(), f, fM21606to);
            } else {
                mo16630k4(c12014ne.Clone(), c12025x6.Clone(), f, fM21606to, c4201h4);
            }
        }
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return !c4201h4.m16781yj();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16630k4(C12014ne c12014ne, C12025x6 c12025x6, float f, float f2, C4201h4 c4201h4);
}
