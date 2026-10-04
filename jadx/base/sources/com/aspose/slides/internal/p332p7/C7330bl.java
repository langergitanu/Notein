package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bl */
/* JADX INFO: loaded from: classes4.dex */
public class C7330bl extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f20607m9 = new C7017h4("lit", "nor", "scr", "sty", "brk", "aln");

    /* JADX INFO: renamed from: du */
    private C7422cn f20608du;

    /* JADX INFO: renamed from: h4 */
    private C9408zw f20609h4;

    /* JADX INFO: renamed from: k4 */
    private C9408zw f20610k4;

    /* JADX INFO: renamed from: kk */
    private C8407o6 f20611kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f20612to;

    /* JADX INFO: renamed from: x1 */
    private C7338bo f20613x1;

    public C7330bl() {
    }

    /* JADX INFO: renamed from: du */
    public final C7422cn m28971du() {
        return this.f20608du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9408zw m28972h4() {
        return this.f20609h4;
    }

    /* JADX INFO: renamed from: kk */
    public final C8407o6 m28979kk() {
        return this.f20611kk;
    }

    /* JADX INFO: renamed from: to */
    public final C7394ca m28980to() {
        return this.f20612to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7338bo m28981x1() {
        return this.f20613x1;
    }

    public C7330bl(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7330bl.f20607m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7330bl.this.f20610k4 = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7330bl.this.f20612to = new C7394ca("nor", new C9408zw(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    C7330bl.this.f20613x1 = new C7338bo(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C7330bl.this.f20611kk = new C8407o6(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C7330bl.this.f20608du = new C7422cn(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C7330bl.this.f20609h4 = new C9408zw(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m28982x1(C9408zw c9408zw) {
        this.f20609h4 = c9408zw;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9408zw m28973k4() {
        return this.f20610k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28974k4(C7338bo c7338bo) {
        this.f20613x1 = c7338bo;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28975k4(C7394ca c7394ca) {
        this.f20612to = c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28976k4(C7422cn c7422cn) {
        this.f20608du = c7422cn;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28977k4(C8407o6 c8407o6) {
        this.f20611kk = c8407o6;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28978k4(C9408zw c9408zw) {
        this.f20610k4 = c9408zw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9408zw c9408zw = this.f20610k4;
        if (c9408zw != null) {
            c9408zw.mo6846k4("m", c3059ii, "lit");
        }
        C7394ca c7394ca = this.f20612to;
        if (c7394ca != null && f20607m9.m27428k4(c7394ca.m29539k4()) == 1) {
            ((C9408zw) this.f20612to.m29541kk()).mo6846k4("m", c3059ii, this.f20612to.m29539k4());
        }
        C7338bo c7338bo = this.f20613x1;
        if (c7338bo != null) {
            c7338bo.mo6846k4("m", c3059ii, "scr");
        }
        C8407o6 c8407o6 = this.f20611kk;
        if (c8407o6 != null) {
            c8407o6.mo6846k4("m", c3059ii, "sty");
        }
        C7422cn c7422cn = this.f20608du;
        if (c7422cn != null) {
            c7422cn.mo6846k4("m", c3059ii, "brk");
        }
        C9408zw c9408zw2 = this.f20609h4;
        if (c9408zw2 != null) {
            c9408zw2.mo6846k4("m", c3059ii, "aln");
        }
        c3059ii.mo21898jd();
    }
}
