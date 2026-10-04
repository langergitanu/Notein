package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pn */
/* JADX INFO: loaded from: classes4.dex */
public class C8534pn extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28476du = new C7017h4("tx", "spPr", "txPr", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8294mw f28477k4;

    /* JADX INFO: renamed from: kk */
    private C8952ug f28478kk;

    /* JADX INFO: renamed from: to */
    private C7249ah f28479to;

    /* JADX INFO: renamed from: x1 */
    private C8087kh f28480x1;

    public C8534pn() {
    }

    /* JADX INFO: renamed from: du */
    public final C8952ug m38989du() {
        return this.f28478kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7249ah m38990h4() {
        return this.f28479to;
    }

    /* JADX INFO: renamed from: kk */
    public final C8294mw m38994kk() {
        return this.f28477k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8087kh m38995to() {
        return this.f28480x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8952ug m38996x1() {
        if (this.f28478kk != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f28478kk = c8952ug;
        return c8952ug;
    }

    public C8534pn(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8534pn.f28476du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8534pn.this.f28477k4 = new C8294mw(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8534pn.this.f28480x1 = new C8087kh(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8534pn.this.f28478kk = new C8952ug(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8534pn.this.f28479to = new C7249ah(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8087kh m38991k4() {
        if (this.f28480x1 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f28480x1 = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38992k4(C7249ah c7249ah) {
        this.f28479to = c7249ah;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38993k4(C8294mw c8294mw) {
        this.f28477k4 = c8294mw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8294mw c8294mw = this.f28477k4;
        if (c8294mw != null) {
            c8294mw.mo6846k4("cx", c3059ii, "tx");
        }
        C8087kh c8087kh = this.f28480x1;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f28478kk;
        if (c8952ug != null) {
            c8952ug.mo6846k4("cx", c3059ii, "txPr");
        }
        C7249ah c7249ah = this.f28479to;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
