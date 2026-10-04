package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.s5 */
/* JADX INFO: loaded from: classes4.dex */
public class C8741s5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f29914m9 = new C7017h4("tx", "layout", "overlay", "spPr", "txPr", "extLst");

    /* JADX INFO: renamed from: du */
    private C8952ug f29915du;

    /* JADX INFO: renamed from: h4 */
    private C7683fo f29916h4;

    /* JADX INFO: renamed from: k4 */
    private C8970uq f29917k4;

    /* JADX INFO: renamed from: kk */
    private C8828t1 f29918kk;

    /* JADX INFO: renamed from: to */
    private C8087kh f29919to;

    /* JADX INFO: renamed from: x1 */
    private C7943in f29920x1;

    public C8741s5() {
    }

    /* JADX INFO: renamed from: c5 */
    public final C8087kh m40777c5() {
        return this.f29919to;
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC7414ck m40778ck() {
        return this.f29916h4;
    }

    /* JADX INFO: renamed from: du */
    public final C8952ug m40779du() {
        if (this.f29915du != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f29915du = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: dy */
    public final C8828t1 m40780dy() {
        return this.f29918kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8970uq m40781h4() {
        return this.f29917k4;
    }

    /* JADX INFO: renamed from: jd */
    public final C8952ug m40782jd() {
        return this.f29915du;
    }

    /* JADX INFO: renamed from: kk */
    public final C8828t1 m40786kk() {
        if (this.f29918kk != null) {
            throw new Exception("Only one <overlay> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f29918kk = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7943in m40787m9() {
        return this.f29920x1;
    }

    /* JADX INFO: renamed from: to */
    public final C8087kh m40788to() {
        if (this.f29919to != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f29919to = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7943in m40789x1() {
        if (this.f29920x1 != null) {
            throw new Exception("Only one <layout> element can be added.");
        }
        C7943in c7943in = new C7943in();
        this.f29920x1 = c7943in;
        return c7943in;
    }

    public C8741s5(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.s5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8741s5.f29914m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8741s5.this.f29917k4 = new C8970uq(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8741s5.this.f29920x1 = new C7943in(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8741s5.this.f29918kk = new C8828t1(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C8741s5.this.f29919to = new C8087kh(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C8741s5.this.f29915du = new C8952ug(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C8741s5.this.f29916h4 = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8970uq m40783k4() {
        if (this.f29917k4 != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C8970uq c8970uq = new C8970uq();
        this.f29917k4 = c8970uq;
        return c8970uq;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40784k4(AbstractC7414ck abstractC7414ck) {
        this.f29916h4 = (C7683fo) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40785k4(C8970uq c8970uq) {
        this.f29917k4 = c8970uq;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8970uq c8970uq = this.f29917k4;
        if (c8970uq != null) {
            c8970uq.mo6846k4("c", c3059ii, "tx");
        }
        C7943in c7943in = this.f29920x1;
        if (c7943in != null) {
            c7943in.mo6846k4("c", c3059ii, "layout");
        }
        C8828t1 c8828t1 = this.f29918kk;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "overlay");
        }
        C8087kh c8087kh = this.f29919to;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f29915du;
        if (c8952ug != null) {
            c8952ug.mo6846k4("c", c3059ii, "txPr");
        }
        C7683fo c7683fo = this.f29916h4;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
