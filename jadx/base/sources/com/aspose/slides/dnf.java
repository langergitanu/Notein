package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class dnf extends C13981tl {

    /* JADX INFO: renamed from: k4 */
    private static final String[] f4630k4 = {TranslateLanguage.TAGALOG, "t", TranslateLanguage.TURKISH, "l", "ctr", "r", "bl", "b", "br"};

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f4631kk = new C7017h4(TranslateLanguage.TAGALOG, "t", TranslateLanguage.TURKISH, "l", "ctr", "r", "bl", "b", "br");

    /* JADX INFO: renamed from: com.aspose.slides.dnf$k4 */
    public static class C0908k4 implements kfh {
        @Override // com.aspose.slides.kfh
        /* JADX INFO: renamed from: k4 */
        public final C13981tl mo4589k4(String str, String str2, String str3, XmlDocument xmlDocument) {
            return new dnf(str, str2, str3, xmlDocument);
        }
    }

    public dnf(String str, String str2, String str3, XmlDocument xmlDocument) {
        super(str, str2, str3, xmlDocument);
    }

    /* JADX INFO: renamed from: h4 */
    public static kfh m5191h4() {
        return new C0908k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m5192k4(C3068ks c3068ks, String str, String str2, int i) {
        return !m65901dy(str, str2) ? i : c3068ks.m12963k4(m65912to(str, str2));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13981tl, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public final agb getOwnerDocument() {
        return (agb) C7019kk.m27452k4((Object) super.getOwnerDocument(), agb.class);
    }

    /* JADX INFO: renamed from: x1 */
    public final dnf m5196x1(String str, String str2) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            dnf dnfVar = (dnf) C7019kk.m27452k4(it.next(), dnf.class);
            if (dnfVar != null && C14113y2.m67363du(dnfVar.getLocalName(), str) && C14113y2.m67363du(dnfVar.getNamespaceURI(), str2)) {
                return dnfVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m5193k4(String str, String str2, int i) {
        return m65901dy(str, str2) ? C13850af.m65151yj(m65912to(str, str2)) : i;
    }

    /* JADX INFO: renamed from: k4 */
    public final dnf[] m5194k4(String str, String str2) {
        List list = new List();
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            dnf dnfVar = (dnf) C7019kk.m27452k4(it.next(), dnf.class);
            if (dnfVar != null && C14113y2.m67363du(dnfVar.getLocalName(), str) && C14113y2.m67363du(dnfVar.getNamespaceURI(), str2)) {
                list.addItem(dnfVar);
            }
        }
        return (dnf[]) list.toArray(new dnf[0]);
    }
}
