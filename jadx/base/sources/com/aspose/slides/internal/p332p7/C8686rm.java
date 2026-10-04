package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.rm */
/* JADX INFO: loaded from: classes4.dex */
public class C8686rm extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f29357to = new C7017h4("tcBdr", "fill", "fillRef", "cell3D");

    /* JADX INFO: renamed from: k4 */
    private C8167la f29358k4;

    /* JADX INFO: renamed from: kk */
    private C8785sl f29359kk;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f29360x1;

    public C8686rm() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m40053k4(String str) {
        C7394ca c7394ca;
        if (this.f29360x1 != null) {
            throw new Exception("ThemeableFillStyle already is initialized.");
        }
        int iM27428k4 = f29357to.m27428k4(str);
        if (iM27428k4 == 1) {
            c7394ca = new C7394ca("fill", new C7886hx());
        } else {
            if (iM27428k4 != 2) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("fillRef", new C8740s4());
        }
        this.f29360x1 = c7394ca;
        return this.f29360x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m40056kk() {
        return this.f29360x1;
    }

    /* JADX INFO: renamed from: to */
    public final C8785sl m40057to() {
        return this.f29359kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8167la m40058x1() {
        return this.f29358k4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r4.f29360x1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8686rm(AbstractC13912i5 abstractC13912i5) {
        C7394ca c7394ca;
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        int iM27428k4 = f29357to.m27428k4(abstractC13912i5.mo65023fa());
                        if (iM27428k4 == 0) {
                            this.f29358k4 = new C8167la(abstractC13912i5);
                            break;
                        }
                        if (iM27428k4 == 1) {
                            c7394ca = new C7394ca("fill", new C7886hx(abstractC13912i5));
                            break;
                        }
                        if (iM27428k4 == 2) {
                            c7394ca = new C7394ca("fillRef", new C8740s4(abstractC13912i5));
                            break;
                        }
                        if (iM27428k4 != 3) {
                            abstractC13912i5.mo65208bv();
                        } else {
                            this.f29359kk = new C8785sl(abstractC13912i5);
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
    public final C8167la m40054k4() {
        if (this.f29358k4 != null) {
            throw new Exception("Only one <tcBdr> element can be added.");
        }
        C8167la c8167la = new C8167la();
        this.f29358k4 = c8167la;
        return c8167la;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40055k4(C8785sl c8785sl) {
        this.f29359kk = c8785sl;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8167la c8167la = this.f29358k4;
        if (c8167la != null) {
            c8167la.mo6846k4("a", c3059ii, "tcBdr");
        }
        C7394ca c7394ca = this.f29360x1;
        if (c7394ca != null) {
            int iM27428k4 = f29357to.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 1) {
                ((C7886hx) this.f29360x1.m29541kk()).mo6846k4("a", c3059ii, this.f29360x1.m29539k4());
            } else if (iM27428k4 == 2) {
                ((C8740s4) this.f29360x1.m29541kk()).mo6846k4("a", c3059ii, this.f29360x1.m29539k4());
            }
        }
        C8785sl c8785sl = this.f29359kk;
        if (c8785sl != null) {
            c8785sl.mo6846k4("a", c3059ii, "cell3D");
        }
        c3059ii.mo21898jd();
    }
}
