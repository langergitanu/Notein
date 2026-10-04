package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5975x1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC13901ga abstractC13901ga = (AbstractC13901ga) C7019kk.m27452k4(obj, AbstractC13901ga.class);
        AbstractC13901ga abstractC13901ga2 = (AbstractC13901ga) C7019kk.m27452k4(obj2, AbstractC13901ga.class);
        if (abstractC13901ga == null || abstractC13901ga2 == null) {
            throw new ArgumentException();
        }
        int iM67426m9 = C14113y2.m67426m9(abstractC13901ga.getNamespaceURI(), abstractC13901ga2.getNamespaceURI());
        return iM67426m9 != 0 ? iM67426m9 : C14113y2.m67426m9(abstractC13901ga.getLocalName(), abstractC13901ga2.getLocalName());
    }
}
