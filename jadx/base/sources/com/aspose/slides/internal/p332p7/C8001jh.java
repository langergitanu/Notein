package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jh */
/* JADX INFO: loaded from: classes4.dex */
public class C8001jh extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25126du = new C7017h4("thickness", "spPr", "pictureOptions", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8452ol f25127k4;

    /* JADX INFO: renamed from: kk */
    private C7547ec f25128kk;

    /* JADX INFO: renamed from: to */
    private C7683fo f25129to;

    /* JADX INFO: renamed from: x1 */
    private C8087kh f25130x1;

    public C8001jh() {
    }

    /* JADX INFO: renamed from: du */
    public final C8087kh m34690du() {
        return this.f25130x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7547ec m34691h4() {
        return this.f25128kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8452ol m34692k4() {
        if (this.f25127k4 != null) {
            throw new Exception("Only one <thickness> element can be added.");
        }
        C8452ol c8452ol = new C8452ol();
        this.f25127k4 = c8452ol;
        return c8452ol;
    }

    /* JADX INFO: renamed from: kk */
    public final C8290mt m34695kk() {
        if (this.f25128kk != null) {
            throw new Exception("Only one <pictureOptions> element can be added.");
        }
        C7547ec c7547ec = new C7547ec();
        this.f25128kk = c7547ec;
        return c7547ec;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC7414ck m34696m9() {
        return this.f25129to;
    }

    /* JADX INFO: renamed from: to */
    public final C8452ol m34697to() {
        return this.f25127k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8087kh m34698x1() {
        if (this.f25130x1 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f25130x1 = c8087kh;
        return c8087kh;
    }

    public C8001jh(AbstractC13912i5 abstractC13912i5) {
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        int iM27428k4 = f25126du.m27428k4(abstractC13912i5.mo65023fa());
                        if (iM27428k4 == 0) {
                            this.f25127k4 = new C8452ol(abstractC13912i5);
                            break;
                        }
                        if (iM27428k4 == 1) {
                            this.f25130x1 = new C8087kh(abstractC13912i5);
                            break;
                        }
                        if (iM27428k4 == 2) {
                            this.f25128kk = new C7547ec(abstractC13912i5);
                        } else {
                            if (iM27428k4 == 3) {
                                this.f25129to = new C7683fo(abstractC13912i5);
                                break;
                            }
                            abstractC13912i5.mo65208bv();
                        }
                        if (abstractC13912i5.mo65015ar()) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34693k4(AbstractC7414ck abstractC7414ck) {
        this.f25129to = (C7683fo) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34694k4(C8290mt c8290mt) {
        this.f25128kk = (C7547ec) c8290mt;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8452ol c8452ol = this.f25127k4;
        if (c8452ol != null) {
            c8452ol.mo6846k4("c", c3059ii, "thickness");
        }
        C8087kh c8087kh = this.f25130x1;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C7547ec c7547ec = this.f25128kk;
        if (c7547ec != null) {
            c7547ec.mo6846k4("c", c3059ii, "pictureOptions");
        }
        C7683fo c7683fo = this.f25129to;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
