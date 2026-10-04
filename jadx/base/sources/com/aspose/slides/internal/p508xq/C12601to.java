package com.aspose.slides.internal.p508xq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p138fu.C4131rv;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xq.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12601to extends AbstractC12594du {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f42148k4 = new C7017h4("Default", "Override", "Extension", "ContentType", "PartName");

    /* JADX INFO: renamed from: kk */
    private static String m58815kk(String str) {
        return C14113y2.m67431to(str, IOUtils.DIR_SEPARATOR_UNIX);
    }

    @Override // com.aspose.slides.internal.p508xq.AbstractC12594du
    /* JADX INFO: renamed from: k4 */
    public void mo58790k4(AbstractC3150x6 abstractC3150x6) {
        C4131rv c4131rv = new C4131rv(abstractC3150x6);
        IGenericEnumerator<C12596h4> it = m58793x1().iterator();
        while (it.hasNext()) {
            try {
                C12596h4 next = it.next();
                next.m58803to().setPosition(0L);
                c4131rv.m16575k4(m58815kk(next.m58800k4()), next.m58803to());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c4131rv.m16574k4();
    }
}
