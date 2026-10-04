package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10928kk;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.C14010x0;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13903gi;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.ig */
/* JADX INFO: loaded from: classes.dex */
public class C5935ig extends AbstractC5920ca {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f16774m9 = new C7017h4("xml", "xmlns");

    /* JADX INFO: renamed from: du */
    private XmlDocument f16775du;

    /* JADX INFO: renamed from: h4 */
    private C13950o3 f16776h4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14068j5[] f16779x1 = {C7019kk.m27443k4((Class<?>) AbstractC3150x6.class), C7019kk.m27443k4((Class<?>) AbstractC13911hq.class), C7019kk.m27443k4((Class<?>) XmlDocument.class)};

    /* JADX INFO: renamed from: kk */
    private AbstractC14068j5[] f16777kk = {C7019kk.m27443k4((Class<?>) AbstractC13911hq.class)};

    /* JADX INFO: renamed from: to */
    private String f16778to = C14113y2.f47374k4;

    public C5935ig() {
        m23931x1("http://www.w3.org/TR/1999/REC-xpath-19991116");
    }

    /* JADX INFO: renamed from: k4 */
    private void m24005k4(AbstractC3150x6 abstractC3150x6) {
        AbstractC13912i5 abstractC13912i5M23976k4 = C5934he.m23976k4(abstractC3150x6, m23913h4() ? this.f16742k4 : new C14010x0(), m23917k4());
        XmlDocument xmlDocument = new XmlDocument();
        this.f16775du = xmlDocument;
        xmlDocument.setPreserveWhitespace(true);
        this.f16775du.load(abstractC13912i5M23976k4);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: c5 */
    public Object mo23909c5() {
        C5921ck c5921ck = new C5921ck();
        if (!C14113y2.m67411k4(this.f16778to)) {
            AbstractC10925du abstractC10925duCreateNavigator = this.f16775du.createNavigator();
            AbstractC10929m9 abstractC10929m9M52689h4 = abstractC10925duCreateNavigator.m52689h4("//. | //@*");
            AbstractC10928kk abstractC10928kkM52688du = abstractC10925duCreateNavigator.m52688du(C14113y2.m67408k4("boolean(", this.f16778to, ")"));
            abstractC10928kkM52688du.mo23219k4(this.f16776h4);
            while (abstractC10929m9M52689h4.mo21770x1()) {
                AbstractC13901ga abstractC13901gaMo65354wl = ((InterfaceC13903gi) abstractC10929m9M52689h4.mo21834kk()).mo65354wl();
                if (((Boolean) C7019kk.m27464to(abstractC10929m9M52689h4.mo21834kk().m52699x1(abstractC10928kkM52688du), Boolean.TYPE)).booleanValue()) {
                    c5921ck.addItem(abstractC13901gaMo65354wl);
                }
            }
            AbstractC10929m9 abstractC10929m9M52689h42 = abstractC10925duCreateNavigator.m52689h4("//namespace::*");
            while (abstractC10929m9M52689h42.mo21770x1()) {
                c5921ck.addItem(((InterfaceC13903gi) abstractC10929m9M52689h42.mo21834kk()).mo65354wl());
            }
        }
        return c5921ck;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: dy */
    public AbstractC13911hq mo23912dy() {
        XmlDocument xmlDocument = new XmlDocument();
        C13981tl c13981tlCreateElement = xmlDocument.createElement(null, "XPath", "http://www.w3.org/2000/09/xmldsig#");
        C13950o3 c13950o3 = this.f16776h4;
        if (c13950o3 != null) {
            IEnumerator it = c13950o3.iterator();
            while (it.hasNext()) {
                try {
                    String str = (String) it.next();
                    int iM27428k4 = f16774m9.m27428k4(str);
                    if (iM27428k4 != 0 && iM27428k4 != 1 && str != null && str.length() > 0) {
                        c13981tlCreateElement.m65910kk(C14113y2.m67408k4("xmlns:", str), this.f16776h4.mo13292k4(str));
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
        }
        c13981tlCreateElement.setInnerXml(this.f16778to);
        xmlDocument.appendChild(c13981tlCreateElement);
        return xmlDocument.getChildNodes();
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: m9 */
    public AbstractC14068j5[] mo23927m9() {
        return this.f16779x1;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: x1 */
    public Object mo23930x1(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) AbstractC13911hq.class) || abstractC14068j5.m66749k4(C7019kk.m27443k4((Class<?>) AbstractC13911hq.class))) {
            return (AbstractC13911hq) mo23909c5();
        }
        throw new ArgumentException("The input type was invalid for this transform.", C18437z2.f56754h);
    }

    /* JADX INFO: renamed from: x1 */
    private void m24006x1(XmlDocument xmlDocument) {
        this.f16775du = xmlDocument;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ("XPath".equals(r2.getLocalName()) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r7.f16778to = com.aspose.slides.p559ms.System.C14113y2.m67423kk(r2.getInnerXml(), (char[]) null);
        r7.f16776h4 = new com.aspose.slides.p559ms.System.Xml.C13950o3(new com.aspose.slides.p559ms.System.Xml.C13970rs(r2).mo65059yd());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (com.aspose.slides.internal.p238kt.C5934he.m23989k4(r2, (java.lang.String) null) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r3 = r2.getAttributes().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (r3.hasNext() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r4 = (com.aspose.slides.p559ms.System.Xml.C13940my) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if ("xmlns".equals(r4.getPrefix()) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        r5 = r4.getLocalName();
        r4 = r4.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r5 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        r5 = r2.getPrefix();
        r4 = r2.getNamespaceURI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        r7.f16776h4.mo65707k4(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27456k4((java.util.Iterator) r3, (java.lang.Class<com.aspose.slides.p559ms.System.IDisposable>) com.aspose.slides.p559ms.System.IDisposable.class) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        ((com.aspose.slides.p559ms.System.IDisposable) r3).dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27456k4((java.util.Iterator) r3, (java.lang.Class<com.aspose.slides.p559ms.System.IDisposable>) com.aspose.slides.p559ms.System.IDisposable.class) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        ((com.aspose.slides.p559ms.System.IDisposable) r3).dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        throw new com.aspose.slides.exceptions.CryptographicException("Unknown transform has been encountered.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        throw new com.aspose.slides.exceptions.CryptographicException("Unknown transform has been encountered.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27456k4((java.util.Iterator) r8, (java.lang.Class<com.aspose.slides.p559ms.System.IDisposable>) com.aspose.slides.p559ms.System.IDisposable.class) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        ((com.aspose.slides.p559ms.System.IDisposable) r8).dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        if (r7.f16778to == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c3, code lost:
    
        throw new com.aspose.slides.exceptions.CryptographicException("Unknown transform has been encountered.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo23920k4(AbstractC13911hq abstractC13911hq) {
        if (abstractC13911hq == null) {
            throw new CryptographicException("Unknown transform has been encountered.");
        }
        IEnumerator it = abstractC13911hq.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                C13981tl c13981tl = (C13981tl) C7019kk.m27452k4(it.next(), C13981tl.class);
                if (c13981tl != null) {
                    break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m24007x1(AbstractC13911hq abstractC13911hq) {
        C3152yj c3152yj = new C3152yj(new C5961to(abstractC13911hq, m23913h4() ? this.f16742k4 : new C14010x0(), true).m24118k4());
        try {
            m24005k4((AbstractC3150x6) c3152yj);
        } finally {
            c3152yj.dispose();
        }
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23922k4(Object obj) {
        if (C7019kk.m27469x1(obj, AbstractC3150x6.class)) {
            m24005k4((AbstractC3150x6) obj);
        } else if (C7019kk.m27469x1(obj, AbstractC13911hq.class)) {
            m24007x1((AbstractC13911hq) obj);
        } else if (C7019kk.m27469x1(obj, XmlDocument.class)) {
            m24006x1((XmlDocument) obj);
        }
    }
}
