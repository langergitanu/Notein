package com.aspose.slides.internal.p238kt;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.os */
/* JADX INFO: loaded from: classes.dex */
public class C5951os {

    /* JADX INFO: renamed from: du */
    private C5925e0 f16826du;

    /* JADX INFO: renamed from: k4 */
    private String f16829k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f16830kk;

    /* JADX INFO: renamed from: to */
    private String f16832to;

    /* JADX INFO: renamed from: x1 */
    private C5926em f16833x1;

    /* JADX INFO: renamed from: dy */
    private C5984zj f16827dy = null;

    /* JADX INFO: renamed from: h4 */
    private IList f16828h4 = new ArrayList();

    /* JADX INFO: renamed from: m9 */
    private C5921ck f16831m9 = new C5921ck();

    /* JADX INFO: renamed from: du */
    public final IList m24078du() {
        return this.f16828h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C5921ck m24079h4() {
        return this.f16831m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final C5984zj m24080k4() {
        return this.f16827dy;
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m24086kk() {
        return this.f16830kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C13981tl m24087m9() {
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        return m24081k4(xmlDocument);
    }

    /* JADX INFO: renamed from: to */
    public final C5925e0 m24088to() {
        if (this.f16826du == null) {
            this.f16826du = new C5925e0();
        }
        return this.f16826du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C5926em m24089x1() {
        return this.f16833x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m24081k4(XmlDocument xmlDocument) {
        C13981tl c13981tlCreateElement = xmlDocument.createElement(RequestParameters.SIGNATURE, "http://www.w3.org/2000/09/xmldsig#");
        if (!C14113y2.m67411k4(this.f16829k4)) {
            c13981tlCreateElement.m65910kk("Id", this.f16829k4);
        }
        C5926em c5926em = this.f16833x1;
        if (c5926em == null) {
            throw new CryptographicException("Signature requires a SignedInfo.");
        }
        c13981tlCreateElement.appendChild(c5926em.m23948k4(xmlDocument));
        if (this.f16830kk == null) {
            throw new CryptographicException("Signature requires a SignatureValue.");
        }
        C13981tl c13981tlCreateElement2 = xmlDocument.createElement("SignatureValue", "http://www.w3.org/2000/09/xmldsig#");
        c13981tlCreateElement2.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(this.f16830kk)));
        if (!C14113y2.m67411k4(this.f16832to)) {
            c13981tlCreateElement2.m65910kk("Id", this.f16832to);
        }
        c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        if (m24088to().m23940k4() > 0) {
            c13981tlCreateElement.appendChild(m24088to().m23941k4(xmlDocument));
        }
        Iterator it = this.f16828h4.iterator();
        while (it.hasNext()) {
            try {
                C5953qq c5953qq = (C5953qq) C7019kk.m27452k4(it.next(), C5953qq.class);
                if (c5953qq != null) {
                    c13981tlCreateElement.appendChild(c5953qq.m24093k4(xmlDocument));
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24082k4(C5926em c5926em) {
        C5926em c5926em2;
        this.f16833x1 = c5926em;
        if (m24080k4() == null || (c5926em2 = this.f16833x1) == null) {
            return;
        }
        c5926em2.m23950k4(m24080k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24083k4(C5984zj c5984zj) {
        this.f16827dy = c5984zj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m24084k4(C13981tl c13981tl) {
        IEnumerator it;
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        if (!C14113y2.m67363du(c13981tl.getLocalName(), RequestParameters.SIGNATURE)) {
            throw new CryptographicException("Malformed element {0}.", RequestParameters.SIGNATURE);
        }
        this.f16829k4 = C5934he.m23994kk(c13981tl, "Id", "http://www.w3.org/2000/09/xmldsig#");
        if (!C5934he.m23989k4(c13981tl, "Id")) {
            throw new CryptographicException("Malformed element {0}.", RequestParameters.SIGNATURE);
        }
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("ds", "http://www.w3.org/2000/09/xmldsig#");
        AbstractC13911hq abstractC13911hqSelectNodes = c13981tl.selectNodes("ds:SignedInfo", c13950o3);
        if (abstractC13911hqSelectNodes == null || abstractC13911hqSelectNodes.mo23932k4() == 0 || abstractC13911hqSelectNodes.mo23932k4() > 1) {
            throw new CryptographicException("Malformed element {0}.", "SignedInfo");
        }
        C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) abstractC13911hqSelectNodes.m65457kk(0), C13981tl.class);
        int iMo23932k4 = abstractC13911hqSelectNodes.mo23932k4();
        m24082k4(new C5926em());
        m24089x1().m23951k4(c13981tl2);
        AbstractC13911hq abstractC13911hqSelectNodes2 = c13981tl.selectNodes("ds:SignatureValue", c13950o3);
        if (abstractC13911hqSelectNodes2 == null || abstractC13911hqSelectNodes2.mo23932k4() == 0 || abstractC13911hqSelectNodes2.mo23932k4() > 1) {
            throw new CryptographicException("Malformed element {0}.", "SignatureValue");
        }
        C13981tl c13981tl3 = (C13981tl) C7019kk.m27452k4((Object) abstractC13911hqSelectNodes2.m65457kk(0), C13981tl.class);
        int iMo23932k42 = abstractC13911hqSelectNodes2.mo23932k4() + iMo23932k4;
        this.f16830kk = C14080ne.m66934jd(C5934he.m23978k4(c13981tl3.getInnerText()));
        this.f16832to = C5934he.m23994kk(c13981tl3, "Id", "http://www.w3.org/2000/09/xmldsig#");
        if (!C5934he.m23989k4(c13981tl3, "Id")) {
            throw new CryptographicException("Malformed element {0}.", "SignatureValue");
        }
        AbstractC13911hq abstractC13911hqSelectNodes3 = c13981tl.selectNodes("ds:KeyInfo", c13950o3);
        this.f16826du = new C5925e0();
        if (abstractC13911hqSelectNodes3 != null) {
            if (abstractC13911hqSelectNodes3.mo23932k4() > 1) {
                throw new CryptographicException("Malformed element {0}.", "KeyInfo");
            }
            it = abstractC13911hqSelectNodes3.iterator();
            while (it.hasNext()) {
                try {
                    C13981tl c13981tl4 = (C13981tl) C7019kk.m27452k4(it.next(), C13981tl.class);
                    if (c13981tl4 != null) {
                        this.f16826du.m23943k4(c13981tl4);
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it).dispose();
            }
            iMo23932k42 += abstractC13911hqSelectNodes3.mo23932k4();
        }
        AbstractC13911hq abstractC13911hqSelectNodes4 = c13981tl.selectNodes("ds:Object", c13950o3);
        this.f16828h4.clear();
        if (abstractC13911hqSelectNodes4 != null) {
            it = abstractC13911hqSelectNodes4.iterator();
            while (it.hasNext()) {
                try {
                    C13981tl c13981tl5 = (C13981tl) C7019kk.m27452k4(it.next(), C13981tl.class);
                    if (c13981tl5 != null) {
                        C5953qq c5953qq = new C5953qq();
                        c5953qq.m24094k4(c13981tl5);
                        this.f16828h4.addItem(c5953qq);
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it).dispose();
            }
            iMo23932k42 += abstractC13911hqSelectNodes4.mo23932k4();
        }
        AbstractC13911hq abstractC13911hqSelectNodes5 = c13981tl.selectNodes("//*[@Id]", c13950o3);
        if (abstractC13911hqSelectNodes5 != null) {
            IEnumerator it2 = abstractC13911hqSelectNodes5.iterator();
            while (it2.hasNext()) {
                try {
                    this.f16831m9.addItem((AbstractC13901ga) it2.next());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it2).dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it2).dispose();
            }
        }
        if (c13981tl.selectNodes(C18358t1.g.f56183c).mo23932k4() != iMo23932k42) {
            throw new CryptographicException("Malformed element {0}.", RequestParameters.SIGNATURE);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24085k4(byte[] bArr) {
        this.f16830kk = bArr;
    }
}
