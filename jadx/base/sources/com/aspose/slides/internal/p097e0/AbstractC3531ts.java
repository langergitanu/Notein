package com.aspose.slides.internal.p097e0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10009ck;
import com.aspose.slides.internal.p380ri.InterfaceC10016m9;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.ts */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3531ts extends AbstractC3511c5 implements InterfaceC10016m9 {

    /* JADX INFO: renamed from: dy */
    private static final Dictionary<String, String> f9860dy;

    /* JADX INFO: renamed from: du */
    protected C13981tl f9861du;

    /* JADX INFO: renamed from: h4 */
    protected XmlDocument f9862h4;

    /* JADX INFO: renamed from: m9 */
    protected String f9863m9;

    /* JADX INFO: renamed from: to */
    private InterfaceC3760kk f9864to;

    static {
        Dictionary<String, String> dictionary = new Dictionary<>();
        f9860dy = dictionary;
        dictionary.addItem("xlink", "http://www.w3.org/1999/xlink");
    }

    public AbstractC3531ts(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f9864to = null;
    }

    /* JADX INFO: renamed from: ar */
    public final InterfaceC1984kk m14368ar() {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo14369k4(C12016rv c12016rv, String str) {
        return C12025x6.f40591k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final XmlDocument m14371m9() {
        return this.f9862h4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return this.f9863m9;
    }

    /* JADX INFO: renamed from: um */
    public final XmlDocument m14372um() {
        this.f9862h4 = null;
        this.f9861du = null;
        try {
            XmlDocument xmlDocument = new XmlDocument();
            this.f9862h4 = xmlDocument;
            this.f9862h4.appendChild(xmlDocument.createElement(this.f9863m9, mo14108ne()));
            C13981tl documentElement = this.f9862h4.getDocumentElement();
            this.f9861du = documentElement;
            m14373x1(this.f9862h4, documentElement);
            if (!this.f9861du.m65901dy("xmlns", "http://www.w3.org/2000/xmlns/")) {
                this.f9861du.m65907k4("xmlns", "http://www.w3.org/2000/xmlns/", mo14108ne());
            }
            this.f9861du.m65910kk("xmlns:xlink", "http://www.w3.org/1999/xlink");
        } catch (RuntimeException unused) {
        }
        return this.f9862h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14373x1(XmlDocument xmlDocument, C13981tl c13981tl) {
        m14367k4(this.f9861du, this.f9864to);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        if (C7019kk.m27469x1(abstractC3511c5, AbstractC3531ts.class)) {
            ((AbstractC3531ts) abstractC3511c5).m14370k4(this.f9862h4, this.f9861du);
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: x1 */
    public void mo14124x1(char[] cArr, int i, int i2, AbstractC3533um abstractC3533um, InterfaceC3757h4 interfaceC3757h4) {
        super.mo14124x1(cArr, i, i2, abstractC3533um, interfaceC3757h4);
        this.f9861du.appendChild(this.f9862h4.createTextNode(C14113y2.m67406k4(cArr, i, i2)));
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            m14103kk(interfaceC3757h4, str, str2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14370k4(XmlDocument xmlDocument, C13981tl c13981tl) {
        this.f9862h4 = xmlDocument;
        C13981tl c13981tlCreateElement = xmlDocument.createElement(this.f9863m9, mo14108ne());
        this.f9861du = c13981tlCreateElement;
        m14367k4(c13981tlCreateElement, this.f9864to);
        this.f9864to = null;
        c13981tl.appendChild(this.f9861du);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m14367k4(C13981tl c13981tl, InterfaceC3760kk interfaceC3760kk) {
        for (int i = 0; i < interfaceC3760kk.mo15083yj(); i++) {
            String strMo15077ck = interfaceC3760kk.mo15077ck(i);
            String strMo15079jd = interfaceC3760kk.mo15079jd(i);
            int iM67364dy = C14113y2.m67364dy(strMo15079jd, C18241k5.f55433h);
            if (iM67364dy == -1) {
                c13981tl.m65910kk(strMo15079jd, strMo15077ck);
            } else {
                String strM49139k4 = C10009ck.m49139k4(strMo15079jd, 0, iM67364dy);
                String strM67422kk = C14113y2.m67422kk(strMo15079jd, iM67364dy + 1);
                if (C14113y2.m67363du(strM49139k4, "xmlns")) {
                    f9860dy.addItem(strM67422kk, strMo15077ck);
                } else {
                    String[] strArr = {null};
                    f9860dy.tryGetValue(strM49139k4, strArr);
                    c13981tl.m65907k4(strM67422kk, strArr[0], strMo15077ck);
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14098k4(String str, InterfaceC3757h4 interfaceC3757h4, InterfaceC3760kk interfaceC3760kk, AbstractC3533um abstractC3533um) {
        m14091k4(interfaceC3757h4);
        this.f9863m9 = str;
        this.f9864to = interfaceC3760kk;
    }
}
