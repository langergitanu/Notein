package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.qq */
/* JADX INFO: loaded from: classes.dex */
public class C5953qq {

    /* JADX INFO: renamed from: k4 */
    private String f16836k4;

    /* JADX INFO: renamed from: kk */
    private String f16837kk;

    /* JADX INFO: renamed from: x1 */
    private String f16839x1;

    /* JADX INFO: renamed from: du */
    private C13981tl f16835du = null;

    /* JADX INFO: renamed from: to */
    private C5921ck f16838to = new C5921ck();

    /* JADX INFO: renamed from: x1 */
    private boolean m24091x1() {
        return this.f16835du != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m24092k4() {
        if (m24091x1()) {
            return this.f16835du;
        }
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        return m24093k4(xmlDocument);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C13981tl m24093k4(XmlDocument xmlDocument) {
        boolean zM27456k4;
        C13981tl c13981tlCreateElement = xmlDocument.createElement("Object", "http://www.w3.org/2000/09/xmldsig#");
        if (!C14113y2.m67411k4(this.f16836k4)) {
            c13981tlCreateElement.m65910kk("Id", this.f16836k4);
        }
        if (!C14113y2.m67411k4(this.f16839x1)) {
            c13981tlCreateElement.m65910kk("MimeType", this.f16839x1);
        }
        if (!C14113y2.m67411k4(this.f16837kk)) {
            c13981tlCreateElement.m65910kk("Encoding", this.f16837kk);
        }
        C5921ck c5921ck = this.f16838to;
        if (c5921ck != null) {
            IEnumerator it = c5921ck.iterator();
            while (it.hasNext()) {
                try {
                    c13981tlCreateElement.appendChild(xmlDocument.importNode((AbstractC13901ga) it.next(), true));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
            if (zM27456k4) {
                return c13981tlCreateElement;
            }
        }
        return c13981tlCreateElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m24094k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        this.f16836k4 = C5934he.m23994kk(c13981tl, "Id", "http://www.w3.org/2000/09/xmldsig#");
        this.f16839x1 = C5934he.m23994kk(c13981tl, "MimeType", "http://www.w3.org/2000/09/xmldsig#");
        this.f16837kk = C5934he.m23994kk(c13981tl, "Encoding", "http://www.w3.org/2000/09/xmldsig#");
        IEnumerator it = c13981tl.getChildNodes().iterator();
        while (it.hasNext()) {
            try {
                this.f16838to.addItem((AbstractC13901ga) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        this.f16835du = c13981tl;
    }
}
