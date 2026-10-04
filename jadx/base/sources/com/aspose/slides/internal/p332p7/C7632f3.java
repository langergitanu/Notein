package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.f3 */
/* JADX INFO: loaded from: classes4.dex */
public class C7632f3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f22632c5 = new C7017h4("id", "name", "descr", NoteMeta.PROPERTY_TITLE, "hidden", "hlinkClick", "hlinkHover", "extLst");

    /* JADX INFO: renamed from: du */
    private boolean f22633du;

    /* JADX INFO: renamed from: dy */
    private C8397nz f22634dy;

    /* JADX INFO: renamed from: h4 */
    private C7473dd f22635h4;

    /* JADX INFO: renamed from: k4 */
    private long f22636k4;

    /* JADX INFO: renamed from: kk */
    private String f22637kk;

    /* JADX INFO: renamed from: m9 */
    private C7473dd f22638m9;

    /* JADX INFO: renamed from: to */
    private String f22639to;

    /* JADX INFO: renamed from: x1 */
    private String f22640x1;

    public C7632f3() {
        m31560fa();
    }

    /* JADX INFO: renamed from: fa */
    private void m31560fa() {
        this.f22637kk = "";
        this.f22633du = false;
    }

    /* JADX INFO: renamed from: c5 */
    public final C7473dd m31569c5() {
        return this.f22638m9;
    }

    /* JADX INFO: renamed from: du */
    public final String m31570du() {
        return this.f22637kk;
    }

    /* JADX INFO: renamed from: dy */
    public final C7473dd m31571dy() {
        return this.f22635h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m31572h4() {
        return this.f22639to;
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC7414ck m31573jd() {
        return this.f22634dy;
    }

    /* JADX INFO: renamed from: kk */
    public final long m31579kk() {
        return this.f22636k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m31581m9() {
        return this.f22633du;
    }

    /* JADX INFO: renamed from: to */
    public final String m31582to() {
        return this.f22640x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7473dd m31583x1() {
        if (this.f22638m9 != null) {
            throw new Exception("Only one <hlinkHover> element can be added.");
        }
        C7473dd c7473dd = new C7473dd();
        this.f22638m9 = c7473dd;
        return c7473dd;
    }

    public C7632f3(final AbstractC13912i5 abstractC13912i5) {
        m31560fa();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.f3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7632f3.f22632c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7632f3.this.f22636k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7632f3.this.f22640x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7632f3.this.f22637kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7632f3.this.f22639to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C7632f3.this.f22633du = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.f3.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7632f3.f22632c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 5) {
                    C7632f3.this.f22635h4 = new C7473dd(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 6) {
                    C7632f3.this.f22638m9 = new C7473dd(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                C7632f3.this.f22634dy = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7473dd m31574k4() {
        if (this.f22635h4 != null) {
            throw new Exception("Only one <hlinkClick> element can be added.");
        }
        C7473dd c7473dd = new C7473dd();
        this.f22635h4 = c7473dd;
        return c7473dd;
    }

    /* JADX INFO: renamed from: kk */
    public final void m31580kk(String str) {
        this.f22639to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m31584x1(String str) {
        this.f22637kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31575k4(long j) {
        this.f22636k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31576k4(AbstractC7414ck abstractC7414ck) {
        this.f22634dy = (C8397nz) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31577k4(String str) {
        this.f22640x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C13850af.m65147x1(this.f22636k4));
        c3059ii.m12955x1("name", this.f22640x1);
        if (!"".equals(this.f22637kk)) {
            c3059ii.m12955x1("descr", this.f22637kk);
        }
        String str3 = this.f22639to;
        if (str3 != null) {
            c3059ii.m12955x1(NoteMeta.PROPERTY_TITLE, str3);
        }
        boolean z = this.f22633du;
        if (z) {
            c3059ii.m12955x1("hidden", z ? "1" : "0");
        }
        C7473dd c7473dd = this.f22635h4;
        if (c7473dd != null) {
            c7473dd.mo6846k4("a", c3059ii, "hlinkClick");
        }
        C7473dd c7473dd2 = this.f22638m9;
        if (c7473dd2 != null) {
            c7473dd2.mo6846k4("a", c3059ii, "hlinkHover");
        }
        C8397nz c8397nz = this.f22634dy;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31578k4(boolean z) {
        this.f22633du = z;
    }
}
