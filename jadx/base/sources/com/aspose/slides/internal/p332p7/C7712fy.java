package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.fy */
/* JADX INFO: loaded from: classes4.dex */
public class C7712fy extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f23114h4 = new C7017h4("Id", "SignedInfo", "SignatureValue", "KeyInfo", "Object");

    /* JADX INFO: renamed from: du */
    private List<C7761gh> f23115du;

    /* JADX INFO: renamed from: k4 */
    private String f23116k4;

    /* JADX INFO: renamed from: kk */
    private C7453d1 f23117kk;

    /* JADX INFO: renamed from: to */
    private C7524dz f23118to;

    /* JADX INFO: renamed from: x1 */
    private C9269yb f23119x1;

    public C7712fy() {
        m32161dy();
        this.f23119x1 = new C9269yb();
        this.f23117kk = new C7453d1();
    }

    /* JADX INFO: renamed from: dy */
    private void m32161dy() {
        this.f23115du = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C7524dz m32168du() {
        return this.f23118to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7761gh[] m32169h4() {
        return this.f23115du.toArray(new C7761gh[0]);
    }

    /* JADX INFO: renamed from: kk */
    public final C9269yb m32172kk() {
        return this.f23119x1;
    }

    /* JADX INFO: renamed from: to */
    public final C7453d1 m32173to() {
        return this.f23117kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7761gh m32174x1() {
        C7761gh c7761gh = new C7761gh();
        this.f23115du.addItem(c7761gh);
        return c7761gh;
    }

    public C7712fy(final AbstractC13912i5 abstractC13912i5) {
        m32161dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7712fy.f23114h4.m27428k4(str) != 0) {
                    return false;
                }
                C7712fy.this.f23116k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fy.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7712fy.f23114h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7712fy.this.f23119x1 = new C9269yb(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7712fy.this.f23117kk = new C7453d1(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C7712fy.this.f23118to = new C7524dz(abstractC13912i5);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    C7712fy.this.f23115du.addItem(new C7761gh(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7524dz m32170k4() {
        if (this.f23118to != null) {
            throw new Exception("Only one <keyInfo> element can be added.");
        }
        C7524dz c7524dz = new C7524dz();
        this.f23118to = c7524dz;
        return c7524dz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32171k4(String str) {
        this.f23116k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("", str2, "http://www.w3.org/2000/09/xmldsig#");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/package/2006/digital-signature") == null) {
            c3059ii.m12954to("xmlns", "mdssi", null, "http://schemas.openxmlformats.org/package/2006/digital-signature");
        }
        if (c3059ii.mo12952k4("http://uri.etsi.org/01903/v1.3.2#") == null) {
            c3059ii.m12954to("xmlns", "xd", null, "http://uri.etsi.org/01903/v1.3.2#");
        }
        String str3 = this.f23116k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        this.f23119x1.mo6846k4("", c3059ii, "SignedInfo");
        this.f23117kk.mo6846k4("", c3059ii, "SignatureValue");
        C7524dz c7524dz = this.f23118to;
        if (c7524dz != null) {
            c7524dz.mo6846k4("", c3059ii, "KeyInfo");
        }
        List.Enumerator<C7761gh> it = this.f23115du.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "Object");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
