package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.k7 */
/* JADX INFO: loaded from: classes4.dex */
public class C8061k7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f25491to = new C7017h4("custUnit", "builtInUnit", "dispUnitsLbl", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f25492k4;

    /* JADX INFO: renamed from: kk */
    private C7683fo f25493kk;

    /* JADX INFO: renamed from: x1 */
    private C8372nr f25494x1;

    public C8061k7() {
    }

    /* JADX INFO: renamed from: kk */
    public final C8372nr m35176kk() {
        return this.f25494x1;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m35177to() {
        return this.f25493kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m35178x1() {
        return this.f25492k4;
    }

    public C8061k7(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.k7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8061k7 c8061k7;
                C7394ca c7394ca;
                int iM27428k4 = C8061k7.f25491to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c8061k7 = C8061k7.this;
                    c7394ca = new C7394ca("custUnit", new C7405cg(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        if (iM27428k4 == 2) {
                            C8061k7.this.f25494x1 = new C8372nr(abstractC13912i5);
                        } else {
                            if (iM27428k4 != 3) {
                                return false;
                            }
                            C8061k7.this.f25493kk = new C7683fo(abstractC13912i5);
                        }
                        return true;
                    }
                    c8061k7 = C8061k7.this;
                    c7394ca = new C7394ca("builtInUnit", new C8135ku(abstractC13912i5));
                }
                c8061k7.f25492k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m35173k4(String str) {
        C7394ca c7394ca;
        if (this.f25492k4 != null) {
            throw new Exception("DisplayUnit already is initialized.");
        }
        int iM27428k4 = f25491to.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("custUnit", new C7405cg());
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("builtInUnit", new C8135ku());
        }
        this.f25492k4 = c7394ca;
        return this.f25492k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8372nr m35174k4() {
        if (this.f25494x1 != null) {
            throw new Exception("Only one <dispUnitsLbl> element can be added.");
        }
        C8372nr c8372nr = new C8372nr();
        this.f25494x1 = c8372nr;
        return c8372nr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35175k4(AbstractC7414ck abstractC7414ck) {
        this.f25493kk = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f25492k4;
        if (c7394ca != null) {
            int iM27428k4 = f25491to.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((C7405cg) this.f25492k4.m29541kk()).mo6846k4("c", c3059ii, this.f25492k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C8135ku) this.f25492k4.m29541kk()).mo6846k4("c", c3059ii, this.f25492k4.m29539k4());
            }
        }
        C8372nr c8372nr = this.f25494x1;
        if (c8372nr != null) {
            c8372nr.mo6846k4("c", c3059ii, "dispUnitsLbl");
        }
        C7683fo c7683fo = this.f25493kk;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
