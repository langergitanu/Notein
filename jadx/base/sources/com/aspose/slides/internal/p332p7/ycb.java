package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class ycb extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33322x1 = new C7017h4("sldTgt", "sndTgt", "spTgt", "inkTgt", "bmkTgt");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f33323k4;

    public ycb() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m44924k4() {
        return this.f33323k4;
    }

    public ycb(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ycb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                ycb ycbVar;
                C7394ca c7394ca;
                int iM27428k4 = ycb.f33322x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    ycbVar = ycb.this;
                    c7394ca = new C7394ca("sldTgt", new qu9(abstractC13912i5));
                } else if (iM27428k4 == 1) {
                    ycbVar = ycb.this;
                    c7394ca = new C7394ca("sndTgt", new C8528pk(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    ycbVar = ycb.this;
                    c7394ca = new C7394ca("spTgt", new sdd(abstractC13912i5));
                } else if (iM27428k4 == 3) {
                    ycbVar = ycb.this;
                    c7394ca = new C7394ca("inkTgt", new kqc(abstractC13912i5));
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    ycbVar = ycb.this;
                    c7394ca = new C7394ca("bmkTgt", new nw7(abstractC13912i5));
                }
                ycbVar.f33323k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m44925k4(String str) {
        C7394ca c7394ca;
        if (this.f33323k4 != null) {
            throw new Exception("Target already is initialized.");
        }
        int iM27428k4 = f33322x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("sldTgt", new qu9());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("sndTgt", new C8528pk());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("spTgt", new sdd());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("inkTgt", new kqc());
        } else {
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("bmkTgt", new nw7());
        }
        this.f33323k4 = c7394ca;
        return this.f33323k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f33323k4;
        if (c7394ca != null) {
            int iM27428k4 = f33322x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((qu9) this.f33323k4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f33323k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C8528pk) this.f33323k4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f33323k4.m29539k4());
            } else if (iM27428k4 == 2) {
                ((sdd) this.f33323k4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f33323k4.m29539k4());
            } else if (iM27428k4 == 3) {
                ((kqc) this.f33323k4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f33323k4.m29539k4());
            } else if (iM27428k4 == 4) {
                ((nw7) this.f33323k4.m29541kk()).mo6846k4("p14", c3059ii, this.f33323k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
