package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11839vw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.qo */
/* JADX INFO: loaded from: classes3.dex */
class C14354qo extends abb {
    public C14354qo(C11839vw c11839vw, OdpSerializationContext odpSerializationContext) {
        super(c11839vw, odpSerializationContext);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69718k4(Presentation presentation) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "document-content".equals(m55443jd().mo65023fa())) {
                com.aspose.slides.internal.p332p7.oss ossVar = new com.aspose.slides.internal.p332p7.oss(m55443jd());
                presentation.m2400yj().m5106k4(ossVar);
                x3e.m73040k4(presentation, ossVar.m38436kk(), new wxb(mo3471m9(), ossVar.m38437x1()));
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69719x1(Presentation presentation) {
        mo55332up();
        com.aspose.slides.internal.p332p7.oss ossVar = new com.aspose.slides.internal.p332p7.oss();
        m69717k4(presentation, ossVar);
        ossVar.mo6846k4(null, m55442ck(), "document-content");
        mo55333yj();
    }

    public C14354qo(C11839vw c11839vw, qye qyeVar) {
        super(c11839vw, qyeVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m69717k4(Presentation presentation, com.aspose.slides.internal.p332p7.oss ossVar) {
        pkv pkvVar = new pkv(ossVar.m38435k4(), mo3468h4(), C14113y2.f47374k4);
        com.aspose.slides.internal.p332p7.oax oaxVar = (com.aspose.slides.internal.p332p7.oax) ossVar.m38436kk().m45215k4("presentation").m29542x1();
        IGenericEnumerator<ISlide> it = presentation.getSlides().iterator();
        while (it.hasNext()) {
            try {
                Slide slide = (Slide) it.next();
                pkvVar.m69130x1().m2058k4(slide);
                ov2.m68882k4(slide, oaxVar.m38148k4(), pkvVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
