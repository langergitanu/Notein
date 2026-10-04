package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class qvp extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f29040h4 = new C7017h4("sldNum", "hdr", "ftr", "dt", "extLst");

    /* JADX INFO: renamed from: du */
    private dnu f29041du;

    /* JADX INFO: renamed from: k4 */
    private boolean f29042k4;

    /* JADX INFO: renamed from: kk */
    private boolean f29043kk;

    /* JADX INFO: renamed from: to */
    private boolean f29044to;

    /* JADX INFO: renamed from: x1 */
    private boolean f29045x1;

    public qvp() {
        m39702m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m39702m9() {
        this.f29042k4 = true;
        this.f29045x1 = true;
        this.f29043kk = true;
        this.f29044to = true;
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC7414ck m39705du() {
        return this.f29041du;
    }

    /* JADX INFO: renamed from: kk */
    public final void m39709kk(boolean z) {
        this.f29043kk = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m39711to(boolean z) {
        this.f29044to = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39713x1(boolean z) {
        this.f29045x1 = z;
    }

    public qvp(final AbstractC13912i5 abstractC13912i5) {
        m39702m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qvp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = qvp.f29040h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    qvp.this.f29042k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    qvp.this.f29045x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    qvp.this.f29043kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                qvp.this.f29044to = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qvp.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (qvp.f29040h4.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                qvp.this.f29041du = new dnu(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39706k4(AbstractC7414ck abstractC7414ck) {
        this.f29041du = (dnu) abstractC7414ck;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m39710kk() {
        return this.f29043kk;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m39712to() {
        return this.f29044to;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m39714x1() {
        return this.f29045x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f29042k4;
        if (!z) {
            c3059ii.m12955x1("sldNum", z ? "1" : "0");
        }
        boolean z2 = this.f29045x1;
        if (!z2) {
            c3059ii.m12955x1("hdr", z2 ? "1" : "0");
        }
        boolean z3 = this.f29043kk;
        if (!z3) {
            c3059ii.m12955x1("ftr", z3 ? "1" : "0");
        }
        boolean z4 = this.f29044to;
        if (!z4) {
            c3059ii.m12955x1("dt", z4 ? "1" : "0");
        }
        dnu dnuVar = this.f29041du;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39707k4(boolean z) {
        this.f29042k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m39708k4() {
        return this.f29042k4;
    }
}
