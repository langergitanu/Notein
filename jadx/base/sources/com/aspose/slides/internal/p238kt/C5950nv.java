package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C14010x0;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.nv */
/* JADX INFO: loaded from: classes.dex */
public class C5950nv extends AbstractC5920ca {

    /* JADX INFO: renamed from: to */
    private AbstractC13911hq f16824to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14068j5[] f16825x1 = {C7019kk.m27443k4((Class<?>) AbstractC3150x6.class), C7019kk.m27443k4((Class<?>) AbstractC13911hq.class), C7019kk.m27443k4((Class<?>) XmlDocument.class)};

    /* JADX INFO: renamed from: kk */
    private AbstractC14068j5[] f16822kk = {C7019kk.m27443k4((Class<?>) AbstractC13911hq.class), C7019kk.m27443k4((Class<?>) XmlDocument.class)};

    /* JADX INFO: renamed from: du */
    private boolean f16819du = false;

    /* JADX INFO: renamed from: h4 */
    private C13950o3 f16821h4 = null;

    /* JADX INFO: renamed from: m9 */
    private XmlDocument f16823m9 = null;

    /* JADX INFO: renamed from: dy */
    private int f16820dy = 0;

    public C5950nv() {
        m23931x1("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: c5 */
    public Object mo23909c5() {
        XmlDocument xmlDocument = this.f16823m9;
        if (xmlDocument == null) {
            throw new CryptographicException("An XmlDocument context is required for enveloped transforms.");
        }
        AbstractC13911hq abstractC13911hq = this.f16824to;
        if (abstractC13911hq == null) {
            AbstractC13911hq abstractC13911hqSelectNodes = xmlDocument.selectNodes("//dsig:Signature", this.f16821h4);
            if (abstractC13911hqSelectNodes == null) {
                return this.f16823m9;
            }
            int iMo23932k4 = abstractC13911hqSelectNodes.mo23932k4();
            int i = this.f16820dy;
            if (iMo23932k4 < i || i <= 0) {
                return this.f16823m9;
            }
            abstractC13911hqSelectNodes.m65457kk(i - 1).getParentNode().removeChild(abstractC13911hqSelectNodes.m65457kk(this.f16820dy - 1));
            return this.f16823m9;
        }
        if (this.f16820dy == 0) {
            return abstractC13911hq;
        }
        AbstractC13911hq abstractC13911hqSelectNodes2 = xmlDocument.selectNodes("//dsig:Signature", this.f16821h4);
        if (abstractC13911hqSelectNodes2 == null) {
            return this.f16824to;
        }
        C5921ck c5921ck = new C5921ck();
        IEnumerator it = this.f16824to.iterator();
        while (it.hasNext()) {
            try {
                AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it.next();
                if (abstractC13901ga != null) {
                    if (C5934he.m24002x1(abstractC13901ga) || C5934he.m23985k4(abstractC13901ga)) {
                        c5921ck.addItem(abstractC13901ga);
                    } else {
                        try {
                            AbstractC13901ga abstractC13901gaSelectSingleNode = abstractC13901ga.selectSingleNode("ancestor-or-self::dsig:Signature[1]", this.f16821h4);
                            IEnumerator it2 = abstractC13911hqSelectNodes2.iterator();
                            int i2 = 0;
                            while (it2.hasNext()) {
                                try {
                                    i2++;
                                    if (((AbstractC13901ga) it2.next()) == abstractC13901gaSelectSingleNode) {
                                        break;
                                    }
                                } catch (Throwable th) {
                                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                        ((IDisposable) it2).dispose();
                                    }
                                    throw th;
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                ((IDisposable) it2).dispose();
                            }
                            if (abstractC13901gaSelectSingleNode == null || i2 != this.f16820dy) {
                                c5921ck.addItem(abstractC13901ga);
                            }
                        } catch (RuntimeException unused) {
                            continue;
                        }
                    }
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        return c5921ck;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: dy */
    public AbstractC13911hq mo23912dy() {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24077k4(int i) {
        this.f16820dy = i;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: m9 */
    public AbstractC14068j5[] mo23927m9() {
        return this.f16825x1;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: x1 */
    public Object mo23930x1(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) AbstractC13911hq.class) || abstractC14068j5.m66749k4(C7019kk.m27443k4((Class<?>) AbstractC13911hq.class))) {
            if (this.f16824to == null) {
                this.f16824to = C5934he.m23975k4((AbstractC13901ga) this.f16823m9, true);
            }
            return (AbstractC13911hq) mo23909c5();
        }
        if (abstractC14068j5 != C7019kk.m27443k4((Class<?>) XmlDocument.class) && !abstractC14068j5.m66749k4(C7019kk.m27443k4((Class<?>) XmlDocument.class))) {
            throw new ArgumentException("The input type was invalid for this transform.", C18437z2.f56754h);
        }
        if (this.f16824to == null) {
            return (XmlDocument) mo23909c5();
        }
        throw new ArgumentException("The input type was invalid for this transform.", C18437z2.f56754h);
    }

    /* JADX INFO: renamed from: k4 */
    private void m24074k4(AbstractC3150x6 abstractC3150x6) {
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        xmlDocument.load(C5934he.m23976k4(abstractC3150x6, m23913h4() ? this.f16742k4 : new C14010x0(), m23917k4()));
        this.f16823m9 = xmlDocument;
        C13950o3 c13950o3 = new C13950o3(this.f16823m9.getNameTable());
        this.f16821h4 = c13950o3;
        c13950o3.mo65707k4("dsig", "http://www.w3.org/2000/09/xmldsig#");
    }

    /* JADX INFO: renamed from: x1 */
    private void m24075x1(XmlDocument xmlDocument) {
        if (xmlDocument == null) {
            throw new ArgumentNullException("doc");
        }
        this.f16823m9 = xmlDocument;
        C13950o3 c13950o3 = new C13950o3(this.f16823m9.getNameTable());
        this.f16821h4 = c13950o3;
        c13950o3.mo65707k4("dsig", "http://www.w3.org/2000/09/xmldsig#");
    }

    /* JADX INFO: renamed from: x1 */
    private void m24076x1(AbstractC13911hq abstractC13911hq) {
        if (abstractC13911hq == null) {
            throw new ArgumentNullException("nodeList");
        }
        XmlDocument xmlDocumentM23972k4 = C5934he.m23972k4(abstractC13911hq);
        this.f16823m9 = xmlDocumentM23972k4;
        if (xmlDocumentM23972k4 == null) {
            throw new CryptographicException("An XmlDocument context is required for enveloped transforms.");
        }
        C13950o3 c13950o3 = new C13950o3(this.f16823m9.getNameTable());
        this.f16821h4 = c13950o3;
        c13950o3.mo65707k4("dsig", "http://www.w3.org/2000/09/xmldsig#");
        this.f16824to = abstractC13911hq;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23920k4(AbstractC13911hq abstractC13911hq) {
        if (abstractC13911hq != null && abstractC13911hq.mo23932k4() > 0) {
            throw new CryptographicException("Unknown transform has been encountered.");
        }
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23922k4(Object obj) {
        if (C7019kk.m27469x1(obj, AbstractC3150x6.class)) {
            m24074k4((AbstractC3150x6) obj);
        } else if (C7019kk.m27469x1(obj, AbstractC13911hq.class)) {
            m24076x1((AbstractC13911hq) obj);
        } else if (C7019kk.m27469x1(obj, XmlDocument.class)) {
            m24075x1((XmlDocument) obj);
        }
    }
}
