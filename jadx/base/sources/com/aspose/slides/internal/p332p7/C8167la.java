package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.la */
/* JADX INFO: loaded from: classes4.dex */
public class C8167la extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f26168jd = new C7017h4("left", "right", "top", "bottom", "insideH", "insideV", "tl2br", "tr2bl", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C8397nz f26169c5;

    /* JADX INFO: renamed from: du */
    private C8605qj f26170du;

    /* JADX INFO: renamed from: dy */
    private C8605qj f26171dy;

    /* JADX INFO: renamed from: h4 */
    private C8605qj f26172h4;

    /* JADX INFO: renamed from: k4 */
    private C8605qj f26173k4;

    /* JADX INFO: renamed from: kk */
    private C8605qj f26174kk;

    /* JADX INFO: renamed from: m9 */
    private C8605qj f26175m9;

    /* JADX INFO: renamed from: to */
    private C8605qj f26176to;

    /* JADX INFO: renamed from: x1 */
    private C8605qj f26177x1;

    public C8167la() {
    }

    /* JADX INFO: renamed from: c5 */
    public final C8605qj m35955c5() {
        return this.f26173k4;
    }

    /* JADX INFO: renamed from: ck */
    public final C8605qj m35956ck() {
        return this.f26174kk;
    }

    /* JADX INFO: renamed from: du */
    public final C8605qj m35957du() {
        if (this.f26170du != null) {
            throw new Exception("Only one <insideH> element can be added.");
        }
        C8605qj c8605qj = new C8605qj();
        this.f26170du = c8605qj;
        return c8605qj;
    }

    /* JADX INFO: renamed from: dy */
    public final C8605qj m35958dy() {
        if (this.f26171dy != null) {
            throw new Exception("Only one <tr2bl> element can be added.");
        }
        C8605qj c8605qj = new C8605qj();
        this.f26171dy = c8605qj;
        return c8605qj;
    }

    /* JADX INFO: renamed from: fa */
    public final C8605qj m35959fa() {
        return this.f26176to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8605qj m35960h4() {
        if (this.f26172h4 != null) {
            throw new Exception("Only one <insideV> element can be added.");
        }
        C8605qj c8605qj = new C8605qj();
        this.f26172h4 = c8605qj;
        return c8605qj;
    }

    /* JADX INFO: renamed from: jd */
    public final C8605qj m35961jd() {
        return this.f26177x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C8605qj m35964kk() {
        if (this.f26174kk != null) {
            throw new Exception("Only one <top> element can be added.");
        }
        C8605qj c8605qj = new C8605qj();
        this.f26174kk = c8605qj;
        return c8605qj;
    }

    /* JADX INFO: renamed from: ks */
    public final C8605qj m35965ks() {
        return this.f26175m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8605qj m35966m9() {
        if (this.f26175m9 != null) {
            throw new Exception("Only one <tl2br> element can be added.");
        }
        C8605qj c8605qj = new C8605qj();
        this.f26175m9 = c8605qj;
        return c8605qj;
    }

    /* JADX INFO: renamed from: rv */
    public final C8605qj m35967rv() {
        return this.f26171dy;
    }

    /* JADX INFO: renamed from: to */
    public final C8605qj m35968to() {
        if (this.f26176to != null) {
            throw new Exception("Only one <bottom> element can be added.");
        }
        C8605qj c8605qj = new C8605qj();
        this.f26176to = c8605qj;
        return c8605qj;
    }

    /* JADX INFO: renamed from: up */
    public final C8605qj m35969up() {
        return this.f26170du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8605qj m35970x1() {
        if (this.f26177x1 != null) {
            throw new Exception("Only one <right> element can be added.");
        }
        C8605qj c8605qj = new C8605qj();
        this.f26177x1 = c8605qj;
        return c8605qj;
    }

    /* JADX INFO: renamed from: x6 */
    public final AbstractC7414ck m35971x6() {
        return this.f26169c5;
    }

    /* JADX INFO: renamed from: yj */
    public final C8605qj m35972yj() {
        return this.f26172h4;
    }

    public C8167la(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.la.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8167la.f26168jd.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8167la.this.f26173k4 = new C8605qj(abstractC13912i5);
                        return true;
                    case 1:
                        C8167la.this.f26177x1 = new C8605qj(abstractC13912i5);
                        return true;
                    case 2:
                        C8167la.this.f26174kk = new C8605qj(abstractC13912i5);
                        return true;
                    case 3:
                        C8167la.this.f26176to = new C8605qj(abstractC13912i5);
                        return true;
                    case 4:
                        C8167la.this.f26170du = new C8605qj(abstractC13912i5);
                        return true;
                    case 5:
                        C8167la.this.f26172h4 = new C8605qj(abstractC13912i5);
                        return true;
                    case 6:
                        C8167la.this.f26175m9 = new C8605qj(abstractC13912i5);
                        return true;
                    case 7:
                        C8167la.this.f26171dy = new C8605qj(abstractC13912i5);
                        return true;
                    case 8:
                        C8167la.this.f26169c5 = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8605qj m35962k4() {
        if (this.f26173k4 != null) {
            throw new Exception("Only one <left> element can be added.");
        }
        C8605qj c8605qj = new C8605qj();
        this.f26173k4 = c8605qj;
        return c8605qj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35963k4(AbstractC7414ck abstractC7414ck) {
        this.f26169c5 = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8605qj c8605qj = this.f26173k4;
        if (c8605qj != null) {
            c8605qj.mo6846k4("a", c3059ii, "left");
        }
        C8605qj c8605qj2 = this.f26177x1;
        if (c8605qj2 != null) {
            c8605qj2.mo6846k4("a", c3059ii, "right");
        }
        C8605qj c8605qj3 = this.f26174kk;
        if (c8605qj3 != null) {
            c8605qj3.mo6846k4("a", c3059ii, "top");
        }
        C8605qj c8605qj4 = this.f26176to;
        if (c8605qj4 != null) {
            c8605qj4.mo6846k4("a", c3059ii, "bottom");
        }
        C8605qj c8605qj5 = this.f26170du;
        if (c8605qj5 != null) {
            c8605qj5.mo6846k4("a", c3059ii, "insideH");
        }
        C8605qj c8605qj6 = this.f26172h4;
        if (c8605qj6 != null) {
            c8605qj6.mo6846k4("a", c3059ii, "insideV");
        }
        C8605qj c8605qj7 = this.f26175m9;
        if (c8605qj7 != null) {
            c8605qj7.mo6846k4("a", c3059ii, "tl2br");
        }
        C8605qj c8605qj8 = this.f26171dy;
        if (c8605qj8 != null) {
            c8605qj8.mo6846k4("a", c3059ii, "tr2bl");
        }
        C8397nz c8397nz = this.f26169c5;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
