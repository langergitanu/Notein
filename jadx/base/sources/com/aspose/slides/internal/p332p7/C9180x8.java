package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.x8 */
/* JADX INFO: loaded from: classes4.dex */
public class C9180x8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f32741m9 = new C7017h4("layout", "tx", "numFmt", "spPr", "txPr", "extLst");

    /* JADX INFO: renamed from: du */
    private C8952ug f32742du;

    /* JADX INFO: renamed from: h4 */
    private C7683fo f32743h4;

    /* JADX INFO: renamed from: k4 */
    private C7943in f32744k4;

    /* JADX INFO: renamed from: kk */
    private C7937ik f32745kk;

    /* JADX INFO: renamed from: to */
    private C8087kh f32746to;

    /* JADX INFO: renamed from: x1 */
    private C8970uq f32747x1;

    public C9180x8() {
    }

    /* JADX INFO: renamed from: du */
    public final C7937ik m44244du() {
        return this.f32745kk;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC7414ck m44245dy() {
        return this.f32743h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8087kh m44246h4() {
        return this.f32746to;
    }

    /* JADX INFO: renamed from: kk */
    public final C7943in m44252kk() {
        return this.f32744k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8952ug m44253m9() {
        return this.f32742du;
    }

    /* JADX INFO: renamed from: to */
    public final C8970uq m44254to() {
        return this.f32747x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8952ug m44255x1() {
        if (this.f32742du != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f32742du = c8952ug;
        return c8952ug;
    }

    public C9180x8(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.x8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9180x8.f32741m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9180x8.this.f32744k4 = new C7943in(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C9180x8.this.f32747x1 = new C8970uq(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C9180x8.this.f32745kk = new C7937ik(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C9180x8.this.f32746to = new C8087kh(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C9180x8.this.f32742du = new C8952ug(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C9180x8.this.f32743h4 = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8970uq m44247k4() {
        if (this.f32747x1 != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C8970uq c8970uq = new C8970uq();
        this.f32747x1 = c8970uq;
        return c8970uq;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44248k4(AbstractC7414ck abstractC7414ck) {
        this.f32743h4 = (C7683fo) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44249k4(C7937ik c7937ik) {
        this.f32745kk = c7937ik;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44250k4(C7943in c7943in) {
        this.f32744k4 = c7943in;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44251k4(C8087kh c8087kh) {
        this.f32746to = c8087kh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7943in c7943in = this.f32744k4;
        if (c7943in != null) {
            c7943in.mo6846k4("c", c3059ii, "layout");
        }
        C8970uq c8970uq = this.f32747x1;
        if (c8970uq != null) {
            c8970uq.mo6846k4("c", c3059ii, "tx");
        }
        C7937ik c7937ik = this.f32745kk;
        if (c7937ik != null) {
            c7937ik.mo6846k4("c", c3059ii, "numFmt");
        }
        C8087kh c8087kh = this.f32746to;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f32742du;
        if (c8952ug != null) {
            c8952ug.mo6846k4("c", c3059ii, "txPr");
        }
        C7683fo c7683fo = this.f32743h4;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
