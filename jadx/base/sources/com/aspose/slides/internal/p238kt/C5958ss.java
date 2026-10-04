package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p118ex.C3823m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.ss */
/* JADX INFO: loaded from: classes.dex */
public class C5958ss extends AbstractC5917bz {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f16845k4 = null;

    /* JADX INFO: renamed from: x1 */
    private ArrayList f16848x1 = null;

    /* JADX INFO: renamed from: kk */
    private ArrayList f16846kk = null;

    /* JADX INFO: renamed from: to */
    private ArrayList f16847to = null;

    /* JADX INFO: renamed from: du */
    private byte[] f16844du = null;

    /* JADX INFO: renamed from: h4 */
    private void m24106h4() {
        this.f16844du = null;
        ArrayList arrayList = this.f16846kk;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f16847to;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.f16848x1;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f16845k4;
        if (arrayList4 != null) {
            arrayList4.clear();
        }
    }

    /* JADX INFO: renamed from: du */
    public final ArrayList m24107du() {
        return this.f16848x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final ArrayList m24108k4() {
        return this.f16845k4;
    }

    /* JADX INFO: renamed from: kk */
    public final ArrayList m24113kk() {
        return this.f16846kk;
    }

    /* JADX INFO: renamed from: to */
    public final ArrayList m24114to() {
        return this.f16847to;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: x1 */
    public C13981tl mo23904x1() {
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        return mo23902k4(xmlDocument);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public C13981tl mo23902k4(XmlDocument xmlDocument) {
        IEnumerator it;
        C13981tl c13981tlCreateElement = xmlDocument.createElement("X509Data", "http://www.w3.org/2000/09/xmldsig#");
        ArrayList arrayList = this.f16848x1;
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    C5940jw c5940jw = (C5940jw) it.next();
                    C13981tl c13981tlCreateElement2 = xmlDocument.createElement("X509IssuerSerial", "http://www.w3.org/2000/09/xmldsig#");
                    C13981tl c13981tlCreateElement3 = xmlDocument.createElement("X509IssuerName", "http://www.w3.org/2000/09/xmldsig#");
                    c13981tlCreateElement3.appendChild(xmlDocument.createTextNode(c5940jw.m24032k4()));
                    c13981tlCreateElement2.appendChild(c13981tlCreateElement3);
                    C13981tl c13981tlCreateElement4 = xmlDocument.createElement("X509SerialNumber", "http://www.w3.org/2000/09/xmldsig#");
                    c13981tlCreateElement4.appendChild(xmlDocument.createTextNode(c5940jw.m24036x1()));
                    c13981tlCreateElement2.appendChild(c13981tlCreateElement4);
                    c13981tlCreateElement.appendChild(c13981tlCreateElement2);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it).dispose();
            }
        }
        ArrayList arrayList2 = this.f16846kk;
        if (arrayList2 != null) {
            IEnumerator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    byte[] bArr = (byte[]) it2.next();
                    C13981tl c13981tlCreateElement5 = xmlDocument.createElement("X509SKI", "http://www.w3.org/2000/09/xmldsig#");
                    c13981tlCreateElement5.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(bArr)));
                    c13981tlCreateElement.appendChild(c13981tlCreateElement5);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it2).dispose();
            }
        }
        ArrayList arrayList3 = this.f16847to;
        if (arrayList3 != null) {
            IEnumerator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                try {
                    String str = (String) it3.next();
                    C13981tl c13981tlCreateElement6 = xmlDocument.createElement("X509SubjectName", "http://www.w3.org/2000/09/xmldsig#");
                    c13981tlCreateElement6.appendChild(xmlDocument.createTextNode(str));
                    c13981tlCreateElement.appendChild(c13981tlCreateElement6);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it3).dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it3).dispose();
            }
        }
        ArrayList arrayList4 = this.f16845k4;
        if (arrayList4 != null) {
            it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    C3817h4 c3817h4 = (C3817h4) it.next();
                    C13981tl c13981tlCreateElement7 = xmlDocument.createElement("X509Certificate", "http://www.w3.org/2000/09/xmldsig#");
                    c13981tlCreateElement7.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(c3817h4.m15278ck())));
                    c13981tlCreateElement.appendChild(c13981tlCreateElement7);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it).dispose();
            }
        }
        if (this.f16844du != null) {
            C13981tl c13981tlCreateElement8 = xmlDocument.createElement("X509CRL", "http://www.w3.org/2000/09/xmldsig#");
            c13981tlCreateElement8.appendChild(xmlDocument.createTextNode(C14080ne.m66952k4(this.f16844du)));
            c13981tlCreateElement.appendChild(c13981tlCreateElement8);
        }
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24109k4(C3817h4 c3817h4) {
        if (c3817h4 == null) {
            throw new ArgumentNullException("certificate");
        }
        if (this.f16845k4 == null) {
            this.f16845k4 = new ArrayList();
        }
        this.f16845k4.addItem(new C3823m9(c3817h4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public void mo23903k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("element");
        }
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("ds", "http://www.w3.org/2000/09/xmldsig#");
        AbstractC13911hq abstractC13911hqSelectNodes = c13981tl.selectNodes("ds:X509IssuerSerial", c13950o3);
        AbstractC13911hq abstractC13911hqSelectNodes2 = c13981tl.selectNodes("ds:X509SKI", c13950o3);
        AbstractC13911hq abstractC13911hqSelectNodes3 = c13981tl.selectNodes("ds:X509SubjectName", c13950o3);
        AbstractC13911hq abstractC13911hqSelectNodes4 = c13981tl.selectNodes("ds:X509Certificate", c13950o3);
        AbstractC13911hq abstractC13911hqSelectNodes5 = c13981tl.selectNodes("ds:X509CRL", c13950o3);
        if (abstractC13911hqSelectNodes5.mo23932k4() == 0 && abstractC13911hqSelectNodes.mo23932k4() == 0 && abstractC13911hqSelectNodes2.mo23932k4() == 0 && abstractC13911hqSelectNodes3.mo23932k4() == 0 && abstractC13911hqSelectNodes4.mo23932k4() == 0) {
            throw new CryptographicException("Malformed element {0}.", "X509Data");
        }
        m24106h4();
        if (abstractC13911hqSelectNodes5.mo23932k4() != 0) {
            this.f16844du = C14080ne.m66934jd(C5934he.m23978k4(abstractC13911hqSelectNodes5.mo23933k4(0).getInnerText()));
        }
        IEnumerator it = abstractC13911hqSelectNodes.iterator();
        while (it.hasNext()) {
            try {
                AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it.next();
                AbstractC13901ga abstractC13901gaSelectSingleNode = abstractC13901ga.selectSingleNode("ds:X509IssuerName", c13950o3);
                AbstractC13901ga abstractC13901gaSelectSingleNode2 = abstractC13901ga.selectSingleNode("ds:X509SerialNumber", c13950o3);
                if (abstractC13901gaSelectSingleNode == null || abstractC13901gaSelectSingleNode2 == null) {
                    throw new CryptographicException("Malformed element {0}.", "IssuerSerial");
                }
                m24111k4(C14113y2.m67440x1(abstractC13901gaSelectSingleNode.getInnerText()), C14113y2.m67440x1(abstractC13901gaSelectSingleNode2.getInnerText()));
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        IEnumerator it2 = abstractC13911hqSelectNodes2.iterator();
        while (it2.hasNext()) {
            try {
                m24112k4(C14080ne.m66934jd(C5934he.m23978k4(((AbstractC13901ga) it2.next()).getInnerText())));
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it2).dispose();
        }
        IEnumerator it3 = abstractC13911hqSelectNodes3.iterator();
        while (it3.hasNext()) {
            try {
                m24110k4(C14113y2.m67440x1(((AbstractC13901ga) it3.next()).getInnerText()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it3).dispose();
        }
        it3 = abstractC13911hqSelectNodes4.iterator();
        while (it3.hasNext()) {
            try {
                m24109k4(new C3823m9(C14080ne.m66934jd(C5934he.m23978k4(((AbstractC13901ga) it3.next()).getInnerText()))));
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24110k4(String str) {
        if (this.f16847to == null) {
            this.f16847to = new ArrayList();
        }
        this.f16847to.addItem(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24111k4(String str, String str2) {
        if (this.f16848x1 == null) {
            this.f16848x1 = new ArrayList();
        }
        this.f16848x1.add(C5934he.m23969k4(str, str2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24112k4(byte[] bArr) {
        if (this.f16846kk == null) {
            this.f16846kk = new ArrayList();
        }
        this.f16846kk.addItem(bArr);
    }
}
