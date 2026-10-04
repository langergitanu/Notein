package com.aspose.slides.internal.p332p7;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13940my;

/* JADX INFO: loaded from: classes4.dex */
public class y4k {
    /* JADX INFO: renamed from: k4 */
    public static h2b m44791k4(AbstractC7414ck abstractC7414ck, String str) {
        h2b h2bVarM44792x1 = m44792x1(abstractC7414ck, str);
        if (h2bVarM44792x1 != null) {
            return h2bVarM44792x1;
        }
        h2b h2bVar = (h2b) abstractC7414ck.mo29646x1();
        h2bVar.mo28310k4(C14113y2.m67402k4("<p:ext uri=\"{0}\" xmlns:p=\"{1}\" xmlns:p15=\"{2}\"></p:ext>", str, "http://schemas.openxmlformats.org/presentationml/2006/main", "http://schemas.microsoft.com/office/powerpoint/2012/main"));
        return h2bVar;
    }

    /* JADX INFO: renamed from: x1 */
    private static h2b m44792x1(AbstractC7414ck abstractC7414ck, String str) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && C14113y2.m67363du(c13940myM65165k4.getValue(), str)) {
                return (h2b) c8290mt;
            }
        }
        return null;
    }
}
