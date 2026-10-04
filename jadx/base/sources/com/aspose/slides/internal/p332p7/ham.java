package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class ham extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f24007m9 = new C7017h4("id", "name", "initials", "lastIdx", "clrIdx", "extLst");

    /* JADX INFO: renamed from: du */
    private long f24008du;

    /* JADX INFO: renamed from: h4 */
    private ltr f24009h4;

    /* JADX INFO: renamed from: k4 */
    private long f24010k4;

    /* JADX INFO: renamed from: kk */
    private String f24011kk;

    /* JADX INFO: renamed from: to */
    private long f24012to;

    /* JADX INFO: renamed from: x1 */
    private String f24013x1;

    public ham() {
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC7414ck m33248du() {
        return this.f24009h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m33249k4() {
        return this.f24010k4;
    }

    /* JADX INFO: renamed from: to */
    public final long m33255to() {
        return this.f24008du;
    }

    public ham(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ham.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ham.f24007m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    ham.this.f24010k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    ham.this.f24013x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    ham.this.f24011kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    ham.this.f24012to = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                ham.this.f24008du = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ham.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (ham.f24007m9.m27428k4(abstractC13912i5.mo65023fa()) != 5) {
                    return false;
                }
                ham.this.f24009h4 = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final String m33253kk() {
        return this.f24011kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m33256x1() {
        return this.f24013x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m33254kk(long j) {
        this.f24008du = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33257x1(long j) {
        this.f24012to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33250k4(long j) {
        this.f24010k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33258x1(String str) {
        this.f24011kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33251k4(AbstractC7414ck abstractC7414ck) {
        this.f24009h4 = (ltr) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33252k4(String str) {
        this.f24013x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C13850af.m65147x1(this.f24010k4));
        c3059ii.m12955x1("name", this.f24013x1);
        c3059ii.m12955x1("initials", this.f24011kk);
        c3059ii.m12955x1("lastIdx", C13850af.m65147x1(this.f24012to));
        c3059ii.m12955x1("clrIdx", C13850af.m65147x1(this.f24008du));
        ltr ltrVar = this.f24009h4;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
