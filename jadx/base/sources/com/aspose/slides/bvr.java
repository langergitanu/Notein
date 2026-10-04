package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11839vw;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class bvr extends abb {

    /* JADX INFO: renamed from: k4 */
    private IGenericList<com.aspose.slides.internal.p332p7.w6f> f4252k4;

    public bvr(C11839vw c11839vw, OdpSerializationContext odpSerializationContext, IGenericList<com.aspose.slides.internal.p332p7.w6f> iGenericList) {
        super(c11839vw, odpSerializationContext);
        this.f4252k4 = iGenericList;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4324k4(Presentation presentation) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "file-entry".equals(m55443jd().mo65023fa())) {
                this.f4252k4.addItem(new com.aspose.slides.internal.p332p7.w6f(m55443jd()));
            }
        }
        mo55330fa();
    }

    public bvr(C11839vw c11839vw, qye qyeVar, IGenericList<com.aspose.slides.internal.p332p7.w6f> iGenericList) {
        super(c11839vw, qyeVar);
        this.f4252k4 = iGenericList;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4325k4(Presentation presentation, boolean z) {
        mo55332up();
        com.aspose.slides.internal.p332p7.cxw cxwVar = new com.aspose.slides.internal.p332p7.cxw();
        com.aspose.slides.internal.p332p7.w6f w6fVarM29972k4 = cxwVar.m29972k4();
        w6fVarM29972k4.m43524x1(z ? "application/vnd.oasis.opendocument.presentation-template" : "application/vnd.oasis.opendocument.presentation");
        w6fVarM29972k4.m43520k4("/");
        IGenericList<com.aspose.slides.internal.p332p7.w6f> iGenericList = this.f4252k4;
        if (iGenericList != null) {
            IGenericEnumerator<com.aspose.slides.internal.p332p7.w6f> it = iGenericList.iterator();
            while (it.hasNext()) {
                try {
                    cxwVar.m29973k4(it.next());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        cxwVar.mo6846k4("manifest", m55442ck(), "manifest");
        mo55333yj();
    }
}
