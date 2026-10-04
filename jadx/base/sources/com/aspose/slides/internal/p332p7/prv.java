package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class prv extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f28537c5 = new C7017h4("spid", "name", "showAsIcon", "r:id", "imgW", "imgH", "extLst", "pic");

    /* JADX INFO: renamed from: du */
    private double f28538du;

    /* JADX INFO: renamed from: dy */
    private C7513du f28539dy;

    /* JADX INFO: renamed from: h4 */
    private double f28540h4;

    /* JADX INFO: renamed from: k4 */
    private String f28541k4;

    /* JADX INFO: renamed from: kk */
    private boolean f28542kk;

    /* JADX INFO: renamed from: m9 */
    private ltr f28543m9;

    /* JADX INFO: renamed from: to */
    private String f28544to;

    /* JADX INFO: renamed from: x1 */
    private String f28545x1;

    public prv() {
        m39071jd();
    }

    /* JADX INFO: renamed from: jd */
    private void m39071jd() {
        this.f28545x1 = "";
        this.f28542kk = false;
        this.f28538du = Double.NaN;
        this.f28540h4 = Double.NaN;
    }

    /* JADX INFO: renamed from: du */
    public final String m39080du() {
        return this.f28544to;
    }

    /* JADX INFO: renamed from: dy */
    public final C7513du m39081dy() {
        return this.f28539dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m39082h4() {
        return this.f28538du;
    }

    /* JADX INFO: renamed from: kk */
    public final String m39086kk() {
        return this.f28545x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final double m39088m9() {
        return this.f28540h4;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m39089to() {
        return this.f28542kk;
    }

    public prv(final AbstractC13912i5 abstractC13912i5) {
        m39071jd();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.prv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = prv.f28537c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    prv.this.f28541k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    prv.this.f28545x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    prv.this.f28542kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    prv.this.f28544to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    prv.this.f28538du = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                prv.this.f28540h4 = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.prv.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = prv.f28537c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 6) {
                    prv.this.f28543m9 = new ltr(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                prv.this.f28539dy = new C7513du(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7513du m39083k4() {
        if (this.f28539dy != null) {
            throw new Exception("Only one <pic> element can be added.");
        }
        C7513du c7513du = new C7513du();
        this.f28539dy = c7513du;
        return c7513du;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m39090x1() {
        return this.f28541k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m39087kk(String str) {
        this.f28544to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39091x1(double d) {
        this.f28540h4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39092x1(String str) {
        this.f28545x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39084k4(double d) {
        this.f28538du = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39085k4(String str) {
        this.f28541k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f28541k4;
        if (str3 != null) {
            c3059ii.m12955x1("spid", str3);
        }
        if (!"".equals(this.f28545x1)) {
            c3059ii.m12955x1("name", this.f28545x1);
        }
        boolean z = this.f28542kk;
        if (z) {
            c3059ii.m12955x1("showAsIcon", z ? "1" : "0");
        }
        if (this.f28544to != null) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:id", this.f28544to);
        }
        if (!C14044b3.m66437kk(this.f28538du)) {
            c3059ii.m12955x1("imgW", C22238OooO0oO.OooO00o(this.f28538du, 12700.0d, 14));
        }
        if (!C14044b3.m66437kk(this.f28540h4)) {
            c3059ii.m12955x1("imgH", C22238OooO0oO.OooO00o(this.f28540h4, 12700.0d, 14));
        }
        ltr ltrVar = this.f28543m9;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        C7513du c7513du = this.f28539dy;
        if (c7513du != null) {
            c7513du.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "pic");
        }
        c3059ii.mo21898jd();
    }
}
