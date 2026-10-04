package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.om */
/* JADX INFO: loaded from: classes4.dex */
public class C8453om extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28009du = new C7017h4("symbol", "size", "spPr", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C7299b6 f28010k4;

    /* JADX INFO: renamed from: kk */
    private C8087kh f28011kk;

    /* JADX INFO: renamed from: to */
    private C7683fo f28012to;

    /* JADX INFO: renamed from: x1 */
    private C8931u9 f28013x1;

    public C8453om() {
    }

    /* JADX INFO: renamed from: du */
    public final C8931u9 m38341du() {
        return this.f28013x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8087kh m38342h4() {
        return this.f28011kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7299b6 m38343k4() {
        if (this.f28010k4 != null) {
            throw new Exception("Only one <symbol> element can be added.");
        }
        C7299b6 c7299b6 = new C7299b6();
        this.f28010k4 = c7299b6;
        return c7299b6;
    }

    /* JADX INFO: renamed from: kk */
    public final C8087kh m38345kk() {
        if (this.f28011kk != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f28011kk = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC7414ck m38346m9() {
        return this.f28012to;
    }

    /* JADX INFO: renamed from: to */
    public final C7299b6 m38347to() {
        return this.f28010k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8931u9 m38348x1() {
        if (this.f28013x1 != null) {
            throw new Exception("Only one <size> element can be added.");
        }
        C8931u9 c8931u9 = new C8931u9();
        this.f28013x1 = c8931u9;
        return c8931u9;
    }

    public C8453om(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.om.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8453om.f28009du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8453om.this.f28010k4 = new C7299b6(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8453om.this.f28013x1 = new C8931u9(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8453om.this.f28011kk = new C8087kh(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8453om.this.f28012to = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38344k4(AbstractC7414ck abstractC7414ck) {
        this.f28012to = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7299b6 c7299b6 = this.f28010k4;
        if (c7299b6 != null) {
            c7299b6.mo6846k4("c", c3059ii, "symbol");
        }
        C8931u9 c8931u9 = this.f28013x1;
        if (c8931u9 != null) {
            c8931u9.mo6846k4("c", c3059ii, "size");
        }
        C8087kh c8087kh = this.f28011kk;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C7683fo c7683fo = this.f28012to;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
