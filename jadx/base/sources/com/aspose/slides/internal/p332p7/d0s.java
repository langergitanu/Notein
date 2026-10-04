package com.aspose.slides.internal.p332p7;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: loaded from: classes4.dex */
public class d0s {
    /* JADX INFO: renamed from: k4 */
    public static XmlDocument m29999k4(AbstractC7414ck abstractC7414ck, String str) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && C14113y2.m67363du(c13940myM65165k4.getValue(), str)) {
                return c8290mt.m37126x1();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public static C8290mt m30001kk(AbstractC7414ck abstractC7414ck, String str) {
        h2b h2bVarM30002x1 = m30002x1(abstractC7414ck, str);
        if (h2bVarM30002x1 != null) {
            return h2bVarM30002x1;
        }
        C8290mt c8290mtMo29646x1 = abstractC7414ck.mo29646x1();
        c8290mtMo29646x1.mo28310k4(C14113y2.m67408k4("<p:ext uri=\"", str, "\" xmlns:p=\"http://schemas.openxmlformats.org/presentationml/2006/main\"></p:ext>"));
        return c8290mtMo29646x1;
    }

    /* JADX INFO: renamed from: x1 */
    public static h2b m30002x1(AbstractC7414ck abstractC7414ck, String str) {
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

    /* JADX INFO: renamed from: k4 */
    public static void m30000k4(AbstractC7414ck abstractC7414ck, AbstractC7414ck abstractC7414ck2, String str) {
        if (m30002x1(abstractC7414ck2, str) == null) {
            for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
                C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
                if (c13940myM65165k4 != null && C14113y2.m67363du(c13940myM65165k4.getValue(), str)) {
                    abstractC7414ck2.mo29646x1().mo28310k4(c8290mt.mo28309k4());
                }
            }
        }
    }
}
