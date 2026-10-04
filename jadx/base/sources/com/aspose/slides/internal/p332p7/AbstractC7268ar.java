package com.aspose.slides.internal.p332p7;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13940my;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ar */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7268ar {
    /* JADX INFO: renamed from: k4 */
    public static C8093kj m28418k4(AbstractC7414ck abstractC7414ck, String str) {
        C13940my c13940myM65165k4;
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            if (c8290mt.m37126x1().getDocumentElement() != null && (c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri")) != null && C14113y2.m67363du(c13940myM65165k4.getValue(), str)) {
                return (C8093kj) c8290mt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m28419x1(AbstractC7414ck abstractC7414ck, String str) {
        C8093kj c8093kjM28418k4 = m28418k4(abstractC7414ck, str);
        if (c8093kjM28418k4 != null) {
            c8093kjM28418k4.mo28310k4("");
        }
    }
}
