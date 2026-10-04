package com.aspose.slides.internal.p216k2;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p124f7.C3878yj;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p310o3.C6974x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.k2.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5574k4 extends AbstractC5576x1 {
    public C5574k4(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
    }

    @Override // com.aspose.slides.internal.p216k2.AbstractC5576x1
    /* JADX INFO: renamed from: k4 */
    public void mo22905k4(AbstractC12536x1 abstractC12536x1) {
        C3180k4 c3180k4 = (C3180k4) C7019kk.m27452k4((Object) abstractC12536x1, C3180k4.class);
        if (c3180k4 == null) {
            throw new C6490k4("Metafile is not EMF image");
        }
        C3149x1 c3149x1 = new C3149x1(m22906k4());
        for (int i = 0; i < c3180k4.m58364k4().size(); i++) {
            C9723vw c9723vw = (C9723vw) c3180k4.m58364k4().get_Item(i);
            AbstractC6973k4 abstractC6973k4M27277k4 = C6974x1.m27277k4(c9723vw.m47767v4());
            if (abstractC6973k4M27277k4 == null) {
                throw new C6490k4(C14113y2.m67408k4("Unable to write record:", C14042ak.m66410k4(C3878yj.class, c9723vw.m47767v4())));
            }
            if (c9723vw.m47768yd() != c3149x1.m13442k4().getPosition()) {
                throw new Exception(C14113y2.m67408k4("Invalid writer position. Record index=", C14057f9.m66591x1(i)));
            }
            abstractC6973k4M27277k4.mo11861x1(c9723vw, c3149x1);
            int iM47768yd = (int) ((c9723vw.m47768yd() + ((long) c9723vw.m47766lr())) - c3149x1.m13442k4().getPosition());
            if (iM47768yd > 0) {
                c3149x1.m13442k4().seek(iM47768yd, 1);
            }
        }
    }
}
