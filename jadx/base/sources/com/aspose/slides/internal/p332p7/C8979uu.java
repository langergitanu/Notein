package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.uu */
/* JADX INFO: loaded from: classes4.dex */
public class C8979uu extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31421kk = new C7017h4("fill", "fillRef", "effect", "effectRef");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f31422k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f31423x1;

    public C8979uu() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m42562k4() {
        return this.f31422k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m42564x1() {
        return this.f31423x1;
    }

    public C8979uu(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8979uu c8979uu;
                C7394ca c7394ca;
                C8979uu c8979uu2;
                C7394ca c7394ca2;
                int iM27428k4 = C8979uu.f31421kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c8979uu = C8979uu.this;
                    c7394ca = new C7394ca("fill", new C7886hx(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        if (iM27428k4 == 2) {
                            c8979uu2 = C8979uu.this;
                            c7394ca2 = new C7394ca("effect", new C7868hn(abstractC13912i5));
                        } else {
                            if (iM27428k4 != 3) {
                                return false;
                            }
                            c8979uu2 = C8979uu.this;
                            c7394ca2 = new C7394ca("effectRef", new C8740s4(abstractC13912i5));
                        }
                        c8979uu2.f31423x1 = c7394ca2;
                        return true;
                    }
                    c8979uu = C8979uu.this;
                    c7394ca = new C7394ca("fillRef", new C8740s4(abstractC13912i5));
                }
                c8979uu.f31422k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m42563k4(String str) {
        C7394ca c7394ca;
        if (this.f31423x1 != null) {
            throw new Exception("ThemeableEffectStyle already is initialized.");
        }
        int iM27428k4 = f31421kk.m27428k4(str);
        if (iM27428k4 == 2) {
            c7394ca = new C7394ca("effect", new C7868hn());
        } else {
            if (iM27428k4 != 3) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("effectRef", new C8740s4());
        }
        this.f31423x1 = c7394ca;
        return this.f31423x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m42565x1(String str) {
        C7394ca c7394ca;
        if (this.f31422k4 != null) {
            throw new Exception("ThemeableFillStyle already is initialized.");
        }
        int iM27428k4 = f31421kk.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("fill", new C7886hx());
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("fillRef", new C8740s4());
        }
        this.f31422k4 = c7394ca;
        return this.f31422k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f31422k4;
        if (c7394ca != null) {
            int iM27428k4 = f31421kk.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((C7886hx) this.f31422k4.m29541kk()).mo6846k4("a", c3059ii, this.f31422k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C8740s4) this.f31422k4.m29541kk()).mo6846k4("a", c3059ii, this.f31422k4.m29539k4());
            }
        }
        C7394ca c7394ca2 = this.f31423x1;
        if (c7394ca2 != null) {
            int iM27428k42 = f31421kk.m27428k4(c7394ca2.m29539k4());
            if (iM27428k42 == 2) {
                ((C7868hn) this.f31423x1.m29541kk()).mo6846k4("a", c3059ii, this.f31423x1.m29539k4());
            } else if (iM27428k42 == 3) {
                ((C8740s4) this.f31423x1.m29541kk()).mo6846k4("a", c3059ii, this.f31423x1.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
