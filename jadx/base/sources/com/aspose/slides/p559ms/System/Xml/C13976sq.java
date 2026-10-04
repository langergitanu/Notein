package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.sq */
/* JADX INFO: loaded from: classes5.dex */
public class C13976sq extends AbstractC14007wt {

    /* JADX INFO: renamed from: k4 */
    private String f46833k4;

    /* JADX INFO: renamed from: kk */
    private String f46834kk;

    /* JADX INFO: renamed from: to */
    private String f46835to;

    public C13976sq(String str, String str2, String str3, XmlDocument xmlDocument) {
        super(xmlDocument);
        if (!m65883to(str)) {
            throw new ArgumentException(C13968ri.m65818k4("Wrong XML version information. The XML must match production \"VersionNum ::= '1.' [0-9]+\"."));
        }
        if (str3 != null && str3.length() > 0 && !"yes".equals(str3) && !TranslateLanguage.NORWEGIAN.equals(str3)) {
            throw new ArgumentException(C13968ri.m65819k4("Wrong value for the XML declaration standalone attribute of '{0}'.", str3));
        }
        m65889x1(str2);
        m65887kk(str3);
        m65885k4(str);
    }

    /* JADX INFO: renamed from: to */
    private boolean m65883to(String str) {
        return str.length() >= 3 && str.charAt(0) == '1' && str.charAt(1) == '.' && C14022y4.m66323k4(str, 2, str.length() - 2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        return getOwnerDocument().createXmlDeclaration(m65884k4(), m65888x1(), m65886kk());
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getInnerText() {
        C6765kp c6765kp = new C6765kp(C14113y2.m67408k4("version=\"", m65884k4(), "\""));
        if (m65888x1().length() > 0) {
            c6765kp.m26792k4(" encoding=\"");
            c6765kp.m26792k4(m65888x1());
            c6765kp.m26792k4("\"");
        }
        if (m65886kk().length() > 0) {
            c6765kp.m26792k4(" standalone=\"");
            c6765kp.m26792k4(m65886kk());
            c6765kp.m26792k4("\"");
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return getName();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return "xml";
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 17;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getValue() {
        return getInnerText();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m65884k4() {
        return this.f46833k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m65886kk() {
        return this.f46835to;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerText(String str) {
        String strM65888x1 = m65888x1();
        String strM65886kk = m65886kk();
        String strM65884k4 = m65884k4();
        String[] strArr = {null};
        String[] strArr2 = {null};
        String[] strArr3 = {null};
        C13987tw.m66209k4(str, strArr, strArr2, strArr3);
        String str2 = strArr[0];
        String str3 = strArr2[0];
        String str4 = strArr3[0];
        if (str2 != null) {
            try {
                if (!m65883to(str2)) {
                    throw new ArgumentException(C13968ri.m65818k4("Wrong XML version information. The XML must match production \"VersionNum ::= '1.' [0-9]+\"."));
                }
            } catch (RuntimeException e) {
                m65889x1(strM65888x1);
                m65887kk(strM65886kk);
                m65885k4(strM65884k4);
                throw e;
            }
        }
        m65885k4(str2);
        if (str3 != null) {
            m65889x1(str3);
        }
        if (str4 != null) {
            m65887kk(str4);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setValue(String str) {
        setInnerText(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo21907k4(getName(), getInnerText());
    }

    /* JADX INFO: renamed from: x1 */
    public final String m65888x1() {
        return this.f46834kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65885k4(String str) {
        this.f46833k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m65887kk(String str) {
        if (str == null) {
            this.f46835to = C14113y2.f47374k4;
        } else {
            if (str.length() != 0 && !"yes".equals(str) && !TranslateLanguage.NORWEGIAN.equals(str)) {
                throw new ArgumentException(C13968ri.m65819k4("Wrong value for the XML declaration standalone attribute of '{0}'.", str));
            }
            this.f46835to = str;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65889x1(String str) {
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        this.f46834kk = str;
    }
}
