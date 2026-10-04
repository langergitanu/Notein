package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ie */
/* JADX INFO: loaded from: classes4.dex */
public class C7926ie extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f24640du = new C7017h4("tx", "spPr", "txPr", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8294mw f24641k4;

    /* JADX INFO: renamed from: kk */
    private C8952ug f24642kk;

    /* JADX INFO: renamed from: to */
    private C7249ah f24643to;

    /* JADX INFO: renamed from: x1 */
    private C8087kh f24644x1;

    public C7926ie() {
    }

    /* JADX INFO: renamed from: du */
    public final C8087kh m34085du() {
        return this.f24644x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8952ug m34086h4() {
        return this.f24642kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C8952ug m34089kk() {
        if (this.f24642kk != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f24642kk = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7249ah m34090m9() {
        return this.f24643to;
    }

    /* JADX INFO: renamed from: to */
    public final C8294mw m34091to() {
        return this.f24641k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8087kh m34092x1() {
        if (this.f24644x1 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f24644x1 = c8087kh;
        return c8087kh;
    }

    public C7926ie(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ie.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7926ie.f24640du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7926ie.this.f24641k4 = new C8294mw(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7926ie.this.f24644x1 = new C8087kh(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7926ie.this.f24642kk = new C8952ug(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C7926ie.this.f24643to = new C7249ah(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8294mw m34087k4() {
        if (this.f24641k4 != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C8294mw c8294mw = new C8294mw();
        this.f24641k4 = c8294mw;
        return c8294mw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34088k4(C7249ah c7249ah) {
        this.f24643to = c7249ah;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8294mw c8294mw = this.f24641k4;
        if (c8294mw != null) {
            c8294mw.mo6846k4("cx", c3059ii, "tx");
        }
        C8087kh c8087kh = this.f24644x1;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f24642kk;
        if (c8952ug != null) {
            c8952ug.mo6846k4("cx", c3059ii, "txPr");
        }
        C7249ah c7249ah = this.f24643to;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
