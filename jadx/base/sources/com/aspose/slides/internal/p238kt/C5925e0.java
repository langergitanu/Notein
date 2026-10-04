package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C5925e0 implements IEnumerable {

    /* JADX INFO: renamed from: k4 */
    private String f16753k4 = null;

    /* JADX INFO: renamed from: x1 */
    private ArrayList f16754x1 = new ArrayList();

    @Override // java.lang.Iterable
    public final IEnumerator iterator() {
        return this.f16754x1.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m23940k4() {
        return this.f16754x1.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m23941k4(XmlDocument xmlDocument) {
        C13981tl c13981tlCreateElement = xmlDocument.createElement("KeyInfo", "http://www.w3.org/2000/09/xmldsig#");
        if (!C14113y2.m67411k4(this.f16753k4)) {
            c13981tlCreateElement.m65910kk("Id", this.f16753k4);
        }
        for (int i = 0; i < this.f16754x1.size(); i++) {
            C13981tl c13981tlMo23902k4 = ((AbstractC5917bz) this.f16754x1.get_Item(i)).mo23902k4(xmlDocument);
            if (c13981tlMo23902k4 != null) {
                c13981tlCreateElement.appendChild(c13981tlMo23902k4);
            }
        }
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23942k4(AbstractC5917bz abstractC5917bz) {
        this.f16754x1.addItem(abstractC5917bz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m23943k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        this.f16753k4 = C5934he.m23994kk(c13981tl, "Id", "http://www.w3.org/2000/09/xmldsig#");
        if (!C5934he.m23989k4(c13981tl, "Id")) {
            throw new CryptographicException("Malformed element {0}.", "KeyInfo");
        }
        for (AbstractC13901ga firstChild = c13981tl.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) firstChild, C13981tl.class);
            if (c13981tl2 != null) {
                String strM67408k4 = C14113y2.m67408k4(c13981tl2.getNamespaceURI(), " ", c13981tl2.getLocalName());
                if ("http://www.w3.org/2000/09/xmldsig# KeyValue".equals(strM67408k4)) {
                    if (!C5934he.m23991k4(c13981tl2, (String[]) C7019kk.m27458kk((Object) null, String[].class))) {
                        throw new CryptographicException("Malformed element {0}.", "KeyInfo/KeyValue");
                    }
                    IEnumerator it = c13981tl2.getChildNodes().iterator();
                    while (true) {
                        try {
                            if (!it.hasNext()) {
                                break;
                            }
                            C13981tl c13981tl3 = (C13981tl) C7019kk.m27452k4(it.next(), C13981tl.class);
                            if (c13981tl3 != null) {
                                strM67408k4 = C14113y2.m67400k4(strM67408k4, C14113y2.m67408k4("/", c13981tl3.getLocalName()));
                                break;
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                ((IDisposable) it).dispose();
                            }
                        }
                    }
                }
                AbstractC5917bz c5959sv = (AbstractC5917bz) C5936ix.m24008k4(AbstractC5917bz.class, strM67408k4);
                if (c5959sv == null) {
                    c5959sv = new C5959sv();
                }
                c5959sv.mo23903k4(c13981tl2);
                m23942k4(c5959sv);
            }
        }
    }
}
