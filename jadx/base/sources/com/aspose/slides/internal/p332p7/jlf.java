package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class jlf extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f25225k4 = f6h.m31644k4("all");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f25226m9 = new C7017h4("style:name", "style:page-usage", "page-layout-properties", "header-style", "footer-style");

    /* JADX INFO: renamed from: du */
    private wgi f25227du;

    /* JADX INFO: renamed from: h4 */
    private qye f25228h4;

    /* JADX INFO: renamed from: kk */
    private int f25229kk;

    /* JADX INFO: renamed from: to */
    private axo f25230to;

    /* JADX INFO: renamed from: x1 */
    private String f25231x1;

    public jlf() {
        m34801du();
    }

    /* JADX INFO: renamed from: du */
    private void m34801du() {
        this.f25229kk = f25225k4;
    }

    /* JADX INFO: renamed from: kk */
    public final axo m34810kk() {
        return this.f25230to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m34811x1() {
        return this.f25231x1;
    }

    public jlf(final AbstractC13912i5 abstractC13912i5) {
        m34801du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jlf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jlf.f25226m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    jlf.this.f25231x1 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                jlf.this.f25229kk = f6h.m31644k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jlf.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = jlf.f25226m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    jlf.this.f25230to = new axo(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    jlf.this.f25227du = new wgi(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                jlf.this.f25228h4 = new qye(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final axo m34808k4() {
        if (this.f25230to != null) {
            throw new Exception("Only one <page_layout_properties> element can be added.");
        }
        axo axoVar = new axo();
        this.f25230to = axoVar;
        return axoVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34809k4(String str) {
        this.f25231x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:name", this.f25231x1);
        int i = this.f25229kk;
        if (i != f25225k4) {
            c3059ii.m12955x1("style:page-usage", f6h.m31645k4(i));
        }
        axo axoVar = this.f25230to;
        if (axoVar != null) {
            axoVar.mo6846k4("style", c3059ii, "page-layout-properties");
        }
        wgi wgiVar = this.f25227du;
        if (wgiVar != null) {
            wgiVar.mo6846k4("style", c3059ii, "header-style");
        }
        qye qyeVar = this.f25228h4;
        if (qyeVar != null) {
            qyeVar.mo6846k4("style", c3059ii, "footer-style");
        }
        c3059ii.mo21898jd();
    }
}
