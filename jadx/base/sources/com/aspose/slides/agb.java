package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes3.dex */
abstract class agb extends XmlDocument {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f3898c5;

    /* JADX INFO: renamed from: k4 */
    mqz f3905k4;

    /* JADX INFO: renamed from: x1 */
    meq f3906x1;

    /* JADX INFO: renamed from: kk */
    static final Dictionary<String, String> f3902kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    static final Dictionary<String, String> f3904to = new Dictionary<>();

    /* JADX INFO: renamed from: m9 */
    private static final String[] f3903m9 = {"http://schemas.openxmlformats.org/officeDocument/2006/relationships", "r", "http://schemas.openxmlformats.org/presentationml/2006/main", ContextChain.TAG_PRODUCT, "http://schemas.microsoft.com/office/2006/activeX", "ox", "http://schemas.openxmlformats.org/drawingml/2006/main", "a", "http://schemas.microsoft.com/office/powerpoint/2010/main", "p14", "urn:schemas-microsoft-com:vml", "v", "http://schemas.openxmlformats.org/markup-compatibility/2006", "mc"};

    /* JADX INFO: renamed from: du */
    static final String[] f3899du = {"http://schemas.openxmlformats.org/officeDocument/2006/relationships", "http://schemas.openxmlformats.org/presentationml/2006/main", "http://schemas.openxmlformats.org/drawingml/2006/main", "http://schemas.microsoft.com/office/2006/activeX"};

    /* JADX INFO: renamed from: h4 */
    static final char[] f3901h4 = C14113y2.m67365dy(C14113y2.m67402k4(" xmlns:xml=\"{0}\" xml:space=\"preserve\"", "http://www.w3.org/XML/1998/namespace"));

    /* JADX INFO: renamed from: dy */
    private static final char[] f3900dy = C14113y2.m67365dy("http://schemas.microsoft.com/office/powerpoint/2010/main");

    static {
        int i = 0;
        while (true) {
            String[] strArr = f3903m9;
            if (i >= strArr.length) {
                f3898c5 = new C7017h4("Choice", "Fallback");
                return;
            }
            int i2 = i + 1;
            f3902kk.set_Item(strArr[i], strArr[i2]);
            f3904to.set_Item(strArr[i2], strArr[i]);
            i += 2;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    public C13981tl createElement(String str, String str2, String str3) {
        C13981tl c13981tlM6113k4 = mo3568k4().m6113k4(str, str2, str3, this);
        if (c13981tlM6113k4 != null) {
            return c13981tlM6113k4;
        }
        throw new Exception();
    }

    /* JADX INFO: renamed from: k4 */
    public final dnf m3567k4(String str, String str2) {
        AbstractC13911hq elementsByTagName = getElementsByTagName(str, str2);
        if (elementsByTagName.mo23932k4() < 1) {
            return null;
        }
        return (dnf) C7019kk.m27452k4((Object) elementsByTagName.m65457kk(0), dnf.class);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract fbw mo3568k4();

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final dnf getDocumentElement() {
        return (dnf) super.getDocumentElement();
    }
}
