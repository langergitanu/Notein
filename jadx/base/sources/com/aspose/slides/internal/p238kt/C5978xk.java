package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13857b1;
import com.aspose.slides.p559ms.System.Xml.C13970rs;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Arrays;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.xk */
/* JADX INFO: loaded from: classes.dex */
public class C5978xk {

    /* JADX INFO: renamed from: k4 */
    private C5924dy f16875k4;

    /* JADX INFO: renamed from: x1 */
    private C5922dq f16876x1;

    public C5978xk(AbstractC3150x6 abstractC3150x6, boolean z, String str, AbstractC13943n5 abstractC13943n5, String str2) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("inputStream");
        }
        C5924dy c5924dy = new C5924dy(true, z);
        this.f16875k4 = c5924dy;
        c5924dy.setXmlResolver(abstractC13943n5);
        this.f16875k4.load(C5934he.m23976k4(abstractC3150x6, abstractC13943n5, str2));
        this.f16876x1 = new C5922dq(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m24142k4(AbstractC13901ga abstractC13901ga) {
        if (C7019kk.m27469x1(abstractC13901ga, InterfaceC5919c6.class)) {
            ((InterfaceC5919c6) abstractC13901ga).mo23907k4(true);
        }
    }

    public C5978xk(XmlDocument xmlDocument, boolean z, String str, AbstractC13943n5 abstractC13943n5) {
        if (xmlDocument == null) {
            throw new ArgumentNullException("document");
        }
        C5924dy c5924dy = new C5924dy(true, z);
        this.f16875k4 = c5924dy;
        c5924dy.setXmlResolver(abstractC13943n5);
        this.f16875k4.load(new C13970rs(xmlDocument));
        this.f16876x1 = new C5922dq(str);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m24143k4(AbstractC13911hq abstractC13911hq, XmlDocument xmlDocument, XmlDocument xmlDocument2) {
        C5921ck c5921ck = new C5921ck();
        C5921ck c5921ck2 = new C5921ck();
        c5921ck.addItem(xmlDocument);
        c5921ck2.addItem(xmlDocument2);
        int i = 0;
        do {
            AbstractC13901ga abstractC13901gaMo23933k4 = c5921ck.mo23933k4(i);
            AbstractC13901ga abstractC13901gaMo23933k42 = c5921ck2.mo23933k4(i);
            AbstractC13911hq childNodes = abstractC13901gaMo23933k4.getChildNodes();
            AbstractC13911hq childNodes2 = abstractC13901gaMo23933k42.getChildNodes();
            for (int i2 = 0; i2 < childNodes.mo23932k4(); i2++) {
                c5921ck.addItem(childNodes.m65457kk(i2));
                c5921ck2.addItem(childNodes2.m65457kk(i2));
                if (C5934he.m23986k4(childNodes.m65457kk(i2), abstractC13911hq)) {
                    m24142k4(childNodes2.m65457kk(i2));
                }
                C13857b1 attributes = childNodes.m65457kk(i2).getAttributes();
                if (attributes != null) {
                    for (int i3 = 0; i3 < attributes.size(); i3++) {
                        if (C5934he.m23986k4(attributes.m65164k4(i3), abstractC13911hq)) {
                            m24142k4(childNodes2.m65457kk(i2).getAttributes().m65633to(i3));
                        }
                    }
                }
            }
            i++;
        } while (i < c5921ck.mo23932k4());
    }

    public C5978xk(AbstractC13911hq abstractC13911hq, boolean z, String str, AbstractC13943n5 abstractC13943n5) {
        if (abstractC13911hq == null) {
            throw new ArgumentNullException("nodeList");
        }
        XmlDocument xmlDocumentM23972k4 = C5934he.m23972k4(abstractC13911hq);
        if (xmlDocumentM23972k4 == null) {
            throw new ArgumentException("nodeList");
        }
        C5924dy c5924dy = new C5924dy(false, z);
        this.f16875k4 = c5924dy;
        c5924dy.setXmlResolver(abstractC13943n5);
        this.f16875k4.load(new C13970rs(xmlDocumentM23972k4));
        this.f16876x1 = new C5922dq(str);
        m24143k4(abstractC13911hq, xmlDocumentM23972k4, this.f16875k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m24144k4() {
        C6765kp c6765kp = new C6765kp();
        this.f16875k4.mo23906k4(c6765kp, 0, this.f16876x1);
        return new C6783wp(false).mo26677to(c6765kp.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m24145k4(AbstractC4705c6 abstractC4705c6) {
        this.f16875k4.mo23905k4(abstractC4705c6, 0, this.f16876x1);
        abstractC4705c6.mo19564k4(new byte[0], 0, 0);
        byte[] bArrCopyOf = Arrays.copyOf(abstractC4705c6.m19584fa(), abstractC4705c6.m19584fa().length);
        abstractC4705c6.mo18846c5();
        return bArrCopyOf;
    }
}
