package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.C14010x0;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.y9 */
/* JADX INFO: loaded from: classes.dex */
public class C5981y9 extends AbstractC5920ca {

    /* JADX INFO: renamed from: du */
    private String f16884du;

    /* JADX INFO: renamed from: h4 */
    private C5978xk f16885h4;

    /* JADX INFO: renamed from: kk */
    private AbstractC14068j5[] f16886kk;

    /* JADX INFO: renamed from: to */
    private boolean f16887to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14068j5[] f16888x1;

    public C5981y9() {
        this(false, null);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: c5 */
    public Object mo23909c5() {
        return new C3152yj(this.f16885h4.m24144k4());
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: dy */
    public AbstractC13911hq mo23912dy() {
        if (m24154fa() == null) {
            return null;
        }
        XmlDocument xmlDocument = new XmlDocument();
        C13981tl c13981tlCreateElement = xmlDocument.createElement("Transform", "http://www.w3.org/2000/09/xmldsig#");
        if (!C14113y2.m67411k4(m23928to())) {
            c13981tlCreateElement.m65910kk("Algorithm", m23928to());
        }
        C13981tl c13981tlCreateElement2 = xmlDocument.createElement("InclusiveNamespaces", "http://www.w3.org/2001/10/xml-exc-c14n#");
        c13981tlCreateElement2.m65910kk("PrefixList", m24154fa());
        c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        return c13981tlCreateElement.getChildNodes();
    }

    /* JADX INFO: renamed from: fa */
    public final String m24154fa() {
        return this.f16884du;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo23920k4(AbstractC13911hq abstractC13911hq) {
        boolean zM27456k4;
        if (abstractC13911hq == null) {
            return;
        }
        IEnumerator it = abstractC13911hq.iterator();
        while (true) {
            try {
                if (it.hasNext()) {
                    C13981tl c13981tl = (C13981tl) C7019kk.m27452k4(it.next(), C13981tl.class);
                    if (c13981tl != null) {
                        if (!C14113y2.m67363du(c13981tl.getLocalName(), "InclusiveNamespaces") || !C14113y2.m67363du(c13981tl.getNamespaceURI(), "http://www.w3.org/2001/10/xml-exc-c14n#") || !C5934he.m23999to(c13981tl, "PrefixList", "http://www.w3.org/2000/09/xmldsig#")) {
                            throw new CryptographicException("Unknown transform has been encountered.");
                        }
                        if (!C5934he.m23989k4(c13981tl, "PrefixList")) {
                            throw new CryptographicException("Unknown transform has been encountered.");
                        }
                        m24155kk(C5934he.m23994kk(c13981tl, "PrefixList", "http://www.w3.org/2000/09/xmldsig#"));
                        if (!zM27456k4) {
                            return;
                        }
                    }
                } else if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    return;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m24155kk(String str) {
        this.f16884du = str;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: m9 */
    public AbstractC14068j5[] mo23927m9() {
        return this.f16888x1;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: x1 */
    public Object mo23930x1(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) AbstractC3150x6.class) || abstractC14068j5.m66749k4(C7019kk.m27443k4((Class<?>) AbstractC3150x6.class))) {
            return new C3152yj(this.f16885h4.m24144k4());
        }
        throw new ArgumentException("The input type was invalid for this transform.", C18437z2.f56754h);
    }

    public C5981y9(boolean z) {
        this(z, null);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23922k4(Object obj) {
        AbstractC13943n5 c14010x0 = m23913h4() ? this.f16742k4 : new C14010x0();
        if (C7019kk.m27469x1(obj, AbstractC3150x6.class)) {
            this.f16885h4 = new C5978xk((AbstractC3150x6) obj, this.f16887to, this.f16884du, c14010x0, m23917k4());
        } else if (C7019kk.m27469x1(obj, XmlDocument.class)) {
            this.f16885h4 = new C5978xk((XmlDocument) obj, this.f16887to, this.f16884du, c14010x0);
        } else {
            if (!C7019kk.m27469x1(obj, AbstractC13911hq.class)) {
                throw new ArgumentException("Type of input object is invalid.", "obj");
            }
            this.f16885h4 = new C5978xk((AbstractC13911hq) obj, this.f16887to, this.f16884du, c14010x0);
        }
    }

    public C5981y9(boolean z, String str) {
        this.f16888x1 = new AbstractC14068j5[]{C7019kk.m27443k4((Class<?>) AbstractC3150x6.class), C7019kk.m27443k4((Class<?>) XmlDocument.class), C7019kk.m27443k4((Class<?>) AbstractC13911hq.class)};
        this.f16886kk = new AbstractC14068j5[]{C7019kk.m27443k4((Class<?>) AbstractC3150x6.class)};
        this.f16887to = z;
        this.f16884du = str;
        m23931x1(z ? "http://www.w3.org/2001/10/xml-exc-c14n#WithComments" : "http://www.w3.org/2001/10/xml-exc-c14n#");
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public byte[] mo23925k4(AbstractC4705c6 abstractC4705c6) {
        return this.f16885h4.m24145k4(abstractC4705c6);
    }
}
