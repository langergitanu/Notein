package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.g1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7718g1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f23152dy = new C7017h4("rotX", "hPercent", "rotY", "depthPercent", "rAngAx", "perspective", "extLst");

    /* JADX INFO: renamed from: du */
    private C8828t1 f23153du;

    /* JADX INFO: renamed from: h4 */
    private C7466d8 f23154h4;

    /* JADX INFO: renamed from: k4 */
    private C8348nj f23155k4;

    /* JADX INFO: renamed from: kk */
    private C8462oq f23156kk;

    /* JADX INFO: renamed from: m9 */
    private C7683fo f23157m9;

    /* JADX INFO: renamed from: to */
    private C8575q4 f23158to;

    /* JADX INFO: renamed from: x1 */
    private C7700ft f23159x1;

    public C7718g1() {
    }

    /* JADX INFO: renamed from: c5 */
    public final C8462oq m32219c5() {
        return this.f23156kk;
    }

    /* JADX INFO: renamed from: ck */
    public final C8828t1 m32220ck() {
        return this.f23153du;
    }

    /* JADX INFO: renamed from: du */
    public final C8828t1 m32221du() {
        if (this.f23153du != null) {
            throw new Exception("Only one <rAngAx> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f23153du = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: dy */
    public final C7700ft m32222dy() {
        return this.f23159x1;
    }

    /* JADX INFO: renamed from: fa */
    public final C7466d8 m32223fa() {
        return this.f23154h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7466d8 m32224h4() {
        if (this.f23154h4 != null) {
            throw new Exception("Only one <perspective> element can be added.");
        }
        C7466d8 c7466d8 = new C7466d8();
        this.f23154h4 = c7466d8;
        return c7466d8;
    }

    /* JADX INFO: renamed from: jd */
    public final C8575q4 m32225jd() {
        return this.f23158to;
    }

    /* JADX INFO: renamed from: kk */
    public final C8462oq m32228kk() {
        if (this.f23156kk != null) {
            throw new Exception("Only one <rotY> element can be added.");
        }
        C8462oq c8462oq = new C8462oq();
        this.f23156kk = c8462oq;
        return c8462oq;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8348nj m32229m9() {
        return this.f23155k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8575q4 m32230to() {
        if (this.f23158to != null) {
            throw new Exception("Only one <depthPercent> element can be added.");
        }
        C8575q4 c8575q4 = new C8575q4();
        this.f23158to = c8575q4;
        return c8575q4;
    }

    /* JADX INFO: renamed from: up */
    public final AbstractC7414ck m32231up() {
        return this.f23157m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7700ft m32232x1() {
        if (this.f23159x1 != null) {
            throw new Exception("Only one <hPercent> element can be added.");
        }
        C7700ft c7700ft = new C7700ft();
        this.f23159x1 = c7700ft;
        return c7700ft;
    }

    public C7718g1(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.g1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C7718g1.f23152dy.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C7718g1.this.f23155k4 = new C8348nj(abstractC13912i5);
                        return true;
                    case 1:
                        C7718g1.this.f23159x1 = new C7700ft(abstractC13912i5);
                        return true;
                    case 2:
                        C7718g1.this.f23156kk = new C8462oq(abstractC13912i5);
                        return true;
                    case 3:
                        C7718g1.this.f23158to = new C8575q4(abstractC13912i5);
                        return true;
                    case 4:
                        C7718g1.this.f23153du = new C8828t1(abstractC13912i5);
                        return true;
                    case 5:
                        C7718g1.this.f23154h4 = new C7466d8(abstractC13912i5);
                        return true;
                    case 6:
                        C7718g1.this.f23157m9 = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8348nj m32226k4() {
        if (this.f23155k4 != null) {
            throw new Exception("Only one <rotX> element can be added.");
        }
        C8348nj c8348nj = new C8348nj();
        this.f23155k4 = c8348nj;
        return c8348nj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32227k4(AbstractC7414ck abstractC7414ck) {
        this.f23157m9 = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8348nj c8348nj = this.f23155k4;
        if (c8348nj != null) {
            c8348nj.mo6846k4("c", c3059ii, "rotX");
        }
        C7700ft c7700ft = this.f23159x1;
        if (c7700ft != null) {
            c7700ft.mo6846k4("c", c3059ii, "hPercent");
        }
        C8462oq c8462oq = this.f23156kk;
        if (c8462oq != null) {
            c8462oq.mo6846k4("c", c3059ii, "rotY");
        }
        C8575q4 c8575q4 = this.f23158to;
        if (c8575q4 != null) {
            c8575q4.mo6846k4("c", c3059ii, "depthPercent");
        }
        C8828t1 c8828t1 = this.f23153du;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "rAngAx");
        }
        C7466d8 c7466d8 = this.f23154h4;
        if (c7466d8 != null) {
            c7466d8.mo6846k4("c", c3059ii, "perspective");
        }
        C7683fo c7683fo = this.f23157m9;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
