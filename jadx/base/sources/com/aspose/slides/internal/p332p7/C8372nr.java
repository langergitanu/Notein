package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.nr */
/* JADX INFO: loaded from: classes4.dex */
public class C8372nr extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f27540du = new C7017h4("layout", "tx", "spPr", "txPr");

    /* JADX INFO: renamed from: k4 */
    private C7943in f27541k4;

    /* JADX INFO: renamed from: kk */
    private C8087kh f27542kk;

    /* JADX INFO: renamed from: to */
    private C8952ug f27543to;

    /* JADX INFO: renamed from: x1 */
    private C8970uq f27544x1;

    public C8372nr() {
    }

    /* JADX INFO: renamed from: du */
    public final C7943in m37820du() {
        return this.f27541k4;
    }

    /* JADX INFO: renamed from: dy */
    public final C8952ug m37821dy() {
        return this.f27543to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8970uq m37822h4() {
        return this.f27544x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7943in m37823k4() {
        if (this.f27541k4 != null) {
            throw new Exception("Only one <layout> element can be added.");
        }
        C7943in c7943in = new C7943in();
        this.f27541k4 = c7943in;
        return c7943in;
    }

    /* JADX INFO: renamed from: kk */
    public final C8087kh m37824kk() {
        if (this.f27542kk != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f27542kk = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8087kh m37825m9() {
        return this.f27542kk;
    }

    /* JADX INFO: renamed from: to */
    public final C8952ug m37826to() {
        if (this.f27543to != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f27543to = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8970uq m37827x1() {
        if (this.f27544x1 != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C8970uq c8970uq = new C8970uq();
        this.f27544x1 = c8970uq;
        return c8970uq;
    }

    public C8372nr(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.nr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8372nr.f27540du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8372nr.this.f27541k4 = new C7943in(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8372nr.this.f27544x1 = new C8970uq(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8372nr.this.f27542kk = new C8087kh(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8372nr.this.f27543to = new C8952ug(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7943in c7943in = this.f27541k4;
        if (c7943in != null) {
            c7943in.mo6846k4("c", c3059ii, "layout");
        }
        C8970uq c8970uq = this.f27544x1;
        if (c8970uq != null) {
            c8970uq.mo6846k4("c", c3059ii, "tx");
        }
        C8087kh c8087kh = this.f27542kk;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f27543to;
        if (c8952ug != null) {
            c8952ug.mo6846k4("c", c3059ii, "txPr");
        }
        c3059ii.mo21898jd();
    }
}
