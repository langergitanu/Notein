package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.bs */
/* JADX INFO: loaded from: classes.dex */
public class C5915bs {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f16734k4 = new ArrayList();

    /* JADX INFO: renamed from: k4 */
    public final int m23886k4() {
        return this.f16734k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m23887k4(AbstractC3150x6 abstractC3150x6, AbstractC13943n5 abstractC13943n5, String str) {
        return m23889k4(abstractC3150x6, C7019kk.m27443k4((Class<?>) AbstractC3150x6.class), abstractC13943n5, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m23888k4(XmlDocument xmlDocument, AbstractC13943n5 abstractC13943n5, String str) {
        return m23889k4(xmlDocument, C7019kk.m27443k4((Class<?>) XmlDocument.class), abstractC13943n5, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m23889k4(Object obj, AbstractC14068j5 abstractC14068j5, AbstractC13943n5 abstractC13943n5, String str) {
        C3152yj c3152yj;
        Object objMo23909c5;
        IEnumerator it = this.f16734k4.iterator();
        while (it.hasNext()) {
            try {
                AbstractC5920ca abstractC5920ca = (AbstractC5920ca) it.next();
                if (obj == null || abstractC5920ca.m23924k4(C14067j2.m66727k4(obj))) {
                    abstractC5920ca.m23921k4(abstractC13943n5);
                    abstractC5920ca.m23923k4(str);
                    abstractC5920ca.mo23922k4(obj);
                } else if (!C7019kk.m27469x1(obj, AbstractC3150x6.class)) {
                    if (C7019kk.m27469x1(obj, AbstractC13911hq.class)) {
                        if (!abstractC5920ca.m23924k4(C7019kk.m27443k4((Class<?>) AbstractC3150x6.class))) {
                            throw new CryptographicException("The input type was invalid for this transform.");
                        }
                        c3152yj = new C3152yj(new C5961to((AbstractC13911hq) obj, abstractC13943n5, false).m24118k4());
                        abstractC5920ca.mo23922k4(c3152yj);
                        objMo23909c5 = abstractC5920ca.mo23909c5();
                    } else {
                        if (!C7019kk.m27469x1(obj, XmlDocument.class)) {
                            throw new CryptographicException("The input type was invalid for this transform.");
                        }
                        if (!abstractC5920ca.m23924k4(C7019kk.m27443k4((Class<?>) AbstractC3150x6.class))) {
                            throw new CryptographicException("The input type was invalid for this transform.");
                        }
                        c3152yj = new C3152yj(new C5961to((XmlDocument) obj, abstractC13943n5).m24118k4());
                        abstractC5920ca.mo23922k4(c3152yj);
                        objMo23909c5 = abstractC5920ca.mo23909c5();
                    }
                    c3152yj.close();
                    obj = objMo23909c5;
                } else {
                    if (!abstractC5920ca.m23924k4(C7019kk.m27443k4((Class<?>) XmlDocument.class))) {
                        throw new CryptographicException("The input type was invalid for this transform.");
                    }
                    AbstractC3150x6 abstractC3150x6 = (AbstractC3150x6) C7019kk.m27452k4(obj, AbstractC3150x6.class);
                    XmlDocument xmlDocument = new XmlDocument();
                    xmlDocument.setPreserveWhitespace(true);
                    xmlDocument.load(C5934he.m23976k4(abstractC3150x6, abstractC13943n5, str));
                    abstractC5920ca.mo23922k4((Object) xmlDocument);
                    abstractC3150x6.close();
                }
                obj = abstractC5920ca.mo23909c5();
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
        if (C7019kk.m27469x1(obj, AbstractC3150x6.class)) {
            return (AbstractC3150x6) C7019kk.m27452k4(obj, AbstractC3150x6.class);
        }
        if (C7019kk.m27469x1(obj, AbstractC13911hq.class)) {
            return new C3152yj(new C5961to((AbstractC13911hq) obj, abstractC13943n5, false).m24118k4());
        }
        if (C7019kk.m27469x1(obj, XmlDocument.class)) {
            return new C3152yj(new C5961to((XmlDocument) obj, abstractC13943n5).m24118k4());
        }
        throw new CryptographicException("The input type was invalid for this transform.");
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC5920ca m23890k4(int i) {
        if (i < this.f16734k4.size()) {
            return (AbstractC5920ca) this.f16734k4.get_Item(i);
        }
        throw new ArgumentException("Index was out of range.  Must be non-negative and less than the size of the collection.", FirebaseAnalytics.Param.INDEX);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C13981tl m23891k4(XmlDocument xmlDocument, String str) {
        C13981tl c13981tlM23915k4;
        C13981tl c13981tlCreateElement = xmlDocument.createElement("Transforms", str);
        IEnumerator it = this.f16734k4.iterator();
        while (it.hasNext()) {
            try {
                AbstractC5920ca abstractC5920ca = (AbstractC5920ca) it.next();
                if (abstractC5920ca != null && (c13981tlM23915k4 = abstractC5920ca.m23915k4(xmlDocument)) != null) {
                    c13981tlCreateElement.appendChild(c13981tlM23915k4);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23892k4(AbstractC5920ca abstractC5920ca) {
        if (abstractC5920ca != null) {
            this.f16734k4.addItem(abstractC5920ca);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23893k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("ds", "http://www.w3.org/2000/09/xmldsig#");
        AbstractC13911hq abstractC13911hqSelectNodes = c13981tl.selectNodes("ds:Transform", c13950o3);
        if (abstractC13911hqSelectNodes.mo23932k4() == 0) {
            throw new CryptographicException("Malformed element {0}.", "Transforms");
        }
        this.f16734k4.clear();
        for (int i = 0; i < abstractC13911hqSelectNodes.mo23932k4(); i++) {
            C13981tl c13981tl2 = (C13981tl) abstractC13911hqSelectNodes.mo23933k4(i);
            AbstractC5920ca abstractC5920ca = (AbstractC5920ca) C5936ix.m24008k4(AbstractC5920ca.class, C5934he.m23994kk(c13981tl2, "Algorithm", "http://www.w3.org/2000/09/xmldsig#"));
            if (abstractC5920ca == null) {
                throw new CryptographicException("Unknown transform has been encountered.");
            }
            abstractC5920ca.mo23920k4(c13981tl2.getChildNodes());
            this.f16734k4.addItem(abstractC5920ca);
        }
    }
}
