package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class kbh extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25566du = new C7017h4("spid", "grpId", "uiExpand", "bldAsOne", "bldSub");

    /* JADX INFO: renamed from: k4 */
    private String f25567k4;

    /* JADX INFO: renamed from: kk */
    private boolean f25568kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f25569to;

    /* JADX INFO: renamed from: x1 */
    private long f25570x1;

    public kbh() {
        m35264kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m35264kk() {
        this.f25568kk = false;
    }

    public kbh(final AbstractC13912i5 abstractC13912i5) {
        m35264kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kbh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = kbh.f25566du.m27428k4(str);
                if (iM27428k4 == 0) {
                    kbh.this.f25567k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    kbh.this.f25570x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                kbh.this.f25568kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kbh.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                kbh kbhVar;
                C7394ca c7394ca;
                int iM27428k4 = kbh.f25566du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    kbhVar = kbh.this;
                    c7394ca = new C7394ca("bldAsOne", new qu9(abstractC13912i5));
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    kbhVar = kbh.this;
                    c7394ca = new C7394ca("bldSub", new C7667fh(abstractC13912i5));
                }
                kbhVar.f25569to = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m35266k4() {
        return this.f25567k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("spid", this.f25567k4);
        c3059ii.m12955x1("grpId", C13850af.m65147x1(this.f25570x1));
        boolean z = this.f25568kk;
        if (z) {
            c3059ii.m12955x1("uiExpand", z ? "1" : "0");
        }
        C7394ca c7394ca = this.f25569to;
        if (c7394ca != null) {
            int iM27428k4 = f25566du.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 3) {
                ((qu9) this.f25569to.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f25569to.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C7667fh) this.f25569to.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f25569to.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
