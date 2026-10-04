package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.um */
/* JADX INFO: loaded from: classes.dex */
public final class C5965um extends AbstractC5945lr {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public void m24121k4(C13981tl c13981tl) {
        AbstractC13911hq abstractC13911hqSelectNodes;
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        C13950o3 c13950o3 = new C13950o3(c13981tl.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("enc", "http://www.w3.org/2001/04/xmlenc#");
        c13950o3.mo65707k4("ds", "http://www.w3.org/2000/09/xmldsig#");
        m24062kk(C5934he.m23994kk(c13981tl, "Id", "http://www.w3.org/2001/04/xmlenc#"));
        m24064to(C5934he.m23994kk(c13981tl, "Type", "http://www.w3.org/2001/04/xmlenc#"));
        m24052du(C5934he.m23994kk(c13981tl, "MimeType", "http://www.w3.org/2001/04/xmlenc#"));
        m24057h4(C5934he.m23994kk(c13981tl, "Encoding", "http://www.w3.org/2001/04/xmlenc#"));
        AbstractC13901ga abstractC13901gaSelectSingleNode = c13981tl.selectSingleNode("enc:EncryptionMethod", c13950o3);
        m24059k4(new C5914b3());
        if (abstractC13901gaSelectSingleNode != null) {
            m24051ck().m23885k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901gaSelectSingleNode, C13981tl.class));
        }
        m24060k4(new C5925e0());
        AbstractC13901ga abstractC13901gaSelectSingleNode2 = c13981tl.selectSingleNode("ds:KeyInfo", c13950o3);
        if (abstractC13901gaSelectSingleNode2 != null) {
            m24058jd().m23943k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901gaSelectSingleNode2, C13981tl.class));
        }
        AbstractC13901ga abstractC13901gaSelectSingleNode3 = c13981tl.selectSingleNode("enc:CipherData", c13950o3);
        if (abstractC13901gaSelectSingleNode3 == null) {
            throw new CryptographicException("Cipher data is not specified.");
        }
        m24061k4(new C5977x6());
        m24065up().m24140k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901gaSelectSingleNode3, C13981tl.class));
        AbstractC13901ga abstractC13901gaSelectSingleNode4 = c13981tl.selectSingleNode("enc:EncryptionProperties", c13950o3);
        if (abstractC13901gaSelectSingleNode4 != null && (abstractC13911hqSelectNodes = abstractC13901gaSelectSingleNode4.selectNodes("enc:EncryptionProperty", c13950o3)) != null) {
            IEnumerator it = abstractC13911hqSelectNodes.iterator();
            while (it.hasNext()) {
                try {
                    AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it.next();
                    C5974wy c5974wy = new C5974wy();
                    c5974wy.m24136k4((C13981tl) C7019kk.m27452k4((Object) abstractC13901ga, C13981tl.class));
                    m24055fa().m23880k4(c5974wy);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
        }
        this.f16804k4 = c13981tl;
    }
}
