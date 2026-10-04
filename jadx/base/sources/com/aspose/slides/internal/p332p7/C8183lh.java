package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.lh */
/* JADX INFO: loaded from: classes4.dex */
public class C8183lh extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f26310h4 = new C7017h4("logBase", "orientation", "max", "min", "extLst");

    /* JADX INFO: renamed from: du */
    private C7683fo f26311du;

    /* JADX INFO: renamed from: k4 */
    private C8103kl f26312k4;

    /* JADX INFO: renamed from: kk */
    private C7405cg f26313kk;

    /* JADX INFO: renamed from: to */
    private C7405cg f26314to;

    /* JADX INFO: renamed from: x1 */
    private C8802st f26315x1;

    public C8183lh() {
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC7414ck m36142c5() {
        return this.f26311du;
    }

    /* JADX INFO: renamed from: du */
    public final C8103kl m36143du() {
        return this.f26312k4;
    }

    /* JADX INFO: renamed from: dy */
    public final C7405cg m36144dy() {
        return this.f26314to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8802st m36145h4() {
        return this.f26315x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C7405cg m36148kk() {
        if (this.f26313kk != null) {
            throw new Exception("Only one <max> element can be added.");
        }
        C7405cg c7405cg = new C7405cg();
        this.f26313kk = c7405cg;
        return c7405cg;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7405cg m36149m9() {
        return this.f26313kk;
    }

    /* JADX INFO: renamed from: to */
    public final C7405cg m36150to() {
        if (this.f26314to != null) {
            throw new Exception("Only one <min> element can be added.");
        }
        C7405cg c7405cg = new C7405cg();
        this.f26314to = c7405cg;
        return c7405cg;
    }

    public C8183lh(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8183lh.f26310h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8183lh.this.f26312k4 = new C8103kl(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8183lh.this.f26315x1 = new C8802st(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8183lh.this.f26313kk = new C7405cg(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C8183lh.this.f26314to = new C7405cg(abstractC13912i5);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    C8183lh.this.f26311du = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final C8802st m36151x1() {
        if (this.f26315x1 != null) {
            throw new Exception("Only one <orientation> element can be added.");
        }
        C8802st c8802st = new C8802st();
        this.f26315x1 = c8802st;
        return c8802st;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8103kl m36146k4() {
        if (this.f26312k4 != null) {
            throw new Exception("Only one <logBase> element can be added.");
        }
        C8103kl c8103kl = new C8103kl();
        this.f26312k4 = c8103kl;
        return c8103kl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36147k4(AbstractC7414ck abstractC7414ck) {
        this.f26311du = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8103kl c8103kl = this.f26312k4;
        if (c8103kl != null) {
            c8103kl.mo6846k4("c", c3059ii, "logBase");
        }
        C8802st c8802st = this.f26315x1;
        if (c8802st != null) {
            c8802st.mo6846k4("c", c3059ii, "orientation");
        }
        C7405cg c7405cg = this.f26313kk;
        if (c7405cg != null) {
            c7405cg.mo6846k4("c", c3059ii, "max");
        }
        C7405cg c7405cg2 = this.f26314to;
        if (c7405cg2 != null) {
            c7405cg2.mo6846k4("c", c3059ii, "min");
        }
        C7683fo c7683fo = this.f26311du;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
