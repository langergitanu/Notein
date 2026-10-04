package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.dd */
/* JADX INFO: loaded from: classes4.dex */
public class C7473dd extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f21583ck = new C7017h4("r:id", "invalidUrl", "action", "tgtFrame", "tooltip", "history", "highlightClick", "endSnd", "snd", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C8528pk f21584c5;

    /* JADX INFO: renamed from: du */
    private String f21585du;

    /* JADX INFO: renamed from: dy */
    private boolean f21586dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f21587h4;

    /* JADX INFO: renamed from: jd */
    private C8397nz f21588jd;

    /* JADX INFO: renamed from: k4 */
    private String f21589k4;

    /* JADX INFO: renamed from: kk */
    private String f21590kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f21591m9;

    /* JADX INFO: renamed from: to */
    private String f21592to;

    /* JADX INFO: renamed from: x1 */
    private String f21593x1;

    public C7473dd() {
        m30277up();
    }

    /* JADX INFO: renamed from: up */
    private void m30277up() {
        this.f21593x1 = "";
        this.f21590kk = "";
        this.f21592to = "";
        this.f21585du = "";
        this.f21587h4 = true;
        this.f21591m9 = false;
        this.f21586dy = false;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m30280c5() {
        return this.f21586dy;
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC7414ck m30281ck() {
        return this.f21588jd;
    }

    /* JADX INFO: renamed from: du */
    public final String m30282du() {
        return this.f21592to;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m30284dy() {
        return this.f21591m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m30285h4() {
        return this.f21585du;
    }

    /* JADX INFO: renamed from: jd */
    public final C8528pk m30286jd() {
        return this.f21584c5;
    }

    /* JADX INFO: renamed from: kk */
    public final String m30291kk() {
        return this.f21593x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m30294m9() {
        return this.f21587h4;
    }

    /* JADX INFO: renamed from: to */
    public final String m30295to() {
        return this.f21590kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m30297x1() {
        return this.f21589k4;
    }

    public C7473dd(final AbstractC13912i5 abstractC13912i5) {
        m30277up();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C7473dd.f21583ck.m27428k4(str)) {
                    case 0:
                        C7473dd.this.f21589k4 = str2;
                        break;
                    case 1:
                        C7473dd.this.f21593x1 = str2;
                        break;
                    case 2:
                        C7473dd.this.f21590kk = str2;
                        break;
                    case 3:
                        C7473dd.this.f21592to = str2;
                        break;
                    case 4:
                        C7473dd.this.f21585du = str2;
                        break;
                    case 5:
                        C7473dd.this.f21587h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        C7473dd.this.f21591m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        C7473dd.this.f21586dy = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.dd.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7473dd.f21583ck.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 8) {
                    C7473dd.this.f21584c5 = new C8528pk(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 9) {
                    return false;
                }
                C7473dd.this.f21588jd = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8528pk m30287k4() {
        if (this.f21584c5 != null) {
            throw new Exception("Only one <snd> element can be added.");
        }
        C8528pk c8528pk = new C8528pk();
        this.f21584c5 = c8528pk;
        return c8528pk;
    }

    /* JADX INFO: renamed from: du */
    public final void m30283du(String str) {
        this.f21585du = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m30292kk(String str) {
        this.f21590kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m30296to(String str) {
        this.f21592to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m30298x1(String str) {
        this.f21593x1 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m30293kk(boolean z) {
        this.f21586dy = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m30299x1(boolean z) {
        this.f21591m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30288k4(AbstractC7414ck abstractC7414ck) {
        this.f21588jd = (C8397nz) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30289k4(String str) {
        this.f21589k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        if ("a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
            c3059ii.mo12953k4(str, str2, (String) null);
        } else {
            c3059ii.mo12953k4(str, str2, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        if (this.f21589k4 != null) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:id", this.f21589k4);
        }
        if (!"".equals(this.f21593x1)) {
            c3059ii.m12955x1("invalidUrl", this.f21593x1);
        }
        if (!"".equals(this.f21590kk)) {
            c3059ii.m12955x1("action", this.f21590kk);
        }
        if (!"".equals(this.f21592to)) {
            c3059ii.m12955x1("tgtFrame", this.f21592to);
        }
        if (!"".equals(this.f21585du)) {
            c3059ii.m12955x1("tooltip", this.f21585du);
        }
        boolean z = this.f21587h4;
        if (!z) {
            c3059ii.m12955x1("history", z ? "1" : "0");
        }
        boolean z2 = this.f21591m9;
        if (z2) {
            c3059ii.m12955x1("highlightClick", z2 ? "1" : "0");
        }
        boolean z3 = this.f21586dy;
        if (z3) {
            c3059ii.m12955x1("endSnd", z3 ? "1" : "0");
        }
        C8528pk c8528pk = this.f21584c5;
        if (c8528pk != null) {
            c8528pk.mo6846k4("a", c3059ii, "snd");
        }
        C8397nz c8397nz = this.f21588jd;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30290k4(boolean z) {
        this.f21587h4 = z;
    }
}
