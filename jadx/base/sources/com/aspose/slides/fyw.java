package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13981tl;

/* JADX INFO: loaded from: classes3.dex */
class fyw {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC13901ga m6352k4(AbstractC13901ga abstractC13901ga, String str, String str2) {
        return m6353k4(abstractC13901ga, abstractC13901ga.getPrefixOfNamespace(str2), str, str2);
    }

    /* JADX INFO: renamed from: x1 */
    private static AbstractC13901ga m6355x1(AbstractC13901ga abstractC13901ga, String str, String str2) {
        for (AbstractC13901ga abstractC13901ga2 : abstractC13901ga.getChildNodes()) {
            if (C14113y2.m67363du(abstractC13901ga2.getLocalName(), str) && C14113y2.m67363du(abstractC13901ga2.getNamespaceURI(), str2)) {
                return abstractC13901ga2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13901ga m6353k4(AbstractC13901ga abstractC13901ga, String str, String str2, String str3) {
        AbstractC13901ga abstractC13901gaM6355x1 = m6355x1(abstractC13901ga, str2, str3);
        if (abstractC13901gaM6355x1 != null) {
            return abstractC13901gaM6355x1;
        }
        C13981tl c13981tlCreateElement = abstractC13901ga.getOwnerDocument().createElement(str, str2, str3);
        abstractC13901ga.appendChild(c13981tlCreateElement);
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13901ga m6354k4(C13981tl c13981tl, String str, String str2) {
        return m6355x1(c13981tl, str, str2);
    }
}
