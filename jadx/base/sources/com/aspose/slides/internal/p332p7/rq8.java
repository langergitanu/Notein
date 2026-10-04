package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.hihonor.honorid.core.data.TmemberRight;

/* JADX INFO: loaded from: classes4.dex */
public class rq8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f29442m9 = new C7017h4("id", "name", "initials", TmemberRight.TAG_USERID, "providerId", "extLst");

    /* JADX INFO: renamed from: du */
    private String f29443du;

    /* JADX INFO: renamed from: h4 */
    private ltr f29444h4;

    /* JADX INFO: renamed from: k4 */
    private C14047bz f29445k4 = new C14047bz();

    /* JADX INFO: renamed from: kk */
    private String f29446kk;

    /* JADX INFO: renamed from: to */
    private String f29447to;

    /* JADX INFO: renamed from: x1 */
    private String f29448x1;

    public rq8() {
        m40157m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m40157m9() {
        C14047bz.f47172k4.CloneTo(this.f29445k4);
    }

    /* JADX INFO: renamed from: du */
    public final String m40160du() {
        return this.f29443du;
    }

    /* JADX INFO: renamed from: kk */
    public final String m40164kk() {
        return this.f29446kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m40166to() {
        return this.f29447to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m40168x1() {
        return this.f29448x1;
    }

    public rq8(final AbstractC13912i5 abstractC13912i5) {
        m40157m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rq8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = rq8.f29442m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    rq8.this.f29445k4 = new C14047bz(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    rq8.this.f29448x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    rq8.this.f29446kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    rq8.this.f29447to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                rq8.this.f29443du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rq8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (rq8.f29442m9.m27428k4(abstractC13912i5.mo65023fa()) != 5) {
                    return false;
                }
                rq8.this.f29444h4 = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C14047bz m40161k4() {
        return this.f29445k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m40165kk(String str) {
        this.f29447to = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m40167to(String str) {
        this.f29443du = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40169x1(String str) {
        this.f29446kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40162k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f29445k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40163k4(String str) {
        this.f29448x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f29445k4), "}"));
        c3059ii.m12955x1("name", this.f29448x1);
        String str3 = this.f29446kk;
        if (str3 != null) {
            c3059ii.m12955x1("initials", str3);
        }
        c3059ii.m12955x1(TmemberRight.TAG_USERID, this.f29447to);
        c3059ii.m12955x1("providerId", this.f29443du);
        ltr ltrVar = this.f29444h4;
        if (ltrVar != null) {
            ltrVar.mo6846k4("p188", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
